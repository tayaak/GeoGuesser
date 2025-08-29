package com.kaldirim.geoguesser.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MainScreenUI(
    onStartGameClick: () -> Unit,
    onInstructionsClick: () -> Unit,
    onAboutClick: () -> Unit
) {
    // Alles zentriert auf dem Bildschirm
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Titel
            Text(
                text = "GeoGuessr App",
                fontSize = 28.sp,
                modifier = Modifier.padding(bottom = 40.dp)
            )

            // Button: Spiel starten
            Button(
                onClick = onStartGameClick,
                modifier = Modifier
                    .width(200.dp)
                    .padding(bottom = 20.dp)
            ) {
                Text("Spiel starten")
            }

            // Button: Anleitung
            Button(
                onClick = onInstructionsClick,
                modifier = Modifier
                    .width(200.dp)
                    .padding(bottom = 20.dp)
            ) {
                Text("Anleitung")
            }

            // Button: Über die App
            Button(
                onClick = onAboutClick,
                modifier = Modifier.width(200.dp)
            ) {
                Text("Über die App")
            }
        }
    }
}


