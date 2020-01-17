package TicTacToe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class TicTacToe 
{
	private JFrame frame;
	private String startGame = "X";
	private   int xCount = 0;
	private  int oCount = 0;
	private  int tieCount = 0;
       
        private  boolean win = false;
	private JButton sq1=new JButton("");
	private JButton sq2=new JButton("");
	private JButton sq3=new JButton("");
	private JButton sq4=new JButton("");
	private JButton sq5=new JButton("");
	private JButton sq6=new JButton("");
	private JButton sq7=new JButton("");
	private JButton sq8=new JButton("");
	private JButton sq9=new JButton("");
	private JTextField tieScore;
	private JTextField oScore;
	private JTextField xScore;
	public int [] check0={0,0,0,0,0,0,0,0,0};
       
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public TicTacToe() 
	{
		initializeboard();
	}
	
	public void score()
	{
	//	xCount++;
	//	oCount++;
	//	tieCount++;
		xScore.setText(String.valueOf(xCount));
		oScore.setText(String.valueOf(oCount));	
		tieScore.setText(String.valueOf(tieCount));
	}
	
	public void reset()
        {
       
                win=false;
                	
				sq1.setText("");
				sq2.setText("");
				sq3.setText("");
				sq4.setText("");
				sq5.setText("");
				sq6.setText("");
				sq7.setText("");
				sq8.setText("");
				sq9.setText("");
                               for(int i=0;i<9;i++)
                               {
                                   check0[i]=0;
                               }
                                
                                
//                                sq1.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent e) 
//			{       
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq1.setText(startGame);
//					sq1.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq1.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O")) 
//				{sq1.setText(startGame);
//					sq1.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq1.removeActionListener(this);
//				}				
//				endGame();
//			}
//		});
//                                sq2.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq2.setText(startGame);
//					sq2.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq2.removeActionListener(this);	
//				}			
//				else if (startGame.equalsIgnoreCase("O"))
//				{sq2.setText(startGame);
//					sq2.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq2.removeActionListener(this);
//				}
//			
//			}
//		});
//                                sq3.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq3.setText(startGame);
//					sq3.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq3.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O")) 
//				{sq3.setText(startGame);
//					sq3.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq3.removeActionListener(this);
//				}
//				endGame();
//			}
//		});
//                                sq4.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq4.setText(startGame);
//					sq4.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq4.removeActionListener(this);
//				}			
//				else if  (startGame.equalsIgnoreCase("O"))
//				{sq4.setText(startGame);
//					sq4.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq4.removeActionListener(this);
//				}	
//				endGame();
//			}
//		});
//                                
//		sq5.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq5.setText(startGame);
//					sq5.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq5.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O"))
//				{sq5.setText(startGame);
//					sq5.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq5.removeActionListener(this);
//				}	
//				endGame();
//			}
//		});
//                sq6.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq6.setText(startGame);
//					sq6.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq6.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O"))
//				{sq6.setText(startGame);
//					sq6.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq6.removeActionListener(this);
//				}	
//				endGame();
//			}
//		});
//                sq7.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq7.setText(startGame);
//					sq7.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq7.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O"))
//				{sq7.setText(startGame);
//					sq7.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq7.removeActionListener(this);
//				}	
//				endGame();
//			}
//		});
//                sq8.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{ 
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq8.setText(startGame);
//					sq8.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq8.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O")) 
//				{sq8.setText(startGame);
//					sq8.setForeground(new Color(255, 105, 180));
//					startGame = "X";
//					sq8.removeActionListener(this);
//				}
//				endGame();
//			}
//		});
//                sq9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//                             
//				
//				if (startGame.equalsIgnoreCase("X"))
//				{sq9.setText(startGame);
//					sq9.setForeground(new Color(138, 43, 226));
//					startGame = "O";
//					sq9.removeActionListener(this);
//				}			
//				else if (startGame.equalsIgnoreCase("O")) 
//				{sq9.setText(startGame);
//					sq9.setForeground(new Color(255, 105, 180));
//					sq9.removeActionListener(this);
//				}
//				endGame();
//			}
//		});
//                                
               
               
        }
	public void endGame()
	{
//		String square1 = Player.getText();
//		
//		if (square1 == "0")
//		{
//			xCount++;
//			oCount++;
//			tieCount++;
//			score();
//		}
//	}
            System.out.println(startGame);
		String square1 = sq1.getText();
		String square2 = sq2.getText();
		String square3 = sq3.getText();
		String square4 = sq4.getText();
		String square5 = sq5.getText();
		String square6 = sq6.getText();
		String square7 = sq7.getText();
		String square8 = sq8.getText();
		String square9 = sq9.getText();

		if (square1.equalsIgnoreCase("X") && square2.equalsIgnoreCase("X") && square3.equalsIgnoreCase("X"))
		{win=true;
                
			xCount++;
			score();
                        JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square4 == ("X") && square5 == ("X") && square6 == ("X"))
		{win=true;
                 
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square7 == ("X") && square8 == ("X") && square9 == ("X"))
		{win=true;
                 
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square1 == ("X") && square4 == ("X") && square7 == ("X"))
		{       win=true;
                        
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square2 == ("X") && square5 == ("X") && square8 == ("X"))
		{       win=true;
                        
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square3 == ("X") && square6 == ("X") && square9 == ("X"))
		{       win=true;
                        
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square1 == ("X") && square5 == ("X") && square9 == ("X"))
		{       win=true;
                        
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square3 == ("X") && square5 == ("X") && square7 == ("X"))
		{win=true;
                 
			xCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "X win");
                        reset();
		}else
		if (square1 == ("O") && square2 == ("O") && square3 == ("O"))
		{win=true;
                 
			oCount++;
			score();
                          JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square4 == ("O") && square5 == ("O") && square6 == ("O"))
		{win=true;
                 
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square7 == ("O") && square8 == ("O") && square9 == ("O"))
		{win=true;
                 
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square1 == ("O") && square4 == ("O") && square7 == ("O"))
		{       win=true;
                        
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square2 == ("O") && square5 == ("O") && square8 == ("O"))
		{   win=true;
                    
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square3 == ("O") && square6 == ("O") && square9 == ("O"))
		{win=true;
                 
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square1 == ("O") && square5 == ("O") && square9 == ("O"))
		{win=true;
                
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if (square3 == ("O") && square5 == ("O") && square7 == ("O"))
		{       win=true;
                       
			oCount++;
			score();
                         JOptionPane.showMessageDialog(frame, "O win");
                        reset();
		}else
		if(square1 !=("")&&square2 !=("")&&square3 !=("")&&square4 !=("")&&square5 !=("")&&square6 !=("")&&square7 !=("")&&square8 !=("")&&square9 !=("")&&win==false)
		{
			tieCount++;
			score();
                          JOptionPane.showMessageDialog(frame, "Tie");
                        reset();
		}
	}
//		int [][]board =
//			{{0, 1, 2},
//			 {3, 4, 5},
//			 {6, 7, 8},
//			 {0, 3, 6},
//			 {1, 4, 7},
//			 {2, 5, 8},
//			 {0, 4, 8},
//			 {2, 4, 6}};
//		for(int i = 0; i < board.length; i++)
//		{
//			for(int j = 0; j < board[i].length; j++)
//			{
//				int a[]	
//			}
//		}
//			   function checkWinner(squares) {
//		  const lines = [
//		                 [0, 1, 2],
//		                 [3, 4, 5],
//		                 [6, 7, 8],
//		                 [0, 3, 6],
//		                 [1, 4, 7],
//		                 [2, 5, 8],
//		                 [0, 4, 8],
//		                 [2, 4, 6]
//		               ];
//		               for (let i = 0; i < lines.length; i++) {
//		                 const [a, b, c] = lines[i];
//		                 if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
//		                   return squares[a];
//		                 }
//		               }
//		               return null;
//		             }
//	}
	
	private void initializeboard() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(147, 112, 219), 3));
		panel.setBackground(new Color(147, 112, 219));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 130, 238));
		panel_1.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(5, 0));
		
		
		sq1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{      
				
				if (startGame.equalsIgnoreCase("X")&&check0[0]==0)
				{check0[0]=1;sq1.setText(startGame);
					sq1.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq1.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[0]==0) 
				{check0[0]=1;sq1.setText(startGame);
					sq1.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq1.setEnabled(false);
				}				
				endGame();
			}
		});
		sq1.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_1.add(sq1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 130, 238));
		panel_2.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(5, 0));
		
		
		sq2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[1]==0)
				{check0[1]=1;sq2.setText(startGame);
					sq2.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq2.setEnabled(false);	
				}			
				if (startGame.equalsIgnoreCase("O")&&check0[1]==0)
				{check0[1]=1;sq2.setText(startGame);
					sq2.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq2.setEnabled(false);
				}
			endGame();
			}
		});
		sq2.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_2.add(sq2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(238, 130, 238));
		panel_3.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(5, 0));
		
		
		sq3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[2]==0)
				{check0[2]=1;sq3.setText(startGame);
					sq3.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq3.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[2]==0) 
				{check0[2]=1;sq3.setText(startGame);
					sq3.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq3.setEnabled(false);
				}
				endGame();
			}
		});
		sq3.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_3.add(sq3, BorderLayout.CENTER);
		
		JPanel panel_exit = new JPanel();
		panel_exit.setBackground(new Color(238, 130, 238));
		panel_exit.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_exit);
		panel_exit.setLayout(new BorderLayout(5, 0));
		
		JButton Exit = new JButton("");
		panel_exit.add(Exit, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(238, 130, 238));
		panel_4.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(5, 0));
		
		
		sq4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[3]==0)
				{check0[3]=1;sq4.setText(startGame);
					sq4.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq4.setEnabled(false);
				}			
				else if  (startGame.equalsIgnoreCase("O")&&check0[3]==0)
				{check0[3]=1;sq4.setText(startGame);
					sq4.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq4.setEnabled(false);
				}	
				endGame();
			}
		});
		sq4.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_4.add(sq4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(238, 130, 238));
		panel_5.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(5, 0));
		
		
		sq5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[4]==0)
				{check0[4]=1;sq5.setText(startGame);
					sq5.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq5.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[4]==0)
				{check0[4]=1;sq5.setText(startGame);
					sq5.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq5.setEnabled(false);
				}	
				endGame();
			}
		});
		sq5.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_5.add(sq5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(238, 130, 238));
		panel_6.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(5, 0));
		
		
		sq6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[5]==0)
				{check0[5]=1;sq6.setText(startGame);
					sq6.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq6.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[5]==0)
				{check0[5]=1;sq6.setText(startGame);
					sq6.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq6.setEnabled(false);
				}	
				endGame();
			}
		});
		sq6.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_6.add(sq6, BorderLayout.CENTER);
		
		JPanel panel_reset = new JPanel();
		panel_reset.setBackground(new Color(238, 130, 238));
		panel_reset.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_reset);
		panel_reset.setLayout(new BorderLayout(5, 0));
		
		JButton Reset = new JButton("Reset");
		Reset.setFont(new Font("STIXNonUnicode", Font.BOLD, 25));
		panel_reset.add(Reset, BorderLayout.CENTER);
	
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(238, 130, 238));
		panel_7.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(5, 0));
		
		
		sq7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[6]==0)
				{check0[6]=1;sq7.setText(startGame);
					sq7.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq7.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[6]==0)
				{check0[6]=1;sq7.setText(startGame);
					sq7.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq7.setEnabled(false);
				}	
				endGame();
			}
		});
		sq7.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_7.add(sq7, BorderLayout.CENTER);
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(238, 130, 238));
		panel_8.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(5, 0));
		
		
		sq8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				
				if (startGame.equalsIgnoreCase("X")&&check0[7]==0)
				{check0[7]=1;sq8.setText(startGame);
					sq8.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq8.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[7]==0) 
				{check0[7]=1;sq8.setText(startGame);
					sq8.setForeground(new Color(255, 105, 180));
					startGame = "X";
//					sq8.setEnabled(false);
				}
				endGame();
			}
		});
		sq8.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		panel_8.add(sq8, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(238, 130, 238));
		panel_9.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(5, 0));

		
		sq9.setFont(new Font("STIXNonUnicode", Font.BOLD, 99));
		sq9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             
				
				if (startGame.equalsIgnoreCase("X")&&check0[8]==0)
				{check0[8]=1;sq9.setText(startGame);
					sq9.setForeground(new Color(138, 43, 226));
					startGame = "O";
//					sq9.setEnabled(false);
				}			
				else if (startGame.equalsIgnoreCase("O")&&check0[8]==0) 
				{check0[8]=1;sq9.setText(startGame);
					sq9.setForeground(new Color(255, 105, 180));
                                        startGame = "X";
//					sq9.setEnabled(false);
				}
				endGame();
			}
		});
		panel_9.add(sq9, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(238, 130, 238));
		panel_12.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton button_10 = new JButton("Exit");
               
                button_10.setFont(new Font("Arial", Font.BOLD, 35));
                button_10.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       System.exit(0);
                    }
                });
		panel_12.add(button_10, BorderLayout.CENTER);
		
		JPanel scoretrack1 = new JPanel();
		scoretrack1.setBackground(new Color(238, 130, 238));
		scoretrack1.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(scoretrack1);
		scoretrack1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(147, 112, 219), new Color(255, 192, 203), new Color(106, 90, 205), new Color(105, 105, 105)));
		panel_10.setBackground(new Color(255, 255, 255));
		scoretrack1.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblX = new JLabel("X.");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Courier New", Font.PLAIN, 35));
		panel_10.add(lblX, BorderLayout.NORTH);
		
		xScore = new JTextField();
		xScore.setEditable(false);
		xScore.setText("0");
		xScore.setHorizontalAlignment(SwingConstants.CENTER);
		xScore.setFont(new Font("Arial", Font.BOLD, 95));
		xScore.setColumns(10);
		xScore.setBackground(Color.WHITE);
		panel_10.add(xScore, BorderLayout.CENTER);

		
		JPanel tiescoretrack = new JPanel();
		tiescoretrack.setBackground(new Color(238, 130, 238));
		tiescoretrack.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(tiescoretrack);
		tiescoretrack.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(147, 112, 219), new Color(255, 192, 203), new Color(106, 90, 205), new Color(105, 105, 105)));
		panel_13.setBackground(new Color(255, 255, 255));
		tiescoretrack.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("TIE");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel, BorderLayout.NORTH);
		
		tieScore = new JTextField();
		tieScore.setEditable(false);
		tieScore.setBackground(new Color(255, 255, 255));
		tieScore.setFont(new Font("Arial", Font.BOLD, 95));
		tieScore.setText("0");
		tieScore.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(tieScore, BorderLayout.CENTER);
		tieScore.setColumns(10);
		
		
		JPanel scoretrack2 = new JPanel();
		scoretrack2.setBackground(new Color(238, 130, 238));
		scoretrack2.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(scoretrack2);
		scoretrack2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(147, 112, 219), new Color(255, 192, 203), new Color(106, 90, 205), new Color(105, 105, 105)));
		panel_11.setBackground(new Color(255, 255, 255));
		scoretrack2.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblO = new JLabel("O.");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Courier New", Font.PLAIN, 35));
		panel_11.add(lblO, BorderLayout.NORTH);
		
		oScore = new JTextField();
		oScore.setEditable(false);
		oScore.setFont(new Font("Arial", Font.BOLD, 95));
		oScore.setHorizontalAlignment(SwingConstants.CENTER);
		oScore.setText("0");
		panel_11.add(oScore, BorderLayout.CENTER);
		oScore.setColumns(10);
		
		
		JPanel panel_player = new JPanel();
		panel_player.setBackground(new Color(238, 130, 238));
		panel_player.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		panel.add(panel_player);
		panel_player.setLayout(new BorderLayout(5, 0));
		
		JButton Player = new JButton("");
		Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_player.add(Player, BorderLayout.CENTER);
		Reset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				reset();
			}
		});
	}
}


