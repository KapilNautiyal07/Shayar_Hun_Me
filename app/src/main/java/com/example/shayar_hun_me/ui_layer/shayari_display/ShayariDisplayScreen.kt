package com.example.shayar_hun_me.ui_layer.shayari_display

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.shayar_hun_me.data.tables.AllShayari


@Composable
fun ShayariDisplayScreen(shayariByCategory: List<AllShayari>) {
    LazyColumn {

        items(shayariByCategory){
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier =Modifier.fillMaxWidth().padding(horizontal = 10.dp)
            ){

                Text(text = it.Shayari.toString(),
                    textAlign = TextAlign.Center)
            }
        }
    }
}
