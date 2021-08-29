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