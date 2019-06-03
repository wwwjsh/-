// 主程序 相当于一个顾客来了 我们辛辛苦苦用创造者创造的套餐
// 可以开始工作了 
public class BuilderPatternDemo {
    public static void main(String[] args) {
       MealBuilder mealBuilder = new MealBuilder();
        // 通过（前台）套餐工厂提供的两个套餐让用户去选择创建哪一个套餐
       Meal vegMeal = mealBuilder.prepareVegMeal();
       System.out.println("Veg Meal");
       vegMeal.showItems();
       System.out.println("Total Cost: " +vegMeal.getCost());
        // 一个套餐  
       Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
       System.out.println("\n\nNon-Veg Meal");
       nonVegMeal.showItems();
       System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
 }
 // 总结 可以发现 所有的创建型模式都要基于一个简单工厂去实现
 // colddrink和Burger[抽象类]（建造者的两个基本种类元）都会用到的packing(接口)
 // 具体实现packing接口的类 提供基本元的几个动作属性
 // 抽象类 colddrink和Burger 两个基本种类元的抽象话
 // 具体化实现抽象类 创建两个基本元的含有的物品类，使用默认继承的非抽象方法 实现代码的复用
 // 通过一个工厂 存储这两个类的自由组合
 // 指定一个建造者类 只能生产提供的类的套餐组合