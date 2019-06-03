// java实现单例模式 懒汉式 线程安全 但是会过多占用内存

public class Singleton {
    private static Singleton instance;
    // 让构造函数为private这样该类就不会被实例化
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}