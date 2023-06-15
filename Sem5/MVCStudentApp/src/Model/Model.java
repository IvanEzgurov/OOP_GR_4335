package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private final List<Student> students;
    
    public Model(List<Student> students) {
        this.students = students;
    }

        public List<Student> getAllStudents()
    {
        return students;
    } 
    
    // number номер студента для удаления
    @Override
    public void delletStudent(int number){
        if (number > -1){
            students.remove(number);
        }
    }
}
