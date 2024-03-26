package com.example.shayar_hun_me.ui_layer

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.room.PrimaryKey
import com.example.shayar_hun_me.data.Daos.ShayariDao
import com.example.shayar_hun_me.data.ShayariDatabase
import com.example.shayar_hun_me.data.tables.AllShayari
import com.example.shayar_hun_me.data.tables.AllShayariCategory
import kotlinx.coroutines.flow.Flow
import java.util.ArrayList

class ShayariViewModel(application: Application) :AndroidViewModel(application =application) {

    var dao : ShayariDao

    var shayariCategory = arrayListOf<AllShayariCategory>()
    init {
        dao = ShayariDatabase.getDB(application).shayariDao
       shayariCategory.addAll(dao.getAllShayariCategory()
       )
    }

fun getShayariByCategory(cat_id:Int):List<AllShayari>{
    return dao.getShayariByCatId(cat_id)
}
}



