package com.ms.jetpackcomposelearning.screens

//import android.content.res.Resources
//import androidx.compose.foundation.Image
//
//i}mport androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material.icons.filled.FavoriteBorder
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.modifier.modifierLocalConsumer
//
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.LineHeightStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.FontScaling
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.window.Popup
//import com.ms.jetpackcomposelearning.R
//
//
//
//@Composable
//fun HomeScreen(modifier: Modifier = Modifier) {
//    Column (modifier=modifier
//        .fillMaxSize()
//        .background(color = Color.White)
//        .padding(vertical = 16.dp)
//    ){
//        Row (modifier=modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
////        verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(imageVector = Icons.Default.Menu,
//                contentDescription = null,
//                tint=Color(0xFF272140),
//                modifier = Modifier.size(24.dp)
//            )
//            Column (horizontalAlignment = Alignment.CenterHorizontally,){
//                Image(painter = painterResource(R.drawable.shopping_basket),
//                    contentDescription = null,modifier=modifier.size(28.dp)
//                )
//                Text(text="My basket", fontSize = 12.sp, color = Color(0xFF272140))
//                Spacer(modifier=modifier.height(4.dp))
//
//            }
//
//        }
//
////        greeting text
//        Text(text="Hello what do You want to have", fontSize = 20.sp,
//            fontWeight = FontWeight.Bold,
//            color=Color(0xFF272140),
//            lineHeight = 28.sp,
//            modifier=modifier.padding(bottom = 24.dp)
//        )
////        search bar
//        Row (modifier=modifier
//            .fillMaxWidth()
//            .background(
//                color = Color(0xFFE0DDDD),
//                shape = RoundedCornerShape(16.dp)
//            )
//            .padding(16.dp), verticalAlignment = Alignment.CenterVertically
//        ){
//            Icon(imageVector=Icons.Default.Search,
//                contentDescription = null,
//            )
//            Spacer(modifier=modifier.width(12.dp))
//            Text(text="Search for what you need",
//                fontSize = 20.sp,
//                color = Color(0xFF86869E))
//            Spacer(modifier=modifier.width(60.dp))
//            Icon(painter = painterResource(R.drawable.filter_list),
//                contentDescription = null,
//                modifier=modifier.height(32.dp)
//            )
//        }
//        Spacer(modifier=modifier.width(80.dp))
//        Text(text="Recomendation", fontSize = 24.sp, fontWeight = FontWeight.Medium,
//            color = Color.Black,modifier=Modifier.padding(16.dp))
//        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
//            modifier=Modifier.padding(16.dp)) {
//            items(2){ index->
//                Recomend(
//                    name = if (index == 0) "Honey limb combo" else "Berry limb combo",
//                    price = if(index==0)"150rs" else "110rs",
//                    imageResources = if(index==0)R.drawable.food_1 else R.drawable.food_2,
//                )
//
//            }
//
//        }
////        catagare tab
////        LazyRow (horizontalArrangement = Arrangement.spacedBy(24.dp),
////            modifier=Modifier.padding(16.dp)){
////            items(listOf("Hottest","Popular","New combo")) { categore ->
////                Text(
////                    text = categore,
////                    fontSize = 16.sp,
////                    fontWeight = if (categore == "Hottest") FontWeight.Bold else FontWeight.Normal
////                )
////
////            }
//        LazyRow(
//            horizontalArrangement = Arrangement.spacedBy(24.dp),
//            modifier = Modifier.padding(16.dp)
//        ) {
//            items(listOf("Hottest")) { category ->
//
//                // Each category section
//                Column(
//                    horizontalAlignment = Alignment.Start
//                ) {
//                    // Category name
//                    Text(
//                        text = category,
//                        fontSize = 16.sp,
//                        fontWeight = if (category == "Hottest") FontWeight.Bold else FontWeight.Normal,
//                        color = Color(0xFF272140)
//                    )
//
//                    Spacer(modifier = Modifier.height(8.dp))
//
//                    // Row with 2 pictures (Recomend cards)
//                    Row(
//                        horizontalArrangement = Arrangement.spacedBy(16.dp)
//                    ) {
//                        Recomend(
//                            name = if (category == "Hottest") "Limb Combo" else "Berry Limb Combo",
//                            price = if (category == "Hottest") "150rs" else "120rs",
//                            imageResources = R.drawable.food_4
//                        )
//
//                        Recomend(
//                            name = if (category == "Hottest") "Mango Mix" else "Citrus Boost",
//                            price = if (category == "Hottest") "180rs" else "140rs",
//                            imageResources = R.drawable.food_2
//                        )
//                    }
//                }
//            }
//        }
//
//
//
//
//
//
//
//    }
//
//}
//
//
//
//
////    main column
//
//@Composable
//fun Recomend(modifier: Modifier = Modifier,name: String,price: String,imageResources: Int) {
//    Card(
//        modifier=modifier.width(152.dp), shape = RoundedCornerShape(16.dp),
//        colors = CardDefaults.cardColors(containerColor = Color.White),
//        elevation = CardDefaults.cardElevation(4.dp)
//    ){
//        Column (modifier=modifier.padding(start=26.dp)){
//            Row (modifier=modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.End){
//                Icon(imageVector = Icons.Default.FavoriteBorder,
//                    contentDescription = null,tint=Color(0xFFE67C3B),
//                    modifier = Modifier.size(20.dp))
//
//
//
//            }
//            Image(
//                painter = painterResource(id = imageResources),
//                contentDescription = null,
//                modifier=modifier.size(80.dp),
//            )
//            Spacer(modifier=modifier.height(12.dp))
//            Text(text=name, fontSize = 16.sp, fontWeight = FontWeight.Medium, color = Color.Black,)
//            Spacer(modifier=modifier.height(8.dp))
//            Row (modifier=modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically){
//                Text(text = price, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black)
//                Icon(imageVector = Icons.Default.Add, contentDescription = null,
//                    modifier=modifier.size(24.dp).
//                    background(color = Color(0xFFFFF2E7),
//                        shape = CircleShape).padding(4.dp))
//            }
//        }
//
//
//    }
//
//}
//
//@Composable
//@Preview(showBackground = true)
//fun HomeScreenPrev(modifier: Modifier = Modifier) {
//    HomeScreen()
//}




