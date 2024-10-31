// Encapsulated Fields
class Student {
    private String name;
    private int age;
    private String studentId;
    private String major; // Atribut baru untuk jurusan

    // Konstruktor
    public Student(String name, int age, String studentId, String major) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
        setMajor(major); // Inisialisasi jurusan
    }

    // Getter dan Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major; // Getter untuk jurusan
    }

    public void setMajor(String major) {
        this.major = major; // Setter untuk jurusan
    }

    // Metode untuk mendapatkan detail mahasiswa dalam bentuk string
    private String getStudentDetails() {
        return "Student Name: " + name + "\nAge: " + age + "\nStudent ID: " + studentId + "\nMajor: " + major;
    }

    // Metode untuk menampilkan informasi mahasiswa ke konsol
    public void displayStudentInfo() {
        System.out.println(getStudentDetails());
    }

    // Main method untuk menjalankan contoh
    public static void main(String[] args) {
        // Membuat objek Student dan menampilkan informasinya
        Student student = new Student("Alice", 21, "S12345", "Computer Science"); // Menginisialisasi jurusan
        student.displayStudentInfo();
    }
}
