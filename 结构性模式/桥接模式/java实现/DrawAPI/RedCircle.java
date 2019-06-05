public class RedCircle implements DrawAPI {
    // 通过这个实体的接口桥接实现具体的实体类
    // 这是一个画红色圆的类
    @Override
    public void drawCircle(int radius, int x, int y) {
       System.out.println("Drawing Circle[ color: red, radius: "
          + radius +", x: " +x+", "+ y +"]");
    }
 }