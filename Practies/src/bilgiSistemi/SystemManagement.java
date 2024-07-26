package bilgiSistemi;

import java.util.ArrayList;

public class SystemManagement {
    ArrayList<Student> students;
    private int currentId;

    public SystemManagement() {
        students = new ArrayList<>();
        currentId = 1;

    }

    public void addStudent(String name, String surName, String email) {
        Student newStudent = new Student(currentId, name, surName, email);
        students.add(newStudent);
      System.out.println("Öğrenci başarıyla eklendi " + newStudent);
      currentId++;
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("Henüz kayıtlı öğrenci bulunamadı ");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }

    }
    public void updateStudent(int id,String email){

            for (Student student : students){
                if(student.getId()==id){
                    student.setEmail(email);
                    System.out.println("Öğrenci başarıyla eklendi ");
                    return;
                }
            }


    }
    public void deleteStudent(int id){
        if(!students.isEmpty()){
            for (Student student:students){
                if(student.getId()==id){
                    students.remove(student);
                    System.out.println("Öğrenci başarıyla silindi" +student);
                    return;
                }
            }
        }else{
            System.out.println("Silinecek kullanıcı bulunamadı");
        }
    }
}
