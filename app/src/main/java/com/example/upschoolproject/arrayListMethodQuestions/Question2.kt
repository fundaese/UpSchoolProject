package com.example.upschoolproject.arrayListMethodQuestions

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    val sortedNames = names.sorted()
    val uppercaseNames = sortedNames.map { it.uppercase() }
    var upperName:String?
    var reversedName:String?

    println("Lütfen bir isim girin")
    val inputName = readLine()

    if (inputName != null) {
        upperName = inputName.uppercase()

        if (uppercaseNames.contains(upperName)){
            reversedName = upperName.reversed()
            println("Bulunan ismin tersten ve büyük yazılmış hali: $reversedName")
        } else {
            println("$upperName listede bulunamadı")
        }
    } else {
        println("Hata")
    }

    println(uppercaseNames)
}