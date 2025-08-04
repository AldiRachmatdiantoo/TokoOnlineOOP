package com.tokoonline.toko

interface Diskon{

    //diskon butuh
    //1.harga awal
    //2.diskon berapa persen
    // diskon = harga awal - persen diskon = sisa harga


    fun diskonTenPercent(pricePerItem: Int): Double{
        val diskonProduk = pricePerItem * 0.10
        val sisaDiskon = pricePerItem - diskonProduk
        return sisaDiskon
    }
}