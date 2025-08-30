package com.kaldirim.geoguesser.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

val LightColorScheme = lightColorScheme(
    primary = Greenish,
    secondary = LightYellow,
    tertiary = BlueGray,
    background = LightYellow,
    surface = Greenish,
    error = Coral,
    onPrimary = WhiteText,
    onSecondary = BlackText,
    onBackground = BlackText,
    onSurface = WhiteText
)

val DarkColorScheme = darkColorScheme(
    primary = Greenish,
    secondary = LightYellow,
    tertiary = BlueGray,
    background = BlueGray,
    surface = Greenish,
    error = Coral,
    onPrimary = WhiteText,
    onSecondary = BlackText,
    onBackground = WhiteText,
    onSurface = WhiteText
)

@Composable
fun GeoguesserTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
