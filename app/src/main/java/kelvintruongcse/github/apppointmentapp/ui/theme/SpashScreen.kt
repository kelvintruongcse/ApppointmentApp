package kelvintruongcse.github.apppointmentapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import kelvintruongcse.github.apppointmentapp.R


@Composable
@Preview
fun SpashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .align(Alignment.TopCenter),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.background_green),
                contentDescription = null,
            )
            Image(
                painter = painterResource(R.drawable.women),
                contentDescription = null,
            )
        }

    }
}