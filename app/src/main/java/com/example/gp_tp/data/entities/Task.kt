package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity(tableName = "Tarefa",
    foreignKeys = [ForeignKey(
        entity = Project::class,
        parentColumns = ["uuid_projeto"],
        childColumns = ["uuid_projeto"],
        onDelete = ForeignKey.CASCADE // ou RESTRICT, SET NULL, etc.
    )]
)

class Task (
    @PrimaryKey(autoGenerate = true) val id_tarefa: Int,
    @ColumnInfo(name = "nome_projeto") val nome_projeto: String,
    @ColumnInfo(name = "descricao_tarefa") val descricao_tarefa: String,
    @ColumnInfo(name = "status_tarefa") val status_tarefa: String,
    @ColumnInfo(name = "data_inicio_tarefa") val data_inicio_tarefa: Date,
    @ColumnInfo(name = "data_fim_tarefa") val data_fim_tarefa: Date,
    @ColumnInfo(name = "taxa_conclusao_tarefa") val taxa_conclusao_tarefa: Int,
    @ColumnInfo(name = "local") val local: String,
    @ColumnInfo(name = "tempo_dispensado_tarefa") val tempo_dispensado_tarefa: Int,
    @ColumnInfo(name = "fotografia") val fotografia: ByteArray,
    @ColumnInfo(name = "uuid_projeto") val uuid_projeto: Int

): Parcelable
