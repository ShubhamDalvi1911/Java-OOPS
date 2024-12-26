class Pen{
    String color;
    String type;

    public void writing(){
        System.out.println("writing something");
    }

    public void penInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class CandObj{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gel";
        p1.writing();
        p1.penInfo();
    }
}