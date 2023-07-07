package com.example.upschoolproject.arrayListMethodQuestions

fun main() {
    val names = arrayListOf("a","b","c","d","e")

    println("Lütfen aralarına virgül koyarak üç isim girin")
    val newNames = readLine()

    if(newNames != null) {
        val newNamesList = newNames.split(",").map { it.trim() }

        if (newNamesList.size != null) {
            names.addAll(newNamesList)
        }
    }

    println("Names: $names")
}