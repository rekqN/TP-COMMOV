package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Role


@Dao
interface RoleDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addRole(Cargo: Role)

    @Update
    suspend fun updateRole(Cargo: Role)

    @Query("SELECT * FROM Cargo ORDER BY id_cargo DESC")
    fun readAllRoles() : LiveData<List<Role>>

    @Delete
    suspend fun deleteRole(Cargo: Role)
}