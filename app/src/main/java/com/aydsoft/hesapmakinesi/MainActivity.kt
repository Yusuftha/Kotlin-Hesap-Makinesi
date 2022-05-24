package com.aydsoft.hesapmakinesi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnSayiTik(view: View) {
        if (YeniOparetor)
        {
            sayiGoster.setText("")
        }
        YeniOparetor=false
        var btnSec = view as Button
        var btnTikDeger:String = sayiGoster.text.toString()
        when(btnSec.id){
            btn0.id->{
                btnTikDeger+="0"
            }
            btn1.id->{
                btnTikDeger+="1"
            }
            btn2.id->{
                btnTikDeger+="2"
            }
            btn3.id->{
                btnTikDeger+="3"
            }
            btn4.id->{
                btnTikDeger+="4"
            }
            btn5.id->{
                btnTikDeger+="5"
            }
            btn6.id->{
                btnTikDeger+="6"
            }
            btn7.id->{
                btnTikDeger+="7"
            }
            btn8.id->{
                btnTikDeger+="8"
            }
            btn9.id->{
                btnTikDeger+="9"
            }
            btnartieksi.id->{
                btnTikDeger= "-"+btnTikDeger
            }

        }
        sayiGoster.setText(btnTikDeger)
    }

    var oparator = "*"
    var eskiSayi = ""
    var YeniOparetor = true
    fun btnOpTik(view: View) {

        var btnSec=view as Button
        when(btnSec.id){
            btnbolme.id->{
                oparator="/"
            }
            btnarti.id->{
                oparator="+"
            }
            btncarpi.id->{
                oparator="X"
            }
            btneksi.id->{
                oparator="-"
            }
        }
        eskiSayi=sayiGoster.text.toString()
        YeniOparetor=true

    }

    fun btnEsittirTik(view: View) {
        var yeniSayi=sayiGoster.text.toString()
        var sonuc:Double?=null
        when(oparator){
            "/"->
            {
                sonuc=eskiSayi.toDouble()/yeniSayi.toDouble()

            }
            "X"->
            {
                sonuc=eskiSayi.toDouble()*yeniSayi.toDouble()

            }
            "+"->
            {
                sonuc=eskiSayi.toDouble()+yeniSayi.toDouble()

            }
            "-"->
            {
                sonuc=eskiSayi.toDouble()-yeniSayi.toDouble()

            }
        }

        sayiGoster.setText(sonuc.toString())
        YeniOparetor = true
    }

    fun btnTemizleTik(view: View) {
        sayiGoster.setText("0")
        YeniOparetor=true
    }

    fun btnYuzdeTik(view: View) {
        var sayi:Double=sayiGoster.text.toString().toDouble()/100
        sayiGoster.setText(sayi.toString())
        YeniOparetor=true
    }
}
