package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFFD8ECD4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        //SubColumn
        Column(
            modifier = Modifier
                .padding(bottom = 80.dp)
        ) {
            val image = painterResource(id = R.drawable.mati3)
            Image(
                painter = image, contentDescription = null,
//           colorFilter = ColorFilter.tint(Color.Transparent),
//            contentScale = ContentScale.Fit,
                modifier = Modifier
                    .clip(CircleShape)
                    .padding(start = 10.dp)
                    .size(200.dp)
                //   .height(40.dp)
//                    .width(120.dp)

            )

            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = stringResource(R.string.Sur_name),
                color = Color.Black,
                // fontWeight =
                fontSize = 43.sp,
            )
            //Occupation
            Text(
                modifier = Modifier
                    .padding(bottom = 80.dp),
                text = stringResource(R.string.Ocupation),
                color = Color(0xFF207D4E),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
        }

    }
//2nd Column
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, bottom = 10.dp)
        ) {
            val icon1 = painterResource(id = R.drawable.phon3)
            Icon(
                painter = icon1, contentDescription = null,
                modifier = Modifier
                    .padding(start = 40.dp)
                    .padding(bottom = 5.dp),
                Color(0xFF207D4E),
            )

            Text(
                text = stringResource(id = R.string.Phone_Text),
                modifier = Modifier
                    .padding(start = 25.dp),
                color = Color.Black,
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, bottom = 10.dp)
        ) {
            val icon2 = painterResource(id = R.drawable.share2)
            Icon(
                painter = icon2, contentDescription = null,
                modifier = Modifier
                    .padding(start = 40.dp, top = 5.dp)
                    .padding(bottom = 5.dp),
                Color(0xFF207D4E),
            )
            Text(
                text = stringResource(id = R.string.share_text),
                modifier = Modifier
                    .padding(start = 25.dp, top = 5.dp)
                    .padding(bottom = 5.dp),
                color = Color.Black
            )

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, bottom = 10.dp)
        ) {
            val icon2 = painterResource(id = R.drawable.phon3)
            Icon(
                painter = icon2, contentDescription = null,
                modifier = Modifier
                    .padding(start = 40.dp, top = 5.dp),
                Color(0xFF207D4E),
            )
            Text(
                text = stringResource(id = R.string.email_text),
                modifier = Modifier
                    .padding(start = 25.dp, top = 5.dp),
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessApp()
        //Greeting("Android")
    }
}