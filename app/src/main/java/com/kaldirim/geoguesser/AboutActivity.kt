package com.kaldirim.geoguesser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kaldirim.geoguesser.ui.AboutScreenUI
import com.kaldirim.geoguesser.ui.theme.GeoguesserTheme


class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeoguesserTheme {

                AboutScreenUI(onBackClick = { finish() })


        }}
    }
}


