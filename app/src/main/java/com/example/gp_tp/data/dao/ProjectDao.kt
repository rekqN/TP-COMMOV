package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Project

@Dao
interface ProjectDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addProject(project: Project)

    @Update
    suspend fun updateProject(project: Project)

    @Query("SELECT * FROM Projeto ORDER BY uuid_projeto DESC")
    fun readAllProjects() : LiveData<List<Project>>

    @Delete
    suspend fun deleteProject(project: Project)
}