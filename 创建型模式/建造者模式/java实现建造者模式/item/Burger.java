// 显示item接口的抽象类
// 一个食品 汉堡包把食品项目接口实现 
public abstract class Burger implements Item {
    // 提供了默认的包装方法 就是直接wrapper 
    // 还有一种包装方法需要用户自己选择并且重写 
    // 就是bottle （选择装箱还是装瓶）
    @Override
    public Packing packing() {
       return new Wrapper();
    }
    // 需要自己去实现的抽象方法 定义价格
    @Override
    public abstract float price();
 }