
    package com.kaldirim.geoguesser

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import com.kaldirim.geoguesser.ui.GameScreenUI
    import com.kaldirim.geoguesser.ui.theme.GeoguesserTheme

    class GameActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                GeoguesserTheme {
                GameScreenUI( onBackClick = { finish() } // schließt die Activity und geht zurück
                )}

            }
        }
    }

