package com.example.upschoolproject.arrayListMethodQuestions

data class Workers(val name: String, var salary: Double)

fun main() {
    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    workers.forEach { worker ->
        val zamMiktari = worker.salary * 0.35
        worker.salary = zamMiktari + worker.salary
    }

    workers.shuffle()
    workers.sortBy { it.salary }

    workers.forEachIndexed { index, worker ->
        println("Worker ${index + 1}:")
        println("Name: ${worker.name}")
        println("Salary: ${worker.salary}")
        println()
    }

    val enYuksekMaas = workers.maxByOrNull { it.salary }?.salary
    val enDusukMaas = workers.minByOrNull { it.salary }?.salary

    println("En yüksek maaş: $enYuksekMaas")
    println("En düşük maaş: $enDusukMaas")

    val maasToplami = workers.sumOf { it.salary }
    val maasOrtalamasi = maasToplami / workers.size
    println("Maaş ortalaması: $maasOrtalamasi")
}