import java.util.ArrayList;
import java.util.List;
 
public class CriteriaFemale implements Criteria {
    // 过滤出所有女性的过滤器 也可以说标准是只要是女的就行
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> femalePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("FEMALE")){
            femalePersons.add(person);
         }
      }
      return femalePersons;
   }
}