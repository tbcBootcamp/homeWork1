package com.example.homework1tbc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {

    println("შეიყვანეთ x ცვლადის მნიშვნელობა: ")
    val a = readLine()?.toIntOrNull()
    if (a == null) {
        println("გთხოვ შეიყვანეთ რიცხვები ..")
        return main()
    }

    println("გთხოვთ y ცვლადის მნიშვნელობა: ")
    val b = readLine()?.toIntOrNull()
    if (b != null) {
        val sum = a + b
        println("x და y ჯამი არის: $sum")
    } else {
        println("გთხოვთ შეიყვანოთ რიცხვები. ")
    }

    println("გსურთ პროგრამის ხელახლა დაწყება? Y/N")
    val again = readLine()
    val resp = "y"
    val resp1 = "Y"
    val resp2 = "n"
    val resp3 = "N"
    if(resp == again || again == resp1){
        main()
    } else if (again == resp2 || again == resp3){
        println("კარგი, ნახვამდის.")
    } else {
        println("მაგდენი უცხო ენა სადვიცი მე \n კარგად."  )
    }
}