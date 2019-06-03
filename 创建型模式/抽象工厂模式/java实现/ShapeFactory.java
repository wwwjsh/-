public class ShapeFactory extends AbstractFactory {
    // 通过 整合两个工厂抽象化的接口实现一个子工厂 只定义抽象接口的一个方法
    @Override
    public Shape getShape(String shapeType){
       if(shapeType == null){
          return null;
       }        
       if(shapeType.equalsIgnoreCase("CIRCLE")){
          return new Circle();
       } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
          return new Rectangle();
       } else if(shapeType.equalsIgnoreCase("SQUARE")){
          return new Square();
       }
       return null;
    }
    // 通过这里可以查看 和这个工厂并列的工厂
    @Override
    public Color getColor(String color) {
       return null;
    }
 }