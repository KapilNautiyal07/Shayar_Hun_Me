package com.example.shayar_hun_me.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class AllShayari (
    @PrimaryKey(autoGenerate = true)
            var Cat_id:Int?,
            var Shayari:String? = null
)