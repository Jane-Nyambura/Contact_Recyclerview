package com.example.contact_recyclerview.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contact_recyclerview.Models.Contact
import com.example.contact_recyclerview.R
import com.example.contact_recyclerview.ViewModel.ContactsViewModel
import com.example.contact_recyclerview.databinding.ActivityAddContactBinding
import com.example.contact_recyclerview.databinding.ActivityContactDetailsActivitiesBinding

class AddContactActivity : AppCompatActivity() {
    lateinit  var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
         binding = ActivityContactDetailsActivitiesBinding:
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
    }
    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener{
            saveContact()
        }
    }
    fun validateContact(){
        binding.tilName.error=null
        binding.tilPhone.error=null
        binding.tilEmail.error=null

        var name=binding.etName.text.toString()
        var phone=binding.etPhoneNumber.text.toString()
        var email=binding.etEmail.text.toString()
        var error=false


        if(name.isEmpty() || name.isBlank()){
            error=false
            binding.tilName.error=getString(R.string.Name)
        }
        if(phone.isEmpty() || phone.isBlank()){
            error=false
            binding.tilPhone.error="phone is Requied"
        }
        if(email.isEmpty() || email.isBlank()){
            error=false
            binding.tilEmail.error="email is Requied"

        }
        if(!error){
            var contact= Contact(0,name,phone,email,"")
            ContactsViewModel.saveContact(contact)
            binding.etname.setText("")        }

    }
}