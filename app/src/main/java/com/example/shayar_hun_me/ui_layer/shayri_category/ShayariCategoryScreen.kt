package com.example.shayar_hun_me.ui_layer.shayri_category

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.shayar_hun_me.navigation.Navigationitems
import com.example.shayar_hun_me.ui_layer.ShayariViewModel


@Composable
fun ShayariCategoryScreen(viewModel: ShayariViewModel,navController: NavController) {
    Scaffold (
        topBar = {
            Card (modifier = Modifier
                .height(56.dp)
                .padding(horizontal = 10.dp)
                .clickable {
                    navController.navigate(Navigationitems.ShayariDisplay.route+it.id.toString())
                })
            {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(horizontal = 30.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "All Shayari")

                    Icon(imageVector = Icons.Rounded.Settings, contentDescription = null)


                }
            }

        }
    ){
        LazyColumn(
            modifier = Modifier.padding(it)
        ) {

            item(viewModel.shayariCategory){

                Card (modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
                    .padding(10.dp)){
                    Row (modifier =Modifier.fillMaxSize()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically){
                        Icon(imageVector = Icons.Rounded.Edit, contentDescription = null)
                        Text(text= it.javaClass.name.toString())
                        Icon(imageVector = Icons.Rounded.KeyboardArrowDown, contentDescription = null)
                    }
                }
            }
        }


    }
}