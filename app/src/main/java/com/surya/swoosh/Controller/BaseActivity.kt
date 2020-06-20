package com.surya.swoosh.Controller

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${this.localClassName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${this.localClassName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${this.localClassName} OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${this.localClassName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${this.localClassName} OnStop")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d(TAG,"${this.localClassName} OnDestroy ")
        super.onDestroy()
    }
    override fun onRestart() {
        Log.d(TAG,"${this.localClassName} OnRestart")
        super.onRestart()
    }
}