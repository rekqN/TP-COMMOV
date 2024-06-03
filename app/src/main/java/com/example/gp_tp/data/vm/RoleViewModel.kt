package com.example.gp_tp.data.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gp_tp.data.db.AppDatabase
import com.example.gp_tp.data.entities.Role
import com.example.gp_tp.data.repository.RoleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RoleViewModel (application: Application) : AndroidViewModel(application){
    val readAllRoles: LiveData<List<Role>>
    private val repository: RoleRepository

    init {
        val roleDao = AppDatabase.getDatabase(application).roleDao()
        repository = RoleRepository(roleDao)
        readAllRoles = repository.readAllRoles
    }

    fun  addRole(role: Role){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addRole(role)
        }
    }

    fun updateRole(role: Role) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateRole(role)
        }
    }

    fun  deleteRole(role: Role) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteRole(role)
        }
    }
}