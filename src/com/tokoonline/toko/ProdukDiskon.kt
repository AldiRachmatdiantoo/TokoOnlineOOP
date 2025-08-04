package com.tokoonline.toko

import checkMapList
import com.tokoonline.akun.Keranjang
import checkYesOrNo

class ProdukDiskon: Diskon {
    fun produkDiskon(keranjang: Keranjang, listDiskon: MutableMap<String, Int>) {
        while (true) {
            println("\n=====PRODUK DISKON=====")
            val chooseProduk = checkMapList("Pilih Produk Diskon: ", listDiskon)
            val toCartOrNo = checkYesOrNo("tambahkan $chooseProduk ke keranjang? ")

            if (!toCartOrNo) {
                continue
            } else {
                OrganizeProduk().toCartDiskon(keranjang,chooseProduk, listDiskon)
                println("\nBerhasil!")

                print("press any key to continue..")
                readln()
                return
            }
        }
    }




}