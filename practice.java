import java.awt.*;
import javax.swing.*;
class awt{
    public static void main (String[] args){
        JFrame frame= new JFrame();
        JLabel l1,l2,l3;
        l1=new JLabel("java programming");
        l1.setFont(new Font("Arial",Font.BOLD,28));
        l1.setBounds(100,20,400,30);
        l1.setForeground(Color.RED);
        l2=new JLabel("username");
        l2.setFont(new Font("Arial",Font.BOLD,28));
        l2.setBounds(50,60,175,25);
        l2.setForeground(Color.RED);
        l3=new JLabel("password");
        l3.setFont(new Font("Arial",Font.BOLD,25));
        l3.setBounds(150,100,175,30);
        l3.setForeground(Color.RED);
        //text field
       JTextField t1=new JTextField();
        t1.setBounds(150,60,175,30);
        JTextField t2=new JPasswordField();
        t2.setBounds(150,100,175,30);
        frame.add(t2);
        frame.add(t1);
frame.add(l1);
 frame.add(l2);
        frame.add(l3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400,400);
        // frame.setLocation(100,100);
        frame.setBounds(100,100,200,200);
        frame.setTitle("kt tech");
        ImageIcon icon= new ImageIcon("photo27.jpg");
        frame.setIconImage(icon.getImage());
Container c= frame.getContentPane();
c.setBackground(Color.BLUE);
    }
}
