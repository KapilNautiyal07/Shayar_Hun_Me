package com.example.shayar_hun_me.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shayar_hun_me.data.Daos.ShayariDao
import com.example.shayar_hun_me.data.tables.AllShayari
import com.example.shayar_hun_me.data.tables.AllShayariCategory

@Database(entities = arrayOf(AllShayariCategory::class, AllShayari::class), version = 3, exportSchema  =false)
abstract class ShayariDatabase: RoomDatabase() {

    abstract val shayariDao : ShayariDao


    companion object{
        fun getDB(context: Context): ShayariDatabase{
            return Room.databaseBuilder(
                context,ShayariDatabase::class.java,
                "ShyarI.db"
            ).createFromAsset("Shayari.db")

                .allowMainThreadQueries()
                .fallbackToDestructiveMigration().build()

        }
    }
}