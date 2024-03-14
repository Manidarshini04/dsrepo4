package employee;
//hkjcgf
//vjkfhu
//mjgu
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class metroticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setcolor
		
		JLabel lblNewLabel = new JLabel("METRO TICKET");
		lblNewLabel.setBounds(140, 209, 191, -221);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setBounds(103, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("source");
		lblNewLabel_3.setBounds(103, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("destination");
		lblNewLabel_4.setBounds(103, 149, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("number of tickets");
		lblNewLabel_5.setBounds(103, 192, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"miyapur", "kukatpally", "jntu", "kphb"}));
		cb2.setBounds(214, 145, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"kphb", "miyapur", "jntu", "kukatpally", "L.B.Nagar"}));
		cb1.setBounds(214, 91, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		cb3.setBounds(224, 188, 76, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
						if(source.equals(destination))
						{
							JOptionPane.showMessageDialog(btnNewButton, "please check stations");
						}
						else
						{
							int bill=nt*45;
							JOptionPane.showMessageDialog(btnNewButton,"NAME"+name+"\n SOURCE"+source+"\n destination "+destination+"\n number of tickets "+tickets+"\n amount "+bill );
						}
			}
		});
		btnNewButton.setBounds(211, 232, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(214, 63, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("metro tickets");
		lblNewLabel_1.setBounds(194, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\stock-photo-hyderabad-metro-train-which-is-on-platform-october-hyderabad-telangana-india-1893387805.jpg"));
		lblNewLabel_6.setBounds(0, 0, 622, 362);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
