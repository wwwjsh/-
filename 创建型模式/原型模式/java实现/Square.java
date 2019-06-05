public class Square extends Shape {
    // 继承可被克隆的形状类 具有内置可克隆的方法 clone
    public Square(){
      type = "Square";
    }
    // 通过克隆可以快速克隆第一个方形类
    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }
 }
 