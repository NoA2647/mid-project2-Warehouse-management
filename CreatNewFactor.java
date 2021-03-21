import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreatNewFactor {
	public CreatNewFactor() {
		JFrame f=new JFrame();
		f.setBounds(500,150,300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setTitle("HOME/Creat New Factor");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		String Item[]= {"shirt","pants","television","mobile","laptop","book"};
		JComboBox A= new JComboBox(Item);
		A.setBounds(10,15,75,30);
		JButton Up1=new JButton("+");
		JButton Down1=new JButton("-");
		JButton Up2=new JButton("+");
		JButton Down2=new JButton("-");
		JButton b1= new JButton("Creat");
		JButton b2= new JButton("HOME");
		JButton b3= new JButton("EXIT");
		JTextField tA= new JTextField("ID");
		JTextField tB= new JTextField("Number");
		JTextField tC= new JTextField("Price");
		JTextField tD= new JTextField("Customer");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField("0");
		JTextField t3= new JTextField("0");
		JTextField t4= new JTextField();
		Up1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int x=Integer.parseInt(t2.getText())+1;
				t2.setText(null);
				t2.setText(String.valueOf(x));
				
			}
		});
		Down1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int x=Integer.parseInt(t2.getText())-1;
				t2.setText(null);
				t2.setText(String.valueOf(x));
				
			}
		});
		Up2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int x=Integer.parseInt(t3.getText())+1;
				t3.setText(null);
				t3.setText(String.valueOf(x));
				
			}
		});
		Down2.addActionListener(new ActionListener() {
	
	
	public void actionPerformed(ActionEvent e) {
		int x=Integer.parseInt(t3.getText())-1;
		t3.setText(null);
		t3.setText(String.valueOf(x));
		
		}
	});
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
							if(Comparison.Comparison(t1.getText(),A.getSelectedIndex())&&!t1.getText().equals(""))
							{
								Date date=new Date(119,3,22);
								String kharid=KharidKol.Kharid(t1.getText(),A.getSelectedIndex());
								Factor factor=new Factor(t4.getText(),date.toString(),t1.getText(),kharid,t3.getText(),t2.getText());
								FactorSetting.addFactor(factor);
								JOptionPane.showMessageDialog(null,"Your factor has been created","save factor",JOptionPane.INFORMATION_MESSAGE);
							}
							else
								{
									JOptionPane.showMessageDialog(null,"This ID doesnt exist !","WARNING",JOptionPane.ERROR_MESSAGE);
									IdShow.IdShow(A.getSelectedIndex());
								}
			}				
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
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
		tA.setBounds(95,15,65,30);
		t1.setBounds(170,15,120,30);
		tB.setBounds(95,55,65,30);
		t2.setBounds(170,55,65,30);
		tC.setBounds(95,95,65,30);
		t3.setBounds(170,95,65,30);
		tD.setBounds(95,135,65,30);
		t4.setBounds(170,135,120,30);
		b1.setBounds(190,225,70,30);
		b2.setBounds(100,225,70,30);
		b3.setBounds(15,225,70,30);
		Up1.setBounds(240, 55, 41,13);
		Down1.setBounds(240, 70, 41,13);
		Up2.setBounds(240, 95, 41,13);
		Down2.setBounds(240, 110, 41,13);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(tD);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(A);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(Up1);
		f.add(Down1);
		f.add(Up2);
		f.add(Down2);
		
	}
}