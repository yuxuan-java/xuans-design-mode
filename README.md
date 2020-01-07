# xuans-design-mode 设计模式

- 信息的隐藏促进了软件的复用
- 如果两个类之间不必彼此直接通信，那么就不要让这两个类发生直接的相互作用。
- 代码重复是编程中最常见、最糟糕的'坏味道'，如果我们在一个以上的地方看到相同的程序结构，那么请设法将它们合二为一。
- 完全相同的代码当然存在明显的重复，而微妙的重复会出现在表面不同但是本质相同的结构或处理步骤中。

## 一.创建型模式

- 创建型模式隐藏了这些类的实例是如何被创建和放在一起，整个系统关于这些对象所知道的是由抽象类所定义的接口。
  这样，创建型模式在创建什么、谁创建它、它是怎么被创建的，以及何时创建这些方面提供了很大的灵活性。
  创建型模式会将关于该系统使用哪些具体的类的信息封装起来。
  允许用结构和功能差别很大的对象配置一个系统。
  配置可以是静态的，即在编译时指定，也可以是动态的，就是运行时再指定。
  当一个系统应该独立于它们的产品创建、构成和表示时，应该考虑创建型模式。

- 内聚性描述的是一个例程内部组成部分之间相互联系的紧密程度。
    而耦合性描述的是一个例程与其他例程之间联系的紧密程度。
    软件开发的目标应该是创建这样的例程：
        内部完整，也就是高内聚
        与其他例程之间的联系则是小巧、直接、可见、灵活的，这就是松耦合
    
### 1. 简单工厂模式：
    让业务逻辑与客户端逻辑分开，让它们之间耦合度下降。
    简单工厂模式并不符合开放-封闭原则
        
### 2. 抽象工厂模式：
    提供一个创建一系列或相关依赖对象的接口，而无需指定它们具体的类。
        
### 3. 建造者模式：
    将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
    
### 4. 工厂方法模式：
    定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法模式使一个类的实例化延迟到其子类。
    通常设计应该是从工厂方法模式开始，当设计者发现需要更大的灵活性时，设计便会向其他创建型模式演化。
    当设计者在设计标准之间进行权衡的时候，了解多个创建型模式可以给设计者更多的选择余地。

### 5. 原型模式：
    用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
    建立相应数据的原型并克隆它们，通常比每次用合适的状态手工实例化该类更方便一些。

### 6. 单例模式：
    保证一个类仅有一个实例，并提供一个访问它的全局访问点。
    让类自身负责保存它的唯一实例。
    这个类可以保证没有其他实例可以被创建，并且还提供一个访问该实例的方法。
    对唯一的实例可以严格地控制客户怎样以及何时访问它。

## 二.结构型模式
    
### 1.适配器模式：
    将一个类的接口转换成客户希望的另外一个接口。
    适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起协同工作。
    主要是为了解决两个已有接口之间不匹配的问题，不需要考虑这些接口是怎样实现的，也不需要考虑它们各自可能会如何演化。
    适配器模式不需要对两个独立设计的类中任一个进行重新设计，就能够使它们协同工作。
        
### 2.桥接模式：
    将抽象部分与它的实现部分分离，使它们都可以独立地变化。
    解耦这些不同方向的变化，通过对象组合的方式，把两个角色之间的继承关系改为了组合的关系，从而使这两者可以应对各自独立的变化。
        
### 3.组合模式：
    将对象组合成树形结构以表示'部分-整体'的层次结构，组合模式使得用户对象单个和组合对象的使用具有一致性。
    客户端可以一致地使用组合结构和单个对象，任何用到基本对象的地方都可以使用组合对象。
        
### 4.装饰模式：
    动态、透明地给一个对象添加一些额外的职责。
    就增加功能来说，装饰模式比生成子类更加灵活。
    
### 5.外观模式：
    为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
    想让一个软件中的子系统间的通信和相互依赖关系达到最小，办法就是引入一个外观对象，它为子系统间提供了一个单一而简单的屏障。
        
### 6.享元模式：
    为运用共享技术有效地支持大量细粒度的对象。
    面向对象技术有时会因简单化的设计而代价极大。
    对象使得内存占用过多，而且如果都是大量重复的对象，那就是资源的极大浪费。
    
### 7.代理模式：
    为其他对象提供一种代理以控制这个对象的访问。
        
### 对比：
    代理模式与外观模式的主要区别：
        代理对象表示一个单一对象而外观对象代表一个子系统；
        代理的客户对象无法直接访问目标对象，由代理提供对单独的目标对象的访问控制，
        而外观的客户对象可以直接访问子系统中的各个对象，但通常由外观对象提供对子系统各元件功能的简化的共同层次的调用接口。
        
    代理模式与适配器模式：
        代理是一种原来对象的代表，其他需要与这个对象打交道的操作都是和这个代表交涉。
        而适配器则不需要虚构出一个代表者，只需要为应付特定使用目的，将原来的类进行一些组合。
    
事实上，在现实中，早已设计好的两个类，过后需要它们统一接口，整合为一的实例也比比皆是。
因此桥接模式和适配器模式是被用于软件生命周期的不同阶段，针对的是不同的问题，谈不上孰优孰劣。

外观模式和适配器模式有些近似，都是对现存系统的封装。
外观模式定义的是一个新的接口，而适配器模式则是复用一个原有的接口，
适配器是使两个已有的接口协同工作，而外观模式则是为现存系统提供一个更为方便的访问接口。
适配器模式使用来适配对象的，而外观模式是用来适配整个子系统的，外观模式所针对的对象粒度更大一些。

## 三.行为型模式

### 1. 观察者模式：
    定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
    
### 2. 模板方法模式：
    定义一个操作的算法骨架，而将一些步骤延迟到子类中，模板方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
    模板方法模式由一个抽象类组成，这个抽象类定义了需要覆盖的可能有不同实现的模板方法，每个从这个抽象类派生的具体类将为此模板实现新方法。
    
### 3. 命令模式：
    将一个请求封装为一个对象，从而使你可用不同的请求对客户端进行参数化；
    可以对请求排队或记录请求日志，以及支持可撤销的操作。
    将调用操作的对象与指导如何实现该操作的对象解耦，在不同的时刻指定、排列和执行请求。
    支持取消/重做的操作、记录整个操作的日志、支持事务。
    利用命令模式分离请求者与实现者，是最明智的选择。
    
### 4. 状态模式：
    允许一个对象在其内部状态改变时改变它的行为，让对象看起来似乎改变了它的类。
    状态模式提供了一个更好的办法来组织与特定状态相关的代码，决定状态转移的逻辑不在单块的if或switch中，
    而是分布在各个状态子类之间，由于所有与状态相关的代码都存在于某个状态子类中，
    所以通过定义新的子类就可以很容易地增加新的状态和转换。
    把分支语句进行分解并封装成多个子类，利用多态来提高其可维护、可扩展的需要。
    
### 5. 责任链模式：
    使多个对象都有机会处理请求，从而避免请求的发送者和接收者(具体处理者)之间的耦合关系。
    将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
    当有多个对象可以处理一个请求，哪个对象处理该请求事先并不知道，要在运行时刻自动确定时，
    让客户在不明确指定接收者的情况下，提交一个请求，然后由所有能处理这请求的对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。





































