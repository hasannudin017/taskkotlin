package id.infinitelearning.KotlinSubmission.exercise5

fun main() {
    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     */
    val hero = Heri()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     */
    hero.setProfile("MuhamadNurhasannudin", 20, 166)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     */
    hero.showProfile()

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge di atas
     */
    hero.doActivities()

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     */
    hero.showProfile()
}

class Heri {
    private var name: String = "Muhamad Nurhasannudin"
    private var age: Int = 20
    private var height: Int = 166

    fun setProfile(name: String, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun showProfile() {
        println("Name: $name, Age: $age, Height: $height")
    }

    fun doActivities() {
        // Implementasi aktivitas sesuai dengan challenge di atas
        // Anda dapat menambahkan logika aktivitas di sini
    }
}
