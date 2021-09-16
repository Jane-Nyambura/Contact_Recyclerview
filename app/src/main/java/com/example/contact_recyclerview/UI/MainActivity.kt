package com.example.contact_recyclerview.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_recyclerview.ContactAdapter
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.ViewModel.ContactsViewModel
import com.example.contact_recyclerview.databinding.ActivityMainBinding
import kotlin.contracts.contract

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val contactViewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactViewModel.getContactById(2)
    }

    fun displayContacts(contactsList: List<Contact>){
        binding.rvContact
        var contactsAdapter= ContactAdapter(contactsList,baseContext)
        binding.rvContact.apply {
            var layoutManager = LinearLayoutManager(baseContext)
            binding.rvContact.adapter=contactsAdapter
        }
    }
    override fun onResume() {
        super.onResume()
        contactViewModel.contactLiveData.observe(this, {contact->
            if (contact!=null){
                Toast.makeText(this, contact.contactName, Toast.LENGTH_LONG).
                show()
            }
        })
        binding.rvContact.setOnClickListener {
            startActivity(Intent(this,AddContactActivity::class.java))
        }

    }
//    lateinit var rvContact:RecyclerView
//    var ContactsViewModel=ContactsViewModel by ViewModel()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        ContactsViewModel.getAllContacts()
//
//    }
//    fun displayContact(contactList:List<Contact>){
//        var contactAdapter= ContactAdapter(contactList,baseContext)
//        rvContact.layoutManager=LinearLayoutManager(baseContext)
//        rvContact.adapter=contactAdapter
//    }
//    override fun onResume() {
//        super.onResume()
//       ContactsViewModel.contactLiveData.observe(this,{ contract
//       displayContact(contacts)
//       })
//        binding.fbAddContacts.setOnClickListener{
//            saveContact()
//        }
//    }
}



