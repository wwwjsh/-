import java.util.List;
    // 通过这个接口可以实现 过滤器（过滤标准）来实现一个接口
public interface Criteria {
    // 需要实现过滤的方法 两次过滤合并去重
   public List<Person> meetCriteria(List<Person> persons);
}