import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
public class WeightConverter implements ListSelectionListener
{
String w1=" ",w2=" ";
JList List1,List2;
JLabel label1,l1,l2;
JPanel p1,p2; 
JTextField txt1;
JTextField txt2;
JFrame f;
String method[]={"kilogram","gram","pound","ounce","milligram"};
WeightConverter()
{
f=new JFrame(); 
Font z = new Font("ELEPHANT",Font.ITALIC,14);
Font y = new Font("ELEPHANT",Font.PLAIN | Font.BOLD,14);
label1=new JLabel("WEIGHT CONVERTER");
      label1.setFont(new Font("ELEPHANT", Font.ITALIC | Font.BOLD, 25));
      label1.setForeground(new Color(120, 90, 40));
      label1.setBackground(new Color(100, 20, 70));
label1.setBounds(100,30,500,20);
l1=new JLabel("Input");
	l1.setFont(new Font("ELEPHANT", Font.PLAIN | Font.BOLD, 14));
	l1.setForeground(new Color(120, 90, 40));
        l1.setBackground(new Color(100, 20, 70));
l2=new JLabel("Output");
	l2.setFont(new Font("ELEPHANT", Font.PLAIN | Font.BOLD, 14));
	l2.setForeground(new Color(120, 90, 40));
        l2.setBackground(new Color(100, 20, 70));
l1.setBounds(100,65,150,40);
l2.setBounds(300,65,150,40);
List1=new JList(method);
List2=new JList(method);
List1.setSelectedIndex(0);
List2.setSelectedIndex(-1);
List1.setBounds(100,150,150,150);
List2.setBounds(300,150,150,150);
List1.addListSelectionListener(this);
List2.addListSelectionListener(this);
List1.setFont(z);
List2.setFont(z);
List1.setForeground(Color.BLACK);
List2.setForeground(Color.BLACK);
List1.setBackground(new Color(120, 90, 40));
List2.setBackground(new Color(120, 90, 40));
txt1=new JTextField("1");
    txt1.setFont(y);
 txt1.setForeground(Color.BLACK);
 txt1.setBackground(new Color(120, 90, 40));
txt1.setHorizontalAlignment(SwingConstants.RIGHT);
txt2=new JTextField();
    txt2.setFont(y);
txt2.setHorizontalAlignment(SwingConstants.RIGHT);
 txt2.setForeground(Color.BLACK);
 txt2.setBackground(new Color(120, 90, 40));
txt1.setBounds(100,100,150,40);
txt2.setBounds(300,100,150,40);
f.add(label1);
f.add(l1);
f.add(l2);
f.add(List1);
f.add(List2);
f.add(txt1);
f.add(txt2);
f.getContentPane().setBackground(Color.BLACK);
f.setLayout(null);
f.setSize(600,600);
f.setVisible(true);
}
double Converter(double val1,String WeightFrom,String weightTo)
{
double val2=0;
if(WeightFrom.equals(weightTo))
{
val2=val1;
}
if(WeightFrom.equals("kilogram"))
	{
	if(weightTo.equals("gram"))
		{
		val2=val1*1000;
		}
	else if(weightTo.equals("pound"))
		{
		val2=val1*2.2046;
		}
	else if(weightTo.equals("ounce"))
		{
		val2=val1*35.274;
		}
	else if(weightTo.equals("milligram"))
		{
		val2=val1*1000000;
		}
	}
else if(WeightFrom.equals("gram"))
	{
	if(weightTo.equals("kilogram"))
		{
		val2=val1/1000;
		}
	else if(weightTo.equals("pound"))
		{
		val2=val1*0.0022046;
		}
	else if(weightTo.equals("ounce"))
		{
		val2=val1*0.035274;
		}
	else if(weightTo.equals("milligram"))
		{
		val2=val1*1000;
		}
	}
else if(WeightFrom.equals("pound"))
	{
	if(weightTo.equals("kilogram"))
		{
		val2=val1/2.2046;
		}
	else if(weightTo.equals("gram"))
		{
		val2=val1/0.0022046;
		}
	else if(weightTo.equals("ounce"))
		{
		val2=val1*16;
		}
	else if(weightTo.equals("milligram"))
		{
		val2=val1*453592;
		}
	}
else if(WeightFrom.equals("ounce"))
	{
	if(weightTo.equals("kilogram"))
		{
		val2=val1/35.274;
		}
	else if(weightTo.equals("gram"))
		{
		val2=val1/0.035274;
		}
	else if(weightTo.equals("pound"))
		{
		val2=val1*0.0625;
		}
	else if(weightTo.equals("milligram"))
		{
		val2=val1*28349.5;
		}
	}
else if(WeightFrom.equals("milligram"))
	{
	if(weightTo.equals("kilogram"))
		{
		val2=val1/1000000;
		}
	else if(weightTo.equals("gram"))
		{
		val2=val1*0.001;
		}
	else if(weightTo.equals("pound"))
		{
		val2=val1/453592;
		}
	else if(weightTo.equals("ounce"))
		{
		val2=val1/28349.5;
		}
	}

return val2;
}
public void valueChanged(ListSelectionEvent eve)
{String c=txt1.getText();
double v1=Double.parseDouble(c);
int c1=List1.getSelectedIndex();
int c2=List2.getSelectedIndex();
String w1=method[c1];
String w2=method[c2]; 
double v2=Converter(v1,w1,w2);
txt2.setText(v2 +"");  
}
public static void main(String args[])throws Exception
{
new WeightConverter();
}
}
