package calculadoraErrores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc_Error {

	private JFrame frmPropagacinDeErrores;
	private JTextField txtValor1;
	private JTextField txtError1;
	private JTextField txtValor2;
	private JTextField txtError2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_Error window = new Calc_Error();
					window.frmPropagacinDeErrores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc_Error() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPropagacinDeErrores = new JFrame();
		frmPropagacinDeErrores.setTitle("Propagaci\u00F3n de Errores");
		frmPropagacinDeErrores.setBounds(100, 100, 600, 300);
		frmPropagacinDeErrores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPropagacinDeErrores.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 255));
		panel.setBounds(0, 0, 592, 273);
		frmPropagacinDeErrores.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblMen = new JLabel("Men\u00FA:");
		lblMen.setBounds(10, 11, 44, 21);
		lblMen.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMen.setForeground(Color.WHITE);
		panel.add(lblMen);

		JRadioButton ErrSuma = new JRadioButton("Error en Suma");
		ErrSuma.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 12));
		ErrSuma.setForeground(new Color(255, 255, 255));
		ErrSuma.setBackground(new Color(51, 51, 255));
		ErrSuma.setBounds(10, 39, 152, 23);
		panel.add(ErrSuma);

		JRadioButton ErrResta = new JRadioButton("Error en Resta");
		ErrResta.setBackground(new Color(51, 51, 255));
		ErrResta.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 12));
		ErrResta.setForeground(new Color(255, 255, 255));
		ErrResta.setBounds(10, 65, 152, 23);
		panel.add(ErrResta);

		JRadioButton ErrMulti = new JRadioButton("Error en Multiplicaci\u00F3n");
		ErrMulti.setBackground(new Color(51, 51, 255));
		ErrMulti.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 12));
		ErrMulti.setForeground(new Color(255, 255, 255));
		ErrMulti.setBounds(10, 91, 152, 23);
		panel.add(ErrMulti);

		JRadioButton ErrDiv = new JRadioButton("Error en Divisi\u00F3n");
		ErrDiv.setBackground(new Color(51, 51, 255));
		ErrDiv.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 12));
		ErrDiv.setForeground(new Color(255, 255, 255));
		ErrDiv.setBounds(10, 117, 152, 23);
		panel.add(ErrDiv);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblValor.setForeground(new Color(255, 255, 255));
		lblValor.setBounds(230, 11, 46, 14);
		panel.add(lblValor);

		JLabel lblError = new JLabel("Error");
		lblError.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblError.setForeground(new Color(255, 255, 255));
		lblError.setBounds(368, 11, 46, 14);
		panel.add(lblError);

		txtValor1 = new JTextField();
		txtValor1.setBounds(230, 36, 104, 20);
		panel.add(txtValor1);
		txtValor1.setColumns(10);

		txtError1 = new JTextField();
		txtError1.setBounds(368, 36, 96, 20);
		panel.add(txtError1);
		txtError1.setColumns(10);

		JTextArea AreatxtResultados = new JTextArea();
		AreatxtResultados.setText("Resultados:");
		AreatxtResultados.setBounds(230, 161, 352, 101);
		panel.add(AreatxtResultados);

		JLabel label = new JLabel("+/-");
		label.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(344, 42, 23, 14);
		panel.add(label);

		JLabel label_1 = new JLabel("Valor");
		label_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(230, 69, 46, 14);
		panel.add(label_1);

		txtValor2 = new JTextField();
		txtValor2.setColumns(10);
		txtValor2.setBounds(230, 94, 104, 20);
		panel.add(txtValor2);

		JLabel label_2 = new JLabel("+/-");
		label_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(344, 97, 23, 14);
		panel.add(label_2);

		JLabel label_3 = new JLabel("Error");
		label_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(368, 69, 46, 14);
		panel.add(label_3);

		txtError2 = new JTextField();
		txtError2.setColumns(10);
		txtError2.setBounds(368, 94, 96, 20);
		panel.add(txtError2);

		JButton btnCalcularError = new JButton("Calcular Error");
		btnCalcularError.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Valor1 = 0, Valor2 = 0, Error1 = 0, Error2 = 0;
				if (ErrResta.isSelected() || ErrSuma.isSelected()) {
					Valor1 = Double.parseDouble(txtValor1.getText());
					Error1 = Double.parseDouble(txtError1.getText());
					Valor2 = Double.parseDouble(txtValor2.getText());
					Error2 = Double.parseDouble(txtError2.getText());
					// Calculo de Error
					String cadenaResultado = "";
					cadenaResultado = "Resultados: \n" + "Valor Total: " + (Valor1 + Valor2) + "\n" + "Error Total: "
							+ (Error1 + Error2);
					AreatxtResultados.setText(cadenaResultado);
				} else if (ErrMulti.isSelected()) {
					Valor1 = Double.parseDouble(txtValor1.getText());
					Error1 = Double.parseDouble(txtError1.getText());
					Valor2 = Double.parseDouble(txtValor2.getText());
					Error2 = Double.parseDouble(txtError2.getText());
					// Calculo de Error
					String cadenaResultado = "";
					cadenaResultado = "Resultados: \n" + "Valor Total: " + (Valor1 * Valor2) + "\n" + "Error Total: "
							+ ((Error1 / Valor1) + (Error2 / Valor2));
					AreatxtResultados.setText(cadenaResultado);
				} else {
					try {
						Valor1 = Double.parseDouble(txtValor1.getText());
						Error1 = Double.parseDouble(txtError1.getText());
						Valor2 = Double.parseDouble(txtValor2.getText());
						Error2 = Double.parseDouble(txtError2.getText());
						// Calculo de Error
						String cadenaResultado = "";
						cadenaResultado = "Resultados: \n" + "Valor Total: " + (Valor1 / Valor2) + "\n" + "Error Total: "
								+ ((Error1 / Valor1) + (Error2 / Valor2));
						AreatxtResultados.setText(cadenaResultado);
					} catch (Exception error) {
						JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\nVerifica que los datos ingresados, sean correctos.");
					}
				}
			}
		});
		btnCalcularError.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCalcularError.setForeground(new Color(255, 255, 255));
		btnCalcularError.setBackground(new Color(0, 0, 0));
		btnCalcularError.setBounds(479, 64, 103, 25);
		panel.add(btnCalcularError);
	}
}
