public class Person {
    // 这是一个基础的对象 有很多个属性不同的这样的对象组成对象列表
    private String name;
    private String gender;
    private String maritalStatus;
  
    public Person(String name,String gender,String maritalStatus){
       this.name = name;
       this.gender = gender;
       this.maritalStatus = maritalStatus;    
    }
  
    public String getName() {
       return name;
    }
    public String getGender() {
       return gender;
    }
    public String getMaritalStatus() {
       return maritalStatus;
    }  
 }