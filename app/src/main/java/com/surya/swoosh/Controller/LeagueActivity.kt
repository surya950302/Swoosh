package com.surya.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.surya.swoosh.Model.Player
import com.surya.swoosh.R
import com.surya.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun leagueNextClicked(view : View){
        val skillIntent = Intent(this, SkillActivity:: class.java )
        if(player.league != ""){
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        }
        else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }
    fun mensOnClicked(view : View){
        womensButton.isChecked = false
        coedButton.isChecked = false

        player.league = "mens"
    }
    fun womensOnClicked(view : View){
        mensButton.isChecked = false
        coedButton.isChecked = false

        player.league = "womens"
    }
    fun coedOnclicked(view : View){
        mensButton.isChecked = false
        womensButton.isChecked = false

        player.league = "co-ed"
    }
}