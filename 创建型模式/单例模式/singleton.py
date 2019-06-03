class Singleton(object):
    '''
    单例模式 python实现
    该类创建的都是同一个对象
    '''
    _intsance = None # 定义类私有属性 类被实例化后 此属性指向第一个被实例化的属性

    def __new__(cls, *args, **kwargs):
        '''类中第一个被执行的方法'''
        if cls._intsance is None:
            # 未有实例，创建一个实例
            cls._intsance = super().__new__(cls, *args, **kwargs)
        # 始终返回第一个创建的实例
        return cls._intsance