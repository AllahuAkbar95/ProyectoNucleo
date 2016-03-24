package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VentanaNuevoUsuario extends JFrame implements ActionListener {
	
	private JCheckBox checkTipoCliente,checkTipoCampesino;
	private JLabel lblnombre, lbltelefono1,lbltelefono2, lbldocumento, lblusuario,
	lblcontrasena,lblim, lblcorreo;
	private JTextField txtnombre,txttelefono1,txttelefono2,txtdocumento,txtusuario
	,txtcorreo;
	private JPasswordField contrasena;
	private JPanel panelBotones, panel,panelcheck;
	private JButton btnCrearUsuario, btnAtras;
	private ButtonGroup grupoCheck;
	private ImageIcon img;
	
	
	//CONSTRUCTOR
	public VentanaNuevoUsuario(){
		
		setTitle("AgroLibre -- Creacion de Usuarios");
		setSize(1000, 5000);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
	    //TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	    Font letra2 = new Font( "Comic Sans MS",Font.PLAIN,12);
	    
	    //COLORES
	    Color verde= new Color(20, 60, 18);
		
	    checkTipoCliente=new JCheckBox("Cliente");
	    checkTipoCliente.addActionListener(this);
	    checkTipoCliente.setFont(letra);
	    checkTipoCliente.setSelected(false);
	    checkTipoCliente.setBackground(Color.WHITE);
	 
	    
	    checkTipoCampesino=new JCheckBox("Campesino");
	    checkTipoCampesino.addActionListener(this);
	    checkTipoCampesino.setFont(letra);
	    checkTipoCampesino.setSelected(false);
	    checkTipoCampesino.setBackground(Color.WHITE);
		
		grupoCheck= new ButtonGroup();
		grupoCheck.add(checkTipoCampesino);
		grupoCheck.add(checkTipoCliente);
		
		
		
		
		lblnombre=new JLabel("Nombre: ");
		lblnombre.setFont(letra);
		txtnombre=new JTextField(20);
		txtnombre.setFont(letra2);
		
		lbldocumento=new JLabel("Documento: ");
		lbldocumento.setFont(letra);
		txtdocumento= new JTextField(20);
		txtdocumento.setFont(letra2);
		
		lblusuario=new JLabel("Usuario: ");
		lblusuario.setFont(letra);
		txtusuario=new JTextField(10);
		txtusuario.setFont(letra2);
		
		lblcontrasena=new JLabel("Contraseña: ");
		lblcontrasena.setFont(letra);
		contrasena=new JPasswordField(20);
	
		
		lbltelefono1=new JLabel("Telefono 1: ");
		lbltelefono1.setFont(letra);
		txttelefono1=new JTextField(10);
		txttelefono1.setFont(letra2);
		
		
		lbltelefono2=new JLabel("Telefono 2: ");
		lbltelefono2.setFont(letra);
		txttelefono2=new JTextField(10);
		txttelefono2.setFont(letra2);
		
		lblcorreo=new JLabel("Correo: ");
		lblcorreo.setFont(letra);
		txtcorreo=new JTextField(10);
		txtcorreo.setFont(letra2);
	
		btnCrearUsuario=new JButton("CrearUsuario");
		btnCrearUsuario.addActionListener(this);
		btnCrearUsuario.setFont(letra);
		btnCrearUsuario.setBackground(verde);
		btnCrearUsuario.setForeground(Color.WHITE);
		
		btnAtras=new JButton("Atras ");
		btnAtras.addActionListener(this);
		btnAtras.setFont(letra);
		btnAtras.setBackground(verde);
		btnAtras.setForeground(Color.WHITE);
		
		img= new ImageIcon("logo2.jpg");
		lblim= new JLabel(img);
		
		panelcheck=new JPanel();
		panelcheck.setLayout(new GridBagLayout());
		GridBagConstraints gbc2=new GridBagConstraints();
		
		panelBotones= new JPanel();
		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		
		
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		gbc2.gridwidth = 1;
		gbc2.gridheight = 1;
		gbc2.weightx = 0.0;
		gbc2.weighty = 1.0;
		gbc2.insets = new Insets(3, 3, 3, 3);
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.anchor = GridBagConstraints.WEST;
		panelcheck.add(checkTipoCliente, gbc2);
		
		
		gbc2.gridx = 2;
		gbc2.gridy = 0;
		gbc2.gridwidth = 1;
		gbc2.gridheight = 1;
		gbc2.weightx = 0.0;
		gbc2.weighty = 1.0;
		gbc2.insets = new Insets(3, 3, 3, 3);
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.anchor = GridBagConstraints.WEST;
		panelcheck.add(checkTipoCampesino, gbc2);
		
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		gbc2.gridwidth = 1;
		gbc2.gridheight = 1;
		gbc2.weightx = 0.0;
		gbc2.weighty = 1.0;
		gbc2.insets = new Insets(3, 3, 3, 3);
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.anchor = GridBagConstraints.WEST;
		panelcheck.add(lblim, gbc2);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblnombre, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtnombre, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lbldocumento, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtdocumento, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblusuario, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtusuario, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblcontrasena, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(contrasena, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lbltelefono1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txttelefono1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lbltelefono2, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txttelefono2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblcorreo, gbc);
		
		
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtcorreo, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnCrearUsuario, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 9;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnAtras, gbc);
		
		panel=new JPanel();
		panel.add(panelcheck);
		panel.add(panelBotones);
		
		panelBotones.setBackground(Color.WHITE);
		panelcheck.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		
		//panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelBotones.setBorder(BorderFactory.createTitledBorder("Llene la informacion"));
		panelcheck.setBorder(BorderFactory.createTitledBorder("Seleccione Tipo de Usuario"));
		//panelcheck.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		
		
		this.add(panel);
		
		
	}

	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==checkTipoCliente){
			//btnCrearUsuario.setEnabled(false);
			txtcorreo.setEnabled(true);
		}
		else if(evento.getSource()==checkTipoCampesino){
			//btnCrearUsuario.setEnabled(true);
			txtcorreo.setEnabled(false);
			
		}
		
		if( evento.getSource()==btnAtras){
			VentanaPrincipal vp=new VentanaPrincipal();
			vp.setVisible(true);
			vp.pack();
			vp.setLocationRelativeTo(null);
			this.setVisible(false);
			
			
			
			
			
		}
	}

	
	//GETTERS AND SETTERS
	public JCheckBox getCheckTipoCliente() {
		return checkTipoCliente;
	}

	public void setCheckTipoCliente(JCheckBox checkTipoCliente) {
		this.checkTipoCliente = checkTipoCliente;
	}

	public JCheckBox getCheckTipoCampesino() {
		return checkTipoCampesino;
	}

	public void setCheckTipoCampesino(JCheckBox checkTipoCampesino) {
		this.checkTipoCampesino = checkTipoCampesino;
	}

	public JLabel getLblnombre() {
		return lblnombre;
	}

	public void setLblnombre(JLabel lblnombre) {
		this.lblnombre = lblnombre;
	}

	public JLabel getLbltelefono1() {
		return lbltelefono1;
	}

	public void setLbltelefono1(JLabel lbltelefono1) {
		this.lbltelefono1 = lbltelefono1;
	}

	public JLabel getLbltelefono2() {
		return lbltelefono2;
	}

	public void setLbltelefono2(JLabel lbltelefono2) {
		this.lbltelefono2 = lbltelefono2;
	}

	public JLabel getLbldocumento() {
		return lbldocumento;
	}

	public void setLbldocumento(JLabel lbldocumento) {
		this.lbldocumento = lbldocumento;
	}

	public JLabel getLblusuario() {
		return lblusuario;
	}

	public void setLblusuario(JLabel lblusuario) {
		this.lblusuario = lblusuario;
	}

	public JLabel getLblcontrasena() {
		return lblcontrasena;
	}

	public void setLblcontrasena(JLabel lblcontrasena) {
		this.lblcontrasena = lblcontrasena;
	}

	public JLabel getLblim() {
		return lblim;
	}

	public void setLblim(JLabel lblim) {
		this.lblim = lblim;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxttelefono1() {
		return txttelefono1;
	}

	public void setTxttelefono1(JTextField txttelefono1) {
		this.txttelefono1 = txttelefono1;
	}

	public JTextField getTxttelefono2() {
		return txttelefono2;
	}

	public void setTxttelefono2(JTextField txttelefono2) {
		this.txttelefono2 = txttelefono2;
	}

	public JTextField getTxtdocumento() {
		return txtdocumento;
	}

	public void setTxtdocumento(JTextField txtdocumento) {
		this.txtdocumento = txtdocumento;
	}

	public JTextField getTxtusuario() {
		return txtusuario;
	}

	public void setTxtusuario(JTextField txtusuario) {
		this.txtusuario = txtusuario;
	}

	public JPasswordField getContrasena() {
		return contrasena;
	}

	public void setContrasena(JPasswordField contrasena) {
		this.contrasena = contrasena;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanelcheck() {
		return panelcheck;
	}

	public void setPanelcheck(JPanel panelcheck) {
		this.panelcheck = panelcheck;
	}

	public JButton getBtnCrearUsuario() {
		return btnCrearUsuario;
	}

	public void setBtnCrearUsuario(JButton btnCrearUsuario) {
		this.btnCrearUsuario = btnCrearUsuario;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}

	public ButtonGroup getGrupoCheck() {
		return grupoCheck;
	}

	public void setGrupoCheck(ButtonGroup grupoCheck) {
		this.grupoCheck = grupoCheck;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public JLabel getLblcorreo() {
		return lblcorreo;
	}

	public void setLblcorreo(JLabel lblcorreo) {
		this.lblcorreo = lblcorreo;
	}

	public JTextField getTxtcorreo() {
		return txtcorreo;
	}

	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}
	
	
	

}
