package com.example.contact_recyclerview.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.Models.Note

@Database(entities = arrayOf(Contact::class, Note::class),version =2)
 abstract class ContactsDatabase:RoomDatabase() {
    abstract fun contactsDao(): ContactsDao

    abstract fun NotesDao(): NotesDao
    abstract fun ContactsDao():ContactsDao

    companion object {
        lateinit var context: Context
        var database: ContactsDatabase? = null

        fun getDatabase(context: Context): ContactsDatabase {
            if (database == null) {
                database =
                    Room.databaseBuilder(context, ContactsDatabase::class.java, "ContactsDb")
                        .fallbackToDestructiveMigration().build() //detroes your database
            }
            return database as ContactsDatabase
        }
    }
}
