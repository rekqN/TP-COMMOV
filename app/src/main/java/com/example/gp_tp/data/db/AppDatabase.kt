package com.example.gp_tp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.gp_tp.data.dao.RoleDao
import com.example.gp_tp.data.entities.Role

@Database(entities = [Role :: class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract  fun  roleDao(): RoleDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "App_Database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}