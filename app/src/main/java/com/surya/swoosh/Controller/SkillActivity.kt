package com.surya.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.surya.swoosh.Model.Player
import com.surya.swoosh.R
import com.surya.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player :  Player
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState!= null){
            player= savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }

    }
    fun beginnerOnClicked(view : View){
        ballerBtn.isChecked = false
        player.skill = "Beginner"
    }
    fun ballerOnClicked(view : View){
        BeginnerBtn.isChecked = false
        player.skill = "Baller"
    }
    fun finishOnClicked(view : View){
        val finishIntent = Intent(this, FinishActivity :: class.java)
        if(player.skill !=""){
            finishIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(finishIntent)
        }
        else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}