package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;


public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Commands com = Commands.NONE;
        getAllStudents();
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.getMessInputComand();
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT: {
                    getNewIteration=false;
                    view.getMessEndProgram();;
                }
                case LIST: {
                    getAllStudents();
                    view.printAllStudents(students);
                }
                case DELETE: {
                    view.getMessNumberForDell();
                    model.delletStudent(getNumber());
                    getAllStudents();;
                    view.printAllStudents(students);
                }
                
            }

        }

    }
    private int getNumber(){
        Scanner iSc = new Scanner(System.in);
        int number = Integer.parseInt(iSc.nextLine());
        boolean flagDel = number < students.size() && number > -1;
        if(flagDel){
            return number;
        }else{
            view.getMessErrDell();
            return -1;
        }
    }

}
