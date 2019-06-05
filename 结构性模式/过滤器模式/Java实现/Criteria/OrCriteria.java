import java.util.List;
 
public class OrCriteria implements Criteria {
    // 通过这两个类的逻辑运算 嵌套和并列可以实现非常复杂的过滤器
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   // 要求两个标准只需要一个成立的与逻辑 或逻辑
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        // 或逻辑 将两次过滤结果 
        // 进行比较 一个是被插入的 另外一个取出比较元素 不存在的放入列表中 
      for (Person person : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(person)){
           firstCriteriaItems.add(person);
         }
      }  
      return firstCriteriaItems;
   }
}