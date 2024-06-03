package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.UserDao
import com.example.gp_tp.data.entities.User

class UserRepository (private val userDao: UserDao) {

    val readAllUsers : LiveData<List<User>> = userDao.readAllUsers()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }
}