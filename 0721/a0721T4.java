/*���i
1.��{������������
2.�������ϧO�O����
�@
��������O�����~��Thread���O
�G
��Runnable�����Өϥΰ����
 */


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.*;
 
public class a0721T4 extends JFrame {
    public a0721T4() {
        // �t�m���s 
        JButton btn = new JButton("Click me"); 
        
        // ���U���s��ø�s��� 
        btn.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                Thread thread1 = new Thread(new Runnable() {
                    public void run() {
                        Graphics g = getGraphics(); 

                        for(int i = 10; i < 300; i+=10) { 
                            try { 
                                Thread.sleep(500); 
                                g.drawOval(i, 100, 10, 10); 
                            } 
                            catch(InterruptedException e) { 
                                e.printStackTrace(); 
                            } 
                        }
                    }
                });
                
                Thread thread2 = new Thread(new Runnable() {
                    public void run() {
                        Graphics g = getGraphics(); 

                        for(int i = 10; i < 300; i+=10) { 
                            try { 
                                Thread.sleep(500); 
                                g.drawOval(i, 150, 15, 15); 
                            } 
                            catch(InterruptedException e) { 
                                e.printStackTrace(); 
                            } 
                        }
                    }
                });
                
                thread1.start();
                thread2.start();
            } 
        }); 
        
        getContentPane().add(btn, BorderLayout.NORTH); 

        // �������U���������s�w�]�ʧ@ 
        setDefaultCloseOperation(
                   WindowConstants.EXIT_ON_CLOSE); 
        setSize(320, 200);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new a0721T4();
    }
}
