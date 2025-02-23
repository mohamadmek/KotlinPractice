package com.example.bankingui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.Start
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingui.data.Finance
import com.example.bankingui.ui.theme.BlueStart
import com.example.bankingui.ui.theme.GreenStart
import com.example.bankingui.ui.theme.OrangeStart
import com.example.bankingui.ui.theme.PurpleStart

val financeList = listOf(
    Finance(
        icon = Icons.Rounded.Star,
        name = "My\nBusiness",
        background = OrangeStart
    ),
    Finance(
        icon = Icons.Rounded.Wallet,
        name = "My\nWallet",
        background = BlueStart
    ),
    Finance(
        icon = Icons.Rounded.Start,
        name = "My\nFinance",
        background = PurpleStart
    ),
    Finance(
        icon = Icons.Rounded.MonetizationOn,
        name = "My\nTransactions",
        background = GreenStart
    )
)

@Preview
@Composable
fun FinanceSection() {
    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow {
            items(financeList.size) {
                FinanceItem(it)
            }
        }
    }
}

@Composable
fun FinanceItem(
    index: Int
) {
    val finance = financeList[index]
    var lastPaddingEnd = 0.dp
    if(index == financeList.size - 1) {
        lastPaddingEnd = 16.dp
    }
    Box(modifier = Modifier
        .padding(start = 16.dp, end = lastPaddingEnd)) {


    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .size(120.dp)
            .clickable {  }
            .padding(13.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .padding(6.dp)
                .background(finance.background)
        ) {
            Icon(
                imageVector = finance.icon,
                contentDescription = finance.name,
                tint = Color.White
            )
        }
        Text(
            text = finance.name,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            fontWeight = FontWeight.SemiBold,
        )
    }
}
}