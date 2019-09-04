package com.example.ass4_603020343_4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //addListenerOnButton()

    }

    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun showDetail(v: View) {
        var radioGroup: RadioGroup = findViewById(R.id.radio_gd)
        var selectedId: Int = radioGroup.checkedRadioButtonId;
        var radioButton: RadioButton = findViewById(selectedId);
        show_id.text = "Name : ${edit_id.text} \nPassword : ${edit_pw.text} \n" +
                "Gender : ${radioButton.text} \nE-Mail : ${edit_em.text} \n" +
                "Birthday ${date_id.text}"

    }

    fun reset(v: View){
        edit_id.text.clear()
        edit_pw.text.clear()
        radio_gd.clearCheck()
        edit_em.text.clear()
        date_id.text = "mm / dd / yy"
        show_id.text="Show Information"

    }
}