package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity(
    tableName = "Tarefa_Utilizador",
    primaryKeys = ["uuid_utilizador", "id_tarefa"],
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["uuid_utilizador"],
            childColumns = ["uuid_utilizador"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Task::class,
            parentColumns = ["id_tarefa"],
            childColumns = ["id_tarefa"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)

class Task_User (
    @ColumnInfo(name = "uuid_utilizador") val uuid_utilizador: Int,
    @ColumnInfo(name = "id_tarefa") val id_tarefa: Int,
    @ColumnInfo(name = "data_associacao") val data_associacao: Date,
    @ColumnInfo(name = "perfomance") val performance: Int,
) :Parcelable


