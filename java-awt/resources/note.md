# AWT

## 创建窗口

java.awt.Frame类，自己去看这个类就行了。

**注意**

1. setBounds() 等效于 setLocation() + setSize();

## 创建面板
java.awt.Pannel类

面板是内嵌在窗口的一个东西，所以是Frame对象.add(Pannel对象)

面板的坐标是相对于Frame对象的坐标

frame.addWindowListener();

添加窗口监听事件：

frame.addWindowListener();

调用System.exit(0);

## 按钮

java.awt.Button类

要添加多个按钮，先设置好Frame对象的布局（有三种布局）

frame.setLayout();

里面需要传入一个layout：流式布局：FlowLayout；东西南北中布局：BorderLayout；表格布局：GridLayout

用上面这几个类，然后你在一个软件的界面里面看到的是多种布局的嵌套使用。

然后再add

## 事件监听

button.addActionListener

## 文本框监听

文本框：java.awt.TextField

文本框监听：textField.addActionListener()

addActionListener()里面传入的对象实现的方法是：e.getSource()，然后强转型，操作textField对象

### 练习：简易计算器，并且分别使用组合类和内部类进行代码优化

有个Label类，也可以add到frame里面去


## 画笔

java.awt.Frame.paint()方法，这个方法需要传入一个Graphics对象，是用这个对象来实现各种切换颜色什么的。

## 鼠标监听

适配器模式：因为你想用一个接口就得重写他里面的所有方法，这时候会有一个这个接口的适配器类（就是个类，只不过我们叫他适配器），一般是接口名称后面加上一个Apapter就是了，这个类实现了接口里面的所有方法，但是实现的是空方法，但是你继承这个类的时候就不用重写全部方法了，你可以只重写你需要的方法就行了。

鼠标监听事件：因为鼠标（比如单击, 英文叫press）的对象是窗口（如果是针对画图工具的话），那么就是 e.getResource()返回的是Frame对象，可以得到你点击的x，y坐标

用Point类把x，y坐标转化为点

那么怎么存点呢？存东西有集合类和Map类，map感觉更像键值对，就是你要用的话你得知道键，但你都存起来了，怎么知道呢？那就是集合，但我们的点有x，和y两个属性啊，一个一个存在集合不会乱吗？不会，还记得泛型吗？/偷笑，对，集合里面存Point对象不就好了！！！

然后去用frame.paint方法，把这个点画出来。

然后不能只画一次，要每次都刷新，再调用frame.repaint()方法

问题：paint方法怎么没调用就能画东西，好好去看看paint方法的文档。

## 窗口监听事件

去看WindowApadter的源码，有几个方法

## 键盘监听事件

用Frame里面的addKeyListener方法，可以自己写类继承Frame去用这个方法，也可以直接对frame对象使用。

传入KeyAdapter对象，有一个方法，keyPressed，需要传入一个KeyEvent 对象，但是似乎不要我们传入，去看看源码是怎么回事？


# Swing

## 窗口、面板

JFrame 类

窗口关闭事件被封装了：setDefaultCloseOperation(WindowConstants.里面有些参数)

### Container

**与 awt 不同的地方：frame 设置颜色设置的是 Container 的颜色，所以通过 JFrame.getContentPane() 得到容器，用 Container 对象接收**

然后给 container 设置颜色就好了。

然后，要在 JFrame 里面放东西，都是放在 Container 里面，如 button, label 等等 

### 绝对定位

绝对定位：给定坐标之后是定死的，你给窗口缩放，如 button 的大小是不会发生变化的（Frame的时候是会跟着一起缩放的）

## Dialog 对话窗口（弹窗）

明确一点的是：对话窗口也是一个 Frame 或者说 JFrame

但是弹窗用的是 JDialog 类了，不是 JFrame，可以去源码看看 JDialog 类是个什么情况，其实他里面用的东西都是 JFrame 的东西。

**注意**

1. JDialog 里面自动封装了 setDefaultCloseOperation(WindowConstants.里面有些参数) 方法，你就不用给它加了。

## JLabel

JLabel 对应 awt 里面的 Label 类

给 label 居中，用 Label 的 setHorizontalAlignment() 方法

里面传入的是一个 int 类型，可以用 SwingConstants.各种方式

JLabel label = new JLabel("");

## Icon 图标

Icon 可以放在 Label 上，也可以放在 JButton 上

还有 ImageIcon，把图片作为图标

然后要把 icon 放在标签上，可以用 Label 的构造，也可以用Label.setIcon方法。

**注意**
通过类可以获得这个类同级目录下的东西：
`Class.class.getResource("文件名")`


## JPanela 面板

用 JPanel 类

有个可以传 Layout 的构造，这里我们可以传入一个GridLayout。

pannel 的 add 方法

然后一个 pannel 对象可以 add 多少个东西是有 GridLayout 设定的布局数决定的。

**注意**

1. JFrame 返回的 Container 可以通过 GridLayout 传入一个水平间距和垂直间距的参数

### JScrollPanel 滚动条

它的一个构造就是把一个组件放进去，就可以对其实现滚动条功能，如把 JTextArea 对象放进去，当输入的内容超出了文本框的大小，就会出现滚动条。

## 按钮

### 普通按钮

JButton， 他有一些方法可以去看看。

JButton.setToolTipButton()就是你鼠标悬浮在按钮上会出现的文字提示。

### 单选按钮

JRadioButton()，在构造内可以给按钮的文本

可以 new 多个对象，然后对多个对象进行分组之后，然后同一组里面的按钮，只能选中一个按钮。

那么就有一个组对象，ButtonGroup，使用 add 方法把组员加进来

**注意**
 
1. 最后使用 container add组件的时候不用把 ButtonGroup 对象add，add JRadioButton 对象就行了

### 复选按钮

JCheckBox

直接new 出多个JCheckBox对象，把这些按钮add到container里面去，就是一组复选按钮了，不用分组。

## 列表

### 下拉框

JComboBox 

用里面的 addItem 方法来加选项

### 列表框

JList

可以在构造的时候传入一个 String[]

直接就得到了这个 String[] 表示的列表

## 文本框

### 文本框

JTextField

### 密码框

JPasswordField

### 文本域

JTextArea

# 小结

以上这些内容对你理解后面的东西是有帮助的，以后这块的内容会搬到前端