import java.awt.Rectangle;

public class ShapeFactory {
    // 囊获所有的生产线 实现一个多生产线的类工厂 专门生产用户所需的类

    public Shape getShape(String shapeType){
        // 使用getShape方法 获取要创建的生产线 既工厂里要实例化的类具体是哪个
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(); 
        }
        return null;
    }
}