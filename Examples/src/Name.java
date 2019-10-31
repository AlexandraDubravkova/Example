import org.w3c.dom.css.Rect;

public class Name {

    public static void main(String[] args){
        Example e = new Example("Andrej");

        System.out.println("Name is: " + e.getName());

        Example e2 = new Example();
        e2.setName("Martin");
        e2.setAge(25);

        System.out.println(e2.toString());
        System.out.println(e2.getName());


        //Rectangle r = new Rectangle(2,3);
        //System.out.println(r.getSurface());

        Rectangle r3 = Rectangle.getRectangle(4,5);
        //Rectangle.getRectangle(1,2);
        //Rectangle.getRectangle(4,57);


        System.out.println(r3.getCircumference());
        System.out.println( (Rectangle.getRectangle(1,2)).getCircumference());

        System.out.println(r3.toString());
        System.out.println(Rectangle.getRectangle(2, 2).toString());
    }
}









