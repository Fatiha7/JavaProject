package java2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Calculatrice extends JFrame implements ActionListener {
	
	private JTextField txt = new JTextField();
	ButtonGroup bg1=new ButtonGroup();
	JRadioButton Hex;
	JRadioButton Dec;
	JRadioButton bin;
	boolean bino;
	int i;
	String s;
	JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JButton jButton6 = new JButton(); 
    JButton jButton7 = new JButton();
    JButton jButton8 = new JButton();
    JButton jButton9 = new JButton();
    JButton jButton10 = new JButton();
    JButton jButton11 = new JButton();
    JButton jButton12 = new JButton();
    JButton jButton13 = new JButton();
    JButton jButton14 = new JButton();
    JButton jButton15 = new JButton();
    JButton jButton16 = new JButton();
    JButton jButton17 = new JButton();
    JButton jButton18 = new JButton();
    JButton jButton19 = new JButton();
    JButton jButton20 = new JButton();
    JButton jButton21 = new JButton();
    JButton jButton22 = new JButton();
    JButton jButton23 = new JButton();
    JButton jButton24 = new JButton();
    JButton jButton25 = new JButton();
	public Calculatrice() {
		setTitle("Calculator");
        setLocation(new java.awt.Point(600, 300));
        
        setResizable(false);
		setLayout(new FlowLayout());
	    this.setSize(310,410);
	    Font police = new Font("Arial", Font.BOLD, 20);
	    txt = new JTextField();
	    txt.setFont(police);
	    txt.setHorizontalAlignment(JTextField.RIGHT);
	    txt.setPreferredSize(new Dimension(250, 40));
	    txt.setEditable(false);
	    Hex= new JRadioButton("Hex",true);
	    Dec= new JRadioButton("Déc",false);
	    bin= new JRadioButton("bin",false);
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
//	    setLayout(new BorderLayout());
	    JPanel pan1 = new JPanel();
	    pan1.add(txt);
	    this.add(pan1);
//	    this.add(pan1,BorderLayout.NORTH);
	    JPanel pan2 = new JPanel();
	    this.add(pan2);
//	    this.add(pan2,BorderLayout.CENTER);
	    bg1.add(Hex);bg1.add(Dec);bg1.add(bin);
	    pan2.add(Hex);
	    Hex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadio1ActionPerformed(evt);
            }
        });
	    pan2.add(Dec);
	    Dec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadio2ActionPerformed(evt);
            }
        });
	    pan2.add(bin);
	    bin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadio3ActionPerformed(evt);
            }
        });
	    JPanel pan3= new JPanel();
	    this.add(pan3);
