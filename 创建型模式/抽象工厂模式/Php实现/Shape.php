<?php
interface Shape{
    // G工厂要实现的接口
    public function draw();
}
class Square implements Shape{

    // 生产square的流水线
    public function draw(){
        echo "make a Square!";
    }
}
class Rectangle implements Shape{

    // 生产square的流水线
    public function draw(){
        echo "make a Rectangle";
    }
}
interface Color {
    public function fill();
}
class Red implements Color{
    public function fill(){
        echo "now fill in Red";
    }
}
class Blue implements Color{
    public function fill(){
        echo "now fil in Blue";
    }
}
abstract class AbstractFactory{
    // 整合抽象化， 这两个工厂
    abstract public function getshape($shape);
    abstract public function getcolor($color);
}
class ShapeFactory extends AbstractFactory{
    public function getshape($shape){
        if ($shape == null){
            return null;
        }else if ($shape == "Square") {
            return new Square();
        }else if ($shape == "Rectangle"){
            return new Recengle();
        }else{
            return null;
        }
    }
    public function getcolor($color)
    {
        return null;
    }
}

class ColorFactory extends AbstractFactory{
    // 实现抽象类的所有抽象方法 实现颜色工厂
    public function getshape($shape){
        return null;
    }
    public function getcolor($color){
        if ($color == null){
            return null;
        }else if ($color == "Red"){
            return new Red();
        }else if ($color == "Blue"){
            return new Blue();
        }else{
            return null;
        }
    }
}
class Factory{
    // 实现这个工厂 并且整合两个工厂
    public static function getFactory($choice){
        if ($choice == "SHAPE"){
            return new ShapeFactory();
        }else if($choice == "COLOR"){
            return new ColorFactory();
        }
        return null;
    }
}
$factory = new Factory ();
$shapefactory  = $factory->getFactory("SHAPE");
echo var_dump($shapefactory);
$shapefactory->getshape("Square")->draw();

?>