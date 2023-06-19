package Sem6;

//3) Переписать код в соответствии с Interface Segregation Principle:

public class Task3 {

    public interface Area{
        double area();
    }

    public interface Volume{
        double volume();
    }

    public class Circle implements Area{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
        
    }

    public class Cube implements Area, Volume{
        private int edge;
        public Cube(int edge){
            this.edge = edge;
        }
        @Override
        public double volume() {
            return 6 * edge * edge;
        }
        @Override
        public double area() {
            return edge * edge * edge;
        }
        
    }
   
}
