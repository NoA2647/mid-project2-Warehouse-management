import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Book_show {
	Book_show()
	{
		JFrame f=new JFrame();
		f.setBounds(500,150,300,280);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME/Create product/book");
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField tA= new JTextField("Genre");
		JTextField tB= new JTextField("Publishers");
		JTextField tC= new JTextField("Language");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();

		JButton next= new JButton("NEXT");
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(tA);
		f.add(tB);
		f.add(tC);
		f.add(next);

		next.setBounds(100,200,70,30);
		tA.setEditable(false);
		tB.setEditable(false);
		tC.setEditable(false);
		tA.setBounds(5,20,65,30);
		t1.setBounds(80,20,200,30);
		tB.setBounds(5,80,65,30);
		t2.setBounds(80,80,200,30);
		tC.setBounds(5,140,65,30);
		t3.setBounds(80,140,200,30);
		
		Book book=new Book();
		book.setGenre(t1.getText());
		book.setPublishers(t2.getText());
		book.setLanguage(t3.getText());
		next.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {

				PublicInformation a=new PublicInformation(book);
				f.dispose();
			}
		});
	}
}
