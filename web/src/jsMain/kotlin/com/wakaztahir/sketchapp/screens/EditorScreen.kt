package com.wakaztahir.sketchapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.wakaztahir.sketchapp.ui.theme.SketchableTheme

@OptIn(
    ExperimentalMaterial3Api::class,
)
@Composable
fun EditorScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit,
) {
    SketchableTheme(darkTheme = false) {
        Scaffold(
            modifier = modifier,
            containerColor = MaterialTheme.colorScheme.background,
            topBar = {

            },
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { }
                    )
                }
            }
        ) {
            Box(modifier = Modifier.padding(it).background(color = Color.Red)) {
                Button(
                    onClick = {

                    }
                ){
                    Text(text = "Hello World")
                }
            }
        }
    }
}