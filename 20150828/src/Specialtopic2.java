import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Specialtopic2 extends JFrame {
	private JButton jbtnStop = new JButton("Stop");// Stop�����s
	private JButton jbtnStart = new JButton("Start");// Start�����s
	private JLabel jlb = new JLabel();
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();// ���Ҫ���
	private JLabel jlbC = new JLabel();
	private JLabel jlbB = new JLabel();
	
	private int j, v, a;
	private Container cp;// �ŧi�@�ӵ����L�l(�e��)
	private ImageIcon img[] = new ImageIcon[4];// �إ�ImageIcon�}�C
	private String fName[] = { "image0", "image1", "image2","image3" };
	private Timer t1;
	private String str = "���}�l";
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

		cp = this.getContentPane();// ���o������ �L�l(�e��) �ө�m�U�ؤ���
		this.setBounds(200,10,510,890);// �]�w��������l��m�M�j�p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// �]�w������X�N��������
		cp.setLayout(null);// ���ϥε����������O
		

		// �]�wstart���s~~
		jbtnStart.setBounds(0, 10, 80, 25);// �]�wstart���s�b��������m�M�j�p
		cp.add(jbtnStart);// �Nstart���s�[�������
		jbtnStart.addActionListener(new ActionListener() {// ��start���s�[�J�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {
				t1.start();
				jlb.setText(str);// ��s���ҤW���r
				jlbB.setText(" ");

			}
		});
		jlbB.setBounds(200,10,80,25);
		add(jlbB);
		// �]�wstop���s
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
					jlbB.setText("���ߤ���");

	
				}else{
					jlbB.setText("�A��F");

						
				}
			}

		});

	}
}
