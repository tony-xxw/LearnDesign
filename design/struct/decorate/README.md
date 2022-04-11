## 装饰者模式(结构型)(重要)

> 在不改变原有对象的基础上,将功能附加到对象上
> 提供了比集成更有弹性的替代方案(扩展原有对象功能)


**适用场景**

- 扩展一个类的功能或给一个类添加附加职能

- 动态的给一个对象添加功能，这些功能可以再动态的撤销

**优点**

- 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
- 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果(蛋糕一层层)
- 符合开闭原则

**缺点**

- 会出现更多的代码，更多的类，增加程序的复杂性
- 动态装饰时，多层装饰时会更复杂

**相似设计模式**
- 代理模式
- 适配器模式