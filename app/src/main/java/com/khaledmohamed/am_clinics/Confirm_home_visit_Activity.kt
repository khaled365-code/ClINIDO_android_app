package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityConfirmHomeVisitBinding

class Confirm_home_visit_Activity : AppCompatActivity() {

    lateinit var binding:ActivityConfirmHomeVisitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityConfirmHomeVisitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.confirmhomevisitBtn.setOnClickListener {

            if (!binding.pnameConfirmvisitid.text.isNullOrEmpty()
                && !binding.pnumberConfirmvisitid.text.isNullOrEmpty()
                && !binding.paddressConfirmvisitid.text.isNullOrEmpty())
            {

                if (binding.pnumberConfirmvisitid.text.toString().length == 11)
                {

                    var intent: Intent = Intent(this, Exit_Activity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "the service will be arrived after some minutes...", Toast.LENGTH_LONG).show()

                }
                else
                {
                    Toast.makeText(this, "Mobile Number is not correct", Toast.LENGTH_LONG).show()

                }

            }
            else
            {
                Toast.makeText(this, "You should fill all these fields", Toast.LENGTH_LONG).show()

            }

        }

        }
}
