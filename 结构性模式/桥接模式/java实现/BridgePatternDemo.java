public class BridgePatternDemo {
     // 执行文件可以通过这个文件进行画圆 
     // 核心：有两个可以不分先后共同产生作用的类
     // 将一个类桥接到另外一个 被桥接的类产生的对象因为被桥接而发生了一点改变
     // 相当于在将一台白色的自行车进行桥接改装接上一个电源 变成了一个电动自行车
    public static void main(String[] args) {
       Shape redCircle = new Circle(100,100, 10, new RedCircle());
       Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
  
       redCircle.draw();
       greenCircle.draw();
    }
 }