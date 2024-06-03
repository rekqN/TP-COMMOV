package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.ProjectDao
import com.example.gp_tp.data.entities.Project

class ProjectRepository (private val projectDao: ProjectDao) {

    val readAllProjects : LiveData<List<Project>> = projectDao.readAllProjects()

    suspend fun addProject(project: Project){
        projectDao.addProject(project)
    }

    suspend fun updateProject(project: Project) {
        projectDao.updateProject(project)
    }

    suspend fun deleteProject(project: Project) {
        projectDao.deleteProject(project)
    }
}