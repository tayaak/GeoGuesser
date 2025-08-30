package com.kaldirim.geoguesser.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kaldirim.geoguesser.ui.components.BackButton

@Composable
fun AboutScreenUI(onBackClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Diese GeoGuesser App wurde im Rahmen der Modulabschlussprüfung gebaut.",
                color = MaterialTheme.colorScheme.onBackground

            )

            Spacer(modifier = Modifier.height(16.dp)) // Abstand zum Button

            BackButton(onClick = onBackClick)

        }
    }
}



