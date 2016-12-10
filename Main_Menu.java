import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main_Menu extends JFrame {

	 JPanel Menu;
	 JTextField Username;
     JButton go;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu frame = new Main_Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 363);
		Menu = new JPanel();
		Menu.setBackground(Color.BLACK);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);
		
		JLabel lblContributers = new JLabel("Contributers:");
		lblContributers.setForeground(Color.GREEN);
		lblContributers.setFont(new Font("AR DESTINE", Font.BOLD, 16));
		lblContributers.setBounds(313, 103, 167, 23);
		Menu.add(lblContributers);
		
		JLabel lblUmangPahwa = new JLabel("Umang Pahwa");
		lblUmangPahwa.setForeground(Color.GREEN);
		lblUmangPahwa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblUmangPahwa.setBounds(385, 137, 95, 14);
		Menu.add(lblUmangPahwa);
		
		JLabel lblVarunKaore = new JLabel("Varun Kaore");
		lblVarunKaore.setForeground(Color.GREEN);
		lblVarunKaore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblVarunKaore.setBounds(385, 153, 80, 14);
		Menu.add(lblVarunKaore);
		
		JLabel lblDhananjayDutt = new JLabel("Dhananjay Dutt");
		lblDhananjayDutt.setForeground(Color.GREEN);
		lblDhananjayDutt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblDhananjayDutt.setBounds(385, 168, 99, 14);
		Menu.add(lblDhananjayDutt);
		
		JLabel lblVikramVenkatesh = new JLabel("Vikram Venkatesh");
		lblVikramVenkatesh.setForeground(Color.GREEN);
		lblVikramVenkatesh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblVikramVenkatesh.setBounds(385, 182, 109, 14);
		Menu.add(lblVikramVenkatesh);
		
		JLabel lblViditSahni = new JLabel("Vidit Sahni");
		lblViditSahni.setForeground(Color.GREEN);
		lblViditSahni.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblViditSahni.setBounds(385, 196, 99, 14);
		Menu.add(lblViditSahni);
		
		JLabel lblNewLabel = new JLabel("DEGENERATION-X");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("AR DESTINE", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(65, 11, 371, 52);
		Menu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Java Project");
		lblNewLabel_1.setFont(new Font("AR DESTINE", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(75, 56, 153, 23);
		Menu.add(lblNewLabel_1);
		
		JLabel lblBeatbox = new JLabel("BEAT");
		lblBeatbox.setFont(new Font("AR DESTINE", Font.PLAIN, 35));
		lblBeatbox.setForeground(Color.RED);
		lblBeatbox.setBounds(75, 125, 109, 23);
		Menu.add(lblBeatbox);
		
		JLabel lblGenerating = new JLabel("GENERATING");
		lblGenerating.setForeground(Color.RED);
		lblGenerating.setFont(new Font("AR DESTINE", Font.PLAIN, 35));
		lblGenerating.setBounds(28, 156, 212, 23);
		Menu.add(lblGenerating);
		
		JLabel lblSystem = new JLabel("SYSTEM");
		lblSystem.setForeground(Color.RED);
		lblSystem.setFont(new Font("AR DESTINE", Font.PLAIN, 35));
		lblSystem.setBounds(53, 184, 144, 23);
		Menu.add(lblSystem);
		
		JLabel lblEnterUsername = new JLabel("UserName:");
		lblEnterUsername.setForeground(Color.YELLOW);
		lblEnterUsername.setFont(new Font("AR DESTINE", Font.PLAIN, 20));
		lblEnterUsername.setBounds(88, 273, 118, 26);
		Menu.add(lblEnterUsername);
		
		Username = new JTextField();
		Username.setBounds(216, 279, 144, 20);
		Menu.add(Username);
		Username.setColumns(10);
		
		 go = new JButton("Go!");
		go.setBackground(Color.BLACK);
		go.setForeground(Color.BLUE);
		go.setFont(new Font("AR JULIAN", Font.PLAIN, 15));
		go.setBounds(385, 277, 67, 23);
		Menu.add(go);
		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			    if(go.isEnabled()){
				BeatBoxUltimate b=new BeatBoxUltimate();
			    b.s=Username.getText();
			    b.main(null);
			    dispose();
			    }
			  }
			
		});
	}
}
