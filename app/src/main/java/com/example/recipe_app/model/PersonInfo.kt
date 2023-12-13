package com.example.recipe_app.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class PersonInfo (
    @PrimaryKey(autoGenerate = true)
    var id :Int,

    @ColumnInfo
    val email :String,

    @ColumnInfo
    val password :String,
        ){
    var name :String ="default"

}