public abstract class Shape {
    // 一个抽象类 里面调用了Drawapi接口实现的类 
    // 通过这个抽象类实现的类可以调用 两个实体化的类 相当于实现了一层继承
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
       this.drawAPI = drawAPI;
    }
    public abstract void draw();  
 }
