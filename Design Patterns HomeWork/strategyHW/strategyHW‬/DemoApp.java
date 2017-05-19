package strategyHW‬;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoApp {

	private JFrame frame;
	private String sumbitNumber="";
	private String sumbitEmail="";
	private FieldEvaluator fieldEvaluator = new FieldEvaluator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DemoApp window = new DemoApp();
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
	public DemoApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField numberTextField = new TextField();
		numberTextField.setFont(new Font("Dialog", Font.PLAIN, 13));
		numberTextField.setBounds(152, 57, 243, 19);
		frame.getContentPane().add(numberTextField);
		
		Label NumberLabel = new Label("Enter Number");
		NumberLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		NumberLabel.setBounds(10, 57, 107, 19);
		frame.getContentPane().add(NumberLabel);
		
		Label emailLabel = new Label("Enter Email");
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		emailLabel.setBounds(10, 117, 107, 19);
		frame.getContentPane().add(emailLabel);
		
		TextField emailTextField = new TextField();
		emailTextField.setFont(new Font("Dialog", Font.PLAIN, 13));
		emailTextField.setBounds(152, 117, 243, 19);
		frame.getContentPane().add(emailTextField);
		
		Button okButton = new Button("OK");
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fieldEvaluator.evaluate(numberTextField.getText(), emailTextField.getText());
			}
		});
		okButton.setFont(new Font("Dialog", Font.PLAIN, 13));
		okButton.setBounds(152, 200, 86, 30);
		frame.getContentPane().add(okButton);
	}
}
