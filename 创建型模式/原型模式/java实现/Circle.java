public class Circle extends Shape {
    // 快速克隆的圆形 类 可以通过克隆跳过构造方法创建一个圆形
    public Circle(){
      type = "Circle";
    }
  
    @Override
    public void draw() {
       System.out.println("Inside Circle::draw() method.");
    }
 }