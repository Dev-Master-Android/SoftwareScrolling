package com.example.softwarescrolling

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.softwarescrolling.PersonalList.personalList
import com.example.softwarescrolling.ui.theme.Pink80
import com.example.softwarescrolling.ui.theme.SoftwareScrollingTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HRDepartment() {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    val groups = personalList.groupBy { it.employee }
    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(6.dp)
    ) {
        item {
            Text(
                text = "В конец",
                modifier = Modifier
                    .padding(6.dp, top = 24.dp, bottom = 24.dp)
                    .background(Color.Gray)
                    .padding(6.dp)
                    .clickable {
                        coroutineScope.launch {
                            listState.animateScrollToItem(listState.layoutInfo.totalItemsCount - 1)
                        }
                    },
                fontSize = 28.sp,
                color = Color.White
            )
        }
        groups.forEach { (employee, employees) ->
            stickyHeader {
                Text(
                    text = employee,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .background(Pink80)
                        .padding(6.dp)
                        .fillParentMaxWidth()
                )
            }
            items(employees.size) { index ->
                val employee = employees[index]
                Text(
                    text = employee.name,
                    modifier = Modifier.padding(6.dp),
                    fontSize = 32.sp,
                )
                Text(
                    text = employee.lastName,
                    modifier = Modifier.padding(6.dp),
                    fontSize = 32.sp,
                )
            }
        }
        item {
            Text(
                text = "В начало",
                modifier = Modifier
                    .padding(8.dp, bottom = 36.dp, top = 24.dp)
                    .background(Color.Gray)
                    .padding(6.dp)
                    .clickable {
                        coroutineScope.launch {
                            listState.animateScrollToItem(0)
                        }
                    },
                fontSize = 28.sp,
                color = Color.White
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun HRDepartmentPreview() {
    SoftwareScrollingTheme {
        HRDepartment()
    }
}