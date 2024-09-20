# 了解封装
from tkinter.font import names


# 私有成员变量
class Animal:
    name:None
    __add = None  #私有变量

    def __init__(self,name,__add):
        self.name = name
        self.__add = __add
    def __str__(self):
        return f"name:{self.name},address:{self.__add}"

    def __private(self):   # 私有成员方法
        print("私有方法！！")

    def fun(self):
        print("公共方法！！")
a1 = Animal("老虎", "东北")

print(a1)
a1.fun()
