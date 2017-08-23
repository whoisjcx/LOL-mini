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
        JCheckBox jcb = (JCheckBox) e.getItem();// ���õ����¼�ǿ��ת��ΪJCheckBox��  
        if (jcb.isSelected()) {// �ж��Ƿ�ѡ��  
            jcb.setIcon(getImageIcon(right, 100, 100));// �޸�ͼƬ  
        } else {  
            jcb.setIcon(getImageIcon(wrong, 100, 100));// �޸�ͼƬ  
        }  
    }  
}  
  
class MyCheckBox1 {
	public static  ImageIcon getImageIcon(String path, int width, int height) {
		  ImageIcon icon = new ImageIcon(path);
		  icon.setImage(icon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
		  return icon;
	}
    private String wrong = "ok.jpg";// ����ͼƬ·��  
    private JFrame frame = new JFrame("ѡ�����Ӣ��");// ���崰��  
    private Container container = frame.getContentPane();// �õ���������  
    private JCheckBox jcb1 = new JCheckBox("����", getImageIcon(wrong, 100, 100) );  
    private JCheckBox jcb2 = new JCheckBox("����", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb3 = new JCheckBox("�ƿ�", getImageIcon(wrong, 100, 100));
    private JCheckBox jcb4 = new JCheckBox("����", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb5 = new JCheckBox("����", getImageIcon(wrong, 100, 100));  
    private JCheckBox jcb6 = new JCheckBox("ҽ��", getImageIcon(wrong, 100, 100));  
    private JPanel panel = new JPanel();// ����һ�����  
    private JButton jb= new JButton("ѡ�����");  
    public MyCheckBox1(){
        panel.setBorder(BorderFactory.createTitledBorder("��ѡ�����Ӣ��"));// ����һ���߿����ʾ��  
        panel.setLayout(new GridLayout(1, 3));// �����Ű� 1��3��  
        panel.add(this.jcb1);// �������  
        panel.add(this.jcb2);// �������  
        panel.add(this.jcb3);// �������  
        panel.add(this.jcb4);// �������  
        panel.add(this.jcb5);// �������  
        panel.add(this.jcb6);// ������� 
        panel.add(this.jb);// �������
        jcb1.addItemListener(new MyItemListener("Garen.jpg"));// �������  
        jcb2.addItemListener(new MyItemListener("Kongming.jpg"));// �������  
        jcb3.addItemListener(new MyItemListener("hulk.jpg"));// ������� 
        jcb4.addItemListener(new MyItemListener("Afu.jpg"));// �������  
        jcb5.addItemListener(new MyItemListener("Reporter.jpg"));// �������  
        jcb6.addItemListener(new MyItemListener("DocYang.jpg"));// ������� 
        container.add(panel);// �������  
        this.frame.setSize(1000, 300);// ���崰���С  
        this.frame.setVisible(true);// ��ʾ���� 
        this.frame.setResizable(false);
        this.frame.addWindowListener(new WindowAdapter() {// �����¼�����  
            public void windowClosing(WindowEvent arg0)// ��д���ڹرշ���  
            {  
            	System.exit(1);// ϵͳ�˳�  
            }  
        });  
    }  
}  
  
public class JCheckBoxDemo02 {  
    public static void main(String[] args) {  
        new MyCheckBox1();  
    }  
}  