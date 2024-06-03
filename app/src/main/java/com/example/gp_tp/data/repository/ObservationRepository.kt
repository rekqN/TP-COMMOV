package com.example.gp_tp.data.repository

import androidx.lifecycle.LiveData
import com.example.gp_tp.data.dao.ObservationDao
import com.example.gp_tp.data.entities.Observation


class ObservationRepository (private val observationDao: ObservationDao) {

    val readAllObservations : LiveData<List<Observation>> = observationDao.readAllObservations()

    suspend fun addObservation(observation: Observation){
        observationDao.addObservation(observation)
    }

    suspend fun updateObservation(observation: Observation) {
        observationDao.updateObservation(observation)
    }

    suspend fun deleteObservation(observation: Observation) {
        observationDao.deleteObservation(observation)
    }
}