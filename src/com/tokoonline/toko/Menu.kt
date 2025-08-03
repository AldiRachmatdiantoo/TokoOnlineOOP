package com.tokoonline.toko
import checkFilterList
import com.tokoonline.akun.Keranjang
import com.tokoonline.akun.User

class Menu() {
    val listMenu = mutableListOf("produk", "produk diskon", "keranjang", "akun saya", "keluar")
    val keranjangUser = Keranjang()
    fun menuToko(user: User){
        while (true){
            println("\n")
            println("=====TOKO ONLINE=====")
        val chooseMenu = checkFilterList("Pilih: ", listMenu)
        when(chooseMenu) {
            "produk" -> {
                Produk().produk(keranjangUser)
                continue
            }
            "produk diskon" -> {
                println("Belum ada")
                continue
            }
            "akun saya" -> {
                user.display()
                continue
            }
            "keranjang" -> {
                keranjangUser.keranjang()
                continue
            }
            "keluar" -> return
        }
        }
    }
}