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