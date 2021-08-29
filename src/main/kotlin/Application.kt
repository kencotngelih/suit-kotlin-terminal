fun main() {

    do {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Masukkan pilihan Pemain 1: (pilihan antara batu/gunting/kertas)")
        val pemain1 = watcherPemainSatu()
        println("Pilihan Pemain 1 adalah $pemain1")
        println("")
        println("Masukkan pilihan Pemain 2: (pilihan antara batu/gunting/kertas)")
        val pemain2 = watcherPemainDua()
        println("Pilihan Pemain 2 adalah $pemain2")
        println("")
        println("Pemain 1 memilih $pemain1 , dan Pemain 2 memilih $pemain2 .")
        watcherLogicGame(pemain1,pemain2)
    } while (repeatGame())

}

fun watcherPemainSatu(): String {
    val readable = readLine().toString().lowercase()
    return if (readable == "gunting") {
        //gunting
        readable
    } else if (readable == "kertas") {
        //kertas
        readable
    }else if (readable == "batu") {
        //batu
        readable
    }else {
        //string
        println("Pilihan Player 1 keliru. Mohon pilih antara batu/gunting/kertas.")
        watcherPemainSatu()
    }
}

fun watcherPemainDua(): String {
    val readable = readLine().toString().lowercase()
    return if (readable == "gunting") {
        //gunting
        readable
    } else if (readable == "kertas") {
        //kertas
        readable
    }else if (readable == "batu") {
        //batu
        readable
    }else {
        //string
        println("Pilihan Player 2 keliru. Mohon pilih antara batu/gunting/kertas.")
        watcherPemainDua()
    }
}

fun watcherLogicGame(pemain1:String,pemain2:String) {
    return if (pemain1 == "batu" && pemain2 == "gunting") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1 == "batu" && pemain2 == "kertas") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1 == "batu" && pemain2 == "batu") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else if (pemain1 == "kertas" && pemain2 == "batu") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1 == "kertas" && pemain2 == "gunting") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1 == "kertas" && pemain2 == "kertas") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else if (pemain1 == "gunting" && pemain2 == "kertas") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1 == "gunting" && pemain2 == "batu") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1 == "gunting" && pemain2 == "gunting") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else {
        println("Ada sesuatu yang keliru di sini.")
    }
}

fun repeatGame(): Boolean {
    var hasil: Boolean = true
    do {
        println("")
        println("Apakah Anda masih mau bermain ??? (Pilih ya/tidak)")
        val readable = readLine().toString().lowercase()
        when (readable) {
            "ya" -> hasil = true
            "tidak" -> hasil = false
            else -> println("Pilihan yang Anda masukkan keliru. Pilih ya/tidak.")
            }
        } while(readable !="ya" && readable !="tidak")
            return hasil
}