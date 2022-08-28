package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityConfirmVisaInfBinding

class Confirm_visa_information_Activity : AppCompatActivity() {

    lateinit var binding: ActivityConfirmVisaInfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmVisaInfBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.paybyvisaBtn.setOnClickListener  {

            if (!binding.cardholderName.text.isNullOrEmpty()
                &&!binding.cardNumid.text.isNullOrEmpty()
                &&!binding.cardmonthId.text.isNullOrEmpty()
                &&!binding.cardyearId.text.isNullOrEmpty()
                &&!binding.cvvId.text.isNullOrEmpty())
            {


                var intent: Intent = Intent(this, Payment_successfully_Activity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Done", Toast.LENGTH_LONG).show()

            }

             else
             {
                Toast.makeText(this, "You should fill all fields correctly", Toast.LENGTH_LONG).show()

             }
        }

        binding.cancelvisaBtn.setOnClickListener {

                var intent: Intent = Intent(this, Cash_or_visa_Activity::class.java)
                startActivity(intent)
                Toast.makeText(this, "back", Toast.LENGTH_LONG).show()

        }


    }

}