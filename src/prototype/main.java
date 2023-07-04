public class PrototypePatternDemo {
    public static void main(String[] args) {
        Rectangle r = Rectangle(3, 4)

        System.out.println("Shape : ");
        r.draw()		

        Shape clonedShape = r.clone;
        System.out.println("Cloned Shape : ");	
        clonedShape.draw()	
   }
}