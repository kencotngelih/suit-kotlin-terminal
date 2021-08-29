fun main() {

    val pemain1 = Pemain("Player 1")
    val pemain2 = Pemain("Player 2")

    do {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")

        pemain1.input()
        pemain2.input()
//        println("Masukkan pilihan Pemain 1: (pilihan antara batu/gunting/kertas)")
//        val pemain1 = watcherPemainSatu()
//        println("Pilihan Pemain 1 adalah $pemain1")
//        println("")
//        println("Masukkan pilihan Pemain 2: (pilihan antara batu/gunting/kertas)")
//        val pemain2 = watcherPemainDua()
//        println("Pilihan Pemain 2 adalah $pemain2")
//        println("")
        watcherLogicGame(pemain1,pemain2)
    } while (repeatGame())

}