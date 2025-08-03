import com.tokoonline.akun.LoginUser

fun main() {
    while (true) {
        val start = checkYesOrNo("Apakah anda ingin masuk ke Program Toko Online? ")
        if (!start){
            println("Terima kasih!")
            return
        } else {
            LoginUser().loginUser()
        }
    }
}
fun checkFilterList(text: String, list: MutableList<String>): String{
    while (true) {
        for ((index, value) in list.withIndex()){
            println("${index+1}.$value")
        }
        print(text)
        val choice = readln().lowercase()
        if (list.any { it == choice }) {
            return choice
        } else {
            println("Tidak ada!\n")
            continue
        }
    }
}
fun checkYesOrNo(text: String): Boolean{
    print(text)
    var choose = readln()
    while (!choose.equals("y", true) && !choose.equals("n", true)){
        println("error! tolong masukkan dengan benar!")
        print(text)
        choose = readln()
    }
    return choose.equals("y", true)
}
fun checkNullOrBlank(text: String): String{
    while (true){
    print(text)
    val input = readln()
        if (input.isBlank()){
            println("Tolong masukkan dengan benar!")
            continue
        } else {
            return input
        }
    }
}