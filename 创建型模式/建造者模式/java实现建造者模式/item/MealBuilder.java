// 这是一个负责创建套餐的类 负责套餐的创建过程 
// 这个类负责和（存储容器）厨房的交互 相当与一个前台
public class MealBuilder {
 
    // 提供的第一个套餐 包含一瓶可乐 一个汉堡 
    public Meal prepareVegMeal (){
       Meal meal = new Meal();
       meal.addItem(new VegBurger());
       meal.addItem(new Coke());
       return meal;
    }   
    // 第二个套餐 提供一瓶百世可乐 和一个肌肉汉堡 
    public Meal prepareNonVegMeal (){
       Meal meal = new Meal();
       meal.addItem(new ChickenBurger());
       meal.addItem(new Pepsi());
       return meal;
    }
    // 返回类型都为 餐类型 
    // 这个类只提供了两个套餐 如果后续有新的套餐 可以很方便地增加
 }