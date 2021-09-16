package com.example.contact_recyclerview.Repository

import androidx.lifecycle.LiveData
import com.example.contact_recyclerview.ContacsApp
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.Database.ContactsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    var database=ContactsDatabase.getDatabase(ContacsApp.context)

    suspend fun saveContact(contact: Contact) {
        withContext(Dispatchers.IO) {
            database.contactsDao().insertContact(contact)
        }

    }
    fun getAllContacts(): LiveData<List<Contact>> {
        return database.ContactsDao().getAllContacts()
    }
    fun getContactById(contactId: Int): LiveData<Contact>{
        return database.contactsDao().getContactById(contactId)
    }
}