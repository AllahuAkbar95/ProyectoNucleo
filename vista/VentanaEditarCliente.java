package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ProyectTests.Tests.Cliente;
import ProyectTests.Tests.Validar;
import conexion.ConexionSQL;

public class VentanaEditarCliente extends JFrame implements ActionListener {
		
		private JLabel lblnombre, lbltelefono1,lbltelefono2,
		lblcontrasena, lblcorreo, lbldireccion;
		private JTextField txtnombre,txttelefono1,txttelefono2
		,txtcorreo,txtdireccion;
		private JPasswordField contrasena;
		private JButton btnAceptar, btnCancelar;
		private JPanel panelBotones, panel;
		private Cliente usuario;
		private ConexionSQL conexion = new ConexionSQL();
		
		
		public VentanaEditarCliente(Cliente usuario) {
			this.usuario = usuario;
			//setSize(1000, 5000);
			 setResizable(false);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			
			setTitle(" AGROLIBRE -- editar perfil (Cliente)");
		    setResizable(false);
			super.setSize(getPreferredSize());
			
			//TIPOGRAFIA
		    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
		    Font letra2 = new Font( "Comic Sans MS",Font.PLAIN,12);
		    
		    //COLORES
		    Color verde= new Color(20, 60, 18);
		    
		    lblnombre=new JLabel("Nombre: ");
			lblnombre.setFont(letra);
			txtnombre=new JTextField(20);
			txtnombre.setFont(letra2);
			txtnombre.setText(usuario.getNombre());
			//txtnombre.setEnabled(false);
			
			
		
			lblcontrasena=new JLabel("Contraseña: ");
			lblcontrasena.setFont(letra);
			contrasena=new JPasswordField(20);
			contrasena.setText(usuario.getContrasenia());
			//contrasena.setEnabled(false);
		
			
			lbltelefono1=new JLabel("Telefono 1: ");
			lbltelefono1.setFont(letra);
			txttelefono1=new JTextField(10);
			txttelefono1.setFont(letra2);
			txttelefono1.setText(usuario.getTel1());
			//txttelefono1.setEnabled(false);
			
			
			lbltelefono2=new JLabel("Telefono 2 (opcional): ");
			lbltelefono2.setFont(letra);
			txttelefono2=new JTextField(10);
			txttelefono2.setFont(letra2);
			if(usuario.getTel2()!=null)
				txttelefono2.setText(usuario.getTel2());
			//txttelefono2.setEnabled(false);
			
			lblcorreo=new JLabel("Correo (opcional): ");
			lblcorreo.setFont(letra);
			txtcorreo=new JTextField(10);
			txtcorreo.setFont(letra2);
			if(usuario.getCorreo()!=null)
				txtcorreo.setText(usuario.getCorreo());
			//txtcorreo.setEnabled(false);
		
			lbldireccion=new JLabel("Direccion (opcional): ");
			lbldireccion.setFont(letra);
			txtdireccion=new JTextField(20);
			txtdireccion.setFont(letra2);
			if(usuario.getDireccion()!=null)
				txtdireccion.setText(usuario.getDireccion());
			//txtcorreo.setEnabled(false);
			
			btnAceptar=new JButton("CrearUsuario");
			btnAceptar.addActionListener(this);
			btnAceptar.setFont(letra);
			btnAceptar.setBackground(verde);
			btnAceptar.setForeground(Color.WHITE);
			
			btnCancelar=new JButton("Cancelar ");
			btnCancelar.addActionListener(this);
			btnCancelar.setFont(letra);
			btnCancelar.setBackground(verde);
			btnCancelar.setForeground(Color.WHITE);
			
			panelBotones= new JPanel();
			panelBotones.setLayout(new GridBagLayout());
			GridBagConstraints gbc=new GridBagConstraints();
			
			
		
			
		
			
			gbc.gridx = 0;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lblnombre, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 2;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txtnombre, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lblcontrasena, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 3;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(contrasena, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lbltelefono1, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 4;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txttelefono1, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lbltelefono2, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 5;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txttelefono2, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 6;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lblcorreo, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 6;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txtcorreo, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 7;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lbldireccion, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 7;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txtdireccion, gbc);
			
			
			gbc.gridx = 0;
			gbc.gridy = 9;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(btnAceptar, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 9;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(btnCancelar, gbc);
			
			panel=new JPanel();
			panel.add(panelBotones);
			panelBotones.setBackground(Color.WHITE);
			panel.setBackground(Color.WHITE);
			
			this.add(panel);
			
			
		}
		
		
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource()==btnAceptar){
				if(txtnombre.getText().length()==0 || !Validar.tamanio(7, contrasena.getText(), 15) || txttelefono1.getText().length()==0   ){
					JOptionPane.showMessageDialog(this, "Debe llenar los campos Obligatorios. ");
					
				}
				else if(Validar.letras(txtnombre.getText())==false || !Validar.tamanio(7, txtnombre.getText(), 20)){
					JOptionPane.showMessageDialog(this, "NO se admiten numeros en el nombre ");
				}
			
				else if(Validar.numeros(txttelefono1.getText())==false || !Validar.tamanio(7, txttelefono1.getText(), 10)){
					JOptionPane.showMessageDialog(this, "NO se admiten letras en el Telefono 1");
				}
				/*else if(Datos.validarNumeros(txttelefono2.getText())==false || !Datos.validarTamanio(7, txttelefono2.getText(), 10)){
					JOptionPane.showMessageDialog(this,  "NO se admiten letras en el Telefono 2");

				}*/
//				else if(d.verificarCorreo(txtcorreo.getText())==false){
//					JOptionPane.showMessageDialog(this, "El Correo no es valido");
//				}
				else if(txttelefono1.getText().equals(txttelefono2.getText())){
					JOptionPane.showMessageDialog(this, "NO  puede usar el mismo numero telefonico en ambos campos");
				}
				else
					usuario.modificar(usuario, txtnombre.getText(), txttelefono1.getText(), txttelefono2.getText(), contrasena.getText(), txtcorreo.getText(), txtdireccion.getText());
					conexion.modificarUsuario(usuario);
					JOptionPane.showMessageDialog(this,"Cliente editado correctamente ");	
					VentanaCliente vcl=new VentanaCliente(this.usuario);
					vcl.setVisible(true);
					//vc.pack();//en caso de que se haga grande
					vcl.setLocationRelativeTo(null);
					this.setVisible(false);
			}
			
