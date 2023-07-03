package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var showButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        showButton = findViewById(R.id.showButton);

        showButton.setOnClickListener {

            val dialog = BottomSheetDialog(this)

            val view = layoutInflater.inflate(R.layout.bottom_sheet_fragment, null)

            val btnClose = view.findViewById<Button>(R.id.cancel)



            btnClose.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setCancelable(false)

            dialog.setContentView(view)

            dialog.show()
        }


    }
}