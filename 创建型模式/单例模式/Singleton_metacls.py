class Singleton(type):
        '''元类Singleton 类可以通过实例化一个元类 改造成单例类'''
        _instance = {}

        def __call__(cls, *arg, **kwargs):
            if cls not in cls._instance:
                cls._instance[cls] = super().__call__(*arg, **kwargs)
            # 保证了每个被实例化的类都是唯一的， 每个实例化的对象也是唯一指定的
            return cls._instance[cls]