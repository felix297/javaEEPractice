# 创建窗口

java.awt.Frame类，自己去看这个类就行了。

# 创建面板
java.awt.Pannel类

面板是内嵌在窗口的一个东西，所以是Frame对象.add(Pannel对象)

面板的坐标是相对于Frame对象的坐标

添加窗口监听时间：调用System.exit(0);

# 按钮标签

java.awt.Button类

要添加多个按钮，先设置好Frame对象的布局（有三种布局）

frame.setLayout();

里面需要传入一个layout：流式布局：FlowLayout；东西南北中布局：BorderLayout；表格布局：GridLayout

用上面这几个类，然后你在一个软件的界面里面看到的是多种布局的嵌套使用。

然后再add
