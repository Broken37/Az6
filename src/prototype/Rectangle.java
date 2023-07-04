public class Rectangle extends Shape {
    public final int width;
    public final int height;

   public Rectangle(int width, int height){
     type = "Rectangle";
   }

   public Rectangle(Rectangle source){
    type = source.type
    width = source.width
    height = source.height
   }

   @Override
   public Object clone(){
    return New Rectangle(this);
   }

    @Override
    public void draw() {
    for(int i=0; i< height; i++){
        System.out.println("*".repeat(width));
        }
        }
}