package com.tokoonline.toko

import checkFilterList
import com.tokoonline.akun.Keranjang

class Produk {
    val howTo = mutableListOf(
        "nama",
        "kategori"
    )
    val listProdukWithKategori = mutableListOf(
        "buah",
        "cemilan",
        "makanan besar",
        "sayuran"
    )
    val listProdukWithNama = mutableListOf(
        "nasi goreng",
        "nasi padang",
        "lays",
        "chitato",
        "sup ayam",
        "bayam",
        "jeruk",
        "apel",
    )
    fun produk(keranjang: Keranjang) {
        println("=====CARI PRODUK=====")
        val choose = checkFilterList("Cari produk berdasarkan: ", howTo)
    when(choose){
        "nama" -> ProdukNama().produkNama(listProdukWithNama, keranjang)
        "kategori" -> ProdukKategori().produkKategori(listProdukWithKategori, keranjang)
    }
    }
}