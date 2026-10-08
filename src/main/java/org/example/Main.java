package org.example;

import org.example.model.Students;
import org.example.repository.StudentRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        StudentRepo studentRepo = new StudentRepo();
//        studentRepo.createStudent(new Students("Rohan","rohan@gmail.com",41));
//        studentRepo.updateStudent(new Students("Rohit","r@gmail.com",21),3L);
//        studentRepo.deleteStudent(4L);

          studentRepo.getStudentById(2L);
    }


}
