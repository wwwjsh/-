public class ColorFactory extends AbstractFactory {
    // 实现一个颜色工厂
    // 使用抽象类实现的好处是 通过具有并列关系的工厂中的一个工厂或者通过超类抽象工厂
    // 就可以大概了解到其他并列的工厂 使得代码逻辑思路更清晰 可读性更强
    @Override
    public Shape getShape(String shapeType){
       return null;
    }
    
    @Override
    public Color getColor(String color) {
       if(color == null){
          return null;
       }        
       if(color.equalsIgnoreCase("RED")){
          return new Red();
       } else if(color.equalsIgnoreCase("GREEN")){
          return new Green();
       } else if(color.equalsIgnoreCase("BLUE")){
          return new Blue();
       }
       return null;
    }
 }