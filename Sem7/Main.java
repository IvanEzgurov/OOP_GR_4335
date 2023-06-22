package Sem7;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        Loger loger = new Loger();
        Logger log = loger.Loger();

        CalcForComplexNumber calc = new CalcForComplexNumber();
        iCalcView view = new CalcViewRus();
        ComplexNumber res;
        ComplexNumber complexTemp;
        StringBuilder resString = new StringBuilder();
        CreatComplexNumber creatNumber = new CreatComplexNumber();
        Scanner iSc = new Scanner(System.in);
        Boolean flagStop = false;
        
        log.info("Произведена инициализация");

        view.messHello();
        view.messSetNumber();
        res = creatNumber.creatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
        log.info("Введено: " + res);
        resString.append(res);

        while(!flagStop){

            view.messOperation();
            switch(iSc.next()){
                case "+":
                    view.messSetNumber();
                    complexTemp = creatNumber.creatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    log.info("Выбрана команда +, и введено значение" + complexTemp);
                    resString.append("+" + complexTemp);
                    res = calc.sum(res, complexTemp);
                    log.info("В итоговую строку добавлена запись +" + complexTemp);
                    log.info("Результат обработан и равен" + res);

                    break;
                case "-":
                    view.messSetNumber();
                    complexTemp = creatNumber.creatComplexNumber(iSc.nextDouble(),iSc.nextDouble());
                    log.info("Выбрана команда -, и введено значение" + complexTemp);
                    resString.append("-" + complexTemp);
                    res = calc.dif(res, complexTemp);
                    log.info("В итоговую строку добавлена запись - " + complexTemp);
                    log.info("Результат обработан и равен " + res);
                
                    break;
                case "/":
                    view.messSetNumber();
                    complexTemp = creatNumber.creatComplexNumber(iSc.nextDouble(),iSc.nextDouble());
                    log.info("Выбрана команда /, и введено значение" + complexTemp);
                    resString.append("/" + complexTemp);
                    res = calc.division(res, complexTemp);
                    log.info("В итоговую строку добавлена запись / " + complexTemp);
                    log.info("Результат обработан и равен " + res);
                
                    break;
                case "*":
                    view.messSetNumber();
                    complexTemp = creatNumber.creatComplexNumber(iSc.nextDouble(),iSc.nextDouble());
                    log.info("Выбрана команда *, и введено значение" + complexTemp);
                    resString.append("*" + complexTemp);
                    res = calc.division(res, complexTemp);
                    log.info("В итоговую строку добавлена запись / " + complexTemp);
                    log.info("Результат обработан и равен " + res);
                
                    break;
                case "=":
                    System.out.println("\n" + resString + "=" + res);
                    log.info("Выбрана команда = ");
                    flagStop = true;
                    break;
                default:
                    System.out.println("команда выбрана не верно");
                    break;
            }
        }
    }
    
}
