public class Rectangle implements Shape{
    // 生产矩形的生产线
    // 重写 类工厂要实现的接口
    @Override
    public void draw(){
        System.out.println("Intside  Rectangle::draw() mothod.");
    }
}