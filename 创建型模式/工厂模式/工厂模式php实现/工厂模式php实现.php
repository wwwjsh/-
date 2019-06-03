<?php
interface Shape{
    public function draw();
}
class Circle implements Shape{
    public function __construct()
    {
        echo "now construct Circle!";
    }
    public function draw()
    {
        echo "now draw Circle";
    }
}
class Recengle implements Shape{
    public function __construct(){
        echo "now construct Recengle!";
    }
    public function draw()
    {
        echo "now draw Recengle";
    }
}
class ShapeFactory{
    public static function getshape($shapetype){
        if ($shapetype == 'Circle'){
            return new Circle();
        }else if ($shapetype == 'Recengle'){
            return new Recengle();
        }
    }
}
$shapefactory = new ShapeFactory();
$circle = $shapefactory->getshape('Circle');
$circle->draw();
?>