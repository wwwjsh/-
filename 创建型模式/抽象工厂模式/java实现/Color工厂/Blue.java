public class Blue implements Color {
    // 实现一个生产Blue的流水线
    @Override
    public void fill() {
       System.out.println("Inside Blue::fill() method.");
    }
 }