//array
fun main() {
    var arr= arrayOf(-2,0,"khalid",5,1,9,2.5,true,'k')
    for (i in 0 until arr.size){
        print(arr[i])
        print(" ")
    }
    println()
    println("-----------------------")

    println("plz enter 5 nums to sum")
    var arr1=Array(5){
        readln().toInt()
    }
    var s=0;
    for (i in 0 until arr1.size)
    {
        s+=arr1[i]
    }
    println("the sum of nums is : "+s)
}

// in for loops
// .. vs until
// .. mean small than or equalls
// until mean small than