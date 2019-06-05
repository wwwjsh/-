public class Rectangle extends Shape {
    // 继承可克隆的抽象类 这是一个可以被快速克隆产生的矩形类
    public Rectangle(){
      type = "Rectangle";
    }
  
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
 }