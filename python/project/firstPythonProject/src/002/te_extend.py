# 了解继承

# 单继承
class Phone001:
    id = None
    producer  = "hw"

    def call_4g(self):
        print("4g通话",self.producer)


class Phone002(Phone001):
    is5G = True

    def call_5g(self):
        print("5g通话",self.producer)

# 多继承
class Phone003(Phone002):
        pass

p1 = Phone001()
p2 = Phone002()
p3 = Phone003()
p1.call_4g()
p2.call_5g()
p3.call_5g()