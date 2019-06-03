public abstract class AbstractFactory {
    // 抽象化 整合这两个工厂要实现的接口
    // 整合这个抽象工厂里面的所有子工厂 可以让代码可读性更强 
    // 尽管子工厂不可能全部实现（完全定义）所有的抽象方法
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
 }