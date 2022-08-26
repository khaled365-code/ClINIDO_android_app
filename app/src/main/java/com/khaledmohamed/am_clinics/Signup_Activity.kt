package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivitySignupBinding


class Signup_Activity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            if(!binding.regfirstName.text.isNullOrEmpty()&&
                !binding.regphoneNum.text.isNullOrEmpty()
                &&!binding.regsettPass.text.isNullOrEmpty()
                &&!binding.regconfirmPass.text.isNullOrEmpty())
            {
                if(binding.regsettPass.text.toString().equals(binding.regconfirmPass.text.toString()))
                {
                    var intent = Intent(this, Verification_code_Activity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "please enter the code sent to your mobile", Toast.LENGTH_LONG).show()

                }
                else
                {

                    Toast.makeText(this, "Passwords should be matched", Toast.LENGTH_LONG).show()
                }
            }
            else
            {

                Toast.makeText(this, "You should fill all fields", Toast.LENGTH_LONG).show()

            }
        }
    }
}