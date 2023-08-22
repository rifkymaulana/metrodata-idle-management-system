package com.example.metrodataidlemanagementsystem.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.metrodataidlemanagementsystem.R
import com.example.metrodataidlemanagementsystem.navigation.PostOfficeAppRouter
import com.example.metrodataidlemanagementsystem.navigation.Screen
import com.example.metrodataidlemanagementsystem.navigation.SystemBackButtonHandler
import com.example.metrodataidlemanagementsystem.ui.theme.Primary

data class Item(val id: Int, val title: String, val imageResId: Int, val description: String)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            TopAppBar(
                title = { Text(text = "Dashboard") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Primary),
                modifier = Modifier.fillMaxWidth(),
                navigationIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(16.dp)
                            .size(24.dp)
                    )
                },
            )
            Spacer(modifier = Modifier.height(8.dp))
            val items = generateSampleData()

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(items.chunked(2)) { rowItems ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        for (item in rowItems) {
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(horizontal = 8.dp)
                            ) {
                                CardItem(item = item)
                            }
                        }
                    }
                }
            }
        }
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
    }
}

@Composable
fun CardItem(item: Item) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .height(180.dp)
            .clickable {
                /* Handle card click here, navigate to detail screen */
                PostOfficeAppRouter.navigateTo(Screen.DetailScreen, item)
            },
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
            ) {
                val (image, title) = createRefs()

                Image(
                    painter = painterResource(id = item.imageResId),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .constrainAs(image) {
                            start.linkTo(parent.start)
                            bottom.linkTo(parent.bottom)
                        },
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center
                )

                Text(
                    text = item.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .constrainAs(title) {
                            top.linkTo(image.bottom)
                            start.linkTo(parent.start)
                        },
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun generateSampleData(): List<Item> {
    return listOf(
        Item(
            1,
            "Card 1",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. "
        ),
        Item(
            2,
            "Card 2",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. "
        ),
        Item(
            3,
            "Card 3",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. "
        ),
        Item(
            4,
            "Card 4",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable."
        ),
        Item(
            5,
            "Card 5",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised."
        ),
        Item(
            6,
            "Card 6",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised."
        ),
        Item(
            7,
            "Card 7",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised."
        ),
        Item(
            8,
            "Card 8",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised."
        ),
        Item(
            9,
            "Card 9",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour."
        ),
        Item(
            10,
            "Card 10",
            R.drawable.profile,
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour."
        ),

        // Add more items here...
    )
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}