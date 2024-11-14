package com.example.gesttaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gesttaches.ui.theme.GestTachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GestTachesTheme {
                GestTaches(text1 = stringResource(R.string.text1),
                    text2 = stringResource(R.string.text2)
                )
            }
        }
    }
}

@Composable
fun GestTaches(text1: String, text2: String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "Image check"
        )
        Text(
            text = text1, fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp , bottom = 8.dp)
        )
        Text(
            text = text2, fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GestTachesPreview() {
    GestTachesTheme {
        GestTaches(text1 = stringResource(R.string.text1), text2 = stringResource(R.string.text2))
    }
}


