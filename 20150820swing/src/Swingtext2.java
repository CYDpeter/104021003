import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	public class Swingtext2 extends JFrame{
	private JButton jbtnExit = new JButton("Exit");//Exit的按鈕
	private JButton jbtnPush = new JButton("Push");//Push的按鈕
	private JLabel jlb1 = new JLabel();//標籤物件
	private Container cp;//宣告一個視窗盤子(容器)
	private String str = "按Push按鈕的次數:";
	private int count = 0;
	
	public Swingtext2(){//視窗類別的建構元
	initComp();//呼叫initComp函式以繪製視窗的樣式
	}
	public void initComp(){
		cp = this.getContentPane();//取得視窗的 盤子(容器) 來放置各種元件
		this.setBounds(150,100,600,400);//設定視窗的初始位置和大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//設定視窗按X就結束執行
		cp.setLayout(null);//不使用視窗布局類別
		
		//設定標籤囉~~
		jlb1.setBounds(50,70,250,25);//設定標籤物件在視窗上的位置和大小
		jlb1.setText(str + count);//設定標籤上顯示的字
		cp.add(jlb1);//將標籤物件加到視窗容器中
		
		//設定Push按鈕~~
		jbtnPush.setBounds(50,100,80,25);//設定Push按鈕在視窗的位置和大小
		cp.add(jbtnPush);//將Push按鈕加到視窗中
		jbtnPush.addActionListener(new ActionListener(){//為Push按鈕加入事件處理
		public void actionPerformed(ActionEvent ae){
			count++;
			jlb1.setText(str + count);//更新標籤上的字
		}
		});
		
		//設定Exit按鈕~~
		jbtnExit.setBounds(50,150,80,25);//設定Exit按鈕在視窗的位置和大小
		cp.add(jbtnExit);//將Exit按鈕加到視窗中
		jbtnExit.addActionListener(new ActionListener(){//為Exit按鈕加入事件處理
		public void actionPerformed(ActionEvent ae){
			System.exit(0);
		}
		});
	}
}
