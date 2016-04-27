package vista_26_04_16;

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

import ProyectTests.Tests.Datos;

public class VentanaEditarCliente extends JFrame implements ActionListener {

	

	

	
		
		private JLabel lbldocumento,lblnombre, lbltelefono1,lbltelefono2,
		lblcontrasena, lblcorreo;
		private JTextField txtnombre,txttelefono1,txttelefono2,txtdocumento
		,txtcorreo;
		private JPasswordField contrasena;
		private JButton btnAceptar, btnCancelar;
		private JPanel panelBotones, panel;
		
		
		
		public VentanaEditarCliente() {
		
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
			txtnombre.setEnabled(false);
			
			lbldocumento=new JLabel("Documento a buscar: ");
			lbldocumento.setFont(letra);
			txtdocumento= new JTextField(20);
			txtdocumento.setFont(letra2);
			txtdocumento.addActionListener(this);
			
		
			lblcontrasena=new JLabel("Contraseña: ");
			lblcontrasena.setFont(letra);
			contrasena=new JPasswordField(20);
			contrasena.setEnabled(false);
		
			
			lbltelefono1=new JLabel("Telefono 1: ");
			lbltelefono1.setFont(letra);
			txttelefono1=new JTextField(10);
			txttelefono1.setFont(letra2);
			txttelefono1.setEnabled(false);
			
			
			lbltelefono2=new JLabel("Telefono 2: ");
			lbltelefono2.setFont(letra);
			txttelefono2=new JTextField(10);
			txttelefono2.setFont(letra2);
			txttelefono2.setEnabled(false);
			
			lblcorreo=new JLabel("Correo: ");
			lblcorreo.setFont(letra);
			txtcorreo=new JTextField(10);
			txtcorreo.setFont(letra2);
			txtcorreo.setEnabled(false);
		
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
			gbc.gridy = 0;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(lbldocumento, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;
			gbc.weightx = 0.0;
			gbc.weighty = 1.0;
			gbc.insets = new Insets(3, 3, 3, 3);
			gbc.fill = GridBagConstraints.BOTH;
			gbc.anchor = GridBagConstraints.WEST;
			panelBotones.add(txtdocumento, gbc);
			
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
			panelBotones.add(btnAceptar, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 7;
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
			
			this.add(panel);
			
			
		}
		
		
		public void actionPerformed(ActionEvent evento) {
			Datos d=new Datos();
			if (evento.getSource()==btnAceptar){
				if(txtnombre.getText().length()==0 || txtdocumento.getText().length()==0 
						|| contrasena.getText().length()==0 || txttelefono1.getText().length()==0 || txttelefono2.getText().length()==0
						|| txtcorreo.getText().length()==0){
					JOptionPane.showMessageDialog(this, "Debe llenar TODOS los campos por favor. ");
					
				}
				else if(d.validarLetras(txtnombre.getText())==false){
					JOptionPane.showMessageDialog(this, "NO se admiten numeros en el nombre ");
				}
				else if(d.validarNumeros(txtdocumento.getText())==false ){
					JOptionPane.showMessageDialog(this, "NO se admiten letras en el Documento ");
				}
				else if(d.validarNumeros(txttelefono1.getText())==false){
					JOptionPane.showMessageDialog(this, "NO se admiten letras en el Telefono 1");
				}
				else if(d.validarNumeros(txttelefono2.getText())==false){
					JOptionPane.showMessageDialog(this,  "NO se admiten letras en el Telefono 2");

				}
//				else if(d.verificarCorreo(txtcorreo.getText())==false){
//					JOptionPane.showMessageDialog(this, "El Correo no es valido");
//				}
				else if(txttelefono1.getText().equals(txttelefono2.getText())){
					JOptionPane.showMessageDialog(this, "NO  puede usar el mismo numero telefonico en ambos campos");
				}
				else
					JOptionPane.showMessageDialog(this,"Cliente editado correctamente ");
			
			
			}
			
			if(evento.getSource()==btnCancelar){
				VentanaCliente vcl=new VentanaCliente();
				vcl.setVisible(true);
				//vcl.pack();
				vcl.setLocationRelativeTo(null);
				this.setVisible(false);
			}
			if(d.validarNumeros(txtdocumento.getText())==false){
				JOptionPane.showMessageDialog(this, "NO debe colocar letras en el Documento");
			}
			if(evento.getSource()==txtdocumento && d.validarNumeros(txtdocumento.getText())==true){//busca el documento,si lo encuentra permite editar
				txtnombre.setEnabled(true);
				contrasena.setEnabled(true);
				txttelefono1.setEnabled(true);
				txttelefono2.setEnabled(true);
				txtcorreo.setEnabled(true);
			}
			
		}

	

}
