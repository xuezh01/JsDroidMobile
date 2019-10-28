class Hello{

}

interface Hello{

}

enum Hello{
    TYPE
}


groovy中，方法返回类型必须大写开头或者def开头

## 1.类提示
在identifier中，类提示,如果在空格之后，则变量提示，例子：User user 

root:
    关键字提示：def class enum while import ...
    类提示
statements:类提示、名称提示

formalParameters:
    类型提示、def提示、名称提示
    
identifier://变量名

literal://数字



new 后面提示
pathExpression后面提示
block 提示

所有提示...当前节点优先 - -

精确提示...去除父节点中的提示 x