import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelevisionShow {
	TelevisionShow()
	{
		JFrame f=new JFrame();
		f.setBounds(500,150,310,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setTitle("HOME/Create product/televsion");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField tA= new JTextField("power");
		JTextField tB= new JTextField("color");
		JTextField tC= new JTextField("energylabel");
		JTextField tD= new JTextField("warranty");
		JTextField tE= new JTextField("kind");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JButton next= new JButton("NEXT");
		Television tel=new Television();
		tel.setPower(t1.getText());
		tel.setColor(t2.getText());
		tel.setEnergylabel(t3.getText());
		tel.setWarranty(t4.getText());
		tel.setKind(t5.getText());
		next.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				PublicInformation a=new PublicInformation(tel);
				f.dispose();
			}
		});
		next.setBounds(100,230,70,30);
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,75,30);
		t3.setBounds(90,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,65,30);
		t5.setBounds(80,190,200,30);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(next);
	}
}
