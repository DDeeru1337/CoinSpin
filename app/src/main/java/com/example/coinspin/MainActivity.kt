package com.example.coinspin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coinspin.ui.theme.CoinSpinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinSpinTheme {
                CoinSpinApp()
            }
        }
    }
}

@Composable
fun CoinWithButtonAndImage(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Preview
@Composable
fun CoinSpinApp() {
    CoinWithButtonAndImage(
        modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}