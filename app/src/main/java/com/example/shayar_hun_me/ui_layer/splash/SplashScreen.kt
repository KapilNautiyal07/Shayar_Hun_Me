package com.example.shayar_hun_me.ui_layer.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayar_hun_me.R
import com.example.shayar_hun_me.navigation.Navigationitems
import kotlinx.coroutines.delay
import java.lang.reflect.Modifier

@Composable
fun SplashScreen(navHostController: NavHostController){

    Box(modifier = androidx.compose.ui.Modifier.fillMaxSize()){

        var scale = remember {
            androidx.compose.animation.core.Animatable(0.0f)
        }

        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.08f,
                animationSpec = tween(800,
                   easing = {
                       OvershootInterpolator(4f).getInterpolation(it)
                   } )
            )
            delay(3000)

            navHostController.navigate(Navigationitems.ShayariCategory.route){
                popUpTo(Navigationitems.splash.route){
                    inclusive =true
                }
            }

        }
    }
    Image(painter = painterResource(id = R.drawable.poetry), contentDescription = null ,
        alignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(40.dp)

        )
}