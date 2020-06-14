import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.nio.ByteOrder;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class view2 extends JFrame implements ActionListener {

	JFrame view2f = new JFrame();
	
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();	
	JButton btn4 = new JButton();
	
JButton date2 = new JButton("2019/10/16");
JButton date3 = new JButton("2019/10/17");
JButton date4 = new JButton("date 4");
JButton date5 = new JButton("2019/10/19");
JButton date6 = new JButton("2019/10/20");
JButton date7 = new JButton("date 7");


JButton date22 = new JButton("2019/10/16");
JButton date32 = new JButton("2019/10/17");
JButton date42 = new JButton("2019/10/18");
JButton date52 = new JButton("2019/10/19");
JButton date62 = new JButton("2019/10/20");
JButton date72 = new JButton("date7");



 

	JButton t1 = new JButton();
	
	JPanel buttonpnl = new JPanel();
	
	JLabel rambo = new JLabel("John Rambo (Sylvester Stallone) erfährt, dass Gabriella (Yvette Monreal), die");
	JLabel rambo2 = new JLabel("Tochter seiner Haushälterin Maria (Adriana Barraza), von einem");
	JLabel rambo3 = new JLabel("Menschenhändlerring entführt wurde, der Teil eines mexikanischen Kartells ist");
	JLabel rambo4 = new JLabel("und junge Frauen zur Prostitution zwingt. Rambo, der sich eigentlich nach lan-");
	JLabel rambo5 = new JLabel("gen Jahren fern der Heimat,nach all dem Leid, dem Totschlag und den geliebten");
	JLabel rambo6 = new JLabel("verstorbenen Menschen, einfach nur in den USA auf einer Ranch zur Ruhe set-");
	JLabel rambo7 = new JLabel("zen wollte und Gabriella wie ein Vater aufgezogen hat, reist ohne zu zögern");
	JLabel rambo8 = new JLabel("nach Süden und schließt sich mit der Journalistin Carmen Delgado zusammen.");
	
	JLabel datefrei = new JLabel("Ausstrahlungendaten:");
	JLabel datefrei2 = new JLabel("Ausstrahlungendaten:");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	JLabel northf1 = new JLabel("RAMBO 5");
	JLabel northf2  = new JLabel("ALLADIN");	
	
	JPanel westp1 = new JPanel();
	JPanel eastp1 = new JPanel();
	JPanel southp1 = new JPanel();
	JPanel northp1 = new JPanel();
	JPanel centerp1 = new JPanel();


	
	
	JPanel westp2 = new JPanel();
	JPanel eastp2 = new JPanel();
	JPanel southp2 = new JPanel();
	JPanel northp2 = new JPanel();
	JPanel centerp2 = new JPanel();
	
	public view2() {
		setLayout(new BorderLayout(-10, -10));
		p1.setLayout(new BorderLayout(50, 50));
		p2.setLayout(new BorderLayout(50, 50));
		
	northp2.add(northf2);

	northp2.setBackground(Color.RED);
	 northf2.setFont(new Font("Monospaced Bold", Font.PLAIN, 30));	
	
	
		northp1.add(northf1);
		northp1.setBackground(Color.RED);
	 	 northf1.setFont(new Font("Monospaced Bold", Font.PLAIN, 30));
		
	 	
	 	 
	 	 
		p1.add(eastp1, BorderLayout.EAST);
		p1.add(westp1,BorderLayout.WEST);
		p1.add(southp1, BorderLayout.SOUTH);
		p1.add(northp1, BorderLayout.NORTH);
		p1.add(centerp1,BorderLayout.CENTER);
		
		p2.add(eastp2, BorderLayout.EAST);
		p2.add(westp2,BorderLayout.WEST);
		p2.add(southp2, BorderLayout.SOUTH);
		p2.add(northp2, BorderLayout.NORTH);
		p2.add(centerp2,BorderLayout.CENTER);
		
		centerp1.add(rambo);
		centerp1.add(rambo2);
		centerp1.add(rambo3);
		centerp1.add(rambo4);
		centerp1.add(rambo5);
		centerp1.add(rambo6);
		centerp1.add(rambo7);
		centerp1.add(rambo8);
		
		
		
		
		

		 datefrei.setFont(new Font("Monospaced Bold", Font.PLAIN, 13));
		
		
eastp1.setBackground(Color.LIGHT_GRAY);
eastp2.setBackground(Color.LIGHT_GRAY);     

southp1.add(datefrei);
		southp1.add(date2);
		southp1.add(date3);
		southp1.add(date4);
		southp1.add(date5);
		southp1.add(date6);
		southp1.add(date6);
		
		
		southp2.add(datefrei2);
		southp2.add(date22);
		southp2.add(date32);
		southp2.add(date42);
		southp2.add(date52);
		southp2.add(date62);
		
		
		
		date2.setBackground(Color.GREEN);
		date3.setBackground(Color.RED);
		date4.setBackground(Color.GREEN);
		date5.setBackground(Color.GREEN);
		date6.setBackground(Color.GREEN);
		
		
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.LIGHT_GRAY);
		p3.setBackground(Color.RED);
	
		
		buttonpnl.setLayout(new GridLayout(4, 1));
		
		buttonpnl.add(btn1);
		buttonpnl.add(btn2);
		buttonpnl.add(btn3);
		buttonpnl.add(btn4);
		
		buttonpnl.setBackground(Color.GRAY);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		date4.addActionListener(this);
		
		
		btn1.setBackground(Color.BLACK);
		
		 btn1.setIcon(new ImageIcon("jimages/rambo.png"));
		 btn3.setIcon(new ImageIcon("jimages/joker.png"));
		 btn2.setIcon(new ImageIcon("jimages/alladin.png"));
		 btn4.setIcon(new ImageIcon("jimages/ender.png"));
		
		add(buttonpnl, BorderLayout.WEST);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.CENTER);
		setSize(1000, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Kino-Programm");
	}
	
	public static void main(String[] args) {
		new start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1) {
			this.remove(p2);
			this.add(p1, BorderLayout.CENTER);
		} else if(e.getSource() == btn2) {
			this.remove(p1);
			this.add(p2, BorderLayout.CENTER);
		}
	
			if(e.getSource() == date4) {
				
				view3 view3f = new view3();
	              view3f.setVisible(true);
	              view2f.setVisible(false);
			}

		{
			
		}
		
		this.repaint(); 
		this.revalidate();
	}
	}
	