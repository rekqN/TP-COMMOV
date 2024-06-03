package com.example.gp_tp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gp_tp.data.entities.Role
import com.example.gp_tp.data.entities.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Query("SELECT * FROM Utilizador ORDER BY uuid_utilizador DESC")
    fun readAllUsers() : LiveData<List<User>>

    @Delete
    suspend fun deleteUser(user: User)

}