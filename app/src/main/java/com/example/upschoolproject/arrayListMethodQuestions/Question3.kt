package com.example.upschoolproject.arrayListMethodQuestions

data class Student(val name: String, val age: Int, val school: String)

fun main() {
    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val enBuyukOgr = students.maxByOrNull { it.age }
    val enKucukOgr = students.minByOrNull { it.age }

    if (enBuyukOgr != null && enKucukOgr != null) {
        println("En büyük yaşa sahip öğrenci: ${enBuyukOgr.name}, index: ${students.indexOf(enBuyukOgr)}")
        println("En küçük yaşa sahip öğrenci: ${enKucukOgr.name}, index: ${students.indexOf(enKucukOgr)}")
    }

    val üniversiteA = students.filter { it.school == "Üniversite A" }
    println("Üniversite A öğrencileri \n$üniversiteA")

    val older25 = üniversiteA.filter { it.age > 25 }
    val younger25 = üniversiteA.filter { it.age <= 25 }

    println("Yaşı 25'ten büyük olanlar")
    older25.forEach { println(" ${it.name}, Yaş: ${it.age}") }

    println("Yaşı 25'ten küçük olanlar")
    younger25.forEach { println(" ${it.name}, Yaş: ${it.age}") }
}