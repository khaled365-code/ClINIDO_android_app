package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityPaymentForCallBinding

class Payment_for_call_Activity : AppCompatActivity() {

    lateinit var binding: ActivityPaymentForCallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentForCallBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.payvisacallBtn.setOnClickListener {

            if (!binding.patientnameCallid.text.isNullOrEmpty()
                && !binding.patientmobileCallid.text.isNullOrEmpty()
                && !binding.patientcodeCallid.text.isNullOrEmpty())
            {
                if (binding.patientmobileCallid.text.toString().length == 11)
                {

                    var intent:Intent = Intent(this, Confirm_visa_information_Activity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "fill all required visa information to continue", Toast.LENGTH_LONG).show()

                }
                else
                {
                    Toast.makeText(this, "Mobile Number is not correct", Toast.LENGTH_LONG).show()

                }


            }
            else
            {
                Toast.makeText(this, "You should fill all these required fields", Toast.LENGTH_LONG).show()

            }

        }

    }
}