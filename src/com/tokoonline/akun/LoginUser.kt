package com.tokoonline.akun
import com.tokoonline.toko.Menu
import checkNullOrBlank
import checkYesOrNo


class LoginUser {
    fun loginUser(){
        while (true){
            println("=====BUAT AKUN=====")
        val username = checkNullOrBlank("Masukkan username: ")
        println("Berhasil memasukkan username!")
        val password = checkNullOrBlank("Masukkan password: ")
        println("Berhasil memasukkan password")
        val emailNotFixed = checkNullOrBlank("Masukkan email: ")
        val email = "$emailNotFixed@gmail.com"
        println("Berhasil memasukkan email!")

        val makeSureLogin = checkYesOrNo("Login Akun? ")
            if (!makeSureLogin){
                println("BUAT ULANG..")
                continue
            } else {
                println("Berhasil Membuat Akun!")
                print("press any key to continue to menu: ")
                readln()
                val user = User(username, password, email)
                Menu().menuToko(user)
                break
            }
        }
    }
}