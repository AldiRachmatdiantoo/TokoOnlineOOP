package com.tokoonline.toko
import checkYesOrNo
import com.tokoonline.akun.Keranjang

class ProdukNama {

    fun produkNama(list: MutableList<String>, keranjang: Keranjang) {
            println("=====CARI PRODUK=====")
        while (true) {
            print("ketik nama produk: ")
            val cariProduk = readln()
            if (list.any { it == cariProduk }) {
                println("anda memilih $cariProduk!")
                val toCart = checkYesOrNo("Tambahkan $cariProduk ke keranjang? ")
                if (!toCart){
                    println("\nkembali..")
                } else {
                    println("\nBerhasil menambahkan $cariProduk!")
                    print("\npress any key to continue: ")
                    readln()
                    keranjang.listProduk.add(cariProduk)
                }
                break
            } else {
                println("produk tidak ada! tolong cari yg lain")
                continue
            }
        }
    }
}