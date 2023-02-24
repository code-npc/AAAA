# DOM 文档对象模型
## dom查找
### 按id属性，精确查找一个元素对象
* var elem = document.getElementById("id");
### 按标签名称查找
可以用在任意父元素上，不仅查直接子节点，而且查所有子代节点，返回一个动态集合，即使只找到一个元素，也返回集合，必须同[0]，取出唯一元素
* var elem = document.getElementsByTagName('tag');
### 按name属性，查找
* var elem = document.getElementsByName('name属性值');
### 按class属性，查找
* var elem = document.getElementsByClass('class');
### 按照选择器来查找
这种方式返回的是非动态集合。
* var elem = parent.querySelector('选择器');  //只找一个元素，如果选择器匹配的有多个，只返回第一个。
* var elem = parent.querySelectorAll('选择器'); //找多个元素
## DOM修改
### 核心DOM的4个操作-获取
1.先获的属性节点对象，在获得节点对象的值： 

var attrNode=elem.attributes[下标/属性名]  

var attrNode=elem.getAttributeNode(属性名)

attrNode.value---------属性值

2.直接获得属性值

var value = elem.getAttribute("属性名")

### 核心DOM的4个操作-修改
elem.setAttribute("属性名"，value)；//将elem元素中的属性名设置value
### 核心DOM的4个操作-判断是否包含指定的属性
var bool = elem.hasAttribute("属性名")
### 核心DOM的4个操作-移除属性
elem.removeAttribute("属性名")
### 修改样式
elem.style.属性名 //注意，这时候的属性名要 去横线，变驼峰 ex:background-color  -> backgroundColor
## DOM 添加
### 1.创建空元素
var elem = document.creatElement("属性名")
### 2.设置关键属性与样式
elem.innerHTML="" , ex: a.innerHTML="链接1"; a.href = "www.baidu.com";  
样式： a.style.width = "200px";  a.style.cssText = "可以放多条样式"
### 3.将元素添加到DOM树
parentNode.appendChild(childNode); 可用于将为一个父元素追加最后一个子节点  
parentNode.insertBefore(newChild,existingChild); 用于在父元素中的指定子节点之前添加一个新的子节点

## 添加元素优化
我们要尽量少的操作DOM树，因为每次修改DOM树，都会导致layout，所以我们应该：  
* 如果同时创建父元素和子元素时，建议在内存中先将子元素添加到父元素，再将父元素一次性挂到页面。
+ 如果只添加多个平级子元素时，就要将所有子元素，临时添加到文档片段中。再将文档片段整体添加到页面。

文档片段：内存中，临时保存多个平级子元素的虚拟父元素，用法和普通父元素完全一样。  
1. 创建片段  
var frag = document.creatDocumentFragment();  
2. 将子元素临时追加到frag中  
frag.appendChild(child);  
3. 将frag追加到页面  
parent.appendChild(frag);  注；append之后，frag自动释放，不会占用元素

# BOM 浏览器对象模型
