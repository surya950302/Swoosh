package com.surya.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view : View){
        val skillIntent = Intent(this,SkillActivity :: class.java )
        skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
        if(selectedLeague != ""){
            startActivity(skillIntent)
        }
        else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }
    fun mensOnClicked(view : View){
        womensButton.isChecked = false
        coedButton.isChecked = false

        selectedLeague = "mens"
    }
    fun womensOnClicked(view : View){
        mensButton.isChecked = false
        coedButton.isChecked = false

        selectedLeague = "womens"
    }
    fun coedOnclicked(view : View){
        mensButton.isChecked = false
        womensButton.isChecked = false

        selectedLeague = "coed"
    }
}