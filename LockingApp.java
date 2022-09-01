import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


 public class LockingApp extends JFrame
{
JButton[] btn;  
JButton clear, enter;
JTextField tef;
JPanel pd,pb;
String num="",dis="",pin="849572";

public LockingApp( ){
pd = new JPanel(new FlowLayout());
tef = new JTextField("CLOSE",39);
tef.setHorizontalAlignment(JTextField.RIGHT);
pd.add(tef);
pb = new JPanel(new GridLayout(4, 3));
btn = new JButton[10];  
for(int i=0;i<=9;i++){
btn[i] = new JButton(Integer.toString(i));  
pb.add(btn[i]);  // The Panel adds this JButton
}
clear = new JButton("Clear");
pb.add(clear);
pb.add(btn[0]);
enter = new JButton("Enter");
pb.add(enter);
for(int n=0;n<=9;n++){
      btn[n].addActionListener(new Listener1());
  }
clear.addActionListener(new Listener2());
enter.addActionListener(new Listener2());
setLayout(new BorderLayout());  
add(pd, BorderLayout.NORTH);
add(pb, BorderLayout.CENTER);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("LockApp");
setSize(500, 400);            
setVisible(true);            
}
public static void main(String[] args){
      new LockingApp();  
}

private class Listener1 implements ActionListener
{
public void actionPerformed(ActionEvent event){
num += event.getActionCommand();
dis+="*";
tef.setText(dis);
}}

private class Listener2 implements ActionListener
{
public void actionPerformed(ActionEvent event){
if(event.getSource()==clear){
tef.setText("Close");
num="";
dis="";
}
else if(event.getSource()==enter){
if(checkPIN(num))
tef.setText("Open");
else
tef.setText("Wrong Pin! Try once again.");
}}

public boolean checkPIN(String p){
if (p.equals(pin))
return true;
else
return false;
}


}

}