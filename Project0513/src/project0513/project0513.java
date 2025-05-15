package project0513;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class project0513 extends JFrame{
   public project0513() {
      setSize(300, 300);
      setTitle("example");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container c = getContentPane();
      c.setLayout(new BorderLayout());
      
   // 상단 - 이름 입력
      c.add(new NorthPanel(), BorderLayout.NORTH);

      // 가운데 - 노란색 공간용 (살짝 보이게)
      JPanel centerSpacer = new JPanel();
      centerSpacer.setBackground(Color.YELLOW);
      centerSpacer.setPreferredSize(new Dimension(3, 1)); // 살짝만 보이게 높이 설정
      c.add(centerSpacer, BorderLayout.CENTER);

      // 하단 - 이름/전공 버튼 있는 하늘색 패널
      c.add(new SouthPanel(), BorderLayout.SOUTH);

      setVisible(true);
  }
   
   // 내부 클래스 - 이름 입력 패널
   class NorthPanel extends JPanel {
       public NorthPanel() {
           setBackground(Color.pink);
           add(new JLabel("이름 : "));
           add(new JTextField("김규리", 10));
       }
   }
   
   class SouthPanel extends JPanel {
       public SouthPanel() {
           setBackground(Color.CYAN);
           setLayout(new GridLayout(2, 1, 10, 10)); // 위아래 간격 10px

           JButton nameBtn = new JButton("이름");
           JButton majorBtn = new JButton("전공");

           nameBtn.setFont(new Font("Dialog", Font.BOLD, 16));
           majorBtn.setFont(new Font("Dialog", Font.BOLD, 16));

           nameBtn.setPreferredSize(new Dimension(200, 40));
           majorBtn.setPreferredSize(new Dimension(200, 40));

           nameBtn.addActionListener(new MyActionListener());
           majorBtn.addActionListener(new MyActionListener());

           add(nameBtn);
           add(majorBtn);
       }
   }
   public static void main(String[] args) {
      project0513 px = new project0513();

   }

}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    JButton b = (JButton) e.getSource();
	    if (b.getText().equals("이름")) {
	        b.setText("name");
	    } else if (b.getText().equals("name")) {
	        b.setText("이름");
	    } else if (b.getText().equals("전공")) {
	        b.setText("major");
	    } else if (b.getText().equals("major")) {
	        b.setText("전공");
	    }
	}
}