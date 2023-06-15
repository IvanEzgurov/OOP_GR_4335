import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.*;

import Model.*;

import View.*;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       List<Student> students = new ArrayList<Student>();
       students.add(new Student("Сергей", "Иванов", 21, 101));
       students.add(new Student("Андрей", "Сидоров", 22, 111));
       students.add(new Student("Иван", "Петров", 22, 121));
       students.add(new Student("Игорь", "Иванов", 23, 301));
       students.add(new Student("Даша", "Цветкова", 25, 171));
       students.add(new Student("Лена", "Незабудкина", 23, 104));
       
       HashMap<Long, Student> hachListStudent = new HashMap<Long, Student>();
       hachListStudent.put(0L, new Student("Сергей", "Климов", 24, 101));
       hachListStudent.put(1L,new Student("Дмитрий", "Голиков", 35, 104));
       hachListStudent.put(2L, new Student("Анна", "Марченко", 21, 105));
       hachListStudent.put(3L, new Student("Василий", "Смирнов", 32, 107));
       hachListStudent.put(4L, new Student("Мария", "Кравцова", 24, 109));
       hachListStudent.put(5L, new Student("Петр", "Иванов", 23, 215));

    
       iGetModel fModel = new FileModel("StudentsDB.txt");
       //fModel.saveAllStudentToFile(students);

       iGetModel model = new Model(students);
       iGetModel hachModel = new hachModel(hachListStudent);
       iGetView view = new View();

       Controller controller = new Controller(view, hachModel);
       //controller.update();
       controller.run();

    }
}
