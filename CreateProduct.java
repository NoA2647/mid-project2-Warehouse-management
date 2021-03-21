import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class CreateProduct {
	public CreateProduct() {
		JFrame f=new JFrame();
		f.setBounds(500,150,300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product");
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		String ItemA[]= {"shirt","pants"};
		JComboBox A= new JComboBox(ItemA);
		String ItemB[]= {"television","mobile","laptop"};
		JComboBox B= new JComboBox(ItemB);
		String ItemC[]= {"book"};
		JComboBox C= new JComboBox(ItemC);
		A.setBounds(10,50,75,30);
		B.setBounds(100,50,80,30);
		C.setBounds(190,50,75,30);
		JButton b1=new JButton("cloths");
		JButton b2=new JButton("electronic");
		JButton b3=new JButton("book");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(A.getSelectedIndex()==0) {
					ShirtShow a=new ShirtShow();
					f.dispose();
				}
				if(A.getSelectedIndex()==1) {
					Pants_show a=new Pants_show();
					f.dispose();
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(B.getSelectedIndex()==0) {
					TelevisionShow a=new TelevisionShow();
					f.dispose();
				}
				if(B.getSelectedIndex()==1) {
					MobileShow a=new MobileShow();
					f.dispose();
				}
				if(B.getSelectedIndex()==2) {
					LaptopShow a=new LaptopShow();
					f.dispose();
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Book_show a=new Book_show();
				f.dispose();
			}
		});
		b1.setBounds(10,175,75,30);
		b2.setBounds(90,175,95,30);
		b3.setBounds(190,175,75,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(A);
		f.add(B);
		f.add(C);
	}
}
