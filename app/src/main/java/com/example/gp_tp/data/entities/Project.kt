package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import kotlinx.parcelize.Parcelize
import java.util.Date


@Parcelize
@Entity(tableName = "Projeto",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["uuid_utilizador"],
        childColumns = ["uuid_gestor"],
        onDelete = ForeignKey.CASCADE // ou RESTRICT, SET NULL, etc.
    )]
)
class Project(
    @PrimaryKey(autoGenerate = true) val uuid_projeto: Int,
    @ColumnInfo(name = "nome_projeto") val nome_projeto: String,
    @ColumnInfo(name = "descricao_projeto") val descricao_projeto: String,
    @ColumnInfo(name = "status_projeto") val status_projeto: String,
    @ColumnInfo(name = "data_inicio_projeto") val data_inicio_projeto: Date,
    @ColumnInfo(name = "data_fim_projeto") val data_fim_projeto: Date,
    @ColumnInfo(name = "tempo_dispensado_projeto") val tempo_dispensado_projeto: Int,
    @ColumnInfo(name = "uuid_gestor") val uuid_gestor: Int

): Parcelable