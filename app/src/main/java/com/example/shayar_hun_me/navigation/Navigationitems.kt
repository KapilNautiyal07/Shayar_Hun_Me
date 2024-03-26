package com.example.shayar_hun_me.navigation

sealed class Navigationitems(var route: String) {

    object splash : Navigationitems("SplashScreen")
    object ShayariCategory : Navigationitems("ShayariCategory")
    object ShayariDisplay : Navigationitems("ShayariDisplayScreen"+"/{id}")



}

