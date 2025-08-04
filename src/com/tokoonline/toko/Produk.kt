package com.tokoonline.toko

import checkFilterList
import com.tokoonline.akun.Keranjang

class Produk {
    val kategori = mutableListOf(
        "elektronik",
        "kopi",
        "alat tulis",
        "buku",
        "kembali"
    )
    val elektronik = mutableMapOf(
        "mouse gaming" to 130000,
        "laptop" to 4000000,
        "keyboard" to 80000,
        "mousepad" to 10000
    )
    val kopi = mutableMapOf(
        "kopi kapal api" to 5000,
        "kopi gajah" to 4000,
        "kopi americano" to 10000,
        "capuccino" to 20000
    )
    val alatTulis = mutableMapOf(
        "pensil" to 2000,
        "penghapus" to 1500,
        "pulpen" to 3000,
        "kertas" to 500,
        "buku tulis" to 4000
    )
    val buku = mutableMapOf(
        "the stranger" to 60000,
        "notes from the underground" to 45000,
        "1984" to 100000,
        "white nights" to 45000
    )
    //produk diskon
    val listProdukDiskon = mutableMapOf(
        "headset" to 160000,
        "tws" to 239000,
        "hokben" to 68000
    )
    fun produk(keranjang: Keranjang, chooseMenu: String) {

        when(chooseMenu){
            "produk diskon" -> {
                ProdukDiskon().produkDiskon(keranjang, listProdukDiskon)
                return
            }
        }
        while (true) {
            println("\n")
            println("=====CARI PRODUK=====")
            val choose = checkFilterList("Pilih Kategori: ", kategori)
            when (choose) {
                "elektronik" -> {
                    OrganizeProduk().organizeProduk(keranjang, elektronik)
                    continue
                }
                "kopi" -> {
                    OrganizeProduk().organizeProduk(keranjang, kopi)
                    continue
                }
                "alat tulis" -> {
                    OrganizeProduk().organizeProduk(keranjang, alatTulis)
                    continue
                }
                "buku" -> {
                    OrganizeProduk().organizeProduk(keranjang, buku)
                    continue
                }
                "kembali" -> {
                    return
                }
            }
        }

    }
}