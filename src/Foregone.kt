import java.util.Scanner
import java.math.BigInteger

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val Ts: Int = reader.nextInt()
    
    for (i in 1..Ts) {
        val n = reader.nextInt()
        val a: BigInteger = findA(n).toBigInteger()
        val b: BigInteger = findB(n).toBigInteger()
        
        println("Case #$i: $a $b")
    }
}

fun findA(n: Int): String {
    var a = ""
    val digits = n.toString().toCharArray()
    digits.forEach { d ->
        if (d == '4') {
            a += '2'
        } else {
            a += '0'
        }
    }
    
    return a
}

fun findB(n: Int): String {
    var b = ""
    val digits = n.toString().toCharArray()
    digits.forEach { d ->
        if (d == '4') {
            b += '2'
        } else {
            b += d
        }
    }
    
    return b
}
