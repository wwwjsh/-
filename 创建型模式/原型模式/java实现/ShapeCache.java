import java.util.Hashtable;
 
public class ShapeCache {
    // 这个类通过缓存可以快速创建一个shape类型的对象 通过直接克隆的方法
    // 可以跳过构造方法
   private static Hashtable<String, Shape> shapeMap 
      = new Hashtable<String, Shape>();
    // getshape 方法可以通过通过id返回一个对象的克隆
   public static Shape getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);
      return (Shape) cachedShape.clone();
   }
 
   // 对每种形状都运行数据库查询，并创建该形状
   // shapeMap.put(shapeKey, shape);
   // 例如，我们要添加三种形状
   // 将三个对象放入哈希map里面缓存起来 这样通过key取出缓存的对象
   // 然后可以快速地根据id克隆出来自己想要创建的对象 免去构造过程的资源消耗
   public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);
 
      Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);
 
      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(),rectangle);
   }
}