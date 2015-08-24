import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Specialtopic2 extends JFrame {
	private JButton jbtnStop = new JButton("Stop");// Stop的按鈕
	private JButton jbtnStart = new JButton("Start");// Start的按鈕
	private JLabel jlb = new JLabel();
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();// 標籤物件
	private Container cp;// 宣告一個視窗盤子(容器)
	private ImageIcon img[] = new ImageIcon[3];// 建立ImageIcon陣列
	private String fName[] = { "image0", "image1", "image2" };
	private Timer t1;
	private String str = "按開始";
	int count = 0;

	Random rnd = new Random();

	public Specialtopic2() {
		initComp();
	}

	private void initComp() {
		t1 = new Timer(150, new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			int j = rnd.nextInt(3);
			int v = rnd.nextInt(3);
			int a = rnd.nextInt(3);
			jlb.setIcon(img[j]);
			jlb1.setIcon(img[v]);
			jlb2.setIcon(img[a]);
			}
		});
		for (int i = 0; i < 3; i++) {
			img[i] = new ImageIcon("c:\\" + fName[i] + ".jpg");
		}
		jlb.setIcon(img[0]);		
		jlb.setBounds(150, 180, 32, 32);
		jlb1.setIcon(img[1]);
		jlb1.setBounds(250,180,32,32);
		jlb2.setIcon(img[2]);
		jlb2.setBounds(350,180,32,32);
		add(jlb);
		add(jlb1);
		add(jlb2);

		cp = this.getContentPane();// 取得視窗的 盤子(容器) 來放置各種元件
		this.setBounds(150, 100, 600, 400);// 設定視窗的初始位置和大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 設定視窗按X就結束執行
		cp.setLayout(null);// 不使用視窗布局類別

		// 設定start按鈕~~
		jbtnStart.setBounds(50, 100, 80, 25);// 設定Push按鈕在視窗的位置和大小
		cp.add(jbtnStart);// 將Push按鈕加到視窗中
		jbtnStart.addActionListener(new ActionListener() {// 為Push按鈕加入事件處理
			public void actionPerformed(ActionEvent ae) {
				t1.start();
				jlb.setText(str);// 更新標籤上的字

			}
		});
		// 設定stop按鈕
		jbtnStop.setBounds(50, 150, 80, 25);
		cp.add(jbtnStop);
		jbtnStop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				t1.stop();
				jlb.setText(str);
			}
		});
	}
}
