import java.awt.*;

public class WindowsDemo {
    public void windows()
        {
        Frame frame=new Frame("计算器");
        //1.创建一个Pannel对象，里面存放一个TextFiled组件
        //30表示最多能容纳30个字符
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        //2.把当前这个Panel添加到frame的北边区域
        frame.add(p1,BorderLayout.NORTH);
        //3，创建一个Pannel对象，并设置它的布局管理器为GridLayout
        //Pannel 默认的布局管理器是FlowLayout
        //GridLayout(int rows,int cols,int hgap,int vgap)
        Panel p2=new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        //4.往Pannel中添加内容
        for (int i = 0; i < 10; i++) {
            //Button(字符串) i+""即变为字符串类型
            p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        //5.将Pannel添加到frame中
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);
    }
}