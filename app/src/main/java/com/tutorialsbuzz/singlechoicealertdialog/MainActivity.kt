package com.tutorialsbuzz.singlechoicealertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun singleChoiceItem(view: View) {
        val singleChoiceList = arrayOf("google", "yahoo", "bing", "yandex", "baidu", "duckduckgo")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Select Search Engine")

        builder.setItems(singleChoiceList, { dialogInterface, which ->
            Toast.makeText(this@MainActivity, singleChoiceList[which], Toast.LENGTH_SHORT).show()
        })

        // builder.create().show();
        val alertDialog = builder.create()
        alertDialog.show()
    }

    fun singleChoiceDialog(view: View) {

        val singleChoiceList = arrayOf("google", "yahoo", "bing", "yandex", "baidu", "duckduckgo")
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Select Search Engine")

        builder.setSingleChoiceItems(singleChoiceList, -1,
            { dialogInterface, which ->
                Toast.makeText(this@MainActivity, singleChoiceList[which], Toast.LENGTH_SHORT).show()
            }
        )

        builder.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, id ->
            dialog.dismiss()
        })
        builder.setNegativeButton("cancel", { dialog, id ->
            dialog.dismiss()
        })

        // builder.create().show();
        val alertDialog = builder.create()
        alertDialog.show()
    }

}
