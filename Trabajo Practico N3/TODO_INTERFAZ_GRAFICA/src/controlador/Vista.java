package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 412);
		URL urlIcon = getClass().getResource("/ing/32.png");
		ImageIcon icon = new ImageIcon(urlIcon);
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
	JLabel lblNewLabel = new JLabel("Mi Label");
	lblNewLabel.setBounds(100, 100, 50, 20);
	//equivalente a :
	lblNewLabel.setLocation(100, 100);
	lblNewLabel.setSize(50, 20);
	
	JLabel lbl = new JLabel("Mi label");
	lbl.setBounds(0, 0, 490, 301);
	String texto = lbl.getText();
	lbl.setText("No entiendo");
	lbl.setIcon(new ImageIcon(getClass().getResource("/ing/ungif.gif")));
	
	
	
ButtonGroup group = new ButtonGroup();
JRadioButton rdbtnA = new JRadioButton("A");
rdbtnA.setBounds(65, 308, 33, 23);
rdbtnA.setSelected(true);
contentPane.add(rdbtnA, BorderLayout.EAST);


JRadioButton rdbtnB = new JRadioButton("B");
rdbtnA.setBounds(110, 308, 39, 23);
rdbtnA.setSelected(true);
contentPane.add(rdbtnB, BorderLayout.CENTER);


JRadioButton rdbtnC = new JRadioButton("C");
rdbtnA.setBounds(151, 308, 49, 23);
rdbtnA.setSelected(true);
contentPane.add(rdbtnC, BorderLayout.WEST);

group.add(rdbtnA);
group.add(rdbtnB);
group.add(rdbtnC);



JComboBox<Dias> comboBox = new JComboBox<Dias>(Dias.values());

String[] items = {"Azul", "Rojo" , "Verde", "Amarillo", "Negro","Blanco"};
JComboBox<String> comboBox = new JComboBox<String>(items);
comboBox.setBounds(460, 312, 116, 22);
contentPane.add(comboBox);

comboBox.getSelectedIndex();
comboBox.getSelectedItem();

comboBox.addItem("Violeta");


textField = new JTextField();
textField.setHorizontalAlignment(SwingConstants.CENTER);
textField.setBounds(422, 309, 86, 20);
contentPane.add(textField);
text

	}

}
