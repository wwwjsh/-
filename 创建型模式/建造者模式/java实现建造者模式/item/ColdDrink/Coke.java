public class Coke extends ColdDrink {
     // 一种具体的冷饮：可乐 继承抽象的冷饮类
    @Override
    public float price() {
       return 30.0f;
    }
    // 赋予名称
    @Override
    public String name() {
       return "Coke";
    }
    // 继承默认的包装方法
 }