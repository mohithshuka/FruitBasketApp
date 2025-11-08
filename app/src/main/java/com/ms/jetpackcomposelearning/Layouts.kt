package com.ms.jetpackcomposelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {

//    Column (modifier= Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
//        Text("hello bro..1")
//        Text("hello bro...2")
//        Button(onClick = {}) {
//            Text(text = "Do some thing")
//        }
//
//    }
//    Row(modifier= Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text("hello bro..1")
//        Text("hello bro...2")
//        Button(onClick = {}) {
//            Text(text = "Do some thing")
//        }
//    }
//
//}
    Box(modifier= Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp).align(Alignment.Center)
        )
Text(text = "overlay text", color = Color.Red,modifier= Modifier.align(Alignment.Center))


    }

}

    @Composable
    @Preview(showBackground = true)
    fun ColumnLayoutPrev(modifier: Modifier = Modifier) {
        ColumnExample()

    }
