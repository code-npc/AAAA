# CSS3媒体查询 Media Query
检查设备的不同宽度和尺寸，来显示不同的样式   
视口：网页显示的区域

    <meta name="viewport" content="width=device-width, initial-scale=1.0">//完成视口的约定
    
    检查设备宽度，根据宽度设置css样式
    超小屏extra small  < 768 px
    小屏small   >= 768 px
    中等medium  >= 992 px
    大屏large   >= 1200 px

    //在style标签中设置 
     @media screen and (min-width:768px){/* 大于等于768px */
            body {
                background-color: red
            };
        }

    
# 第三方框架 Bootstrap