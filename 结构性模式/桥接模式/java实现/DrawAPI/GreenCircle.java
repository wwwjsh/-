public class GreenCircle implements DrawAPI {
    // 一个非常实体的类 
    // 画绿色的圆的类
    @Override
    public void drawCircle(int radius, int x, int y) {
       System.out.println("Drawing Circle[ color: green, radius: "
          + radius +", x: " +x+", "+ y +"]");
    }
 }