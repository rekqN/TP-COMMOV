package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Observation


@Dao
interface ObservationDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addObservation(observation: Observation)

    @Update
    suspend fun updateObservation(observation: Observation)

    @Query("SELECT * FROM Observacao ORDER BY id_observacao DESC")
    fun readAllObservations() : LiveData<List<Observation>>

    @Delete
    suspend fun deleteObservation(observation: Observation)
}