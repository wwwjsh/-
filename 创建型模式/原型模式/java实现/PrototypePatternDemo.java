public class PrototypePatternDemo {
    // 一个工厂被创建起来了 用户可以通过这个工厂 创建已经被缓存的对象
    public static void main(String[] args) {
       ShapeCache.loadCache();
  
       Shape clonedShape = (Shape) ShapeCache.getShape("1");
       System.out.println("Shape : " + clonedShape.getType());        
  
       Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
       System.out.println("Shape : " + clonedShape2.getType());        
  
       Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
       System.out.println("Shape : " + clonedShape3.getType());        
    }
 }