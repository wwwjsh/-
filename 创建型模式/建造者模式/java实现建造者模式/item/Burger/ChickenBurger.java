public class ChickenBurger extends Burger {
    // 继承汉堡抽象类实现 火腿肌肉汉堡 
    // 定义价格
    @Override
    public float price() {
       return 50.5f;
    }
    // 定义名称
    @Override
    public String name() {
       return "Chicken Burger";
    }
    // 使用默认的包装方法
 }