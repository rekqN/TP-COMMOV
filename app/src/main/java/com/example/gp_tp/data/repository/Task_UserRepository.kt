package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.Task_UserDao
import com.example.gp_tp.data.entities.Task_User

class Task_UserRepository (private val taskUserdao: Task_UserDao) {

    val readAllTasks_User : LiveData<List<Task_User>> = taskUserdao.readAllTasks_User()

    suspend fun addTask_User(taskUser: Task_User){
        taskUserdao.addTask_User(taskUser)
    }

    suspend fun updateTask_User(taskUser: Task_User) {
        taskUserdao.updateTask_User(taskUser)
    }

    suspend fun deleteTask_User(taskUser: Task_User) {
        taskUserdao.deleteTask_User(taskUser)
    }
}