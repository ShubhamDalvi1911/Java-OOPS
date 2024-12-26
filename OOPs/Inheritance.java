// 1)Single Level Inheritance
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Traingle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

// Multi-Level interface 

class EquilateralTraingle extends Traingle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

// Hierarchial Inheritance

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String args[]){
        Traingle t1 = new Traingle();
        t1.area(2,2);

        EquilateralTraingle e1 = new EquilateralTraingle();
        e1.area(2,2);

        Circle c1 = new Circle();
        c1.area(2);
    }
}
