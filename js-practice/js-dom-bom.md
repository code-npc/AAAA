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
var elem = document.createElement("属性名")
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

## 常用属性和方法总结

elem.addEventListener(click,function(){},) 将事件处理程序附加到元素.第三个参数可选，默认为false - 处理程序在冒泡阶段执行。true - 处理程序在捕获阶段执行。   
elem.appendChild("button") 向元素添加新的子节点，作为最后一个子节点。  
elem.attributes 返回元素属性的NamedNodeMap，就是获得该元素的属性列表  
elem.childNodes 返回元素子节点的的列表，  
elem.className  设置或返回元素class属性   
elem.id  设置或返回元素id   
element.tagName  返回元素的标签名   
element.textContent   设置或返回节点及其后代的文本内容。  
elem.cloneNode()  克隆元素。参数默认为false，克隆节点及其后代。设置为true，克隆节点及其属性，以及后代。  
elem.firstChild  返回元素的首个子元素。   
elem.lastChild  返回元素的最后一个子元素。  
elem.getAttribute() 返回元素节点的指定属性值。     
elem.getAttributeNode()  返回指定的属性节点  
elem.hasAttribute()  如果元素拥有指定属性，则返回true，否则返回false  
elem.hasAttributes()  如果元素拥有属性，返回true，否则返回false  
elem.hasChildNodes() 如果元素拥有子节点，则返回true，否则false  
elem.innerHTML  设置或返回元素的内容  
elem.insertBefore(newnode,existnode) 在指定的已有子节点之前插入新节点,第一个参数必需，是需要插入的节点对象，第二个节点可选，在其之前插入新节点的子节点，如果未规定，默认在尾部插入新节点，同appendChild（）   
elem.nodeName   返回元素名称
elem.nodeType   返回元素的节点类型
elem.nodeValue   设置或返回元素值  
elem.setAttribute(name，key) 把指定属性设置或更改为指定值  
elem.setAttributeNode() 设置或更改指定属性节点,其实功能同上一个一样。 

# BOM 浏览器对象模型
