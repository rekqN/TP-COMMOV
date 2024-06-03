package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "Utilizador",
    foreignKeys = [ForeignKey(
        entity = Role::class,
        parentColumns = ["id_cargo"],
        childColumns = ["id_cargo"],
        onDelete = ForeignKey.CASCADE // ou RESTRICT, SET NULL, etc.
    )]
)

class User(
    @PrimaryKey(autoGenerate = true) val uuid_utilizador: Int,
    @ColumnInfo(name = "nome_utilizador") val nome_utilizador: String,
    @ColumnInfo(name = "email_utilizador") val email_utilizador: String,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "fotografia") val fotografia: ByteArray,
    @ColumnInfo(name = "id_cargo") val id_cargo: Int

): Parcelable
