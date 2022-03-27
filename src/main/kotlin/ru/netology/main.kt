package ru.netology

fun main() {

    val amount = 1_000_000
    val commission = if ((amount * 75 / 10_000) < 3500) 3500 else amount * 75 / 10_000

    println("\n Ваша комиссия: $commission рублей")
}