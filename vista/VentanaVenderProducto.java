package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ProyectTests.Tests.Campesino;
import ProyectTests.Tests.Validar;
import ProyectTests.Tests.Producto;
import conexion.ConexionSQL;


public class VentanaVenderProducto extends JFrame implements ActionListener {
	
	private JLabel lblnombre,lblprecio,lblcantidad, lblimg;
	private JTextField txtnombre,txtprecio,txtcantidad;
	private JButton btnvender, btncancelar;
	private JPanel panelBotones,panelImagen, panel;
	private ImageIcon imagen;
	private Campesino usuario;
	private ConexionSQL conexion = new ConexionSQL();

	
	public VentanaVenderProducto(Campesino usuario){
		this.usuario = usuario;
		setTitle("Vender Producto");
		setSize(200, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		//TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	    Font letra2 = new Font( "Comic Sans MS",Font.PLAIN,12);
	    
	    //COLORES
	    Color verde= new Color(20, 60, 18);
	   
	    lblnombre=new JLabel("Nombre del Producto: ");
	    lblnombre.setFont(letra);
	    txtnombre=new JTextField(20);
	    txtnombre.setFont(letra2);
	    
	    lblcantidad=new JLabel("Cantidad (en peso): ");
	    lblcantidad.setFont(letra);
	    txtcantidad=new JTextField(20);
	    txtcantidad.setFont(letra2);
	    
	    lblprecio= new JLabel("Precio ($): ");
	    lblprecio.setFont(letra);
	    txtprecio=new JTextField(20);
	    txtprecio.setFont(letra2);
	    
	    
	    imagen=new ImageIcon("logo2.jpg");
	    lblimg=new JLabel(imagen);
	    
	    btnvender=new JButton("Vender");
	    btnvender.setFont(letra);
	    btnvender.addActionListener(this);
	    btnvender.setBackground(verde);
	    btnvender.setForeground(Color.WHITE);
	    
	    

	    btncancelar=new JButton("Cancelar ");
	    btncancelar.setFont(letra);
	    btncancelar.addActionListener(this);
	    btncancelar.setBackground(verde);
	    btncancelar.setForeground(Color.WHITE);
	    
	    
	    
	    panelImagen= new JPanel();
	    panelImagen.setLayout(new GridBagLayout());
	    
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblnombre, gbc);
	    
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtnombre, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblcantidad, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtcantidad, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblprecio, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtprecio, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnvender, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btncancelar, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelImagen.add(lblimg, gbc);
	    
		panel=new JPanel();
		panel.add(panelImagen);
		panel.add(panelBotones);
		panelBotones.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		this.add(panel);
	    
		
	}

	public void actionPerformed(ActionEvent evento) 
	{
		if(evento.getSource()==btnvender){
			if(txtnombre.getText().length()==0|| txtcantidad.getText().length()==0
					||txtprecio.getText().length()==0){
				JOptionPane.showMessageDialog(this, "Debe llenar TODOS los campos. ");
			}
			
			else if(Validar.letras(txtnombre.getText())==false){
				JOptionPane.showMessageDialog(this, "No debe colocar numeros en el nombre");
			}
			else if(Validar.numeros(txtcantidad.getText())==false){
				JOptionPane.showMessageDialog(this, "la cantidad no debe ser en letras");

			}
			else if(Validar.numeros(txtprecio.getText())==false){
				JOptionPane.showMessageDialog(this, "el precio no debe contener letras");

			}else
			{
				Producto producto = new Producto(txtnombre.getText().toLowerCase(),Integer.parseInt(txtprecio.getText()),Integer.parseInt(txtcantidad.getText()),this.usuario.getUsuario());
				conexion.insertarProducto(producto);
				JOptionPane.showMessageDialog(this, "el producto se ha agregado correctamente");
			}
		}
		
		if(evento.getSource()==btncancelar){
			VentanaCampesino vc=new VentanaCampesino(this.usuario);
			vc.setVisible(true);
			this.setVisible(false);
		}
		
		
		
	}

	public JLabel getLblnombre() {
		return lblnombre;
	}

	public void setLblnombre(JLabel lblnombre) {
		this.lblnombre = lblnombre;
	}

	public JLabel getLblprecio() {
		return lblprecio;
	}

	public void setLblprecio(JLabel lblprecio) {
		this.lblprecio = lblprecio;
	}

	public JLabel getLblcantidad() {
		return lblcantidad;
	}

	public void setLblcantidad(JLabel lblcantidad) {
		this.lblcantidad = lblcantidad;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtprecio() {
		return txtprecio;
	}

	public void setTxtprecio(JTextField txtprecio) {
		this.txtprecio = txtprecio;
	}

	public JTextField getTxtcantidad() {
		return txtcantidad;
	}

	public void setTxtcantidad(JTextField txtcantidad) {
		this.txtcantidad = txtcantidad;
	}

	public JButton getBtnvender() {
		return btnvender;
	}

	public void setBtnvender(JButton btnvender) {
		this.btnvender = btnvender;
	}

	public JButton getBtncancelar() {
		return btncancelar;
	}

	public void setBtncancelar(JButton btncancelar) {
		this.btncancelar = btncancelar;
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
