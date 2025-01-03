package com.example.myhamburgapp.data

import com.example.myhamburgapp.R
import com.example.myhamburgapp.model.City

object LocalCitiesDataProvider {
    val defaultCity = City(
        id = -1,
        title = -1,
        shortDescription = -1,
        longDescription = -1,
        image = R.drawable.avatar_0
    )

    private val allCities = listOf(
        City(
            id = 2,
            title = R.string.title_2,
            shortDescription = R.string.short_description_2,
            longDescription = R.string.description_2,
            image = R.drawable.avatar_2
        ),
        City(
            id = 3,
            title = R.string.title_3,
            shortDescription = R.string.short_description_3,
            longDescription = R.string.description_3,
            image = R.drawable.avatar_3
        ),
        City(
            id = 4,
            title = R.string.title_4,
            shortDescription = R.string.short_description_4,
            longDescription = R.string.description_4,
            image = R.drawable.avatar_4
        ),
        City(
            id = 5,
            title = R.string.title_5,
            shortDescription = R.string.short_description_5,
            longDescription = R.string.description_5,
            image = R.drawable.avatar_5
        ),
        City(
            id = 6,
            title = R.string.title_6,
            shortDescription = R.string.short_description_6,
            longDescription = R.string.description_6,
            image = R.drawable.avatar_6
        ),
        City(
            id = 7,
            title = R.string.title_7,
            shortDescription = R.string.short_description_7,
            longDescription = R.string.description_7,
            image = R.drawable.avatar_7
        )
    )
}