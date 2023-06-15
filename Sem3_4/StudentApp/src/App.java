import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Services.AverageAge;
//import Controllers.EmploeeController;
//import StudentDomen.Emploee;
import Services.TeacherService;
import StudentDomen.Person;
//import StudentDomen.PersonComparator;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
//import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        // //System.out.println(man.toString());

        // Student pers1 = new Student("Денис", "Криницын", 35, 1);
        // //System.out.println(pers1.toString());

         Student s1 = new Student("Сергей", "Иванов", 22, 101);
         Student s2 = new Student("Андрей", "Сидоров", 22, 111);
         Teacher t1 = new Teacher(null, null, 0, null);
         Teacher t2 = new Teacher(null, null, 0, null);
        
         Person p1 = new Student("Сергей", "Иванов", 22, 101);
         Person p2 = new Teacher(null, null, 0, null);


        // PersonComparator<Student> compS = new PersonComparator<Student>();
        // compS.compare(s1, s2); 
        // PersonComparator<Teacher> compT = new PersonComparator<Teacher>();
        // compT.compare(t1, t2);
        // PersonComparator<Person> compPerson = new PersonComparator<Person>();
        // compPerson.compare(p1,p2);

         Student s3 = new Student("Иван", "Петров", 22, 121);
         Student s4 = new Student("Игорь", "Иванов", 23, 301);
         Student s5 = new Student("Даша", "Цветкова", 23, 171);
         Student s6 = new Student("Лена", "Незабудкина", 23, 104);
         Student s7 = new Student("Максим", "Ежгуров", 21, 1);
         Student s8 = new Student("Мария", "Ежгурова", 18, 2);


         List<Student> listStud = new ArrayList<Student>();
         listStud.add(s1);
         listStud.add(s2);
         listStud.add(s3);
         listStud.add(s4);
         listStud.add(s5);
         listStud.add(s6);
         listStud.add(s7);
         listStud.add(s8);
         
        // listStud.add(pers1);

         StudentGroup group4335 = new StudentGroup(listStud, 4335);
        //System.out.println(group4335.toString());
        //List<Student> listStud2 = new ArrayList<Student>();
         
         //listStud2.add(s6);
         //listStud2.add(s7);
         //listStud2.add(s8);

         //StudentGroup group4336 = new StudentGroup(listStud2, 4336);

         //List<StudentGroup> listStudGroup = new ArrayList<StudentGroup>();
         //listStudGroup.add(group4335);
         //listStudGroup.add(group4336);

         //StudentSteam steam1 = new StudentSteam(listStudGroup, 1);
          
         // Вываод через итератор
         //for (StudentGroup gr: steam1){
         //   System.out.println("id = " + gr.getIdGroup());
         //   for (Student st: gr){
         //       System.out.println(st.toString());
         //   }
         //   System.out.println("-------------");
         //}

         //System.out.println("---------------");

         //сортировка
        // Collections.sort(steam1.getSteamStud());

        //for(StudentGroup gr: steam1){
        //   System.out.println("id= " + gr.getIdGroup());
        //   for (Student st : gr){
        //       System.out.println(st.toString());
        //   }
        // }
         //for(Student stud:group4335)
         //{
         //    System.out.println(stud.toString());
         //}

         //System.out.println("===============================");
         //Collections.sort(group4335.getGroup());

         //for(Student stud:group4335)
         //{
         //    System.out.println(stud.toString());
         //}

        //Emploee per1 = new Emploee("Борис", "Иванов", 40, "basic");
        //Student s1 = new Student("Сергей", "Иванов", 22, 101);

        //EmploeeController empContr = new EmploeeController();
        //EmploeeController.paySalary(per1);
        //EmploeeController.paySalary(s1);
        //empContr.paySalary(per1);
        //empContr.paySalary(s1);

        TeacherService teacherService = new TeacherService();
        teacherService.create("Дмитрий", "Корж", 36);
        teacherService.create("Андрей", "Сидоров", 40);
        teacherService.create("Геннадий", "Лещ", 39);
        teacherService.create("Ольга", "Симакова", 32);

        for (Teacher teacher : teacherService.getAll()){
            System.out.println(teacher);
        }

        System.out.println(("--------------"));

        for (Teacher teacher : teacherService.getSortedByFIOStudentsList()){
            System.out.println(teacher);
        }

        System.out.println("---------------");

        for (Teacher teacher : teacherService.getSortedByAGETeachersList()){
            System.out.println(teacher);
        }

        System.out.println("-----------");

        AverageAge<Student> groupAvAge4335 = new AverageAge<Student>(listStud);

        groupAvAge4335.AverageResult();

        

    }
}
