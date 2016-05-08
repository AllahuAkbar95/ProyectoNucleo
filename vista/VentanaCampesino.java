package vista;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ProyectTests.Tests.Campesino;
import ProyectTests.Tests.Persona;
import conexion.ConexionSQL;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	private JLabel lblusuario, lblcontrasena, lblim;
	private JTextField txtusuario;
	private JButton btnIngresar, btnSalir, btnCrearUsuario;
	private JPanel panelBotones ,panelImagen ,panelprin;
	private JPasswordField passcontrasena;
	private ImageIcon imagen;
	private ConexionSQL conexion = new ConexionSQL();
	
	
	
	//Constructor
	public VentanaPrincipal(){
		
		setTitle(" AGROLIBRE -- inicio de sesion");
		//setSize(450, 200);//ancho- largo
	    setResizable(false);
		super.setSize(getPreferredSize());
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
		
	    //TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	    Font letra2 = new Font( "Comic Sans MS",Font.PLAIN,12);
	    
	    //COLORES
	    Color verde= new Color(20, 60, 18);
	    
	    
		lblusuario= new JLabel("Usuario: ");
		lblusuario.setFont(letra);
		
        txtusuario= new JTextField(10);
        txtusuario.setFont(letra2);
        
        lblcontrasena= new JLabel("Contraseña: ");
        lblcontrasena.setFont(letra);
        
        passcontrasena= new JPasswordField(10);
        
        
        btnIngresar= new JButton("Ingresar ");
        btnIngresar.addActionListener(this);
        btnIngresar.setFont(letra);
        btnIngresar.setBackground(verde);
        btnIngresar.setForeground(Color.WHITE);
        
        btnSalir= new JButton("Salir ");
        btnSalir.addActionListener(this);
        btnSalir.setFont(letra);
        btnSalir.setBackground(verde);
        btnSalir.setForeground(Color.WHITE);
       
        
        
        btnCrearUsuario= new JButton("Crear Usuario  ");
        btnCrearUsuario.addActionListener(this);
        btnCrearUsuario.setFont(letra);
        btnCrearUsuario.setBackground(verde);
        btnCrearUsuario.setForeground(Color.WHITE);

        
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		panelImagen = new JPanel();
		panelImagen.setLayout(new GridBagLayout());
		
		
		
		GridBagConstraints gbc2 = new GridBagConstraints();
		
		
		imagen= new ImageIcon("logo2.jpg");
		lblim= new JLabel(imagen);
		
		

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblusuario, gbc);


		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(txtusuario, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(lblcontrasena, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(passcontrasena, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(btnIngresar, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(btnSalir, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelBotones.add(btnCrearUsuario, gbc);
		
	//IMAGEN
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(7, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panelImagen.add(lblim, gbc2);
		
		panelBotones.setBackground(null);	

		panelprin =new JPanel();
		panelprin.add(panelImagen);
		panelprin.add(panelBotones);
		panelprin.setBackground(Color.WHITE);
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelImagen.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		
		this.add(panelprin);
		


	}
	

	
	public void actionPerformed(ActionEvent evento) {
		
if(evento.getSource()==btnIngresar){
			
			Persona usuario = conexion.iniciarUsuario(txtusuario.getText(), passcontrasena.getText());
			
			if(usuario != null)
			{
				if(usuario.getTipoUsurio().charAt(0) == 'C')
				{
					Campesino camp = new Campesino(usuario.getDocumento(), usuario.getNombre(), usuario.getTel1(), usuario.getTel2(), usuario.getUsuario(), usuario.getContrasenia(), usuario.getCorreo(), usuario.getDireccion(), usuario.getListaProductos(), usuario.getTipoUsurio().charAt(0));
				//para mirar la ventana de campesino
				VentanaCampesino vc=new VentanaCampesino(camp);
				vc.setVisible(true);
				vc.pack(); //en caso de que se haga grande
				vc.setLocationRelativeTo(null);
				this.setVisible(false);
				}
				else if(usuario.getTipoUsurio().charAt(0) == 'U')
				{
					//para mirar la ventana de cliente
					VentanaCliente vcl=new VentanaCliente();
					vcl.setVisible(true);
					vcl.setLocationRelativeTo(null);
					this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
				}
				
				
			}else{
				JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
			}
			
			
			
		
		}
		
		if(evento.getSource()==btnCrearUsuario){
			
			VentanaNuevoUsuario vnu=new VentanaNuevoUsuario();
			vnu.setVisible(true);
			vnu.pack();
			vnu.setLocationRelativeTo(null);
			this.setVisible(false);

		}
		
		if(evento.getSource()==btnSalir){
			System.exit(0);
		}
		
	}


	public static void main(String[] args) {
		
		VentanaPrincipal vp= new VentanaPrincipal();
		vp.pack();
		vp.setVisible(true);
		vp.setLocationRelativeTo(null);

	}

//METODOS GETTERS AND SETTERS
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


	public JTextField getTxtusuario() {
		return txtusuario;
	}


	public void setTxtusuario(JTextField txtusuario) {
		this.txtusuario = txtusuario;
	}


	public JButton getBtnIngresar() {
		return btnIngresar;
	}


	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}


	public JButton getBtnSalir() {
		return btnSalir;
	}


	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}


	public JButton getBtnCrearUsuario() {
		return btnCrearUsuario;
	}


	public void setBtnCrearUsuario(JButton btnCrearUsuario) {
		this.btnCrearUsuario = btnCrearUsuario;
	}


	public JPanel getPanelBotones() {
		return panelBotones;
	}


	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}


	public JPasswordField getPasscontrasena() {
		return passcontrasena;
	}


	public void setPasscontrasena(JPasswordField passcontrasena) {
		this.passcontrasena = passcontrasena;
	}
	
	
	


}
