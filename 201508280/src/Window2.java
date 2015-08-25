import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window2 extends JFrame {
 private Container cp;
  private JLabel jlbN=new JLabel("�_(North)");
  private JLabel jlbS=new JLabel("�n(South)");
  private JLabel jlbC=new JLabel("�ϥ�");
  private JLabel jlbE=new JLabel("���Q���s");
  private JLabel jlbW=new JLabel("��(West)");
  public Window2(){
	  initComp();
  }
private void initComp(){
	this.setBounds(200,200,250,320);
	cp=this.getContentPane();
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	cp.setLayout(new BorderLayout());
	jlbN.setOpaque(true);
	jlbN.setBackground(Color.pink);
	jlbN.setHorizontalAlignment(JLabel.CENTER);
	
	jlbS.setOpaque(true);
	jlbS.setBackground(Color.red);
	jlbS.setHorizontalAlignment(JLabel.CENTER);
	
	jlbC.setOpaque(true);
	jlbC.setBackground(Color.green);
	jlbC.setHorizontalAlignment(JLabel.CENTER);
	
	jlbE.setOpaque(true);
	jlbE.setBackground(Color.yellow);
	jlbE.setHorizontalAlignment(JLabel.CENTER);
	
	jlbW.setOpaque(true);
	jlbW.setBackground(Color.magenta);
	jlbW.setHorizontalAlignment(JLabel.CENTER);
	
	cp.add(jlbN, BorderLayout.NORTH);
	cp.add(jlbS, BorderLayout.SOUTH);
	cp.add(jlbC, BorderLayout.CENTER);
	cp.add(jlbE, BorderLayout.EAST);
	cp.add(jlbW, BorderLayout.WEST);
}
  
}