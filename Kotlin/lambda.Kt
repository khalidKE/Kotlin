// lambda
fun main(){
    println(getName("khalid","Elabd"))

    println(getFullName("Wasta-","واسطة"))
}


fun getName(fName: String, lName: String):String{
    return "$fName $lName"
}

//lambda
/*
    var name : (inputs type) -> output type = {
        arguments : input type -> output
    }
*/

var getFullName : (String ,String) ->String ={
    fName ,lName : String ->"$fName $lName"
}