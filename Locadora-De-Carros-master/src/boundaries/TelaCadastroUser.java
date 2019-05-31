package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.UsuarioControl;
import entities.Usuario;

public class TelaCadastroUser implements ActionListener {

	JPanel painelCadUser = new JPanel ();
	JLabel lblNome = new JLabel("Nome");
	JLabel lblCpf = new JLabel("CPF");
	JLabel lblEnd = new JLabel("Endere�o");
	JLabel lblNum = new JLabel("N�mero");
	JLabel lblTel = new JLabel("Telefone");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme a senha");
	JTextField txtNome;
	JTextField txtCpf;
	JTextField txtEnd;
	JTextField txtTel;
	JTextField txtSenha;
	JTextField txtNum;
	JTextField txtConfSenha = new JTextField();
	JButton btConfirmaCad = new JButton("Confirmar");
	JLabel lblEmail = new JLabel("Email");
	 JTextField txtEmail = new JTextField();
	JLabel lblCadUser = new JLabel("Cadastro de Usu\u00E1rios");
	
	public TelaCadastroUser() {
		txtEmail.setBounds(101, 220, 320, 20);
		txtEmail.setColumns(10);
		
		
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblNome);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblCpf);
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblEnd);
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblNum);
		lblTel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblTel);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblSenha);
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelCadUser.add(lblConfSenha);
		
		lblNome.setBounds(45, 160, 46, 14);
		lblCpf.setBounds(45, 280, 46, 14);
		lblEnd.setBounds(45, 340, 70, 14);
		lblNum.setBounds(501, 340, 65, 14);
		lblTel.setBounds(45, 400, 70, 14);
		lblSenha.setBounds(45, 460, 46, 14);
		lblConfSenha.setBounds(45, 520, 135, 14);
		
		
		painelCadUser.setLayout(null);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(45, 220, 98, 31);
		painelCadUser.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(101, 160, 320, 20);
		painelCadUser.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(101, 280, 320, 20);
		painelCadUser.add(txtCpf);
		
		txtEnd = new JTextField();
		txtEnd.setColumns(10);
		txtEnd.setBounds(125, 340, 320, 20);
		painelCadUser.add(txtEnd);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(126, 400, 320, 20);
		painelCadUser.add(txtTel);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(101, 460, 320, 20);
		painelCadUser.add(txtSenha);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(576, 340, 86, 20);
		painelCadUser.add(txtNum);
		txtConfSenha.setColumns(10);
		txtConfSenha.setBounds(198, 519, 248, 20);
		
		painelCadUser.add(txtConfSenha);
		
		btConfirmaCad.setBounds(548, 518, 114, 23);
		btConfirmaCad.addActionListener(this);
		painelCadUser.add(btConfirmaCad);
		
		painelCadUser.add(txtEmail);
		lblCadUser.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCadUser.setBounds(301, 27, 184, 55);
		
		painelCadUser.add(lblCadUser);
		
	}
	Usuario user = new Usuario ();
	UsuarioControl userControl = new UsuarioControl();
	public void UserToBoundary () {
	
		
		user.setNome(txtNome.getText());
		user.setCpf(txtCpf.getText());
		user.setEmail(txtEmail.getText());
		user.setEndereco(txtEnd.getText());
		user.setCasaNum(txtNum.getText());
		user.setTelefone(txtTel.getText());
		user.setSenha(txtSenha.getText());
	
		txtNome.setText(null);
		txtCpf.setText(null);
		txtEmail.setText(null);
		txtEnd.setText(null);
		txtNum.setText(null);
		txtTel.setText(null);
		txtSenha.setText(null);
		txtConfSenha.setText(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if (e.getSource() == btConfirmaCad) {
					
			UserToBoundary();	
			userControl.CadastraUser(user);
			
			
		}
		
		
	}
}
