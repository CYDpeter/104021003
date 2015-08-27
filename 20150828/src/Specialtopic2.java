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
	private JLabel jlb3 = new JLabel();
	private JLabel jlb4 = new JLabel();
	private JLabel jlb5 = new JLabel();
	private JLabel jlb6 = new JLabel();
	private JLabel jlb7 = new JLabel();
	private JLabel jlb8 = new JLabel();
	private JLabel jlbC = new JLabel();
	private JLabel jlbB = new JLabel();
	private JLabel jlbTT = new JLabel();
	private JLabel jlbLOSE = new JLabel();

	private int j, v, a, w, e, r, z, x, c;
	private Container cp;// 宣告一個視窗盤子(容器)
	private ImageIcon img[] = new ImageIcon[5];// 建立ImageIcon陣列
	private String fName[] = { "image0", "image1", "image2", "image3", "image4" };
	private Timer t1;
	private String str = "按開始";
	int count = 20;

	Random rnd = new Random();

	public Specialtopic2() {
		initComp();
	}

	private void initComp() {
		t1 = new Timer(150, new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				j = rnd.nextInt(5);
				v = rnd.nextInt(5);
				a = rnd.nextInt(5);
				w = rnd.nextInt(5);
				e = rnd.nextInt(5);
				r = rnd.nextInt(5);
				z = rnd.nextInt(5);
				x = rnd.nextInt(5);
				c = rnd.nextInt(5);
				jlb.setIcon(img[j]);
				jlb1.setIcon(img[v]);
				jlb2.setIcon(img[a]);
				jlb3.setIcon(img[w]);
				jlb4.setIcon(img[e]);
				jlb5.setIcon(img[r]);
				jlb6.setIcon(img[z]);
				jlb7.setIcon(img[x]);
				jlb8.setIcon(img[c]);
			}
		});
		for (int i = 0; i < 5; i++) {
			img[i] = new ImageIcon("E:\\" + fName[i] + ".jpg");
		}
		jlb.setIcon(img[0]);
		jlb.setBounds(40, 75, 140, 192);
		jlb1.setIcon(img[1]);
		jlb1.setBounds(183, 75, 140, 192);
		jlb2.setIcon(img[2]);
		jlb2.setBounds(325, 75, 140, 192);
		jlb3.setIcon(img[3]);
		jlb3.setBounds(40, 341, 140, 192);
		jlb4.setIcon(img[0]);
		jlb4.setBounds(183, 341, 140, 192);
		jlb5.setIcon(img[1]);
		jlb5.setBounds(325, 341, 140, 192);
		jlb6.setIcon(img[2]);
		jlb6.setBounds(42, 641, 140, 192);
		jlb7.setIcon(img[3]);
		jlb7.setBounds(183, 641, 140, 192);
		jlb8.setIcon(img[0]);
		jlb8.setBounds(325, 641, 140, 192);
		add(jlb);
		add(jlb1);
		add(jlb2);
		add(jlb3);
		add(jlb4);
		add(jlb5);
		add(jlb6);
		add(jlb7);
		add(jlb8);

		jlbC.setOpaque(true);
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("E://13579.jpg");
		JLabel background = new JLabel(img);
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

		cp = this.getContentPane();// 取得視窗的 盤子(容器) 來放置各種元件
		this.setBounds(200, 10, 510, 890);// 設定視窗的初始位置和大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 設定視窗按X就結束執行
		cp.setLayout(null);// 不使用視窗布局類別
		jlbTT.setBounds(400, 10, 80, 25);
		jlbTT.setText("目前金額" + "" + count);
		jlbTT.setForeground(Color.white);
		cp.add(jlbTT);
		jlbLOSE.setBounds(300, 10, 80, 25);
		jlbLOSE.setForeground(Color.white);
		add(jlbLOSE);
		// 設定start按鈕~~
		jbtnStart.setBounds(0, 10, 80, 25);// 設定start按鈕在視窗的位置和大小
		cp.add(jbtnStart);// 將start按鈕加到視窗中
		jbtnStart.addActionListener(new ActionListener() {// 為start按鈕加入事件處理
			public void actionPerformed(ActionEvent ae) {
				if (count >= 2) {
					t1.start();
					jlb.setText(str);// 更新標籤上的字
					jlbB.setText(" ");
					count -= 2;
					jlbTT.setText("目前金額" + "" + count);
				} else {
					jbtnStart.setEnabled(false);

					jlbLOSE.setText("遊戲結束");
				}
			}

		});
		jlbB.setBounds(200, 10, 80, 25);
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
				System.out.println("w=" + w);
				System.out.println("e=" + e);
				System.out.println("r=" + r);
				System.out.println("z=" + z);
				System.out.println("x=" + x);
				System.out.println("c=" + c);
				jlb.setText(str);
				jlbB.setForeground(Color.white);

				if (j == v && v == a || j == w && j == z || j == e && e == c || v == e && e == x || a == e && e == z
						|| a == r && r == c || w == e && e == r || z == x && x == c) {
					jlbB.setText("恭喜中獎>w<");
					if (j == 0 && v == 0 && a == 0 || j == 0 && w == 0 && z == 0 || j == 0 && e == 0 && c == 0
							|| w == 0 && e == 0 && r == 0 || z == 0 && x == 0 && c == 0 || v == 0 && e == 0 && x == 0
							|| a == 0 && e == 0 && z == 0 || a == 0 && r == 0 && c == 0) {
						count += 10;
					}
					if (j == 1 && v == 1 && a == 1 || j == 1 && w == 1 && z == 1 || j == 1 && e == 1 && c == 1
							|| w == 1 && e == 1 && r == 1 || z == 1 && x == 1 && c == 1 || v == 1 && e == 1 && x == 1
							|| a == 1 && e == 1 && z == 1 || a == 1 && r == 1 && c == 1) {
						count += 3;
					}
					if (j == 2 && v == 2 && a == 2 || j == 2 && w == 2 && z == 2 || j == 2 && e == 2 && c == 2
							|| w == 2 && e == 2 && r == 2 || z == 2 && x == 2 && c == 2 || v == 2 && e == 2 && x == 2
							|| a == 2 && e == 2 && z == 2 || a == 2 && r == 2 && c == 2) {
						count += 3;
					}
					if (j == 3 && v == 3 && a == 3 || j == 3 && w == 3 && z == 3 || j == 3 && e == 3 && c == 3
							|| w == 3 && e == 3 && r == 3 || z == 3 && x == 3 && c == 3 || v == 3 && e == 3 && x == 3
							|| a == 3 && e == 3 && z == 3 || a == 3 && r == 3 && c == 3) {
						count += 3;
					}
					if (j == 4 && v == 4 && a == 4 || j == 4 && w == 4 && z == 4 || j == 4 && e == 4 && c == 4
							|| w == 4 && e == 4 && r == 4 || z == 4 && x == 4 && c == 4 || v == 4 && e == 4 && x == 4
							|| a == 4 && e == 4 && z == 4 || a == 4 && r == 4 && c == 4) {
						if (count < 10) {
							count = 0;
						} else {
							count -= 10;
						}
					}
					jlbTT.setText("目前金額" + "" + count);
				} else {
					jlbB.setText("哈哈,遜!");
				}
			}

		});

	}
}
