package com.example.gp_tp.data.db

import com.example.gp_tp.data.db.Converters
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.gp_tp.data.dao.RoleDao
import com.example.gp_tp.data.dao.UserDao
import com.example.gp_tp.data.dao.ProjectDao
import com.example.gp_tp.data.dao.TaskDao
import com.example.gp_tp.data.dao.Task_UserDao
import com.example.gp_tp.data.dao.ObservationDao
import com.example.gp_tp.data.entities.Role
import com.example.gp_tp.data.entities.User
import com.example.gp_tp.data.entities.Project
import com.example.gp_tp.data.entities.Task
import com.example.gp_tp.data.entities.Task_User
import com.example.gp_tp.data.entities.Observation

@Database(entities = [Role :: class, User :: class, Project :: class, Task :: class, Task_User :: class, Observation :: class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract  fun  roleDao(): RoleDao
    abstract fun userDao(): UserDao
    abstract fun projectDao(): ProjectDao
    abstract fun taskDao(): TaskDao
    abstract fun task_userDao(): Task_UserDao
    abstract fun observationDao(): ObservationDao

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