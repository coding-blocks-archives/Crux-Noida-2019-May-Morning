package com.codingblocks.lecture_9.interfeace_example;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new CBTeacher();
        teacher.teach();
        teacher.study();

        Student student = new CBStudent();
        student.play();
        student.study();

        Teacher ta = new CBTA();

//        ta.play();
        ta.study();
        ta.teach();

    }
}
