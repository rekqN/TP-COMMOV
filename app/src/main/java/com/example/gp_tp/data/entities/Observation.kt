package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity(tableName = "Observacao",
    foreignKeys = [ForeignKey(
        entity = Task::class,
        parentColumns = ["id_tarefa"],
        childColumns = ["id_tarefa"],
        onDelete = ForeignKey.CASCADE // ou RESTRICT, SET NULL, etc.
    )]
)

class Observation (
    @PrimaryKey(autoGenerate = true) val id_observacao: Int,
    @ColumnInfo(name = "descricao_observacao") val descricao_observacao: String,
    @ColumnInfo(name = "data_observacao") val data_observacao: Date,
    @ColumnInfo(name = "fotografia") val fotografia: ByteArray,
    @ColumnInfo(name = "id_tarefa") val id_tarefa: Int
): Parcelable
