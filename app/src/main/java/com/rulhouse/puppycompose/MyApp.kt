package com.rulhouse.puppycompose.ui.theme

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.rulhouse.puppycompose.PuppyHomeContent

@Composable
fun MyApp () {
    Scaffold(
        content = {
        PuppyHomeContent()
        }
    )
}