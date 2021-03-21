import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LaptopShow {
	public LaptopShow() {
		JFrame f=new JFrame();
		f.setBounds(500,150,335,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/laptop");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField tA= new JTextField("color");
		JTextField tB= new JTextField("warranty");
		JTextField tC= new JTextField("memory");
		JTextField tD= new JTextField("operating system");
		JTextField tE= new JTextField("core");
		JTextField tF= new JTextField("graphic");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JButton next= new JButton("NEXT");
                Laptop laptop= new Laptop();
		laptop.setColor(t1.getText());
		laptop.setWarranty(t2.getText());
		laptop.setMemory(t3.getText());
		laptop.setOperationsystem(t4.getText());
        laptop.setCore(t5.getText());
        laptop.setGraphic(t6.getText());
		next.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				PublicInformation a=new PublicInformation(laptop);
				f.dispose();
			}
		});
		next.setBounds(110,300,80,40);
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,100,30);
		t4.setBounds(115,145,200,30);
		tE.setBounds(5,190,65,30);
		t5.setBounds(80,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(next);
	}
}
