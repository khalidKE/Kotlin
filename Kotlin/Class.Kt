fun main(){
    var obj:student=student()
    obj.name="Ali"
    obj.print()
}

class student{
    var name: String ="Khalid"
    var id:Int = 10
    var isMale:Boolean =true
    var weight:Double =84.5

    fun printHi(){
        println("Hi")
    }

    fun print(){
        println("My name is : $name")
        println("My id is : $id")
        println("My sex is Male : $isMale")
        println("My weight is : $weight")
    }
}