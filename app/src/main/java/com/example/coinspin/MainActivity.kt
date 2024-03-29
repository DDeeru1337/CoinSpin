package com.example.coinspin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinspin.ui.theme.CoinSpinTheme
import com.example.coinspin.ui.theme.MyWhite

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
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.orel
        2 -> R.drawable.reshka
        3 -> R.drawable.reorel
        else -> R.drawable.oreshka
    }
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(MyWhite)) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(imageResource), contentDescription = result.toString())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            result = (1..4).random()
        }) {
            Text(stringResource(R.string.flip))
        }
        }
    }
}

@Preview
@Composable
fun CoinSpinApp() {
    CoinWithButtonAndImage()
}