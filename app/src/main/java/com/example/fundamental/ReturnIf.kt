fun main() {
    fun nama(name: String = ""): String{
        return if (name == ""){
            "Hello World!"
        }else{
            "Haloo $name"
        }
    }
    println(nama("Mark"))

    fun kelas(nama: String = ""): String{
        return when(nama){
            "" -> "Hello World"
            else -> "Haloo $nama"
        }
    }

    println(kelas("Kelas 1"))
    println(kelas())
}