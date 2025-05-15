package ex0508;
import java.awt.*;

import javax.swing.*;

public class PanelEx extends JFrame{
   public PanelEx() {
      setSize(300, 300);
      setTitle("example");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container c = getContentPane();
      c.setBackground(Color.yellow);
      
      //2. 콘테이너의 레이아웃
      c.setLayout(new BorderLayout(10,10));
      
      //3. 클래스 패널을 2개 추가
      c.add(new NorthPanel(), BorderLayout.NORTH);
      c.add(new CenterPanel(), BorderLayout.CENTER);
      
      setVisible(true);
   }
   
   class NorthPanel extends JPanel{
      public NorthPanel() {
         setBackground(Color.pink);
         add(new JLabel("이름 : "));
         add(new JTextField("",5));
         
      }
   }
   
   class CenterPanel extends JPanel{
      public CenterPanel() {
         
         setBackground(Color.CYAN);
         
         //2. 콘테이너의 레이아웃
         GridLayout grid = new GridLayout(4, 4);
         grid.setVgap(5);
         setLayout(grid);
         
         //3. 버튼 추가
         add(new JButton("1"));
         add(new JButton("2"));
         add(new JButton("3"));
         add(new JButton("4"));
         add(new JButton("5"));
         add(new JButton("6"));
         add(new JButton("7"));
         add(new JButton("8"));
         add(new JButton("9"));
         add(new JButton("*"));
         add(new JButton("0"));
         add(new JButton("#"));
      }
      
   }

   public static void main(String[] args) {
      PanelEx px = new PanelEx();

   }

}