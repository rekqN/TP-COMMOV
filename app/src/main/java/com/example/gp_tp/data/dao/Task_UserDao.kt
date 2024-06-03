package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Task_User

@Dao
interface Task_UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask_User(taskUser: Task_User)

    @Update
    suspend fun updateTask_User(taskUser: Task_User)

    @Query("SELECT * FROM Tarefa_Utilizador ORDER BY id_tarefa,uuid_utilizador DESC")
    fun readAllTasks_User() : LiveData<List<Task_User>>

    @Delete
    suspend fun deleteTask_User(taskUser: Task_User)
}