package com.hss01248.demos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import butterknife.ButterKnife
import com.hss01248.demos.animation.ValueAnimationDemoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       onclicks()
    }

    private fun onclicks() {

        button2.setOnClickListener{
            startActivity(Intent(this, ValueAnimationDemoActivity::class.java))
        }
    }
}
