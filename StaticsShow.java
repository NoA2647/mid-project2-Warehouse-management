import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StaticsShow {
	public static void StaticsShow() {
		JFrame f=new JFrame();
		f.setBounds(550,300,400,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("static");
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		JTextArea jt4=new JTextArea();
		JTextField A=new JTextField("kharid");
		JTextField B=new JTextField("forosh");
		JTextField C=new JTextField("profit");
		JTextField D=new JTextField("Top ten");
		jt1.setText(String.valueOf(KharidKol.KharidKol()));
		/*jt2.setText(String.valueOf(ForoshKol.ForoshKol()));
		jt3.setText(String.valueOf(ForoshKol.ForoshKol()-KharidKol.KharidKol()));*/
		jt4.setText(null);
		A.setBounds(20, 20, 80, 20);
		jt1.setBounds(120, 20, 80, 20);
		B.setBounds(50, 50, 80, 20);
		jt2.setBounds(150, 50, 80, 20);
		C.setBounds(80, 80, 80, 20);
		jt3.setBounds(180, 80, 80, 20);
		D.setBounds(110, 110, 80, 20);
		jt4.setBounds(210, 110, 100, 200);
		A.setEditable(false);
		B.setEditable(false);
		C.setEditable(false);
		D.setEditable(false);
		jt1.setEditable(false);
		jt2.setEditable(false);
		jt3.setEditable(false);
		jt4.setEditable(false);
		f.add(A);
		f.add(jt1);
		f.add(B);
		f.add(jt2);
		f.add(C);
		f.add(jt3);
		f.add(D);
		f.add(jt4);
	}
}
