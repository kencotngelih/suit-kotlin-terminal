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