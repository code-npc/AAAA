# css3新特性
## 圆角边框 border-radius
    border-top-left-radius 左上角的形状
    border-top-right-radius 右上角的形状
    border-bottom-left-radius 左下角的形状
    border-bottom-right-radius 右下角的形状
## 阴影box-shadow
    box-shadow:inset *px *px 模糊距离 阴影颜色| outset; //inset 内部阴影 阴影的水平偏移，垂直偏移，outset 默认值，外部阴影
## 文字和文本
    text-shadow:水平偏移 垂直偏移 阴影大小（可省略） 颜色；
    word-wrap: normal | break-word //长文本强制换行，折叠的效果.   break-word设置可折叠。

    @font-face  定义网络字体，并引用。 规则：  
1.在本地站点文件下载相应的文字字体文件，注意，不同浏览器可以支持的文件格式有限  

2.在样式表中定义字体，如下   

    @font-face{
        font-family: name; 
        url ("文字文件的地址","***","***" ...);
    }  
3.引用定义的字体  

    p{ font-family: name; }`//这里的name必须与上面定义的name值一样  
## 2D转换方法
对元素进行旋转，缩放，移动，拉伸。  

    transform:rotate( *deg ); // rotate()函数表示旋转，里面的参数为正数，表示顺时针旋转的角度，如果为负数，表示逆时针旋转的角度  
    transform:scale(x,y); //scale函数设置缩放，x代表水平方向缩放的倍数，y表示垂直方向缩放的倍数，若y省略，则同x        0~1，缩小 1 ~ ∞，放大
## 过渡
transition 将元素的某个***属性***从 ***一个值*** 在***指定的时间内***过渡到 ***另一个值***    

    transiton: 属性名 持续时间 过度方法
    transition-property: 属性名 | all //发生变化的属性名，或者直接就是所有发生变化的属性
    transition-duration: 持续时间（s）
    transition-timing-function: linear匀速 | ease慢快慢 | ease-in慢快 | ease-out快慢 | ease-in-out慢快慢
## 动画
animation:  
animation-name : 引用@keyframes动画的名称  
animation-duration : 动画完成时间  
animation-function : 规定动画的速度曲线，默认是“ease”  
animation-paly-state : running | paused

1.定义动画：  
    
    @keyframes name{
        0%  {样式}//动画开始的时候
        30% {样式}//过渡
        60% {样式}//过渡
        100%{样式}//动画结束的时候
    }
2.调用动画  

    选择器{
        animation: name 3s linear;
    }

## 3D变换
 3D 
    
    transform-style : preserve-3d

旋转 设置在需要变换的元素的父容器上

    transform : rotateX(*deg);  
    transform : rotateY(*deg);  
    transform : rotateZ(*deg);
    
透视 设置在外层容器中 
    
    perspective: *px; //含义:近大远小,站的近着变换幅度大
