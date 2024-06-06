import model.Student;
import service.StudentService;
import service.serviceImpl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();

//        Add student
        studentService.addStudent(new Student("Baktulan",18,"Java10"));
        studentService.addStudent(new Student("Omurbek",22,"Java14"));
        studentService.addStudent(new Student("Yryskeldi",20,"Java14"));
        studentService.addStudent(new Student("Bektur",19,"Java13"));
        studentService.addStudent(new Student("Nurkyz",24,"Java13"));
        studentService.addStudent(new Student("Myrzaiym",25,"Java12"));

//        Get all students
        System.out.println(studentService.getAllStudents());

//        Get student by group name
        System.out.println("Get student by group name: ");
        System.out.println(studentService.getStudentsByGroupName("Java14"));

//        Filter student by age
        System.out.println("Filter srudent by age: ");
        System.out.println(studentService.filterStudentByAge(19, 23));

        System.out.println("Get stundent by first letter: ");
        System.out.println(studentService.getStudentsByInitialLetter('Y'));


    }
}