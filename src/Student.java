// Encapsulated Fields
class Student {
    private String name;
    private int age;
    private String studentId;
    private int tinggi;
    // Konstruktor
    public Student(String name, int age, String studentId) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
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

    // Metode untuk mendapatkan detail mahasiswa dalam bentuk string
    private String getStudentDetails() {
        return "Student Name: " + name + "\nAge: " + age + "\nStudent ID: " + studentId;
    }

    // Metode untuk menampilkan informasi mahasiswa ke konsol
    public void displayStudentInfo() {
        System.out.println(getStudentDetails());
    }

    // Main method untuk menjalankan contoh
    public static void main(String[] args) {
        // Membuat objek Student dan menampilkan informasinya
        Student student = new Student("Alice", 21, "S12345");
        student.displayStudentInfo();
    }
}