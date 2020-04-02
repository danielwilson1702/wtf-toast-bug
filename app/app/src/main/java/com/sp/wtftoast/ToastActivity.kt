package com.sp.wtftoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sp.wtftoast.ui.main.ToastFragment

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ToastFragment.newInstance())
                    .commitNow()
        }
    }
}
