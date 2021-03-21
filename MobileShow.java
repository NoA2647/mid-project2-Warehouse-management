import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MobileShow {
	public MobileShow()
	{
		JFrame f=new JFrame();
		f.setBounds(500,150,335,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/mobile");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField tA= new JTextField("color");
		JTextField tB= new JTextField("warranty");
		JTextField tC= new JTextField("memory");
		JTextField tD= new JTextField("operating system");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JButton next= new JButton("NEXT");
		Mobile mobile= new Mobile();
		mobile.setColor(t1.getText());
		mobile.setWarranty(t2.getText());
		mobile.setMemory(t3.getText());
		mobile.setOperationSystem(t4.getText());
		next.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				PublicInformation a=new PublicInformation(mobile);
				f.dispose();
			}
		});
		next.setBounds(100,200,70,30);
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,100,30);
		t4.setBounds(115,145,200,30);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(next);
	}
}
