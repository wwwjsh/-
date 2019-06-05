import java.util.List;
 
public class AndCriteria implements Criteria {
    // 这是一个特殊的标准
    // 通过这个类 可以实现将多个过滤器（标准）实现的类0嵌套起来
    // 可以通过调用一个函数 然后这个函数类似链表传递下一个调用
    // 不停地传递调用 来实现通过多个过滤器过滤得到的结果
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   // 这个函数实现了链式结构的传递调用 可以传递通过属性来传递调用
   // 要求两个标准同时成立的或逻辑
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
       // 与逻辑 是通过两次过滤得到接口实现的
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);     
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}