//	    this.add(pan3, BorderLayout.SOUTH);
	    jButton1 = new JButton();
	    jButton2 = new JButton();
	    jButton3 = new JButton();
	    jButton4 = new JButton();
	    jButton5 = new JButton();
	    jButton6 = new JButton();
	    jButton7 = new JButton();
	    jButton8 = new JButton();
	    jButton9 = new JButton();
	    jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jButton21 = new JButton();
        jButton22 = new JButton();
        jButton23 = new JButton();
        jButton24 = new JButton();
        jButton25 = new JButton();
        
        jButton1.setText("A");
        
        jButton2.setText(" ");
        
        jButton3.setText("<-");
        
        jButton4.setText(" c");

        jButton5.setText("/");

        jButton6.setText("B");

        jButton7.setText("7");

        jButton8.setText("8");

        jButton9.setText("9");

        jButton10.setText("*");

        jButton11.setText("C");

        jButton12.setText("4");

        jButton13.setText("5");

        jButton14.setText("6");

        jButton15.setText("-");

        jButton16.setText("D");

        jButton17.setText("1");

        jButton18.setText("2");

        jButton19.setText("3");

        jButton20.setText("+");

        jButton21.setText("E");

        jButton22.setText("F");

        jButton23.setText("0");

        jButton24.setText(".");

        jButton25.setText("=");

       
        jButton1.setPreferredSize(new Dimension(50,40));
        pan3.add(jButton1);
        jButton1.setFont(new Font("Arial", Font.BOLD, 15));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setPreferredSize(new Dimension(50,40));
        pan3.add(jButton2);
        jButton2.setFont(new Font("Arial", Font.BOLD, 15));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        jButton3.setPreferredSize(new Dimension(50,40));
        pan3.add(jButton3);
        jButton3.setFont(new Font("Arial", Font.BOLD, 15));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setPreferredSize(new Dimension(50,40));
        pan3.add(jButton4);
        jButton4.setFont(new Font("Arial", Font.BOLD, 15));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton5.setPreferredSize(new Dimension(50,40));
        pan3.add(jButton5);
        jButton5.setFont(new Font("Arial", Font.BOLD, 15));
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        JPanel pan4=new JPanel();
        this.add(pan4);
        jButton6.setPreferredSize(new Dimension(50,40));
        pan4.add(jButton6);
        jButton6.setFont(new Font("Arial", Font.BOLD, 15));
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton7.setPreferredSize(new Dimension(50,40));
        pan4.add(jButton7);
        jButton7.setFont(new Font("Arial", Font.BOLD, 15));
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton8.setPreferredSize(new Dimension(50,40));
        pan4.add(jButton8);
        jButton8.setFont(new Font("Arial", Font.BOLD, 15));
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton9.setPreferredSize(new Dimension(50,40));
        pan4.add(jButton9);
        jButton9.setFont(new Font("Arial", Font.BOLD, 15));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton10.setPreferredSize(new Dimension(50,40));
        pan4.add(jButton10);
        jButton10.setFont(new Font("Arial", Font.BOLD, 15));
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        JPanel pan5=new JPanel();
        this.add(pan5);
        jButton11.setPreferredSize(new Dimension(50,40));
        pan5.add(jButton11);
        jButton11.setFont(new Font("Arial", Font.BOLD, 15));
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton12.setPreferredSize(new Dimension(50,40));
        pan5.add(jButton12);
        jButton12.setFont(new Font("Arial", Font.BOLD, 15));
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton13.setPreferredSize(new Dimension(50,40));
        pan5.add(jButton13);
        jButton13.setFont(new Font("Arial", Font.BOLD, 15));
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton14.setPreferredSize(new Dimension(50,40));
        pan5.add(jButton14);
        jButton14.setFont(new Font("Arial", Font.BOLD, 15));
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jButton15.setPreferredSize(new Dimension(50,40));
        pan5.add(jButton15);
        jButton15.setFont(new Font("Arial", Font.BOLD, 15));
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        JPanel pan6=new JPanel();
        this.add(pan6);
        jButton16.setPreferredSize(new Dimension(50,40));
        pan6.add(jButton16);
        jButton16.setFont(new Font("Arial", Font.BOLD, 15));
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jButton17.setPreferredSize(new Dimension(50,40));
        pan6.add(jButton17);
        jButton17.setFont(new Font("Arial", Font.BOLD, 15));
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jButton18.setPreferredSize(new Dimension(50,40));
        pan6.add(jButton18);
        jButton18.setFont(new Font("Arial", Font.BOLD, 15));
        jButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jButton19.setPreferredSize(new Dimension(50,40));
        pan6.add(jButton19);
        jButton19.setFont(new Font("Arial", Font.BOLD, 15));
        jButton19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jButton20.setPreferredSize(new Dimension(50,40));
        pan6.add(jButton20);
        jButton20.setFont(new Font("Arial", Font.BOLD, 15));
        jButton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        JPanel pan7=new JPanel();
        this.add(pan7);
        jButton21.setPreferredSize(new Dimension(50,40));
        pan7.add(jButton21);
        jButton21.setFont(new Font("Arial", Font.BOLD, 15));
        jButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jButton22.setPreferredSize(new Dimension(50,40));
        pan7.add(jButton22);
        jButton22.setFont(new Font("Arial", Font.BOLD, 15));
        jButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jButton23.setPreferredSize(new Dimension(50,40));
        pan7.add(jButton23);
        jButton23.setFont(new Font("Arial", Font.BOLD, 15));
        jButton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jButton24.setPreferredSize(new Dimension(50,40));
        pan7.add(jButton24);
        jButton24.setFont(new Font("Arial", Font.BOLD, 15));
        jButton24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jButton25.setPreferredSize(new Dimension(50,40));
        pan7.add(jButton25);
        jButton25.setFont(new Font("Arial", Font.BOLD, 15));
        jButton25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        
     
	}
	double num,a,j;
	int cal;
