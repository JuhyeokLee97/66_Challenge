package com.example.a66_challenge

import androidx.room.*

@Dao
interface ChallengeDao {
    @Insert
    fun insert(challenge: Challenge)

    @Update
    fun update(challenge: Challenge)

    @Delete
    fun delete(challenge: Challenge)

    @Query("SELECT * FROM Challenge WHERE id = :id")
    fun getChallenge(id: String): Challenge
}