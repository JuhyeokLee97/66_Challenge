package com.example.a66_challenge.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.a66_challenge.Challenge
import com.example.a66_challenge.ChallengeDao
import com.example.a66_challenge.Converters

@Database(entities = [Challenge::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase(){
    abstract fun challengeDao(): ChallengeDao
}