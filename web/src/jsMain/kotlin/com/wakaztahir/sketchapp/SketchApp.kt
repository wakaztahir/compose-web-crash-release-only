package com.wakaztahir.sketchapp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

object SketchApp {
    val appScope = CoroutineScope(Dispatchers.Default + SupervisorJob())
}