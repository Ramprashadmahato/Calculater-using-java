import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;


public class calculater implements ActionListener
{
JFrame JF;
JLabel Title, Number1, Number2,Result;
JButton But1, But2, But3;  
JTextField T1,T2,T3; 
public calculater(){
JF = new JFrame ("MathEvents");
Title = new JLabel ("Calculation");

Number1 = new JLabel("Number1:");
T1 = new JTextField();
Number2 = new JLabel("Number2:");
T2 = new JTextField();
Result = new JLabel("Result:");
T3 = new JTextField();
//Button
But1 = new JButton("+");
But2 = new JButton("-");
But3 = new JButton("C");

//add in JFrame all the components
JF.add(Title);
JF.add(Number1);
JF.add(T1);
JF.add(Number2);
JF.add(T2);
JF.add(Result);
JF.add(T3);
JF.add(But1);
JF.add(But2);
JF.add(But3);
//set bounds of all the components
Title.setBounds(100,100,300,30);
Number1.setBounds(25,150,100,30);
T1.setBounds(100,150,100,30);
Number2.setBounds(25,200,100,30);
T2.setBounds(100,200,100,30);
Result.setBounds(25,250,100,30);
T3.setBounds(100,250,100,30);
But1.setBounds(50,300,50,30);
But2.setBounds(150,300,50,30);
But3.setBounds(250,300,50,30);

//add or register components  to required listener interface
T1.addActionListener(this); 
T2.addActionListener(this); 
T3.addActionListener(this);   
But1.addActionListener(this);
But2.addActionListener(this);
But3.addActionListener(this);

// Title font size and color
Title.setFont(new Font("Times New Roman",Font.BOLD,30));
Title.setForeground(Color.BLUE);  
JF.getContentPane().setBackground(Color.PINK); 
  

//set Layout of the JFrame
JF.setLayout(null);
JF.setSize(700,600);
JF.setVisible(true); 
       
}
@ Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==But1 ){
       JOptionPane.showMessageDialog(JF,"Sum of the two value","Addition",JOptionPane.INFORMATION_MESSAGE);
       try{
       int Number1 = Integer.parseInt(T1.getText());
       int Number2 = Integer.parseInt(T2.getText());
       T3.setText(""+(Number1 + Number2));
       }catch(NumberFormatException F){
       JOptionPane.showMessageDialog(JF,"Formate not valid","Warning",JOptionPane.ERROR_MESSAGE);  
       }
    }else if(e.getSource()==But2 ){
      JOptionPane.showMessageDialog(JF,"Subtraction of the two value","Subtraction",JOptionPane.INFORMATION_MESSAGE);
      try{
      int Number1 = Integer.parseInt(T1.getText());
      int Number2 = Integer.parseInt(T2.getText());
      T3.setText(""+(Number1 - Number2));  
      }catch(NumberFormatException F){
      JOptionPane.showMessageDialog(JF,"Formate not valid","Warning",JOptionPane.ERROR_MESSAGE);  
      }
      int Number1 = Integer.parseInt(T1.getText());
      int Number2 = Integer.parseInt(T2.getText());
      T3.setText(""+(Number1 - Number2));  
    }else{
      JOptionPane.showMessageDialog(JF,"The form has been clear","Sucessful",JOptionPane.INFORMATION_MESSAGE);
      T3.setText("");
      T1.setText("");
      T2.setText("");
    }
    

}
}
