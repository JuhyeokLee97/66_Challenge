package com.example.a66_challenge

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

@Entity
data class Challenge(
    val id : String,
    var bitmap: Bitmap
){
    @PrimaryKey(autoGenerate = true)
    var pk: Int? = null
}

class Converters{
    // Bitmap -> ByteArray 변환
    @TypeConverter
    fun toByteArray(bitmap: Bitmap): ByteArray{
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    // ByteArray -> Bitmap 변환
    @TypeConverter
    fun toBitmap(bytes : ByteArray) : Bitmap{
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
    }
}