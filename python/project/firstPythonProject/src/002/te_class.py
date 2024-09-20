# 创建一个类
class Student:
    # 类的属性（成员变量）
    name = None
    gender = None
    age = None

    # 构造方法__init__()
    def __init__(self,name,gender,age):
        self.name = name
        self.gender = gender
        self.age = age




    # 其他内置方法
    #__str__()
    def __str__(self):
        return f"student类对象，name={self.name},age={self.age},gender={self.gender}"
    # __lt__()
    def __lt__(self, other):
        return self.age < other.age

    # __le__()
    def __le__(self, other):
        return self.age < other.age

    # __eq__() 默认比较的是内存地址，所以是重写
    def __eq__(self, other):
        return self.age == other.age


    # 类的方法(行为) （成员方法）
    def fun(self):
        print(self.age)


# 创建一个对象
st1 = Student("张三","男",19)
st2 = Student("李四","男",20)

# # 对象赋值
# st1.name=
# st1.gender= "nan"
# st1.age = 15

# st1.fun()
# print(st1.name,st1.gender,st1.age)

print(st1)
print(st2)

print(st1 > st2)  # False
print(st1 < st2)  # True
print(st1 <= st2)  # True
print(st1 == st2)  # False