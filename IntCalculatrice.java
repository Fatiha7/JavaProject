package java2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class IntCalculatrice extends JFrame implements ActionListener,ItemListener
	{
	public JTextField txt;
	public JRadioButton Bin,Dec,Hex;
	public JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b,bc,bcl,bMult,bDiv,bSom,bSoust;
	public JButton bRes,bOff,bF,bE,bD,bC,bB,bA;
	ButtonGroup bg2;
	double xp=1,xs=0,aux=0;
	boolean op=false,mult=false,div=false,som=false,soust=false,init=true;
	boolean dec=true,bin=false,hex=false;
	boolean virg=false;
	IntCalculatrice (){
		 
		 this.setResizable(false);
		    setSize(new Dimension(300, 300));
		    txt = new JTextField(" 0",15);
			Hex= new JRadioButton("Hex",true);
		    Dec= new JRadioButton("Dec",false);
		    Bin= new JRadioButton("Bin",false);
		    bA=new JButton("A");bOff=new JButton(" ");bcl=new JButton("<--");bc=new JButton("C");bDiv=new JButton("/");
			bB=new JButton("B");b7=new JButton("7");b8=new JButton("8");b9=new JButton("9");bMult=new JButton("*");
			bC=new JButton("C");b4=new JButton("4");b5=new JButton("5");b6=new JButton("6");bSoust=new JButton("-");
			bD=new JButton("D");b1=new JButton("1");b2=new JButton("2");b3=new JButton("3");bSom=new JButton("+");
			bE=new JButton("E");bF=new JButton("F");b0=new JButton("0");b=new JButton(".");bRes=new JButton("=");
			this.getContentPane().setLayout(new FlowLayout());
			
			JPanel pTxt = new JPanel(new GridLayout(1,1));
			pTxt.add(txt);txt.addActionListener(this);
			txt.setFont(new Font("Arial", 1, 18)); // NOI18N
		    txt.setHorizontalAlignment(JTextField.RIGHT);
		   
		    txt.setBorder(BorderFactory.createEtchedBorder());
			JPanel pRad = new JPanel(new GridLayout(1,3));
			pRad.add(Hex);pRad.add(Dec); pRad.add(Bin);
			Hex.addItemListener(this); Dec.addItemListener(this);Bin.addItemListener(this);
			Hex.setActionCommand("Hex");Dec.setActionCommand("Dec");Bin.setActionCommand("Bin");
			JPanel pcl= new JPanel(new GridLayout(5,5));
			//bg2.add(Bin);bg2.add(Hex);bg2.add(Dec);
		    pcl.add(bA); bA.addActionListener(this);
			pcl.add(bOff);bOff.addActionListener(this);
		    pcl.add(bcl);bcl.addActionListener(this);
			pcl.add(bc); bc.addActionListener(this);
			pcl.add(bDiv); bDiv.addActionListener(this);
			pcl.add(bB); b8.addActionListener(this);
			pcl.add(b7);b7.addActionListener(this);
			pcl.add(b8);bB.addActionListener(this);
			pcl.add(b9);b9.addActionListener(this);
			pcl.add(bMult);bMult.addActionListener(this);
			pcl.add(bC);bC.addActionListener(this);
			pcl.add(b4); b4.addActionListener(this);
			pcl.add(b5);b5.addActionListener(this);
			pcl.add(b6); b6.addActionListener(this);
			pcl.add(bSoust);bSoust.addActionListener(this);
			pcl.add(bD);bD.addActionListener(this);
			pcl.add(b1);b1.addActionListener(this);
			pcl.add(b2);b2.addActionListener(this);
			pcl.add(b3);b3.addActionListener(this);
			pcl.add(bSom);bSom.addActionListener(this);
			pcl.add(bE);bE.addActionListener(this);
			pcl.add(bF);bF.addActionListener(this);
			pcl.add(b0);b0.addActionListener(this);
			pcl.add(b);b.addActionListener(this);
		    pcl.add(bRes); bRes.addActionListener(this);
			
		    this.getContentPane().add(pTxt);
			this.getContentPane().add(pRad);
			this.getContentPane().add(pcl);

			 getContentPane().add(pTxt, BorderLayout.LINE_START);
			 getContentPane().add(pRad, BorderLayout.AFTER_LAST_LINE);
			
			 getContentPane().add(pTxt, BorderLayout.PAGE_START);
			 getContentPane().add(pRad, BorderLayout.CENTER);
			 getContentPane().add(pcl, BorderLayout.PAGE_END); 

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 void activatehex(boolean v)
	    {
		bA.setEnabled(v);bB.setEnabled(v);
	    bC.setEnabled(v);bD.setEnabled(v);bE.setEnabled(v);bF.setEnabled(v);
	    
	    
	    }
		/*void activatedec(boolean v)
	    {
			b0.setEnabled(v);b1.setEnabled(v);b2.setEnabled(v);b3.setEnabled(v);
		    b4.setEnabled(v);b5.setEnabled(v);b6.setEnabled(v);b7.setEnabled(v);
		    b8.setEnabled(v);b9.setEnabled(v);b.setEnabled(v);bc.setEnabled(v);
		    bMult.setEnabled(v);bDiv.setEnabled(v);bSom.setEnabled(v);bSoust.setEnabled(v);
		    bRes.setEnabled(v);Dec.setEnabled(v);bcl.setEnabled(v);bOff.setEnabled(v);
	    }
		void activatebin(boolean v)
	    {
			b0.setEnabled(v);b1.setEnabled(v);b.setEnabled(v);bc.setEnabled(v);
		    bMult.setEnabled(v);bDiv.setEnabled(v);bSom.setEnabled(v);bSoust.setEnabled(v);
		    bRes.setEnabled(v);Bin.setEnabled(v);bcl.setEnabled(v);bOff.setEnabled(v);
	    }
	
	*/
	
	
	
	
	
	
	
	
	
	
		void Resultat()
	    {
	    	double x2=Double.parseDouble(txt.getText());
	    	if(mult) {txt.setText(""+(xp*x2));xp=Double.parseDouble(txt.getText());}
			else if(div) 
			{
				if(x2!=0)
				{
				txt.setText(""+(xp/x2));
				xp=Double.parseDouble(txt.getText());
				}
				else
				{
					txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
					txt.setText("  ERROR !!  DIVISION   PAR   ZERO   IMPOSSIBLE  ");
				}		
			}
			else if(som) {txt.setText(""+(xs+x2));xs=Double.parseDouble(txt.getText());}
			else if(soust){ txt.setText(""+(xs-x2));xs=Double.parseDouble(txt.getText());}
				else
				{
					txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
					txt.setText("  ERROR!!  RULE  :  \"  n  doit  etre >= r  et  n >= 0  et  r >= 0  \" ");
				    }
			
			}

		
		 void activateP2P3(boolean v)
		    {
			 b0.setEnabled(v);b1.setEnabled(v);b2.setEnabled(v);b3.setEnabled(v);
			    b4.setEnabled(v);b5.setEnabled(v);b6.setEnabled(v);b7.setEnabled(v);
			    b8.setEnabled(v);b9.setEnabled(v);b.setEnabled(v);
			    bMult.setEnabled(v);bDiv.setEnabled(v);bSom.setEnabled(v);bSoust.setEnabled(v);
			    bRes.setEnabled(v);Bin.setEnabled(v);Dec.setEnabled(v);
				Hex.setEnabled(v);bA.setEnabled(v);bB.setEnabled(v);bC.setEnabled(v);
				bD.setEnabled(v);bE.setEnabled(v);bF.setEnabled(v);
		    }
		
		
		
		void activateOp(boolean v)
	    {
	    b.setEnabled(v);bMult.setEnabled(v);bDiv.setEnabled(v);
	    bSom.setEnabled(v);bSoust.setEnabled(v);bRes.setEnabled(v);
	    }	
		
		
		
		

		int detBaseDestination(Object src)
	    {
			if(src==Dec)
	    	{
	    		dec=true;bin=false;hex=false;
	    		activatehex(false);activateOp(true);
	    		b0.setEnabled(true);b1.setEnabled(true);b2.setEnabled(true);
	    		b3.setEnabled(true);b4.setEnabled(true);b5.setEnabled(true);
	    		b6.setEnabled(true);b7.setEnabled(true);b8.setEnabled(true);
	    		b9.setEnabled(true);
	    		return 10;
	    	}
	    	else if(src==Bin)
	    	{
	    		dec=false;bin=true;hex=false;
	    		activatehex(false);activateOp(false);
	    		b0.setEnabled(true);b1.setEnabled(true);b2.setEnabled(false);
	    		b3.setEnabled(false);b4.setEnabled(false);b5.setEnabled(false);
	    		b6.setEnabled(false);b7.setEnabled(false);b8.setEnabled(false);
	    		b9.setEnabled(false);
	    		return 2;
	    	}
	    	
	    	else
	    	{
	    		dec=false;bin=false;hex=true;
	    		activatehex(true);activateOp(false);
	    		b0.setEnabled(true);b1.setEnabled(true);b2.setEnabled(true);
	    		b3.setEnabled(true);b4.setEnabled(true);b5.setEnabled(true);
	    		b6.setEnabled(true);b7.setEnabled(true);b8.setEnabled(true);
	    		b9.setEnabled(true); 
	    		return 16;
	    	}
	    	}
	    
		char toHexaCarct(int x)
	    {
	    	if(x==10) return 'A';
	    	else if(x==11) return 'B';
	    	else if(x==12) return 'C';
	    	else if(x==13) return 'D';
	    	else if(x==14) return 'E';
	    	else return 'F';
	    }
		String fromDec(String dep,int bd)
	    {
	       	String s="";
	    	int aux=Integer.parseInt(dep);
	    	while(aux/bd!=0)
	    	{
	    		if(aux%bd<10)
	    		{s=(aux%bd)+s;}
	    		else
	    		{s=toHexaCarct(aux%bd)+s;}
	    		aux=aux/bd;
	    	}
	    	if(aux%bd<10) {s=(aux%bd)+s;}
	    	else {s=toHexaCarct(aux%bd)+s;}
	    	return s;
	    }
		int detBaseSource()
	    {
	    	if(dec) return 10;
	    	else if(bin) return 2;
	    	else  return 16;
	    }
		int toDec(String dep,int bs)
	    {
	    int i=(dep.length())-1;
	    String s=dep;
	    int puis=0;
	    int res=0;
	    while(i>=0)
	    {
	    	res=res+conversionCarct(s.charAt(i))*((int)(Math.pow(bs,puis)));
	    	puis++;
	    	i--;
	    }
	    return res;
	    }
		boolean isValide(String s)
	    {
	    	for(int i=0;i<s.length();i++)
	    	{
	    		if(s.charAt(i)=='.' || s.charAt(i)=='-')
	    		return false;
	    	}
	    	return true;
	    }
		int conversionCarct(char c)
	    {
	    	if(c=='F') return 15;
	    	else if(c=='E') return 14;
	    	else if(c=='D') return 13;
	    	else if(c=='C') return 12;
	    	else if(c=='B') return 11;
	    	else if(c=='A') return 10;
	    	else return(Character.getNumericValue(c));
	    }
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
   Object src=e.getSource();
    
	JButton baux=(JButton)src;
	////////////*********Bouton des chiffres********//////////////
	if((src==b0)||src==b1||src==b2||src==b3||src==b4||src==b5||src==b6||src==b7||src==b8||src==b9||src==bA||src==bB||src==bC||src==bD||src==bE||src==bF)
	{ 
	if(!op) txt.setText(txt.getText()+baux.getLabel());
	else if(op)
	{
		txt.setText(baux.getLabel());
		op=false;
	}
	}
	////////////*********Bouton virgule********//////////////
	else if(src==b)
	{
		if(!virg)
		{
			txt.setText(txt.getText()+".");
			virg=true;
		}
	}
	
	////////////*********Bouton clear********//////////////
	else if(src==bc)
	{txt.setText("0");xp=1;xs=0;init=true;aux=0;
	mult=false;div=false;som=false;soust=false;
	Dec.setSelected(true);virg=false;
	}
	else if(src==bcl)
	 txt.setText(txt.getText().substring(0,txt.getText().length()-1));
	 
	 ////////////*********Multiplication********//////////////
	else if(src==bMult)
	{
	try
	{
	if(init || op)
	{
		xp=(Double.parseDouble(txt.getText()));
		init=false;virg=false;
		txt.setText(""+xp);
	}
	else
	{
		Resultat();
		xp=(Double.parseDouble(txt.getText()));
	}
		op=true;mult=true;div=false;som=false;soust=false;
		
	}catch(NumberFormatException execp)
	{
		txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
		txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE ");
     	activateP2P3(false);}
	}
	////////////*******Division******////////////
	else if(src==bDiv)
	{
	try
	{
	if(init || op)
	{
		xp=(Double.parseDouble(txt.getText()));
		init=false;virg=false;
		txt.setText(""+xp);
	}
	else
	{
		 Resultat();
	 xp=(Double.parseDouble(txt.getText()));
	}
	op=true;mult=false;div=true;som=false;soust=false;
	
	}catch(NumberFormatException execp)
	{
		txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
		txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE ");
	    activateP2P3(false);}
	}
	////////////////***********Somme**********////////////////
	else if(src==bSom)
	{
	try
	{
	if(init || op)
	{
		xs=(Double.parseDouble(txt.getText()));
		init=false;virg=false;
		txt.setText(""+xs);
	}
	else
	{
		 Resultat();
		 xs=(Double.parseDouble(txt.getText()));
	}
	op=true;mult=false;div=false;som=true;soust=false;
	
	}catch(NumberFormatException execp)
	{
		txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
		txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE ");
	    activateP2P3(false);}
	}
	////////////////************Soustraction***********//////////////////
	else if(src==bSoust)
	{
	try
	{
	if(init || op)
	{
		xs=(Double.parseDouble(txt.getText()));
		init=false;virg=false;
		txt.setText(""+xs);
	}
	else
	{
		Resultat();
		xs=(Double.parseDouble(txt.getText()));
	}
    op=true;mult=false;div=false;som=false;soust=true;
	}catch(NumberFormatException execp)
	{
		txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
		txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE ");
	    activateP2P3(false);}
    }
    //////////////////**************Resultat*************//////////////////
	else if(e.getSource()==bRes)
	{
		Resultat();
		init=true;virg=false;
	}
	//////////************Les fonction Scientifiques********/////////////
 	
	/////////************FIN des Fonctions Scientifiques********/////////

    else if(src==bOff) System.exit(0);
	}

	public void itemStateChanged(ItemEvent i) {
		Object srci=i.getSource();
		 if(dec)
		{
			activateOp(false);
			String dep=txt.getText();
			try
			{ 
			String s=fromDec(dep,detBaseDestination(srci));
			txt.setText(s);}
			catch(NumberFormatException e)
			{
				txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
				txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE  ");
			    }
		}
		else if(bin||hex)
		{
			try
			{
			int x= toDec(txt.getText(),detBaseSource());
			String s=""+x;
			txt.setText(fromDec(s,detBaseDestination(srci)));}
			catch(NumberFormatException e)
			{
				txt.setBackground(Color.LIGHT_GRAY);txt.setForeground(Color.black);
				txt.setText("ERROR :  CONVERTION  AVEC  VERGULE  FLOTTANTE  NON  SUPPORTEE  ");
			    }
		}
	
	} 
	public static void main(String[] args) {
		IntCalculatrice cal = new IntCalculatrice();
		cal.setVisible(true);
		
         }
	}