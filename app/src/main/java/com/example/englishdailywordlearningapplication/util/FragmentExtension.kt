package com.example.englishdailywordlearningapplication.util

import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.toast(text: String) =
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()

fun Fragment.disableUI(disable: Boolean) {
    if (disable)
        requireActivity().window.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    else
        requireActivity().window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
}