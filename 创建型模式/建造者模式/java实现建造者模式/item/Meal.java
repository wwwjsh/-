import java.util.ArrayList;
import java.util.List;
 // 这是一个存储容器 负责存储套餐相当于再外加了、一层包装 
 // 这里是套餐存储的地方 相当于一个容器仓库(厨房)
public class Meal {
    // 定义一个泛型列表 只能存储item类 并且只能在内部使用 
   private List<Item> items = new ArrayList<Item>();    
    // 泛型列表添加元素的方法
   public void addItem(Item item){
      items.add(item);
   }
   // 遍历item列表里面所有的价格计算这个套餐的价格
   public float getCost(){
      float cost = 0.0f;
      for (Item item : items) {
         cost += item.price();
      }        
      return cost;
   }
    // 展示item 展示食品列表 并把他对应的包装 价格 名称全部显示出来
   public void showItems(){
      for (Item item : items) {
         System.out.print("Item : "+item.name());
         System.out.print(", Packing : "+item.packing().pack());
         System.out.println(", Price : "+item.price());
      }        
   }    
}