import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ms.jetpackcomposelearning.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var showMenu by remember { mutableStateOf(false) }     // ⚙️ settings dropdown
    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }  // 🔍 search input text

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 16.dp)
    ) {
        // 🔹 Top bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left-side Menu Icon
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color(0xFF272140),
                modifier = Modifier.size(24.dp)
            )

            // Right-side Basket and Settings
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = "Basket",
                    modifier = Modifier.size(28.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))

                // ⚙️ Settings Icon Button
                IconButton(onClick = { showMenu = !showMenu }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        tint = Color(0xFF272140)
                    )
                }

                // ⚙️ Dropdown Menu
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("Profile") },
                        onClick = { showMenu = false }
                    )
                    DropdownMenuItem(
                        text = { Text("Notifications") },
                        onClick = { showMenu = false }
                    )
                    DropdownMenuItem(
                        text = { Text("Logout") },
                        onClick = { showMenu = false }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Greeting
        Text(
            text = "Hello, what do you want to have?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF272140),
            lineHeight = 28.sp,
            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
        )

        // 🔍 Search bar — accepts string input
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { newValue ->
                searchQuery = newValue
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color(0xFF272140)
                )
            },
            placeholder = { Text("Search for what you need") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(Color.White, shape = RoundedCornerShape(16.dp)),
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF8C42),
                unfocusedBorderColor = Color(0xFFE0DDDD)
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Show what user typed (just for testing)
        if (searchQuery.text.isNotEmpty()) {
            Text(
                text = "You searched: ${searchQuery.text}",
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color(0xFF50577E),
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Recommendation Section
        Text(
            text = "Recommendations",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            items(listOf(
                Triple("Honey Limb Combo", "150₹", R.drawable.food_1),
                Triple("Berry Limb Combo", "110₹", R.drawable.food_2),
                Triple("Mango Mix", "180₹", R.drawable.food_4)
            )) { (name, price, image) ->
                RecommendCard(name, price, image)
            }
        }
    }
}

@Composable
fun RecommendCard(name: String, price: String, imageResources: Int) {
    Card(
        modifier = Modifier.width(152.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Favorite",
                tint = Color(0xFFE67C3B),
                modifier = Modifier.align(Alignment.End)
            )
            Image(
                painter = painterResource(imageResources),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(price, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color(0xFFE67C3B),
                    modifier = Modifier
                        .background(Color(0xFFFFF2E7), shape = CircleShape)
                        .padding(4.dp)
                        .size(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