public void arithmetic_operation() {
	
if(Hex.isSelected()) {	
	try {	i=Integer.parseInt(txt.getText(),16);
	}catch(ArithmeticException e) {}
switch(cal) {
		

case 1:
	  a= num+ i;
	  txt.setText(Integer.toHexString((int) a));
	  break;
case 2:
	  a= num- i;
	  txt.setText(Integer.toHexString((int) a));
	  break;
case 3:	  
	  a= num* i;
	  txt.setText(Integer.toHexString((int) a));
	  break;
case 4:	  
	  try{a= num/ i;}catch(ArithmeticException e) {}
	  txt.setText(Integer.toHexString((int) a).toUpperCase());
	  break;
}}
if(Dec.isSelected()) {
	try{j= Double.parseDouble(txt.getText());}catch(ArithmeticException e) {};
switch(cal) {
			
	
	case 1:
		  a= num+ j;
		  txt.setText(Double.toString(a));
		  break;
	case 2:
		  a= num- j;
		  txt.setText(Double.toString(a));
		  break;
	case 3:	  
		  a= num* j;
		  txt.setText(Double.toString(a));
		  break;
	case 4:	  
		  try{ a= num/ j;}catch(ArithmeticException e) {};
		  txt.setText(Integer.toString((int) a));
		  break;
	}
}

if(bin.isSelected()) {
		try {	i=Integer.parseInt(txt.getText(),2);
		}catch(ArithmeticException e) {}
	switch(cal) {
			
	
	case 1:
		  a= num+ i;
		  txt.setText(Integer.toBinaryString((int) a));
		  break;
	case 2:
		  a= num- i;
		  txt.setText(Integer.toBinaryString((int) a));
		  break;
	case 3:	  
		  a= num* i;
		  txt.setText(Integer.toBinaryString((int) a));
		  break;
	case 4:	  
		  try{a= num/ i;}catch(ArithmeticException e) {txt.setText("0");}
		  txt.setText(Integer.toBinaryString((int) a));
		  break;
	}
}
}	

public void bin2dec(double number) {
	int decNumber = 0;
    int nexInt;
    int i = 0;
    while (number != 0) {
        nexInt = (int) (number  % 10);
        decNumber = (int) (decNumber + nexInt * Math.pow(2, i));
        number = number / 10;
        i++;
    }
    txt.setText("decNumber");
}

public static void main(String[] args){
    Calculatrice fenetre = new Calculatrice();
    fenetre.setVisible(true);
  }     
public void jRadio1ActionPerformed(ActionEvent evt) {   
	
			jButton1.setEnabled(true);
			jButton6.setEnabled(true);
			jButton11.setEnabled(true);
			jButton16.setEnabled(true);
			jButton21.setEnabled(true);
			jButton22.setEnabled(true);
			jButton7.setEnabled(true);
			jButton8.setEnabled(true);
			jButton9.setEnabled(true);
			jButton12.setEnabled(true);
			jButton13.setEnabled(true);
			jButton14.setEnabled(true);
			jButton18.setEnabled(true);
			jButton19.setEnabled(true);
			num=Double.parseDouble(txt.getText());
			s=Long.toHexString((long) num).toUpperCase();
			txt.setText(s);
}

