public abstract class Shape implements Cloneable {
    // 这个抽象类需要实现一个cloneable的内置接口 继承这个抽象类的类可以被克隆
    private String id;
    protected String type;
    
    abstract void draw();
    
    public String getType(){
       return type;
    }
    
    public String getId() {
       return id;
    }
    
    public void setId(String id) {
       this.id = id;
    }
    
    public Object clone() {
       Object clone = null;
       // 实现cloneable接口 子类产生的对象可以被克隆
       try {
           // 继承这个抽象类的子类可以被克隆
          clone = super.clone();
       } catch (CloneNotSupportedException e) {
          e.printStackTrace();
       }
       return clone;
    }
 }