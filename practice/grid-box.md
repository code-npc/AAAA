## 网格布局
### 网格容器属性
    display: grid
    grid-template-columns//划分网格的列，取值：px % auto fr repeat()函数
        grid-template-columns:1fr 1fr; //划分列为1 ：1
        grid-template-columns:1fr 2fr; //划分列为1 ：2
        grid-template-columns:100px 1fr 2fr; //第一列为100像素固定宽度，剩余两列分为1 ：2
        grid-template-columns:repeat(3,1fr); //划分三列，为1 ：1的比例
    grid-template-rows//划分网格的行
    grid-template-areas//命名单元格，相同名称的单元格被划分为一个区域 
    grid-gap------grid-row-gap行间距\grid-column-gap列间距
    justify-items：start| end| center| 默认sretch //设置水平的对齐方式
    align-items：start| end| center| 默认sretch //设置垂直的对齐方式
    justify-content:start| end| center| stretch| space-around | space-bentween | space-evenly //设置水平方向整体的对齐方式
    align-content:start| end| center| stretch| space-around | space-bentween | space-evenly //设置垂直方向整体的对齐方式
### 网格元素属性
    grid-colunm-*  //*可以代表start和end
    grid-row-*   //*可以代表start和end，这俩属性主要用于网格元素的定位，grid-row-start：1；grid-row-end：2；表示从第一行起，第二行  
    结束，配合列定位可以确定一个唯一的位置，类似直角坐标系  
    在这里是可以简写的，grid-row：1/2；表示的含义是一样的；还可以这样写，grid-area：1/1/2/2；表示从第一行开始，第一列开始，第二行结束，第二列结束
    justify-self:start| end| center| stretch //单个网格元素的对齐方式，这两个可统一写为 place-self
    align-self:start| end| center| stretch
