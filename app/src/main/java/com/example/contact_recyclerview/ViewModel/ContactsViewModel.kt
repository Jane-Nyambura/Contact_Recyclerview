package com.example.contact_recyclerview.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {
    lateinit var contactLiveData: LiveData<Contact>
    val contactsRepository = ContactsRepository()
    lateinit var contact: Contact

fun saveContact(contact: Contact) {
    viewModelScope.launch {
        contactsRepository.saveContact(contact)
    }
}
    fun getContactById(contactId: Int) {
        contactLiveData = contactsRepository.getContactById(contactId)
    }
//    fun getAllContacts() {
//        val contactsL
//        var contactsLiveData = contactsRepository.getAllContacts()
//
//    }

    fun getContactById() {

    }
}