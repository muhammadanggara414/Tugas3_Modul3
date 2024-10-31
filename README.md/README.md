# MENGELOLA INFORMASI SISWA

Proyek ini adalah contoh sederhana dari Pengelolaan Informasi Siswa

## Fitur

- **Encapsulation**: Semua atribut mahasiswa disimpan sebagai variabel privat, dan aksesnya dikelola melalui metode getter dan setter.
- **Constructor**: Kelas ini memiliki konstruktor untuk menginisialisasi objek mahasiswa dengan nama, usia, dan ID.
- **Display Information**: Metode untuk menampilkan informasi mahasiswa ke konsol.

## Struktur Kelas

### Kelas `Student`

- **Atribut**:
    - `private String name`: Nama mahasiswa.
    - `private int age`: Usia mahasiswa.
    - `private String studentId`: ID mahasiswa.

- **Metode**:
    - `public Student(String name, int age, String studentId)`: Konstruktor untuk menginisialisasi objek.
    - `public String getName()`: Mendapatkan nama mahasiswa.
    - `public void setName(String name)`: Mengatur nama mahasiswa.
    - `public int getAge()`: Mendapatkan usia mahasiswa.
    - `public void setAge(int age)`: Mengatur usia mahasiswa.
    - `public String getStudentId()`: Mendapatkan ID mahasiswa.
    - `public void setStudentId(String studentId)`: Mengatur ID mahasiswa.
    - `public void displayStudentInfo()`: Menampilkan informasi mahasiswa ke konsol.

## Contoh Penggunaan

Berikut adalah contoh penggunaan kelas `Student`:

```java
public static void main(String[] args) {
    Student student = new Student("Alice", 21, "S12345");
    student.displayStudentInfo();
}
