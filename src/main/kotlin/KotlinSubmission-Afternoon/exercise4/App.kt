package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try-catch untuk menangani suatu kasus sesuai keinginan teman-teman
     */
    // Contoh 1: Pembagian oleh nol
    try {
        val numerator = 10
        val denominator = 0
        val result = numerator / denominator
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmetika: ${e.message}")
    }

    // Contoh 2: Konversi String ke Int
    try {
        val strNumber = "abc"
        val number = strNumber.toInt()
        println("Angka yang diperoleh: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan konversi: ${e.message}")
    }

    // Contoh 3: Mengakses indeks di luar batas pada array
    try {
        val numbers = arrayOf(1, 2, 3)
        val element = numbers[5]
        println("Elemen pada indeks 5: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Terjadi kesalahan indeks array: ${e.message}")
    }

    // Contoh 4: Operasi dengan nullable type
    try {
        val nullableValue: Int? = null
        val result = nullableValue!! * 2 // !! menandakan bahwa nullableValue tidak boleh null
        println("Hasil operasi: $result")
    } catch (e: NullPointerException) {
        println("Terjadi kesalahan null pointer: ${e.message}")
    }
}
