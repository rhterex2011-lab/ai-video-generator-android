package com.aivideogenerator.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun VideoEditorScreen(navController: NavHostController) {
    var scriptText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Video Editor")
        
        TextField(
            value = scriptText,
            onValueChange = { scriptText = it },
            label = { Text("Enter your script") },
            modifier = Modifier
                .fillMaxSize(0.8f)
        )
        
        Button(
            onClick = { /* Generate video */ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Generate Video")
        }
        
        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Back")
        }
    }
}
