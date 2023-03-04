# ES6新特性
* let和const：用于声明块级作用域的变量和常量，避免了var的变量提升和全局污染的问题。  
* symbol：一种新的原始数据类型，表示独一无二的值，可以用作对象属性名或者模拟私有成员。  
* 箭头函数：一种更简洁的函数语法，可以省略function关键字和return语句，同时绑定当前上下文的this值。  
* 类：一种基于原型的面向对象编程模式，可以使用class、constructor、extends、super等关键字定义类和继承关系。  
* 模板字符串：一种支持插值和多行字符串的语法，使用反引号（`）包裹字符串，并用${}表示表达式。  
* 解构赋值：一种从数组或对象中提取值并赋给变量的简便写法，可以按照对应位置或属性名进行匹配。  
* 默认参数：一种为函数参数指定默认值的语法，当调用函数时没有传递对应参数或传递undefined时，会使用默认值。  
* 剩余参数和展开运算符：剩余参数（…args）可以将函数接收到的多余参数收集到一个数组中；展开运算符（…arr）可以将一个数组或类数组对象展开为多个元素或参数。  
* Promise：一种异步编程的解决方案，表示一个未来可能完成或失败的操作，可以通过then方法添加成功或失败时执行的回调函数。  
* async/await：一种基于Promise的异步编程语法糖，可以使用async关键字定义一个返回Promise对象的函数，并在函数内部使用await关键字等待Promise对象状态改变后继续执行后续代码。  
## let 和 const
ES6推荐使用let声明局部变量，相比之前的var（无论声明在何处，都会被视为声明在函数的最顶部）let声明的是局部变量，var声明的是全局变量。

let表示声明变量，而const表示声明常量，两者都为块级作用域；const 声明的变量都会被认为是常量，意思就是它的值被设置完成后就不能再修改了。

如果const的是一个对象，对象所包含的值是可以被修改的。抽象一点儿说，就是对象所指向的地址没有变就行。  

注意：
* let 关键词声明的变量不具备变量提升（hoisting）特性
* let 和 const 声明只在最靠近的一个块中（花括号内）有效
* 当使用常量 const 声明时，请使用大写变量，如：CAPITAL_CASING
* const 在声明时必须被赋值  
## Symbol
在ES6之前，我们知道JavaScript支持8种数据类型：Object，String，Boolean，Number，Null，Undefined、Array、Function。现在，ES6新增了一种原始数据类型：symbol，表示独一无二的值，即每个symbol类型的值都不相同。
    
    var sy = Symbol('test');
    var sy1 = Symbol('test');
    console.log(tepeof sy);   //'symbol'
    sy == sy1;   //false
    var sy2 = new Symbol('test');   //error : Symbol is not a constructor  
    
每个symbol类型值都是独一无二的，即使传递的是相同的字符串。 
## 模板字符串

每个symbol类型值都是独一无二的，即使传递的是相同的字符串。  

基本的字符串格式化。将表达式嵌入字符串中进行拼接。用${}来界定；
反引号(``)直接搞定。
## 箭头函数
ES6 中，箭头函数就是函数的一种简写形式，使用括号包裹参数，跟随一个 =>，紧接着是函数体；  

箭头函数最直观的三个特点。  
* 不需要 function 关键字来创建函数  
* 省略 return 关键字  
* 继承当前上下文的 this 关键字 

当函数有且仅有一个参数的时候，是可以省略掉括号。当你函数返回有且仅有一个表达式的时候可以省略{} 和 return； 
## 默认参数
    // ES6之前，当未传入参数时，text = 'default'；
    function printText(text) {
    text = text || 'default';
    console.log(text);
        }

    // ES6；
    function printText(text = 'default') {
    console.log(text);
        }

    printText('hello');  // hello
    printText(); // default

## 剩余参数和展开运算符 
当被用于迭代器中时，它是一个 Spread 操作符

    function foo(x,y,z) {
    console.log(x,y,z);
    }
 
    let arr = [1,2,3];
    foo(...arr); // 1 2 3

当被用于函数传参时，是一个 Rest 操作符：当被用于函数传参时，是一个 Rest 操作符
    
    function foo(...args) {
    console.log(args);
    }
    foo( 1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]

## Promise
Promise 构造函数接受一个函数作为参数，该函数是同步的并且会被立即执行，所以我们称之为起始函数。起始函数包含两个参数 resolve 和 reject，分别表示 Promise 成功和失败的状态。  

起始函数执行成功时，它应该调用 resolve 函数并传递成功的结果。当起始函数执行失败时，它应该调用 reject 函数并传递失败的原因。  

Promise 构造函数返回一个 Promise 对象，该对象具有以下几个方法：  
* then：用于处理 Promise 成功状态的回调函数。
* catch：用于处理 Promise 失败状态的回调函数。
* finally：无论 Promise 是成功还是失败，都会执行的回调函数。

Promise 类有 .then() .catch() 和 .finally() 三个方法，这三个方法的参数都是一个函数，  
.then() 可以将参数中的函数添加到当前 Promise 的正常执行序列，  
.catch() 则是设定 Promise 的异常处理序列，  
.finally() 是在 Promise 执行的最后一定会执行的序列。 .then() 传入的函数会按顺序依次执行，有任何异常都会直接跳到 catch 序列

## async / await
async和await是用来处理异步操作的语法糖  

异步函数 async function 中可以使用 await 指令，await 指令后必须跟着一个 Promise，异步函数会在这个 Promise 运行中暂停，直到其运行结束再继续运行。