public void jRadio3ActionPerformed(ActionEvent evt) {                                         
			bino=true;
			jButton1.setEnabled(false);
			jButton6.setEnabled(false);
			jButton11.setEnabled(false);
			jButton16.setEnabled(false);
			jButton21.setEnabled(false);
			jButton22.setEnabled(false);
			jButton7.setEnabled(false);
			jButton8.setEnabled(false);
			jButton9.setEnabled(false);
			jButton12.setEnabled(false);
			jButton13.setEnabled(false);
			jButton14.setEnabled(false);
			jButton18.setEnabled(false);
			jButton19.setEnabled(false);
			num=Double.parseDouble(txt.getText());
			s=Long.toBinaryString((long) num);
			txt.setText(s);
}
public void jRadio2ActionPerformed(ActionEvent evt) {                                         
	
	jButton1.setEnabled(false);
	jButton6.setEnabled(false);
	jButton11.setEnabled(false);
	jButton16.setEnabled(false);
	jButton21.setEnabled(false);
	jButton22.setEnabled(false);
	jButton7.setEnabled(true);
	jButton8.setEnabled(true);
	jButton9.setEnabled(true);
	jButton12.setEnabled(true);
	jButton13.setEnabled(true);
	jButton14.setEnabled(true);
	jButton18.setEnabled(true);
	jButton19.setEnabled(true);
	num=Double.parseDouble(txt.getText());
	bin2dec(num);
	s=Long.toString((long) num);
	txt.setText(s);
	
}
private void jButton1ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + " A");
}
private void jButton2ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + " ");
}
private void jButton3ActionPerformed(ActionEvent evt) {                                         
    int length= txt.getText().length();
    int number= txt.getText().length() -1;
    String store;
    if(length > 0) {
    	StringBuilder back = new StringBuilder(txt.getText());
    	//StringBuilder is creates empty string builder,wich is used to store strings
    	back.deleteCharAt(number);
    	//back is object of stringbuilder
    	//deleteCharAt(number):is a method used to delete a single character from specific position
    	store=back.toString();
    	//convert back into string
    	txt.setText(store);
    }
}
private void jButton4ActionPerformed(ActionEvent evt) {                                         
	txt.setText(" ");
}
private void jButton5ActionPerformed(ActionEvent evt) {                                         
	if(Hex.isSelected()) {
		num= Integer.parseInt(txt.getText(),16);
	}
	if(Dec.isSelected()) {
		num= Double.parseDouble(txt.getText());
	}
	if(bin.isSelected()) {
		num= Integer.parseInt(txt.getText(),2);
	}
	cal=1;
    txt.setText("");
}
private void jButton6ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "B");
}
private void jButton7ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "7");
}
private void jButton8ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "8");
}
private void jButton9ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "9");
}
private void jButton10ActionPerformed(ActionEvent evt) {                                         
	if(Hex.isSelected()) {
		num= Integer.parseInt(txt.getText(),16);
	}
	if(Dec.isSelected()) {
		num= Double.parseDouble(txt.getText());
	}
	if(bin.isSelected()) {
		num= Integer.parseInt(txt.getText(),2);
	}
	cal=3;
    txt.setText("");
}
private void jButton11ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "C");
}
private void jButton12ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "4");
}
private void jButton13ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "5");
}
private void jButton14ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "6");
}
private void jButton15ActionPerformed(ActionEvent evt) {                                         
	if(Hex.isSelected()) {
		num= Integer.parseInt(txt.getText(),16);
	}
	if(Dec.isSelected()) {
		num= Double.parseDouble(txt.getText());
	}
	if(bin.isSelected()) {
		num= Integer.parseInt(txt.getText(),2);
	}
	cal=2;
    txt.setText("");
}
private void jButton16ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "D");
}
private void jButton17ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "1");
}
private void jButton18ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "2");
}
private void jButton19ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "3");
}
private void jButton20ActionPerformed(ActionEvent evt) {                                         
	if(Hex.isSelected()) {
		num= Integer.parseInt(txt.getText(),16);
	}
	if(Dec.isSelected()) {
		num= Double.parseDouble(txt.getText());
	}
	if(bin.isSelected()) {
		num= Integer.parseInt(txt.getText(),2);
	}
	cal=1;
    txt.setText("");
}
private void jButton21ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "E");
}
private void jButton22ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "F");
}
private void jButton23ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + "0");
}
private void jButton24ActionPerformed(ActionEvent evt) {                                         
    txt.setText(txt.getText() + ".");
}
private void jButton25ActionPerformed(ActionEvent evt) {                                         
	arithmetic_operation();
}
private void txtActionPerformed(ActionEvent evt) {                                         
	
}

public void actionPerformed(ActionEvent e) {

	
}

	
}
