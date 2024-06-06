package service;

import model.Student;

import java.util.List;

public interface StudentService {
    String addStudent(Student student);
    List<Student> getAllStudents();
    List<Student> getStudentsByGroupName(String groupName);
    List<Student> filterStudentByAge(int startAge,int endAge);
    List<Student> getStudentsByInitialLetter(char letter);
}
