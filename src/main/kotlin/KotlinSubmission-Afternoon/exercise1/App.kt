package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan di bawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variabel myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Muhamad"
    val lastName: String = "Nurhasannudin"
    val age: Int = 20 // Ganti ini dengan usia Anda
    val isSingle: Boolean = true // Ganti ini berdasarkan status hubungan Anda

    println("Nama: $firstName $lastName")
    println("Usia: $age")
    println("Single: $isSingle")
}

/**
 * Latihan 2
 * Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<String>, session: String): Any {
    println("ID Grup: $groupId")
    println("Anggota Grup: $groupMember")
    println("Sesi: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variabel yang berisi daftar anggota grup Anda,
 * Kemudian akses item yang berisi nama Anda dari variabel tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<String> {
    val anggotaTim = listOf("Muhamad Nurhasannudin", "Faqih Aldian Noor", "Eva Tesvara", "Maya Ratnasari", "Ilham Safaat", "Nanda Aprilia") // Tambahkan nama Anda ke dalam daftar
    println("Anggota Tim: $anggotaTim")
    return anggotaTim
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota grup
 */
fun totalMember(): Int {
    val mentor = arrayOf("kak hasan", "kak yogi")
    val anggotaGrup = arrayOf("Muhamad Nurhasannudin", "Faqih Aldian Noor", "Eva Tesvara", "Maya Ratnasari", "Ilham Safaat", "Nanda Aprilia") // Tambahkan nama Anda ke dalam daftar

    return mentor.size + anggotaGrup.size
}

fun main() {

    myProfile()

    val timSaya = myTeam()
    println("Tim saya: $timSaya")

    val totalAnggota = totalMember()
    println("Total Anggota grup : $totalAnggota")

    /**
     * Latihan 5
     * Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data grup Anda
     *
     */
    groupDetail("IDGrupAnda", listOf("Anggota1", "Anggota2", "NamaAnda"), "SesiXYZ")
}
