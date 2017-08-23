import java.awt.Container;  
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
import java.io.File;  
  
import javax.swing.BorderFactory;  
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
class MyItemListener implements ItemListener {  
    String right = "f:" + File.separator + "2.png";  
    String wrong = "ok.jpg";  
    MyItemListener(String s){
    	right=s;
    }
    public static  ImageIcon getImageIcon(String path, int width, int height) {
		  ImageIcon icon = new ImageIcon(path);
		  icon.setImage(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
		  return icon;
	}
    public void itemStateChanged(ItemEvent e) {  
        JCheckBox jcb = (JCheckBox) e.getItem();// 将得到的事件强制转化为JCheckBox类  
        if (jcb.isSelected()) {// 判断是否被选择  
            jcb.setIcon(getImageIcon(right, 100, 100));// 修改图片  
        } else {  
            jcb.setIcon(getImageIcon(wrong, 100, 100));// 修改图片  
        }  
    }  
}  
  
class MyCheckBox1 {
	public static  ImageIcon getImageIcon(String path, int width, int height) {
		  ImageIcon icon = new ImageIcon(path);
		  icon.setImage(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
		  return icon;
	}
    private String wrong = "ok.jpg";// 定义图片路径  
    private JFrame frame = new JFrame("选择你的英雄");// 定义窗体  
    private Container container = frame.getContentPane();// 得到窗体容器  
    private JCheckBox jcb1 = new JCheckBox("盖伦", getImageIcon(wrong, 100, 100) );  
    private JCheckBox jcb2 = new JCheckBox("孔明", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb3 = new JCheckBox("浩克", getImageIcon(wrong, 100, 100));
    private JCheckBox jcb4 = new JCheckBox("阿福", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb5 = new JCheckBox("记者", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb6 = new JCheckBox("医生", getImageIcon(wrong, 100, 100));  
    private JPanel panel = new JPanel();// 定义一个面板  
    private JButton jb= new JButton("选择完毕");  
    public MyCheckBox1(){
        panel.setBorder(BorderFactory.createTitledBorder("请选择你的英雄"));// 定义一个边框的显示条  
        panel.setLayout(new GridLayout(1, 3));// 定义排版 1行3列  
        panel.add(this.jcb1);// 加入组件  
        panel.add(this.jcb2);// 加入组件  
        panel.add(this.jcb3);// 加入组件  
        panel.add(this.jcb4);// 加入组件  
        panel.add(this.jcb5);// 加入组件  
        panel.add(this.jcb6);// 加入组件 
        panel.add(this.jb);// 加入组件
        jcb1.addItemListener(new MyItemListener("Garen.jpg"));// 加入监听  
        jcb2.addItemListener(new MyItemListener("Kongming.jpg"));// 加入监听  
        jcb3.addItemListener(new MyItemListener("hulk.jpg"));// 加入监听 
        jcb4.addItemListener(new MyItemListener("Afu.jpg"));// 加入监听  
        jcb5.addItemListener(new MyItemListener("Reporter.jpg"));// 加入监听  
        jcb6.addItemListener(new MyItemListener("DocYang.jpg"));// 加入监听 
        container.add(panel);// 加入面板  
        this.frame.setSize(1000, 300);// 定义窗体大小  
        this.frame.setVisible(true);// 显示窗体 
        this.frame.setResizable(false);
        this.frame.addWindowListener(new WindowAdapter() {// 加入事件监听  
            public void windowClosing(WindowEvent arg0)// 复写窗口关闭方法  
            {  
            	System.exit(1);// 系统退出  
            }  
        });  
    }  
}  
  
public class JCheckBoxDemo02 {  
    public static void main(String[] args) {  
        new MyCheckBox1();  
    }  
}  