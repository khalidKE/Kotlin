# Kotlin Programming Examples

This repository showcases a variety of Kotlin examples that demonstrate fundamental programming concepts, including functions, collections, lambda expressions, classes, and more.

## Table of Contents
1. [Variables and Constants](#variables-and-constants)
2. [Basic Functions](#basic-functions)
3. [Collections](#collections)
4. [Conditions and Loops](#conditions-and-loops)
5. [Lambda Expressions](#lambda-expressions)
6. [Infix Functions](#infix-functions)
7. [Classes and Objects](#classes-and-objects)
8. [Arrays](#arrays)

## Variables and Constants

```kotlin
fun main() {
    // var can be reassigned
    var name = "Kotlin"
    name = "khalid"
    println(name)
    println("-----------------------------")

    // val cannot be reassigned
    val num = 10
    println(num)
    println("-----------------------------")

    // Specifying types explicitly
    var x: Int = 5 // Integer type only

    // String interpolation
    println("5 + 5 = ${5 + 5}")
    println("hello " + 5)

    var y = 12
    println("value of y : $y")
    println("-----------------------------")
}
```

## Basic Functions
```kotlin
fun main() {
    add(5, 2)
    println("---------------------")
    println(multi(2, 4))
    println("---------------------")
    println(sum(2, 3, 1, 6))
    println("---------------------")
    println(sum(2, 3, 1, 6, 12, 0, 1))
}

fun add(num1: Int, num2: Int) {
    println("sum is : " + (num2 + num1))
}

// Return function
fun multi(num1: Long, num2: Long): Long {
    return (num1 * num2)
}

// Function with a variable number of parameters
fun sum(vararg nums: Int): Int {
    var s = 0
    for (i in 0 until nums.size) {
        s += nums[i]
    }
    return s
}
```
## Collections
```kotlin
fun main() {
    // List
    var listt = listOf(2, 9, 1)
    for (i in 0 until listt.size)
        println(listt[i])
    println("------------------------")

    println(listt.get(1)) //9
    println(listt.first()) //2
    println(listt.last()) //1

    // Set (No duplicates allowed)
    var slist = setOf(2, 3, 4, 5, 6, 2, 3)
    println(slist) //[2, 3, 4, 5, 6]

    // Map
    var map = mapOf("010" to "khalid", "015" to "Ehab", "012" to "Elabd")
    println(map) // {010=khalid, 015=Ehab, 012=Elabd}

    var mp = mapOf(111 to "Ahmed", 22 to "Ali", 3 to "Omar")
    println(mp) //{111=Ahmed, 22=Ali, 3=Omar}
    println(mp[22]) //Ali

    var m = hashMapOf<String, String>()
    m.put("Egypt", "Cairo")
    m.put("Emarat", "Dubi")
    m.put("Palastine", "Quds")
    println(m) //{Emarat=Dubi, Egypt=Cairo, Palastine=Quds}
}
```
## Conditions and Loops
```kotlin
fun main() {
    var y = 12

    // Conditions
    when (y % 2) {
        0 -> println("Even")
        1 -> println("Odd")
    }
    
    var Sname = "april"
    when(Sname) {
        "jan", "feb", "mar" -> println("Winter")
        "april", "may", "jun" -> println("Spring")
        else -> println("error")
    }

    // Input
    print("Enter your number: ")
    var n = readln()
    println(n)

    println("----------------------------")

    // Loops
    for (i in 1..10) { // Inclusive range
        print(i)
        print(" ")
    }
    println()

    for (k in 1..10 step 2) { // Step through the range by 2
        print(k)
    }
    println()
}
```
## Lambda Expressions
```kotlin
fun main() {
    println(getName("khalid", "Elabd"))
    println(getFullName("Wasta-", "واسطة"))
}

fun getName(fName: String, lName: String): String {
    return "$fName $lName"
}

// Lambda expression
var getFullName: (String, String) -> String = { fName, lName -> "$fName $lName" }
```
## Infix Functions
```kotlin
fun main() {
    println(5.plus(2))
    println(5.add(5))
    println(5 add 6) // Infix function
}

infix fun Int.add(num: Int) = this + num
```
## Classes and Objects
```kotlin
fun main() {
    var obj: student = student()
    obj.name = "Ali"
    obj.print()
}

class student {
    var name: String = "Khalid"
    var id: Int = 10
    var isMale: Boolean = true
    var weight: Double = 84.5

    fun printHi() {
        println("Hi")
    }

    fun print() {
        println("My name is: $name")
        println("My id is: $id")
        println("My sex is Male: $isMale")
        println("My weight is: $weight")
    }
}
```
## Arrays
```kotlin
fun main() {
    var arr = arrayOf(-2, 0, "khalid", 5, 1, 9, 2.5, true, 'k')
    for (i in 0 until arr.size) {
        print(arr[i])
        print(" ")
    }
    println()
    println("-----------------------")

    println("Please enter 5 numbers to sum")
    var arr1 = Array(5) {
        readln().toInt()
    }
    var s = 0
    for (i in 0 until arr1.size) {
        s += arr1[i]
    }
    println("The sum of the numbers is: " + s)
}
```
