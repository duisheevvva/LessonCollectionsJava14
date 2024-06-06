package service.serviceImpl;

import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    List<Student> studentList = new ArrayList<>();

    @Override
    public String addStudent(Student student) {
        studentList.add(student);
        return "Success";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public List<Student> getStudentsByGroupName(String groupName) {
        List<Student> newStudentList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGroup().equals(groupName)) {
                newStudentList.add(student);
            }
        }
        return newStudentList;
    }

    @Override
    public List<Student> filterStudentByAge(int startAge, int endAge) {
        List<Student> newStudentList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getAge() >= startAge && student.getAge() <= endAge) {
                newStudentList.add(student);
            }
        }
        return newStudentList;
    }

    @Override
    public List<Student> getStudentsByInitialLetter(char letter) {
        List<Student> newStudentList = new ArrayList<>();
        for (Student student: studentList) {
            if (student.getName().startsWith(String.valueOf(letter))){
                newStudentList.add(student);
            }
        }
        return newStudentList;
    }
}
