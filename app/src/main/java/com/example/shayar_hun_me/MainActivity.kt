package com.example.shayar_hun_me

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.shayar_hun_me.navigation.Navigation
import com.example.shayar_hun_me.ui.theme.Shayar_Hun_MeTheme
import com.example.shayar_hun_me.ui_layer.ShayariViewModel


class MainActivity : ComponentActivity() {

    lateinit var viewModel:ShayariViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this@MainActivity).get(ShayariViewModel::class.java)
        setContent {
            Shayar_Hun_MeTheme {
                MyApp(viewModel =viewModel)


            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier.Companion = Modifier, viewModel: ShayariViewModel){
    Scaffold (modifier = Modifier.fillMaxSize()){
        it
        Box(modifier = Modifier.padding(it))
        var navHostController = rememberNavController()
        Navigation(navHostController = navHostController, viewModel =viewModel)
    }
}


@Composable
fun Greeting(name:String, modifier:Modifier = Modifier){
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Shayar_Hun_MeTheme {
        Greeting("Android")
    }
}