package memorytest;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
	 
class LabelMemory extends JFrame{
	JLabel num10[]=new JLabel[10];
	int index_k;
		
	public LabelMemory() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Container c=getContentPane();
		c.setLayout(null);
			
		for(int i=0;i<10;i++) {
			num10[i]=new JLabel(Integer.toString(i));
			num10[i].setForeground(Color.magenta);
			num10[i].setSize(20,20);
			num10[i].addMouseListener(new MouseAdapter() {
					
			public void mouseClicked(MouseEvent e) {
				JLabel temp=(JLabel)e.getSource();
				int num=Integer.parseInt(temp.getText());
				if(num==index_k) {
					temp.setVisible(false);
					index_k++;
				}
				if(index_k==10) {
							setting();
				}
			}
		});
				c.add(num10[i]);
			}
			setting();
			setSize(350,350);
			setVisible(true);
		}
		
		public void setting() {
			index_k=0;
			for(int i=0;i<10;i++) {
				int x=(int)(Math.random()*300);
				int y=(int)(Math.random()*300);
				
				num10[i].setLocation(x,y);
				num10[i].setVisible(true);
			}
		}
	}
	 
	public class MemoryTest {
		public static void main(String[] args) {
			new LabelMemory();
		}
	}