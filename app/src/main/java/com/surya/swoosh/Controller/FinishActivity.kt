package com.surya.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.surya.swoosh.Model.Player
import com.surya.swoosh.R
import com.surya.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        searchLeaguesText.setText("Looking for a ${player.league} ${player.skill} league near you...")
    }
}