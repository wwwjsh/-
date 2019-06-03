// 主程序判断要实例化的工厂或者流水线是哪个 做出执行

public class FactoryPatternDemo{
    public static void main(String[] args){
        // 实例化类工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        //  指定具体要实现的流水线（小工厂） 圆形流水线
        Shape shape1 = shapeFactory.getshape("CIRCLE");
        shape1.draw(); // 相当于生产操作
        // 指定要实现的流水线为矩形
        Shape shape2 = shapeFactory.getshape("RECTANGLE");
        shape2.draw();
        // 实现一个生产方形的工厂
        Shape shape3 = shapeFactory.getshape("SQUARE");
        shape3.draw();
    }


}