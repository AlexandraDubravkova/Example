public class Rectangle {

    private int a;
    private int b;

    private Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static Rectangle getRectangle(int a, int b) {
        return new Rectangle(a, b);
    }


    public String toString() {
        return ("Hello, I am rectangle :D Size A: " + this.getA() + " Size B: " + this.getB() + " Surface: " + this.getSurface() + " Circumference: " + this.getCircumference());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getSurface(){
        return (a * b);
    }

    public int getCircumference(){
        return (2 * (a + b));
    }
}
