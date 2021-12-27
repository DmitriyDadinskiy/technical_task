package com.kotlinmovie.technicaltask

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import com.kotlinmovie.technicaltask.databinding.FragmentBlankListErrorBinding

class BlankFragmentListError : Fragment(R.layout.fragment_blank_list_error) {

    private var viewBinding: FragmentBlankListErrorBinding? = null
   private var keepReason: String = ""
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentBlankListErrorBinding.bind(view)
        initTextView()
    }
    private fun initTextView() {
       viewBinding?.checkBox?.setOnClickListener {
          keepReason = getText(R.string.first_reason).toString()
           clickTextView()
       }
        viewBinding?.checkBox2?.setOnClickListener {
            keepReason = getText(R.string.refusal).toString()
            clickTextView()
        }
        viewBinding?.checkBox3?.setOnClickListener {
            keepReason = getText(R.string.first_reason).toString()
            clickTextView()
        }
        viewBinding?.checkBox4?.setOnClickListener {
            keepReason = getText(R.string.first_reason).toString()
            clickTextView()
        }
        viewBinding?.checkBox5?.setOnClickListener {
            keepReason = getText(R.string.first_reason).toString()
            clickTextView()
        }
        viewBinding?.checkBox6?.setOnClickListener {
            keepReason = getText(R.string.first_reason).toString()
            clickTextView()
        }
        viewBinding?.checkBox7?.setOnClickListener {
            keepReason = getText(R.string.first_reason).toString()
        }
    }
    private fun clickTextView(): Boolean {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("ВНИМНИЕ вы выбрали: ")
            .setMessage("${this.keepReason}")
            .setIcon(R.drawable.ic_launcher_foreground)
            .setCancelable(true)
            .setPositiveButton("Ok") { dialog: DialogInterface?, which: Int ->
                Toast.makeText(context, "Причина отправлена на сервер", Toast.LENGTH_LONG).show()
               activity?.onBackPressed()
            }
            .setNegativeButton("Cancel") { _: DialogInterface?, _: Int -> Toast.makeText(context, "Отмена", Toast.LENGTH_LONG).show() }
            .show()
        return true
    }


    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}