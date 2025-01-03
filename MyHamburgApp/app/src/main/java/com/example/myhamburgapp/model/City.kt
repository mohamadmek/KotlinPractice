package com.example.myhamburgapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(
  val id: Long,
  @StringRes val title: Int,
  @StringRes val shortDescription: Int,
  @StringRes val longDescription: Int,
  @DrawableRes val image: Int
)
