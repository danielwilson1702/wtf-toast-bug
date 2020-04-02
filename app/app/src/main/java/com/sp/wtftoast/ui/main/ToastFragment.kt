package com.sp.wtftoast.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sp.wtftoast.R
import kotlinx.android.synthetic.main.toast_fragment.*

class ToastFragment : Fragment() {

    companion object {
        fun newInstance() = ToastFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.toast_fragment, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var version = 0;
        val pm = context?.packageManager
        val applicationInfo = pm?.getApplicationInfo("com.sp.wtftoast", 0);
        if (applicationInfo != null) {
            version = applicationInfo.targetSdkVersion
            message.text = "Target SDK version = $version"
        }

        imageButton.setOnClickListener {
            Toast.makeText(context, "on click! -- " + System.currentTimeMillis(), Toast.LENGTH_SHORT).show()
        }
    }

}
