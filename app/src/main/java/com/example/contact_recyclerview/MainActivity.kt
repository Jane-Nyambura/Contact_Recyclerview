package com.example.contact_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contactList= listOf(
            Contact("Jane","07879897922344","jane@gmail.com"),
            Contact("Kelvin","07954222344","kelvin@gmail.com"),
            Contact("Sam","07988222344","sam@gmail.com"),
            Contact("Joy","0754222344","joy@gmail.com"),
            Contact("June","0754222344","june@gmail.com"),
            Contact("John","0754222344","john@gmail.com"),
            Contact("Rose","0944554222344","rose@gmail.com"),
            Contact("Kenny","078955422","Kennt@gmail.com"),
            Contact("Mary","074222344","mary@gmail.com"),
            Contact("Terry","0744522344","terry@gmail.com"),
            Contact("Simon","074222344","simon@gmail.com"),
        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=ContactAdapter(contactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter

    }
}


