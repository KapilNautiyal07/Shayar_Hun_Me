package com.example.shayar_hun_me.data.Daos

import androidx.room.Dao
import androidx.room.Query
import com.example.shayar_hun_me.data.tables.AllShayari
import com.example.shayar_hun_me.data.tables.AllShayariCategory
import kotlinx.coroutines.flow.Flow


@Dao
interface ShayariDao {

    @Query("SELECT * FROM allshayaricategory")
    fun getAllShayariCategory():Flow<List<AllShayariCategory>>

    @Query ("SELECT * FROM allshayaricategory WHERE Cat_id =:cat_id")
    fun getShayariByCatId(cat_id:Int): List<AllShayari>
}