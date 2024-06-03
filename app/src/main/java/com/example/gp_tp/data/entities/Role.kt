package com.example.gp_tp.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Cargo")
class Role(
    @PrimaryKey(autoGenerate = true) val id_cargo: Int,
    @ColumnInfo(name = "nome_cargo") val nome_cargo: String
): Parcelable

