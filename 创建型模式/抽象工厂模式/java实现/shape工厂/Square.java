public class Square implements Shape {
    // 生产Square的流水线
    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }
 }