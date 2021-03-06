/*報告
1.實現執行緒有哪兩種
2.之間的區別是什麼
一
執行緒類別直接繼承Thread類別
二
用Runnable介面來使用執行緒
 */


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.*;
 
public class a0721T4 extends JFrame {
    public a0721T4() {
        // 配置按鈕 
        JButton btn = new JButton("Click me"); 
        
        // 按下按鈕後繪製圓圈 
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

        // 取消按下視窗關閉鈕預設動作 
        setDefaultCloseOperation(
                   WindowConstants.EXIT_ON_CLOSE); 
        setSize(320, 200);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new a0721T4();
    }
}