			if(evento.getSource()==btnCancelar){
				VentanaCliente vcl=new VentanaCliente(this.usuario);
				vcl.setVisible(true);
				//vcl.pack();
				vcl.setLocationRelativeTo(null);
				this.setVisible(false);
			}
			
//			if(evento.getSource()==txtdocumento && d.validarNumeros(txtdocumento.getText())==true){//busca el documento,si lo encuentra permite editar
//				txtnombre.setEnabled(true);
//				contrasena.setEnabled(true);
//				txttelefono1.setEnabled(true);
//				txttelefono2.setEnabled(true);
//				txtcorreo.setEnabled(true);
//			}
			
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


		public JLabel getLblcontrasena() {
			return lblcontrasena;
		}


		public void setLblcontrasena(JLabel lblcontrasena) {
			this.lblcontrasena = lblcontrasena;
		}


		public JLabel getLblcorreo() {
			return lblcorreo;
		}


		public void setLblcorreo(JLabel lblcorreo) {
			this.lblcorreo = lblcorreo;
		}


		public JLabel getLbldireccion() {
			return lbldireccion;
		}


		public void setLbldireccion(JLabel lbldireccion) {
			this.lbldireccion = lbldireccion;
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


		public JTextField getTxtcorreo() {
			return txtcorreo;
		}


		public void setTxtcorreo(JTextField txtcorreo) {
			this.txtcorreo = txtcorreo;
		}


		public JTextField getTxtdireccion() {
			return txtdireccion;
		}


		public void setTxtdireccion(JTextField txtdireccion) {
			this.txtdireccion = txtdireccion;
		}


		public JPasswordField getContrasena() {
			return contrasena;
		}


		public void setContrasena(JPasswordField contrasena) {
			this.contrasena = contrasena;
		}


		public JButton getBtnAceptar() {
			return btnAceptar;
		}


		public void setBtnAceptar(JButton btnAceptar) {
			this.btnAceptar = btnAceptar;
		}


		public JButton getBtnCancelar() {
			return btnCancelar;
		}


		public void setBtnCancelar(JButton btnCancelar) {
			this.btnCancelar = btnCancelar;
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
		
		

	

}
