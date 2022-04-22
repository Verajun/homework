package com.train

import java.util.*


fun main() {
    val tester = TesterKotlin()
    tester.print()
}
class TesterKotlin {
    var ticket:Int = 0
    var roundtrip:Int = 0
    var price:Int = 0
    fun print(){
        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets:")
        ticket = scanner.nextInt()
        print("How many round-trip tickets:")
        roundtrip = scanner.nextInt()
        price = ticket*1000+roundtrip*1000-roundtrip*200
        println("Total tickets:$ticket\t\tRound-trip:$roundtrip\tTotal:$price")
    }
}