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
	private Container cp;// �ŧi�@�ӵ����L�l(�e��)
	private ImageIcon img[] = new ImageIcon[3];// �إ�ImageIcon�}�C
	private String fName[] = { "image0", "image1", "image2" };
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

		cp = this.getContentPane();// ���o������ �L�l(�e��) �ө�m�U�ؤ���
		this.setBounds(150, 100, 600, 400);// �]�w��������l��m�M�j�p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// �]�w������X�N��������
		cp.setLayout(null);// ���ϥε����������O

		// �]�wstart���s~~
		jbtnStart.setBounds(50, 100, 80, 25);// �]�wPush���s�b��������m�M�j�p
		cp.add(jbtnStart);// �NPush���s�[�������
		jbtnStart.addActionListener(new ActionListener() {// ��Push���s�[�J�ƥ�B�z
			public void actionPerformed(ActionEvent ae) {
				t1.start();
				jlb.setText(str);// ��s���ҤW���r

			}
		});
		// �]�wstop���s
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
