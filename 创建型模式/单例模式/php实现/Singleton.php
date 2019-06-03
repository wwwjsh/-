<?php 
class Singleton{
    private static $instance;
    private function __construct()
    {
        // 防止被实例化
    }
    
    public static function getInstance(){
        // 使用getInstance  确保只有一个实例被生成
        if (self::$instance == null){
            self::$instance = new Singleton();
        }
        return self::$instance;
    }
}
?>