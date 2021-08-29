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