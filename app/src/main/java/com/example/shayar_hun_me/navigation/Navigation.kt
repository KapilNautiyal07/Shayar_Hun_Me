package com.example.shayar_hun_me.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shayar_hun_me.ui_layer.ShayariViewModel
import com.example.shayar_hun_me.ui_layer.shayari_display.ShayariDisplayScreen
import com.example.shayar_hun_me.ui_layer.shayri_category.ShayariCategoryScreen
import com.example.shayar_hun_me.ui_layer.splash.SplashScreen

@Composable
fun Navigation (navHostController: NavHostController,viewModel: ShayariViewModel ){

    NavHost(navController = navHostController, startDestination =
    Navigationitems.splash.route
    ){
        composable(
            Navigationitems.splash.route
        ){
            SplashScreen(navHostController)
    }
        composable(
            Navigationitems.ShayariCategory.route
        ){
            ShayariCategoryScreen(viewModel, navController = navHostController)
    }
        composable(
            Navigationitems.ShayariDisplay.route
        ){
            var cat_id =it.arguments?.getString("cat_id")?.replace("{id}","")
            Log.d("MYTAG","Navigation:${cat_id?.toInt()}")
            ShayariDisplayScreen(viewModel.getShayariByCategory(cat_id!!.toInt()))
    }

    }
}