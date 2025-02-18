package sie.edu.primeraclase.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun caja(){

    Box(
        modifier = Modifier
            .background(color = Color.Black)
            .width(100.dp)
            .height(110.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth())
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp),
                horizontalArrangement = Arrangement.SpaceAround)

            {
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "1", color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))

                }
                Box(
                    modifier = Modifier
                        .background( color = Color(0xFF009688))
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "2",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "3",  color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background( color = Color(0xFF009688))
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "4",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier

                            .align(Alignment.Center))
                }
            }
            Row(modifier = Modifier
                .padding(1.dp),
                    horizontalArrangement = Arrangement.SpaceAround)

            {
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "5",  color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))

                }
                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF009688))
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "6",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "7",  color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF009688))
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "8",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
            }
            Row(modifier = Modifier .padding(1.dp),
                horizontalArrangement = Arrangement.SpaceAround)

            {
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "9",  color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))

                }
                Box(
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                        .background(color = Color(0xFF009688)))
                {
                    Text(
                        text = "10",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .background( color = Color(0xFF009688))
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "11", color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                        .background(color = Color(0xFF009688)))
                {
                    Text(
                        text = "12",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .background( color = Color(0xFF009688))
                            .align(Alignment.Center))
                }
            }
            Row(modifier= Modifier .padding(1.dp),
                horizontalArrangement = Arrangement.SpaceAround)

            {
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "13", color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))

                }
                Box(
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                        .background(color = Color(0xFF009688)))
                {
                    Text(
                        text = "14",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .background( color = Color(0xFF009688))
                            .align(Alignment.Center)
                            )
                }
                Box(
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                        .background(color = Color(0xFF009688)))
                {
                    Text(
                        text = " ",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .background( color = Color(0xFF009688))
                            .align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(25.dp)
                        .height(25.dp))
                {
                    Text(
                        text = "15", color = Color(0xFF009688),
                        modifier = Modifier
                            .align(Alignment.Center))
                }
            }
        }
    }
}


