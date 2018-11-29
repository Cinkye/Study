package banking.UI;

import java.awt.*;
 
import javax.swing.ImageIcon;
import javax.swing.JPanel;  
  
/** 
 * �б���ͼƬ��Panel�� 
 */  
public class BackgroundPanel extends JPanel {  
      
    /** 
     *  
     */  
    private static final long serialVersionUID = -6352788025440244338L;  
      
    private Image image = (Image) new ImageIcon("./Image/background.jpg").getImage();  
  
    // �̶�����ͼƬ���������JPanel������ͼƬ�������������  
    protected void paintComponent(Graphics g) {  
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);  
    }  
}