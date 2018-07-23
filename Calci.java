import java.awt.*;
import java.awt.event.*;
import javax.script.*;
class Calci extends WindowAdapter implements ActionListener
{	
	Frame f;
	TextField t;
	Button i1,i2,i3,i4,i5,i6,i7,i8,i9,i0,plus,min,mul,equl,div,canc;
	
	String str="";
	public Calci()
	{
		f=new Frame();
		
		f.setSize(400,300);
		f.setLayout(new GridLayout(5,1,5,5));
		
		f.addWindowListener(this);
		
		
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(1,1));
		t=new TextField();
		p1.add(t);
		f.add(p1);
		
		GridLayout gl=new GridLayout(1,4,5,5);
		
		i1=new Button("1");
		i2=new Button("2");
		i3=new Button("3");
		i4=new Button("4");
		i5=new Button("5");
		i6=new Button("6");
		plus=new Button("+");
		min=new Button("-");
		i7=new Button("7");
		i8=new Button("8");
		i9=new Button("9");
		i0=new Button("0");
		mul=new Button("*");
		equl=new Button("=");
		div=new Button("/");
		canc=new Button("C");
		
		
		Panel p2=new Panel();
		p2.setLayout(gl);
		p2.add(i1);
		p2.add(i2);
		p2.add(i3);
		p2.add(plus);
		
		Panel p3=new Panel();
		p3.setLayout(gl);
		p3.add(i4);
		p3.add(i5);
		p3.add(i6);
		p3.add(min);
		//f.add(p2);
		
		
		Panel p4=new Panel();
		p4.setLayout(gl);
		
		p4.add(i7);
		p4.add(i8);
		p4.add(i9);
		p4.add(mul);
		
		
		Panel p5=new Panel();
		p5.setLayout(gl);
		p5.add(canc);
		p5.add(i0);
		p5.add(div);
		p5.add(equl);
		
		
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		
		f.setVisible(true);
		
		i0.addActionListener(this);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);
		i9.addActionListener(this);
		plus.addActionListener(this);
		min.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equl.addActionListener(this);
		canc.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getSource()==i0)
		{
			str+="0";
		}
		else if(e.getSource()==i1)
		{
			str+="1";
		}
		else if(e.getSource()==i2)
		{
			str+="2";
		}
		else if(e.getSource()==i3)
		{
			str+="3";
		}
		else if(e.getSource()==i4)
		{
			str+="4";
		}
		else if(e.getSource()==i5)
		{
			str+="5";
		}
		else if(e.getSource()==i6)
		{
			str+="6";
		}
		else if(e.getSource()==i7)
		{
			str+="7";
		}
		else if(e.getSource()==i8)
		{
			str+="8";
		}
		else if(e.getSource()==i9)
		{
			str+="9";
		}
		else if(e.getSource()==plus)
		{
			if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='*' ||str.charAt(str.length()-1)=='/')
			{
			
				str=str.substring(0,str.length()-1);
			
			}
			str+="+";	
		}
		else if(e.getSource()==min)
		{	
			if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='*' ||str.charAt(str.length()-1)=='/')
			{
			
				str=str.substring(0,str.length()-1);
			
			}
			str+="-";
		}
		else if(e.getSource()==mul)
		{	
			if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='*' ||str.charAt(str.length()-1)=='/')
			{
			
				str=str.substring(0,str.length()-1);
			
			}
			str+="*";
		}
		else if(e.getSource()==div)
		{	
			if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='*' ||str.charAt(str.length()-1)=='/')
			{
			
				str=str.substring(0,str.length()-1);
			
			}
			str+="/";
		}
		else if(e.getSource()==canc)
		{
			str="";
		}
		else if(e.getSource()==equl)
		{
			 ScriptEngineManager mgr = new ScriptEngineManager();
  			 ScriptEngine engine = mgr.getEngineByName("JavaScript");
			 try{
			 	str=engine.eval(str).toString();
			}
			catch(ScriptException e1)
			{
				System.out.println(e1.getMessage());
			}
			
		}
	
	
	
	
		t.setText(str);
	}
	
	public void windowClosing(WindowEvent e)
	{
		Window w=e.getWindow();		
		w.setVisible(false);
		w.dispose();
		System.exit(1);
	}
	
	
	public double Eval(double a,char op,double b)
	{
		if(op=='+')
		{
			return a+b;
		}
		if(op=='-')
		{
			return a-b;
		}
		if(op=='*')
		{
			return a*b;
		}
		
		
		
		return a/b;
	}
	
	
	public static void main(String args[])
	{
		Calci c=new Calci();
	}
}
		
		
		
		
		
		
				
		
		
