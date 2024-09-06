fun main(){

    //list
    var listt = listOf(2,9,1)
    for (i in 0 until listt.size)
        println(listt[i])
    println("------------------------")

    println(listt.get(1))//9
    println(listt.first())//2
    println(listt.last())//1

    //-----------------------------------------
    // set
    var slist = setOf(2,3,4,5,6,2,3)
    println(slist) //[2, 3, 4, 5, 6]

    // لا تسمح بالتكرار على عكس list

    //-----------------------------------------
    // map
    var map = mapOf("010" to "khalid" , "015" to "Ehab" , "012" to "Elabd")
    println(map)
    // {010=khalid, 015=Ehab, 012=Elabd}

    var mp = mapOf(111 to "Ahmed" , 22 to "Ali" , 3 to "Omar")
    println(mp)
    //{111=Ahmed, 22=Ali, 3=Omar}
    println(mp[22]) //Ali

        var m= hashMapOf<String, String>()
    m.put("Egypt","Cairo")
    m.put("Emarat","Dubi")
    m.put("Palastine","Quds")
    println(m) //{Emarat=Dubi, Egypt=Cairo, Palastine=Quds}
}

