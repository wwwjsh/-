import java.util.ArrayList;
import java.util.List;
 
public class CriteriaMale implements Criteria {
   // 这是一个过滤标准（过滤器） 
   // param： 对象列表
   // return: 过滤后（经过标准筛选后的列表）
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}