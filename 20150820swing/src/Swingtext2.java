import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	public class Swingtext2 extends JFrame{
	private JButton jbtnExit = new JButton("Exit");//Exit�����s
	private JButton jbtnPush = new JButton("Push");//Push�����s
	private JLabel jlb1 = new JLabel();//���Ҫ���
	private Container cp;//�ŧi�@�ӵ����L�l(�e��)
	private String str = "��Push���s������:";
	private int count = 0;
	
	public Swingtext2(){//�������O���غc��
	initComp();//�I�sinitComp�禡�Hø�s�������˦�
	}
	public void initComp(){
		cp = this.getContentPane();//���o������ �L�l(�e��) �ө�m�U�ؤ���
		this.setBounds(150,100,600,400);//�]�w��������l��m�M�j�p
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//�]�w������X�N��������
		cp.setLayout(null);//���ϥε����������O
		
		//�]�w�����o~~
		jlb1.setBounds(50,70,250,25);//�]�w���Ҫ���b�����W����m�M�j�p
		jlb1.setText(str + count);//�]�w���ҤW��ܪ��r
		cp.add(jlb1);//�N���Ҫ���[������e����
		
		//�]�wPush���s~~
		jbtnPush.setBounds(50,100,80,25);//�]�wPush���s�b��������m�M�j�p
		cp.add(jbtnPush);//�NPush���s�[�������
		jbtnPush.addActionListener(new ActionListener(){//��Push���s�[�J�ƥ�B�z
		public void actionPerformed(ActionEvent ae){
			count++;
			jlb1.setText(str + count);//��s���ҤW���r
		}
		});
		
		//�]�wExit���s~~
		jbtnExit.setBounds(50,150,80,25);//�]�wExit���s�b��������m�M�j�p
		cp.add(jbtnExit);//�NExit���s�[�������
		jbtnExit.addActionListener(new ActionListener(){//��Exit���s�[�J�ƥ�B�z
		public void actionPerformed(ActionEvent ae){
			System.exit(0);
		}
		});
	}
}
