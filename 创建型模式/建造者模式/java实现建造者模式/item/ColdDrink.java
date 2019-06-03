// 定义食品
public abstract class ColdDrink implements Item {
    // 默认的包装方法 装瓶
    @Override
    public Packing packing() {
       return new Bottle();
    }
    // 必须实现的抽象方法 记录价格 
    @Override
    public abstract float price();
}