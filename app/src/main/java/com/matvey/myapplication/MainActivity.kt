package com.matvey.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioManager
import android.media.SoundPool
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1: Int = 0
    private var soundId2: Int = 0
    private var soundId3: Int = 0
    private var soundId4: Int = 0
    private var soundId5: Int = 0
    private var soundId6: Int = 0
    private var soundId7: Int = 0
    private var soundId8: Int = 0
    var Random_One_Six = Random.nextInt(1, 6)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       fun clicked_button(btn: Int, it: View)
       {
           when(btn)
           {
               1 -> R.id.big_drum
               2 -> R.id.big_drum
               3 -> R.id.big_drum
               4 -> R.id.big_drum
               5 -> R.id.big_drum
               6 -> R.id.big_drum
               7 -> R.id.snare
               8 -> R.id.hi_hat
           }

           MainScope().launch {
               playSound(1)
               var Scale: Float = 0.005F
               for(i in 0..180)
               {
                   it.scaleX = it.scaleX + Scale
                   it.scaleY = it.scaleY + Scale
                   delay(1)
               }
               for(i in 0..180)
               {
                   it.scaleX = it.scaleX - Scale
                   it.scaleY = it.scaleY - Scale
                   delay(1)
               }
           }

       }

            findViewById<Button>(R.id.big_drum).setOnClickListener {
                MainScope().launch {
                    clicked_button(1, it)
                var Scale: Float = 0.005F
                for(i in 0..180)
                {
                    it.scaleX = it.scaleX + Scale
                    it.scaleY = it.scaleY + Scale
                    delay(1)
                }
                for(i in 0..180)
                {
                    it.scaleX = it.scaleX - Scale
                    it.scaleY = it.scaleY - Scale
                    delay(1)
                }
            }
        }






        findViewById<ImageView>(R.id.dice).setOnClickListener {
            playSound(8)

            /*  if(Courutine_Dice.isActive)*/
            /* Courutine_Dice =*/ MainScope().launch {

            Random_One_Six = Random.nextInt(1, 6)
            var rotateDirection = arrayListOf(-1, 1).random()//
            var random_Buffer_XY = Random.nextBoolean()
            var rotation_Time: Long = 1
            var Dice_scale: Float = 0.005F

            for (i in 1..10)
            {

                if (random_Buffer_XY) {
                    for (i in 0..89) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)
                    }
                } else {
                    for (i in 0..89) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX + Dice_scale
                        it.scaleY = it.scaleY + Dice_scale
                        delay(rotation_Time)
                    }
                }


                findViewById<ImageView>(R.id.dice).setImageResource(
                    when (Random_One_Six) {
                        1 -> {
                            R.drawable.one
                        }
                        2 -> {
                            R.drawable.two
                        }
                        3 -> {
                            R.drawable.three
                        }
                        4 -> {
                            R.drawable.four
                        }
                        5 -> {
                            R.drawable.five
                        }
                        6 -> {
                            R.drawable.six
                        }
                        else -> R.drawable.ic_launcher_foreground
                    }
                )

                if (random_Buffer_XY) {
                    for (i in 90..179) {
                        it.rotationX = it.rotationX + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                } else {
                    for (i in 90..179) {
                        it.rotationY = it.rotationY + rotateDirection
                        it.scaleX = it.scaleX - Dice_scale
                        it.scaleY = it.scaleY - Dice_scale
                        delay(rotation_Time)
                    }

                }
                playSound(1)
            }
        }

            }




        soundPool = SoundPool(25, AudioManager.STREAM_MUSIC, 0)
        soundId1 = soundPool!!.load(baseContext, R.raw.avto, 1)
        soundId2 = soundPool!!.load(baseContext, R.raw.crash, 1)
        soundId3 = soundPool!!.load(baseContext, R.raw.ettet, 1)
        soundId4 = soundPool!!.load(baseContext, R.raw.bochka, 1)
        soundId5 = soundPool!!.load(baseContext, R.raw.big1, 1)
        soundId6 = soundPool!!.load(baseContext, R.raw.big2, 1)
        soundId7 = soundPool!!.load(baseContext, R.raw.rabochiy, 1)
        soundId8 = soundPool!!.load(baseContext, R.raw.hihatclosed1, 1)


    }

    fun playSound(sound: Int) {

        var soundId = 0
        if (sound != 0) {
            Random_One_Six = sound
        }
        when (Random_One_Six) {
            1 -> soundId = soundId1
            2 -> soundId = soundId2
            3 -> soundId = soundId3
            4 -> soundId = soundId4
            5 -> soundId = soundId5
            6 -> soundId = soundId6
            7 -> soundId = soundId7
            8 -> soundId = soundId8

        }
        soundPool?.play(soundId, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, soundId!!.toString(), Toast.LENGTH_SHORT).show()


    }


}