package com.example.contact_recyclerview.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.contact_recyclerview.R
import com.example.contact_recyclerview.databinding.ActivityContactDetailsActivitiesBinding
import com.squareup.picasso.Picasso

class ContactDetailsActivities : AppCompatActivity() {
    lateinit var binding: ActivityContactDetailsActivitiesBinding
    lateinit var cvCardView: CardView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsave.setOnClickListener {
            val intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)

            val contactId = intent1.getStringExtra("contactId")

            Toast.makeText(baseContext, "These are your contact details", Toast.LENGTH_LONG).show()
        }


    }
}
//    lateinit var cvContact: CardView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_contact_details_activities)
//        var name=intent.getStringExtra("name")
//        var phoneNumber=intent.getStringExtra("phoneNumber")
//        var email=intent.getStringExtra("Email")
//        var imageUrl=intent.getStringExtra("image")
//
//
//        var intentName=findViewById<TextView>(R.id.tvname)
//        var Number=findViewById<TextView>(R.id.tvphone)
//        var emaill=findViewById<TextView>(R.id.tvemail)
//        var ivimage=findViewById<ImageView>(R.id.ivimage)
//
//
//        Picasso.get()
//            .load(imageUrl)
//            .resize(200,200)
//            .centerCrop()
//            .into(ivimage)
//        intentName.text=name
//        Number.text=phoneNumber
//        emaill.text=email
//
//


//        Toast.makeText(baseContext, "name", Toast.LENGTH_SHORT).show






