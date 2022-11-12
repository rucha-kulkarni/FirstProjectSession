import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {
    JFrame frame;
    JTextArea myarea;
    JButton button;
    FirstSession(){
        frame = new JFrame("FirstSession");
        frame.setBounds(258,258, 300,300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        button = new JButton("Click");
        button.setBounds(120,20,70,20);
        button.addActionListener(this);
        myarea = new JTextArea("Welcome to text area");
        myarea.setBounds(50, 50, 200, 200);
        myarea.setBackground(Color.RED);
        frame.add(button);
        frame.add(myarea);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        FirstSession object = new FirstSession();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        myarea.setText("You clicked the button");
    }

}
