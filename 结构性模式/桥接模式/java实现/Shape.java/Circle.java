public class Circle extends Shape {
    // 通过这个实体化的接口实现了一个圆 
    private int x, y, radius;
  
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        // 调用父类的构造方法
       super(drawAPI);
       this.x = x;  
       this.y = y;  
       this.radius = radius;
    }
    // 必须要实现的抽象方法 通过这个方法可以画指定颜色 输入长度的圆
    public void draw() {
       drawAPI.drawCircle(radius,x,y);
    }
    // 还有一个从抽象类继承的非抽象方法 
 }