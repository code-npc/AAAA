"""
构建基础的柱状图
"""
#导包
from pyecharts.charts import Bar,Timeline
from pyecharts.options import LabelOpts

# 对象
bar1 = Bar()
# 添加x轴
bar1.add_xaxis(["中国","美国", "英国"])
# 添加y轴
bar1.add_yaxis("GDP",[40,20,10],label_opts=LabelOpts(position="right"))
# 反转x轴和y轴
bar1.reversal_axis()

bar2 = Bar()
# 添加x轴
bar2.add_xaxis(["中国","美国", "英国"])
# 添加y轴
bar2.add_yaxis("GDP",[60,30,14],label_opts=LabelOpts(position="right"))
# 反转x轴和y轴
bar2.reversal_axis()

bar3 = Bar()
# 添加x轴
bar3.add_xaxis(["中国","美国", "英国"])
# 添加y轴
bar3.add_yaxis("GDP",[80,60,40],label_opts=LabelOpts(position="right"))
# 反转x轴和y轴
bar3.reversal_axis()

# 时间线对象
timeline = Timeline()

# 在时间线内添加柱状图对象
timeline.add(bar1,"时间点1")
timeline.add(bar2,"时间点2")
timeline.add(bar3,"时间点3")

# 添加自动播放
timeline.add_schema(
    play_interval=1000, # ms
    is_timeline_show=True,
    is_auto_play=True,
    is_loop_play=True
)
# 绘图
timeline.render("基础柱状图（带时间线）.html")