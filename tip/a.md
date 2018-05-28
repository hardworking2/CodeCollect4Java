##### SimpleDateFormat的格式大小是有影响的
##### 要关注实体类POJO,保护无参数调用方法，不能参入内部类
##### POJO
POJO（Plain Ordinary Java Object）简单的Java对象，实际就是普通JavaBeans，是为了避免和EJB混淆所创造的简称。
使用POJO名称是为了避免和EJB混淆起来, 而且简称比较直接. 其中有一些属性及其getter setter方法的类,没有业务逻辑，有时可以作为VO(value -object)或dto(Data Transform Object)来使用.当然,如果你有一个简单的运算属性也是可以的,但不允许有业务方法,也不能携带有connection之类的方法。
[POJO介绍链接](https://baike.baidu.com/item/POJO/3311958)

##### 不能关闭的应用，不能删除的文件
开启文件占用，查看资源监视器，搜索cpu相应句柄，点击关闭	