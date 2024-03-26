package com.example.shayar_hun_me.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class AllShayariCategory(
    @PrimaryKey(autoGenerate = true)
    var name :String?,
    var fav :Int?
){

}