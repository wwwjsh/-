public class Pepsi extends ColdDrink {
    // 将抽象的冷饮类实例化 形成一杯冷饮 ： 百事可乐
    @Override
    public float price() {
       return 35.0f;
    }
    // 赋予一个名字属性  这是一个需要强制实现的抽象方法
    @Override
    public String name() {
       return "Pepsi";
    }
 }