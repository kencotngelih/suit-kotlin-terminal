class Pemain(_namaPemain:String) {
    var namaPemain = _namaPemain
    lateinit var pick:String

    fun input():Unit {
        do {
            print("Masukan Pilihan $namaPemain: ")
            pick = readLine().toString().lowercase()
            val valid = Cek(pick)
        } while (!valid)
    }
}