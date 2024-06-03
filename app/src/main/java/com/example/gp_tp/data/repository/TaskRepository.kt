package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.TaskDao
import com.example.gp_tp.data.entities.Task

class TaskRepository (private val taskDao: TaskDao) {

    val readAllTasks : LiveData<List<Task>> = taskDao.readAllTasks()

    suspend fun addTask(task: Task){
        taskDao.addTask(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.updateTask(task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(task)
    }
}