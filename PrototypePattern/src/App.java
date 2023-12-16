


public class App {
    public static void main(String[] args) {
        ShapeCache.loadCache();
  
        Shape clonedShape = (Shape) ShapeCache.getClonedShape("1");
        System.out.println("Shape : " + clonedShape.getType());		
  
        Shape clonedShape2 = (Shape) ShapeCache.getClonedShape("2");
        System.out.println("Shape : " + clonedShape2.getType());		
  
        Shape clonedShape3 = (Shape) ShapeCache.getClonedShape("3");
        System.out.println("Shape : " + clonedShape3.getType());		
     }
}
