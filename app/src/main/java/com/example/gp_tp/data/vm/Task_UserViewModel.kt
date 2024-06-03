package com.example.gp_tp.data.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gp_tp.data.db.AppDatabase
import com.example.gp_tp.data.entities.Task_User
import com.example.gp_tp.data.repository.Task_UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Task_UserViewModel (application: Application) : AndroidViewModel(application){
    val readAllTasks_User: LiveData<List<Task_User>>
    private val repository: Task_UserRepository

    init {
        val task_userDao = AppDatabase.getDatabase(application).task_userDao()
        repository = Task_UserRepository(task_userDao)
        readAllTasks_User = repository.readAllTasks_User
    }

    fun  addTask_User(taskUser: Task_User){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addTask_User(taskUser)
        }
    }

    fun updateTask_User(taskUser: Task_User) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateTask_User(taskUser)
        }
    }

    fun  deleteTask_User(taskUser: Task_User) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteTask_User(taskUser)
        }
    }
}