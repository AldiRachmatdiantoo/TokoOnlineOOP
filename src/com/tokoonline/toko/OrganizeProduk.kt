package com.tokoonline.toko
import checkMapList
import checkYesOrNo
import com.tokoonline.akun.Keranjang

class OrganizeProduk: Diskon{
    fun organizeProduk(keranjang: Keranjang, listProduk: MutableMap<String, Int>) {
        val chooseProduk = checkMapList("Pilih Produk: ", listProduk)
        val toCartOrNo = checkYesOrNo("Masukkan $chooseProduk ke keranjang? ")
        if (!toCartOrNo) {
            return
        } else {
            toCart(keranjang, chooseProduk, listProduk)
            println("Berhasil!\n")
            print("press any key to continue..")
            readln()
            return
        }
    }

    fun toCart(keranjang: Keranjang, chooseProduk: String, listProduk: MutableMap<String, Int>) {
        val pricePerItem = listProduk.getValue(chooseProduk)

        val jumlah = (keranjang.listProduk[chooseProduk]?.jumlah?:0) + 1
        val totalPrice = pricePerItem * jumlah
        keranjang.listProduk[chooseProduk] = RincianKeranjang(chooseProduk, totalPrice, jumlah)
    }

    fun toCartDiskon(keranjang: Keranjang, chooseProduk: String, listProduk: MutableMap<String, Int>){
        val pricePerItem = listProduk.getValue(chooseProduk)
        val jumlah = (keranjang.listProduk[chooseProduk]?.jumlah?:0) + 1
        val priceAfterDiskon = diskonTenPercent(pricePerItem)
        val totalPrice = priceAfterDiskon.toInt() * jumlah
        keranjang.listProduk[chooseProduk] = RincianKeranjang("$chooseProduk (Diskon 10%)", totalPrice, jumlah)


    }

}