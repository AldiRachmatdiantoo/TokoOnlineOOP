package com.tokoonline.toko
import checkMapList
import checkYesOrNo
import com.tokoonline.akun.Keranjang

class OrganizeProduk {

    fun organizeProduk(keranjang: Keranjang, listProduk: MutableMap<String,Int>){
        val chooseProduk = checkMapList("Pilih Produk: ", listProduk)
        val toCartOrNo = checkYesOrNo("Masukkan $chooseProduk ke keranjang? ")
        if (!toCartOrNo){
            return
        } else {
            toCart(keranjang, chooseProduk, listProduk)
            return
        }
    }

    fun toCart(keranjang: Keranjang, chooseProduk: String, listProduk: MutableMap<String, Int>){
//        val index = listProduk.keys.indexOf(chooseProduk)
//        val entry = listProduk.entries.elementAt(index)
        val harga = listProduk[chooseProduk] ?: return
        keranjang.listProduk[chooseProduk] = harga
//        keranjang.listProduk.put(entry.key, entry.value)

        println("\nBerhasil memasukkan $chooseProduk ke keranjang!\n")
        print("press any key to continue..")
        readln()
        println("\n")
    }
}