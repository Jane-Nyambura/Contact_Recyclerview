package com.example.contact_recyclerview.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.contact_recyclerview.Models.Contact

@Dao
interface ContactsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getAllContacts(): LiveData<List<Contact>>

    @Query("SELECT * FROM contact WHERE contactId = :contactId")
    fun getContactById(contactId: Int): LiveData<Contact>

    @Delete
    fun deleteContact(contact: Contact)
}