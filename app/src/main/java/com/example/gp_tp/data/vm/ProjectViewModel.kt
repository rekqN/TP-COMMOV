package com.example.gp_tp.data.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gp_tp.data.db.AppDatabase
import com.example.gp_tp.data.entities.Project
import com.example.gp_tp.data.repository.ProjectRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProjectViewModel (application: Application) : AndroidViewModel(application){
    val readAllProjects: LiveData<List<Project>>
    private val repository: ProjectRepository

    init {
        val projectDao = AppDatabase.getDatabase(application).projectDao()
        repository = ProjectRepository(projectDao)
        readAllProjects = repository.readAllProjects
    }

    fun  addProject(project: Project){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addProject(project)
        }
    }

    fun updateProject(project: Project) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateProject(project)
        }
    }

    fun  deleteProject(project: Project) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteProject(project)
        }
    }
}