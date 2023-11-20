package vista;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import controlador.Coordinador;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaOtra  implements ActionListener{

	public JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	JButton btnLimpia;
	JButton btnRestar;
	JButton btnSuma;
	JLabel lblResultado;
	JLabel lblNum1;
	JLabel lblNum2;
	private Coordinador miCoordinador;
	private JLabel lblResult;
	
	


	/**
	 * Create the application.
	 */
	public VentanaOtra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(206, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 473, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA MVC");
		//frame.setResizable(false);
		
		lblNum1 = new JLabel("num1");
		lblNum1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNum1.setBounds(35, 43, 49, 24);
		frame.getContentPane().add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtNum1.setBounds(98, 48, 96, 19);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		lblNum2 = new JLabel("num2");
		lblNum2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNum2.setBounds(267, 43, 49, 24);
		frame.getContentPane().add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtNum2.setColumns(10);
		txtNum2.setBounds(326, 47, 107, 19);
		frame.getContentPane().add(txtNum2);
		
	    lblResultado = new JLabel("RESULTADO:  ");
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResultado.setBounds(19, 112, 111, 35);
		frame.getContentPane().add(lblResultado);
		
		
		btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSuma.setBounds(35, 178, 85, 48);
		btnSuma.addActionListener(this);
		frame.getContentPane().add(btnSuma);
		
		btnRestar = new JButton("-");
		btnRestar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnRestar.setBounds(156, 178, 85, 48);
		btnRestar.addActionListener(this);
		frame.getContentPane().add(btnRestar);
		
		btnLimpia = new JButton("Salir");
		btnLimpia.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLimpia.setBounds(278, 178, 155, 48);
		btnLimpia.addActionListener(this);
		frame.getContentPane().add(btnLimpia);
		
		lblResult = new JLabel("0");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResult.setBounds(140, 115, 293, 24);
		frame.getContentPane().add(lblResult);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnSuma) {
			
			realizarSuma();
			

	  }
		
		if (e.getSource()==btnRestar) {
			miCoordinador.restar(txtNum1.getText(),txtNum2.getText());
		}
		
		if (e.getSource()==btnLimpia) {
			miCoordinador.salirDeLaVentanaOtra();
			
		}
		
	}

	private void realizarLimpieza() {
		txtNum1.setText("");
		txtNum2.setText("");
		lblResult.setText("");
	}

	private void realizarSuma() {
        String result= miCoordinador.sumar(txtNum1.getText(),txtNum2.getText());
        
        if (result.equals("error")) {
			  JOptionPane.showMessageDialog(null, "Ojo,error en el ingreso de datos");
			  lblResult.setText("error en el ingreso de datos");
		}else {
			lblResult.setText(result);
		} 
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;	
	}

	public void asignarResta(String resta) {
		lblResult.setText(resta);
	}


}
