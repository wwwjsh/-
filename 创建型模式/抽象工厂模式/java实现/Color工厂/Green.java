public class Green implements Color {
    // 实现一个生产Green的流水线
    @Override
    public void fill() {
       System.out.println("Inside Green::fill() method.");
    }
 }