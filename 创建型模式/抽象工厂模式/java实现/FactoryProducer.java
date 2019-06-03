public class FactoryProducer {
    // 创建一个工厂 整合两个工厂
    public static AbstractFactory getFactory(String choice){
       if(choice.equalsIgnoreCase("SHAPE")){
          return new ShapeFactory();
       } else if(choice.equalsIgnoreCase("COLOR")){
          return new ColorFactory();
       }
       return null;
    }
 }