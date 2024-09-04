//function
fun main() {
    add(5,2)
    println("---------------------")
    println(multi(2,4))

    println("---------------------")
    println(sum(2,3,1,6))
    println("---------------------")
    println(sum(2,3,1,6,12,0,1))

}
fun add(num1:Int ,num2:Int){
    println("sum is : "+(num2+num1))
}

//return function
fun multi(num1: Long ,num2: Long):Long{
    return  (num1*num2);
}

//unknown number of parameters
fun sum(vararg  nums:Int):Int{
    var s=0;
    for (i in 0 until  nums.size){
        s+=nums[i]
    }
    return s
}