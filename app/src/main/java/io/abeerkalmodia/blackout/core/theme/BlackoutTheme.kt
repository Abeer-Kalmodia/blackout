package io.abeerkalmodia.blackout.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val BlackoutDarkColorScheme = darkColorScheme(

    primary = Blue,
    onPrimary = White,

    secondary = BlueDark,
    onSecondary = White,

    background = Black,
    onBackground = White,

    surface = SurfaceBlack,
    onSurface = White,

    surfaceVariant = SurfaceDark,
    onSurfaceVariant = Gray300,

    error = Error,
    onError = White
)

@Composable
fun BlackoutTheme(
    content: @Composable () -> Unit
){

    MaterialTheme(

        colorScheme = BlackoutDarkColorScheme,

        typography = BlackoutTypography,

        content = content

    )

}