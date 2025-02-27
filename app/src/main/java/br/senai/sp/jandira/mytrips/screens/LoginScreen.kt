package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xffffffff)
            ),
    ){
            Card (
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .width(160.dp)
                    .height(50.dp),

                shape = RoundedCornerShape(
                    bottomStart = 20.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff87cefa)
                    )
            ){ }
            Card (
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .width(160.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(
                    topEnd = 20.dp,
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff87cefa)
                    )
            ){  }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(28.dp),
            verticalArrangement = Arrangement.Center
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
            ){
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    color = Color(0xff87cefa),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    modifier = Modifier
                        .padding(bottom = 70.dp),
                    text = stringResource(
                        R.string.login_subtitle
                    ),
                    color = Color(0xFFB0B0B0),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 25.dp),
                    shape = RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp,
                        bottomStart = 15.dp,
                        bottomEnd = 15.dp,
                    ),
                    value = "",
                    onValueChange = {},
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 25.dp),
                    shape = RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp,
                        bottomStart = 15.dp,
                        bottomEnd = 15.dp,
                    ),
                    value = "",
                    onValueChange = {},
                )
                Button(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(bottom = 18.dp),
                    onClick = {},
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xff87cefa)
                    )
                ) {
                    Text(
                        text = stringResource(
                            R.string.button_sign_in
                        ),
                        color = Color(0xffffffff)
                    )
                }
                Row (
                    modifier = Modifier
                        .align(Alignment.End)
                ){
                    Text(
                        text = stringResource(
                            R.string.sign_up
                        ),
                        color = Color(0xFFB0B0B0),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        text = stringResource(
                            R.string.sign_up_link
                        ),
                        color = Color(0xff87cefa),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium

                    )
                }



            }
        }

        }
    }

@Preview(showSystemUi = true)
@Composable
private fun LoginScreenPreview(){
    LoginScreen()
}
