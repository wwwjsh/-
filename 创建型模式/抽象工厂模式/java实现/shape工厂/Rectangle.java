public class Rectangle implements Shape {
    // 生产Rectangle的流水线
    @Override
    public void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
 }