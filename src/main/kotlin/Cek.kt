fun Cek(nilaiPemain:String):Boolean {
    return if (nilaiPemain != "gunting" && nilaiPemain != "batu" &&
        nilaiPemain != "kertas"){
        println("")
        println("KETERANGAN:")
        println("Pilihan keliru. Mohon pilih antara batu/gunting/kertas.")
        println("")
        false
    } else {
        true
    }
}