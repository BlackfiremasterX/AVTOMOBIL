package com.matvey.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import android.media.SoundPool
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var soundPool:  SoundPool?= null
    private var soundId1 : Int = 0
    private var soundId2 : Int = 0
    private var soundId3 : Int = 0
    private var soundId4 : Int = 0
    private var soundId5 : Int = 0
    private var soundId6 : Int = 0
    private var soundId7 : Int = 0
    private var soundId8 : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundId1 = soundPool!!.load(baseContext, R.raw.hihatclosed1, 1)
        soundId2 = soundPool!!.load(baseContext, R.raw.crash, 1)
        soundId3 = soundPool!!.load(baseContext, R.raw.ettet, 1)
        soundId4 = soundPool!!.load(baseContext, R.raw.bochka, 1)
        soundId5 = soundPool!!.load(baseContext, R.raw.big1, 1)
        soundId6 = soundPool!!.load(baseContext, R.raw.big2, 1)
        soundId7 = soundPool!!.load(baseContext, R.raw.rabochiy, 1)
        soundId8 = soundPool!!.load(baseContext, R.raw.stick, 1)



    }

    fun playSound(view: View) {
        soundPool?.play(soundId1, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound2(view: View) {
        soundPool?.play(soundId2, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound3(view: View) {
        soundPool?.play(soundId3, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound4(view: View) {
        soundPool?.play(soundId4, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound5(view: View) {
        soundPool?.play(soundId5, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound6(view: View) {
        soundPool?.play(soundId6, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound7(view: View) {
        soundPool?.play(soundId7, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }

    fun playSound8(view: View) {
        soundPool?.play(soundId8, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
    }


}