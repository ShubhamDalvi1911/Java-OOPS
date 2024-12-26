abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public void horse(){
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class Abstract {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}
