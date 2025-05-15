package project0513;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AnonymousClassListener extends JFrame{
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1. 독립
		JButton btn1 = new JButton("Action1");
		btn1.addActionListener(new MyActionListener());
		c.add(btn1);
		
		//2. 내부
		JButton btn2 = new JButton("Action2");
		btn2.addActionListener(new MyActionListener());
		c.add(btn2);
		
		//3. 익명
		JButton btn3 = new JButton("Action3");
		btn3.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action3"))
					b.setText("액션3");
				else
					b.setText("Action3");
					setTitle(b.getText());
			}
		});
		c.add(btn3);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	private class InnerActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("Action2"))
				b.setText("액션2");
			else
				b.setText("Action2");
			setTitle(b.getText());
		}
	}
	
	public static void main(String[]args) {
		new AnonymousClassListener();
	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if (b.getText().equals("Action1"))
			b.setText("액션1");
		else
			b.setText("Action1");
	}
}
