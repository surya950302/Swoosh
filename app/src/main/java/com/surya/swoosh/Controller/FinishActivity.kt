package com.surya.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.surya.swoosh.R
import com.surya.swoosh.Utilities.EXTRA_LEAGUE
import com.surya.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeaguesText.setText("Looking for a $league $skill league near you...")
    }
}