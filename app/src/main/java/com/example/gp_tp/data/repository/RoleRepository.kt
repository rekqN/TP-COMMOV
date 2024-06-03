package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.RoleDao
import com.example.gp_tp.data.entities.Role

class RoleRepository(private val roleDao: RoleDao) {

    val readAllRoles : LiveData<List<Role>> = roleDao.readAllRoles()

    suspend fun addRole(role: Role){
        roleDao.addRole(role)
    }

    suspend fun updateRole(role: Role) {
        roleDao.updateRole(role)
    }

    suspend fun deleteRole(role: Role) {
        roleDao.deleteRole(role)
    }
}