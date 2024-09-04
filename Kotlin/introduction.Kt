
fun main() {
    // val vs var
    // val can not reidentifier
    var name = "Kotlin"
    name="khalid"
    println(name)
    println("-----------------------------")

    val num=10
    println(num)
    println("-----------------------------")


    //to be specific
    var x:Int =5 // here take only integer number

    // $
    println("5 + 5 = ${5+5} ")
    println("hello "+5)

    var y=12
    println("value of y : $y")
    println("-----------------------------")


//condition
    when(y%2){
        0 -> println("Even")
        1-> println("Odd")
    }
    var Sname ="april"
    when(Sname){
        "jan","feb","mar"-> println("Winter")
        "april" , "may" , "jun" -> println("Spring")
        else->println("error")
    }

//input
    print("Enter your number : ")
    var n= readln()
    println(n)

    println("----------------------------")
    //loops
    for (i in 1 ..10) //1 2 3 4 5 6 7 8 9 10
    { print(i)
        print(" ")
    }
    println()
    for (k in 1 .. 10 step 2){
        print (k)
    }

}