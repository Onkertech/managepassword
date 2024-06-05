package com.vk.jetpackpract.home.data
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [PasswordEntity::class],
    version = 3,
    exportSchema = false

)
abstract class PasswordDatabase:RoomDatabase() {
    abstract fun PasswordDao():PasswordDao
}