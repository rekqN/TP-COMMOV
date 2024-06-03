package com.example.gp_tp.data.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.gp_tp.data.db.AppDatabase
import com.example.gp_tp.data.entities.Observation
import com.example.gp_tp.data.repository.ObservationRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ObservationViewModel (application: Application) : AndroidViewModel(application){
    val readAllObservations: LiveData<List<Observation>>
    private val repository: ObservationRepository

    init {
        val observationDao = AppDatabase.getDatabase(application).observationDao()
        repository = ObservationRepository(observationDao)
        readAllObservations = repository.readAllObservations
    }

    fun  addObservation(observation: Observation){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addObservation(observation)
        }
    }

    fun updateObservation(observation: Observation) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateObservation(observation)
        }
    }

    fun  deleteObservation(observation: Observation) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteObservation(observation)
        }
    }
}