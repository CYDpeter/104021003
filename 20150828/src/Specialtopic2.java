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
	private JLabel jlbC = new JLabel();
	private JLabel jlbB = new JLabel();
	
	private int j, v, a;
	private Container cp;// 宣告一個視窗盤子(容器)
	private ImageIcon img[] = new ImageIcon[4];// 建立ImageIcon陣列
	private String fName[] = { "image0", "image1", "image2","image3" };
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
				j = rnd.nextInt(4);
				v = rnd.nextInt(4);
				a = rnd.nextInt(4);
				jlb.setIcon(img[j]);
				jlb1.setIcon(img[v]);
				jlb2.setIcon(img[a]);
			}
		});
		for (int i = 0; i < 4; i++) {
			img[i] = new ImageIcon("E:\\" + fName[i] + ".jpg");
		}
		jlb.setIcon(img[0]);
		jlb.setBounds(40,75,140, 192);
		jlb1.setIcon(img[1]);
		jlb1.setBounds(183,75,140,192);
		jlb2.setIcon(img[2]);
		jlb2.setBounds(325,75,140,192);

		add(jlb);
		add(jlb1);
		add(jlb2);

		jlbC.setOpaque(true);
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("E://13579.jpg");
		JLabel background = new JLabel(img);
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

		cp = this.getContentPane();// 取得視窗的 盤子(容器) 來放置各種元件
		this.setBounds(200,10,510,890);// 設定視窗的初始位置和大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 設定視窗按X就結束執行
		cp.setLayout(null);// 不使用視窗布局類別
		

		// 設定start按鈕~~
		jbtnStart.setBounds(0, 10, 80, 25);// 設定start按鈕在視窗的位置和大小
		cp.add(jbtnStart);// 將start按鈕加到視窗中
		jbtnStart.addActionListener(new ActionListener() {// 為start按鈕加入事件處理
			public void actionPerformed(ActionEvent ae) {
				t1.start();
				jlb.setText(str);// 更新標籤上的字
				jlbB.setText(" ");

			}
		});
		jlbB.setBounds(200,10,80,25);
		add(jlbB);
		// 設定stop按鈕
		jbtnStop.setBounds(100, 10, 80, 25);
		cp.add(jbtnStop, BorderLayout.SOUTH);
		jbtnStop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				t1.stop();
				System.out.println("j=" + j);
				System.out.println("v=" + v);
				System.out.println("a=" + a);
				jlb.setText(str);
				if(j==v&&v==a){
					jlbB.setText("恭喜中獎");

	
				}else{
					jlbB.setText("你輸了");

						
				}
			}

		});

	}
}
