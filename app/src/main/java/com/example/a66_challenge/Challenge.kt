package com.example.a66_challenge

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Challenge(
    var bitmap: Bitmap
){
    @PrimaryKey val id: String = ""
}
