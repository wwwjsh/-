public class VegBurger extends Burger {
    // 一种具体的汉堡包 继承抽象的汉堡包类
    @Override
    public float price() {
       return 25.0f;
    }
    // 赋予这个食品名称
    @Override
    public String name() {
       return "Veg Burger";
    }
    // 包装方法已经被继承不用再定义了 默认装包
 }