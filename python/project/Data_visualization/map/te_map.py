
"""
演示地图可视化的基本使用
"""
# 导包
from pyecharts.charts import Map
from pyecharts.options import VisualMapOpts

# 准备地图对象
map = Map()

# 准备数据
data = [
    ("北京市",4),
    ("陕西省",34),
    ("广东省",234),
    ("台湾省",123),
    ("湖北省",123),
    ("河南省",67),
]
# 添加数据
map.add("测试地图",data,"china")


# 设置全局选项
map.set_global_opts(
    visualmap_opts=VisualMapOpts(
        is_show=True,
        is_piecewise=True, # 允许手动校准
        pieces=[
            {"min": 1,"max": 9,"lable":"1-9","color":"##BEBEBE"},
            {"min": 10,"max": 89,"lable":"10-89","color":"#2E8B57"},
            {"min": 90,"max": 199,"lable":"90-199","color":"#EEDD82"},
            {"min": 200,"max": 999999,"lable":"200-999999","color":"#B03060"},

        ]
        )
)

# 绘图
map.render()