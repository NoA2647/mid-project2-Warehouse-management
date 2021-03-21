import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PublicInformation {
	public PublicInformation(Book book) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/book");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
					book.setId(t1.getText());
					book.setName(t2.getText());
					book.setForosh(t3.getText());
					book.setKharid(t4.getText());
					book.setWrighter(t5.getText());
					book.setType(t6.getText());
					book.setNote(t7.getText());
					Book_Setting.addProduct(book);
					JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	public PublicInformation(Pants pant) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/pant");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
					pant.setId(t1.getText());
					pant.setName(t2.getText());
					pant.setForosh(t3.getText());
					pant.setKharid(t4.getText());
					pant.setBrand(t5.getText());
					pant.setType(t6.getText());
					pant.setNote(t7.getText());
					PantsSetting.addProduct(pant);
					JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	public PublicInformation(Shirt shirt) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/shirt");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
					shirt.setId(t1.getText());
					shirt.setName(t2.getText());
					shirt.setForosh(t3.getText());
					shirt.setKharid(t4.getText());
					shirt.setBrand(t5.getText());
					shirt.setType(t6.getText());
					shirt.setNote(t7.getText());
					ShirtSetting.addProduct(shirt);
					JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	public PublicInformation(Television tel) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/television");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
					tel.setId(t1.getText());
					tel.setName(t2.getText());
					tel.setForosh(t3.getText());
					tel.setKharid(t4.getText());
					tel.setBrand(t5.getText());
					tel.setType(t6.getText());
					tel.setNote(t7.getText());
					televisionSetting.addProduct(tel);
					JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	public PublicInformation(Mobile mobile) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/mobile");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				mobile.setId(t1.getText());
				mobile.setName(t2.getText());
				mobile.setForosh(t3.getText());
				mobile.setKharid(t4.getText());
				mobile.setBrand(t5.getText());
				mobile.setType(t6.getText());
				mobile.setNote(t7.getText());
				MobileSetting.addProduct(mobile);
				JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	public PublicInformation(Laptop laptop) {
		JFrame f=new JFrame();
		f.setBounds(500,150,330,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/laptop");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton b1= new JButton("SAVE");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Name");
		JTextField tC= new JTextField("Kharid");
		JTextField tD= new JTextField("Forosh");
		JTextField tE= new JTextField("Brand/Wrighter");
		JTextField tF= new JTextField("Type");
		JTextField tG= new JTextField("Note");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		JTextField t5= new JTextField();
		JTextField t6= new JTextField();
		JTextArea t7= new JTextArea();
		b1.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				laptop.setId(t1.getText());
				laptop.setName(t2.getText());
				laptop.setForosh(t3.getText());
				laptop.setKharid(t4.getText());
				laptop.setBrand(t5.getText());
				laptop.setType(t6.getText());
				laptop.setNote(t7.getText());
				LaptopSetting.addProduct(laptop);
				JOptionPane.showMessageDialog(null,"save successful", "save file",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main a=new Main();
				a.main(null);
				f.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tD.setEditable(false);
		tE.setEditable(false);
		tF.setEditable(false);
		tG.setEditable(false);
		tA.setBounds(5,10,65,30);
		t1.setBounds(80,10,200,30);
		tB.setBounds(5,55,65,30);
		t2.setBounds(80,55,200,30);
		tC.setBounds(5,100,65,30);
		t3.setBounds(80,100,200,30);
		tD.setBounds(5,145,65,30);
		t4.setBounds(80,145,200,30);
		tE.setBounds(5,190,87,30);
		t5.setBounds(102,190,200,30);
		tF.setBounds(5,235,65,30);
		t6.setBounds(80,235,200,30);
		tG.setBounds(5,280,65,30);
		t7.setBounds(80,280,200,65);
		b1.setBounds(190,355,70,30);
		b2.setBounds(100,355,70,30);
		b3.setBounds(15,355,70,30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(tE);
		f.add(tF);
		f.add(tG);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
	}
	
}