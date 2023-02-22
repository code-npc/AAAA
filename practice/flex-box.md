## 弹性盒子布局
### 适应环境
    1.移动应用开发  
    2.响应式布局  
### 特点
    拉伸以填充额外的空间，收缩以适应更小的空间   

### 弹性容器样式：
    display: flex //将容器设置为弹性容器
    flex-direction: row / row-reverse / column / column-reverse  //设置按行或列布局 （flex-flow）
    flex-wrap: wrap / wrap-reverse //设置元素多的时候是否可以折行（flex-flow）
    flex-flow: row wrap //意思就是元素按行排列，可以折行
    justify-content： flex-start / center / flex-end / space-between / space-around //水平方向排列的设置    
    属性含义依次是strat方向对齐，居中对齐，end方向对齐，两端对齐，拉手对齐
    align-items: flex-start / center / flex-end / stretch  //垂直方向排列的设置,最后一个属性是垂直拉伸
    align-content:flex-start / center / flex-end / stretch /space-between / space-around     
    //设置多行元素在容器中的整体对齐方式，注意，对单行元素无效 

### 弹性元素的样式：
    flex-grow：0 1 2 3   //元素拉大的比例（flex） 默认为0表示不会被拉大 1表示等比放大
    flex-shrink: 0 1  //元素缩小的比例（flex）默认为1，表示弹性元素等比例压缩 0则表示不压缩
    flex-basis  //元素基础的大小（flex）  
     元素在主轴上的默认尺寸，其优先级高于width属性，如果主轴为垂直方向，其优先级高于height属性
    order ：1 2 3   // 设置子元素的排列顺序  数字越小排名越靠前
    align-self：auto/ flex-start/ flex-end/ center/ baseline/stretch  //元素单独的自己的对齐方式



