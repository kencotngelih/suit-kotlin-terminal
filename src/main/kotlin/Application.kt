fun main() {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    println("1. Masukkan pemain 1: ")
    val pemain1 = watcherPemainSatu()
    println("2. Masukkan pemain 2: ")
    val pemain2 = watcherPemainDua()
    println("Hasil: Pemain 1 pilih $pemain1 dan Pemain 2 pilih $pemain2")

}

fun watcherPemainSatu(): String? {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null) {
        //integer
        watcherPemainSatu()
    } else if (readable == "gunting") {
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
        watcherPemainSatu()
    }
}

fun watcherPemainDua(): String? {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null) {
        //integer
        watcherPemainDua()
    } else if (readable == "gunting") {
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
        watcherPemainDua()
    }
}