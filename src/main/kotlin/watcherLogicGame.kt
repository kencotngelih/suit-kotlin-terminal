fun watcherLogicGame(pemain1:Pemain,pemain2:Pemain) {

    return if (pemain1.pick == "batu" && pemain2.pick == "gunting") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1.pick == "batu" && pemain2.pick == "kertas") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1.pick == "batu" && pemain2.pick == "batu") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else if (pemain1.pick == "kertas" && pemain2.pick == "batu") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1.pick == "kertas" && pemain2.pick == "gunting") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1.pick == "kertas" && pemain2.pick == "kertas") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else if (pemain1.pick == "gunting" && pemain2.pick == "kertas") {
        println("Pemenang dari suit game ini adalah Pemain 1")
    } else if (pemain1.pick == "gunting" && pemain2.pick == "batu") {
        println("Pemenang dari suit game ini adalah Pemain 2")
    } else if (pemain1.pick == "gunting" && pemain2.pick == "gunting") {
        println("Pemenang dari suit game ini adalah Tidak ada. Hasil imbang sama kuat.")
    } else {
        println("Ada sesuatu yang keliru di sini.")
    }
}