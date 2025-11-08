package com.ms.jetpackcomposelearning.screens


//import androidx.compose.material3.Text
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.material3.darkColorScheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.graphicsLayer
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import java.nio.file.Files.copy
//import com.ms.jetpackcomposelearning.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ms.jetpackcomposelearning.R



//@Composable
//fun WelcomeScreen(modifier: Modifier = Modifier) {
//    Column(modifier=modifier.fillMaxSize().background(color = Color.White)) {
//
//        Box(
//            modifier=modifier.fillMaxSize().weight(0.65f).background(
//                brush = Brush.verticalGradient(colors = listOf(Color(0xFFFF8C42),
//                    Color(0xFFFF7A2B)
//                )
//                )
//            ),
//            contentAlignment = Alignment.Center
//        ){
//            Box(
//                modifier = modifier
//                    .size(300.dp)
//                    .background(Color.White.copy(alpha = 0.23f), shape = CircleShape),
//                contentAlignment = Alignment.Center
//            ){
//                Image(painter = painterResource(R.drawable.fruit_basket_image), contentDescription = null,modifier=modifier.size(160.dp))
//            }
//
//        }
//        Column  (modifier= Modifier.fillMaxSize().weight(0.35f).padding(horizontal = 24.dp, vertical = 32.dp),
//            horizontalAlignment =Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ){
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Text(
//                    text = "Get the Freshest Fruit Salad Combo",
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color(0xFF272140),
//                    textAlign = TextAlign.Center, lineHeight = 28.sp
//                )
//                Spacer(modifier=modifier.height(16.dp))
//
//                Text(text="We deliver the best abd freshest fruit salad in town.Order for a combo today!!!",
//                    fontSize = 16.sp,
//                    color=Color(0xFF50577E),
//                    textAlign = TextAlign.Center, lineHeight = 24.sp
//                )
//                Spacer(modifier=modifier.height(26.dp))
//                Button(onClick = {},modifier=modifier,
//                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42)),
//                    shape=RoundedCornerShape(16.dp)){
//                    Text(text="Let's Continue", fontSize =16.sp,
//                        fontWeight= FontWeight.Medium, color = Color.White)
//                }
//            }
//
//        }
//
//
////        main column
//
//    }
//
//}
@Composable
fun WelcomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(color = Color.White)) {

        // Top section (Image with gradient background)
        Box(
            modifier = modifier
                .fillMaxSize()
                .weight(0.65f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFF8C42),
                            Color(0xFFFF7A2B)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = modifier
                    .size(300.dp)
                    .background(Color.White.copy(alpha = 0.23f), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.fruit_basket_image),
                    contentDescription = null,
                    modifier = modifier.size(160.dp)
                )
            }
        }

        // Bottom section (Text + Button)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.35f)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Get the Freshest Fruit Salad Combo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF272140),
                textAlign = TextAlign.Center,
                lineHeight = 28.sp
            )

            Spacer(modifier = modifier.height(16.dp))

            Text(
                text = "We deliver the best and freshest fruit salad in town. Order your combo today!",
                fontSize = 16.sp,
                color = Color(0xFF50577E),
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )

            Spacer(modifier = modifier.height(26.dp))

            //  Navigation Button
            Button(
                onClick = {
                    navController.navigate("home") {
                        popUpTo("welcome") { inclusive = true }
                    }
                },
                modifier = modifier,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42)),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Let's Continue",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }
        }
    }
}



//@Composable
//@Preview(showBackground = true)
//fun WelcomeScreenprev(modifier: Modifier = Modifier) {
//    WelcomeScreen()
//}