package calci;


import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

class mainview extends JFrame implements ActionListener{
	static JFrame f; 

    static JTextField l; 
  
   
    String s0, s1, s2; 
  
   
    mainview() 
    { 
        s0 = s1 = s2 = ""; 
    } 
  

	public static void main(String args[]) throws Exception {
		
		gettingstart();
}

	@SuppressWarnings("deprecation")
	private static void gettingstart() {
		// TODO Auto-generated method stub
		 f = new JFrame("calculator"); 
		  
	        try { 
	       
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
	        } 
	        catch (Exception e) { 
	            System.err.println(e.getMessage()); 
	        } 
	  
	        mainview c = new mainview(); 
	  
	        l = new JTextField(16); 
	  
	        l.setEditable(false); 
	  
	        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
	  
	        b0 = new JButton("0"); 
	        b1 = new JButton("1"); 
	        b2 = new JButton("2"); 
	        b3 = new JButton("3"); 
	        b4 = new JButton("4"); 
	        b5 = new JButton("5"); 
	        b6 = new JButton("6"); 
	        b7 = new JButton("7"); 
	        b8 = new JButton("8"); 
	        b9 = new JButton("9"); 
	  
	        beq1 = new JButton("="); 
	  
	        ba = new JButton("+"); 
	        bs = new JButton("-"); 
	        bd = new JButton("/"); 
	        bm = new JButton("*"); 
	        beq = new JButton("C"); 
	  
	        be = new JButton("."); 
	  
	      
	        bm.addActionListener(c); 
	        bd.addActionListener(c); 
	        bs.addActionListener(c); 
	        ba.addActionListener(c); 
	        b9.addActionListener(c); 
	        b8.addActionListener(c); 
	        b7.addActionListener(c); 
	        b6.addActionListener(c); 
	        b5.addActionListener(c); 
	        b4.addActionListener(c); 
	        b3.addActionListener(c); 
	        b2.addActionListener(c); 
	        b1.addActionListener(c); 
	        b0.addActionListener(c); 
	        be.addActionListener(c); 
	        beq.addActionListener(c); 
	        beq1.addActionListener(c); 
	        
	        
	        
	        JPanel p = new JPanel(); 
	        p.add(l); 
	        p.add(ba); 
	        p.add(b1); 
	        p.add(b2); 
	        p.add(b3); 
	        p.add(bs); 
	        p.add(b4); 
	        p.add(b5); 
	        p.add(b6); 
	        p.add(bm); 
	        p.add(b7); 
	        p.add(b8); 
	        p.add(b9); 
	        p.add(bd); 
	        p.add(be); 
	        p.add(b0); 
	        p.add(beq); 
	        p.add(beq1); 
	
	        p.setBackground(Color.blue); 
	  
	     
	        f.add(p); 
	  
	        f.setSize(200, 220); 
	        f.show(); 
	        
	       
				}
	        	
	        
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
	
		 if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) { 
	          
	            if (!s1.equals("")) 
	                s2 = s2 + s; 
	            else
	                s0 = s0 + s; 
	  
	            l.setText(s0 + s1 + s2); }
	            else if (s.charAt(0) == '=') {  
	                double te;
	                if (s1.equals("*")) 
	                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
	                else
	                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
	                l.setText(s0 + s1 + s2 + "=" + te); 
	                s0 = Double.toString(te); 
	                s1 = s2 = ""; }
	                else { 
	                    if (s1.equals("") || s2.equals("")) 
	                        s1 = s; 
	                    else { 
	                        double te; 
	                        if (s1.equals("*")) 
	                            te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
	                        else 
	                        	 te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
	                        s0 = Double.toString(te); 
	                        s1 = s; 
	                        s2 = ""; 
	                    } 
		 tanmay t=new tanmay();
		 t.multiply();
			 }
		
		
	}
	public static void lists(String s) {
		java.util.List<String> someList = new ArrayList<String>();
		someList.addAll(Arrays.asList(s));
		 System.out.println(someList);
		
	}
}