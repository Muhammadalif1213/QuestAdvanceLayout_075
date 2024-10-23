package com.example.project3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxSize()) {
        SectionHeader()
        Text(text = "kpd yth:")
        Text(text = "Jodi")
        MainSection(
            JudulParam = "Nama", IsiParam = "Alifian"
        )
        MainSection(JudulParam = "Kelas", IsiParam = "B")
        MainSection(JudulParam = "NIM", IsiParam = "20220140075")
        MainSection(JudulParam = "Keterangan", IsiParam = "Sehat")
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray) ){
        Row {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(
                    painter = painterResource(id = R.drawable.epos),
                    contentDescription = "",
                    Modifier
                        .size(100.dp)
                        .padding(vertical = 10.dp)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "",
                    Modifier
                        .padding(end = 8.dp)
                        .size(30.dp),
                    tint = Color.Green,
                )
            }
            Column (modifier = Modifier
                .padding(15.dp)){
                Text(text = "EVOS", color = Color.White)
                Spacer(Modifier
                    .padding(3.dp))
                Text(text = "Epos Epos di sini", color = Color.White)
            }
        }
    }
}

@Composable
fun MainSection(JudulParam: String, IsiParam: String){
    Column (horizontalAlignment = Alignment.Start){
        Row (
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ){
            Text(text = JudulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$IsiParam", modifier = Modifier.weight(2f))
        }
    }
}