package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentCRUD crud = new StudentCRUD();

        // 1️⃣ Create new students
        crud.createStudent("Aarav Mehta", "aarav@example.com");
        crud.createStudent("Priya Sharma", "priya@example.com");

        // 2️⃣ Read all students
        System.out.println("\n--- List of Students ---");
        crud.readStudents();

        // 3️⃣ Update student email
        System.out.println("\n--- Updating Student ---");
        crud.updateStudent(1, "aarav.newemail@example.com");

        // 4️⃣ Delete a student
        System.out.println("\n--- Deleting Student ---");
        crud.deleteStudent(2);

        // 5️⃣ Read all students after operations
        System.out.println("\n--- Final List of Students ---");
        crud.readStudents();

        HibernateUtil.shutdown();
    }
}

