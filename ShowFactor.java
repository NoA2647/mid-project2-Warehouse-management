import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShowFactor {
	public ShowFactor() 
	{	
		JFrame f=new JFrame();
		f.setBounds(500,150,350,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("HOME");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField jtf=new JTextField();
		JButton b1= new JButton("OK");
		b1.setBounds(225, 50, 65, 30);
		JButton b2= new JButton("back");
		b2.setBounds(200, 100, 100, 30);
		jtf.setBounds(100, 50, 100, 20);
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
		String json = file.readFromFile("E:\\save\\factor\\factor.txt");
		try {
			JSONArray array = new JSONArray(json);
			DefaultMutableTreeNode[] a = new DefaultMutableTreeNode[10];
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				a[i]=new DefaultMutableTreeNode(object.getString(Factor.KEY_ID));
				style.add(a[i]);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JTree jt= new JTree(style);
		jt.setSize(350, 200);
		jt.addMouseListener(new MouseAdapter() {
		      public void mouseClicked(MouseEvent me) {
		    	 jtf.setText(jt.getLeadSelectionPath().toString());
		    	 String[] word=jtf.getText().split(", ");
		    	 String[] word1=word[1].split("]");
		    	 jtf.setText(word1[0]);
		      }
		    });
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				JFrame f=new JFrame();
				f.setBounds(550,200,500,300);
				f.setLayout(null);
				f.setVisible(true);
				f.setTitle(jtf.getText());
				f.setResizable(false);
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				JPanel jp=new JPanel();
				jp.setSize(500, 300);
				jp.setBackground(Color.LIGHT_GRAY);
				JTextArea jta= new JTextArea();
				jta.setBounds(0, 0,500, 200);
				jta.setFont(new Font("Serif", Font.ITALIC, 16));
				jta.setText(EditFactor.FindFactor(jtf.getText()).toString());
				JButton edit =new JButton("edit");
				edit.setBounds(100, 100, 100, 30);
				edit.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						JSONObject array = null;
						try {
							array = new JSONObject(jta.getText());
						} catch (JSONException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						EditFactor.EditFactor(jtf.getText(), array);
						
					}
				});
				f.add(edit);
				f.add(jta);
				f.add(jp);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
				f.dispose();
			}
		});
		f.add(b2);
		f.add(b1);
		f.add(jtf);
		f.add(jt);
		
	}
}
