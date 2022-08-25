package com.khaledmohamed.am_clinics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.khaledmohamed.am_clinics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            if(!binding.regfirstName.text.isNullOrEmpty()&&
                !binding.regsurName.text.isNullOrEmpty()
                && !binding.regphoneNum.text.isNullOrEmpty()
                &&!binding.regsettPass.text.isNullOrEmpty()
                &&!binding.regconfirmPass.text.isNullOrEmpty())
            {
                if(binding.regsettPass.text.toString().equals(binding.regconfirmPass.text.toString()))
                {
                    var intent = Intent(this, VerificationActivity::class.java)
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