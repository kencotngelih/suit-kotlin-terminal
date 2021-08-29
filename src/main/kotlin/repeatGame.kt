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