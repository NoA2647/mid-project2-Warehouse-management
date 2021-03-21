import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){ 
		JFrame f=new JFrame();
		f.setBounds(500,150,350,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME");
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1=new JButton("Creat Product");
		JButton b2=new JButton("Creat New Factor");
		JButton b3=new JButton("Show Factor");
		JButton b4=new JButton("Show Statics");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CreateProduct A= new CreateProduct();
				f.dispose();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CreatNewFactor A= new CreatNewFactor();
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ShowFactor a= new ShowFactor();
				f.dispose();
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StaticsShow.StaticsShow();
			}
		});
		b1.setBounds(10,25,140,30);
		b2.setBounds(170,25,140,30);
		b3.setBounds(170,95,140,30);
		b4.setBounds(10,95,140,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
	}

}
