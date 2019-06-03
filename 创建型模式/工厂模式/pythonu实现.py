# 类型名 要继承的类 对象初始化点的属性
# myType = type('myType', (object,), {'a': 1})
# ob = myType()
# print(ob.a)
# print(type(myType))
# print(type(ob))
# python
class Shape():
    @classmethod
    def draw(cls):
        print("now draw " + cls.__name__)

class Circle(Shape):
    #  circle流水线 
    def __init__(self):
        print("Circle object is create")

class Rectangle(Shape):
    def __init__(self):
        print("Rectangle object is create")

class Factory(object):
    '''工厂实现'''
    def __new__(self, methods):
        # new是运行在__init__之前的方法
        if methods == None:
            return None
        elif methods == "Circle":
            print('1')
            return  Circle()
        elif methods == 'Rectangle':
            return Rectangle()
        else:
            print("without ")
            return None

shape = Shape()
shape.draw()

circle = Factory('Circle')
print(circle)
circle.draw()


    
