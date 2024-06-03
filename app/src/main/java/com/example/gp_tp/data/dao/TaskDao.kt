package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Task

@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

    @Query("SELECT * FROM Tarefa ORDER BY id_tarefa DESC")
    fun readAllTasks() : LiveData<List<Task>>

    @Delete
    suspend fun deleteTask(task: Task)
}