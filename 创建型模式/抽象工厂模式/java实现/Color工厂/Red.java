public class Red implements Color {
    // 一个生产Red的流水线
    @Override
    public void fill() {
       System.out.println("Inside Red::fill() method.");
    }
 }