package com.vlad_kryvovyaz.boombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton
import com.nightonke.boommenu.BoomMenuButton
import com.nightonke.boommenu.ButtonEnum
import com.nightonke.boommenu.Piece.PiecePlaceEnum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  bmb = findViewById<BoomMenuButton>(R.id.btn)
        bmb.buttonEnum=ButtonEnum.SimpleCircle
        bmb.piecePlaceEnum=PiecePlaceEnum.DOT_3_1
        bmb.buttonPlaceEnum=ButtonPlaceEnum.SC_3_3
        for (i in 0 until bmb.buttonPlaceEnum.buttonNumber()){
            bmb.addBuilder(SimpleCircleButton.Builder().normalImageRes(R.drawable.ic_launcher_background))
        }
    }
}