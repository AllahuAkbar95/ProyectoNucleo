package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ProyectTests.Tests.Cliente;
import ProyectTests.Tests.Producto;
import conexion.ConexionSQL;

public class VentanaAgregarCompra extends JFrame implements ActionListener {
	
	private JLabel lblBusqueda, lblid, lblcantidad;
	private JTextField txtproducto, txtid, txtCantidad;
	private JButton btnComprar, btnCancelar, btnBuscar;
	private JPanel panelCuadro, panelCompleto,panelBotones;
	private JTextArea area;
	private Cliente usuario;
	private ConexionSQL conexion = new ConexionSQL();
	
	public VentanaAgregarCompra(Cliente usuario){
		this.usuario = usuario;
		setTitle(" Carrito de Compras ");
		setSize(500, 500);//ancho- largo
		
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
		
	    //TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	    Font letra2 = new Font( "Comic Sans MS",Font.PLAIN,12);
	    
	  //COLORES
	    Color verde= new Color(20, 60, 18);
	    
	    
	    lblBusqueda =new JLabel("Producto a buscar: ");
	    lblBusqueda.setFont(letra);
	    txtproducto=new JTextField(20);
	    txtproducto.setFont(letra2);
	    
	    lblid=new JLabel("ID del producto: ");
	    lblid.setFont(letra);
	    txtid=new JTextField(20);
	    txtid.setFont(letra2);
	    
	    lblcantidad=new JLabel("Cantidad: ");
	    lblcantidad.setFont(letra);
	    txtCantidad=new JTextField();
	    txtCantidad.setFont(letra2);
	    
	    btnBuscar=new JButton("Buscar");
	    btnBuscar.addActionListener(this);
	    btnBuscar.setFont(letra);
	    btnBuscar.setBackground(verde);
	    btnBuscar.setForeground(Color.WHITE);
	    
	    btnComprar= new JButton("Añadir al Carrito ");
	    btnComprar.addActionListener(this);
	    btnComprar.setFont(letra);
	    btnComprar.setBackground(verde);
	    btnComprar.setForeground(Color.WHITE);
	    
	    btnCancelar=new JButton("Cancelar ");
	    btnCancelar.addActionListener(this);
	    btnCancelar.setFont(letra);
	    btnCancelar.setBackground(verde);
	    btnCancelar.setForeground(Color.WHITE);
	    
	    area=new JTextArea();
	    area.setSize(2500, 2500);
	    area.setFont(letra2);
	    area.setEditable(false);
	    
	
	    
	    
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		 panelCuadro= new JPanel();
		 panelCuadro.setLayout(new GridBagLayout());
		 GridBagConstraints gbc2 = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblBusqueda, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtproducto, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnBuscar, gbc);
		
		
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblid, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtid, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnCancelar, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(lblcantidad, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(txtCantidad, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnComprar, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelCuadro.add(area, gbc2);
		
		panelBotones.setBackground(Color.WHITE);
		panelCuadro.setBackground(Color.WHITE);
		
		
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		
		panelCuadro.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));

		
		panelCompleto=new JPanel();
		panelCompleto.add(panelBotones);
		panelCompleto.add(panelCuadro);
		panelCompleto.setBackground(Color.WHITE);
		this.add(panelCompleto);
	    
	    
	    
	}

	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==btnComprar){
			if(txtid.getText().length()==0){
				JOptionPane.showMessageDialog(this, "Por favor escriba el codigo del alimento a comprar");
				
			}
		}
		if(evento.getSource()==btnCancelar){
			VentanaCliente vc=new VentanaCliente(this.usuario);
			vc.setVisible(true);
			this.setVisible(false);
		}
		if(evento.getSource() == btnBuscar)
		{
			java.util.List<Producto> lista = conexion.obtenerLista(txtid.getText().toLowerCase(), "nombreProducto");
			for(int i=0; i<lista.size();i++)
			{
				area.setText(area.getText()+"\n"+lista.get(i));
			}
			
		}
		
	}

	public JLabel getLblBusqueda() {
		return lblBusqueda;
	}

	public void setLblBusqueda(JLabel lblBusqueda) {
		this.lblBusqueda = lblBusqueda;
	}

	public JLabel getLblid() {
		return lblid;
	}

	public void setLblid(JLabel lblid) {
		this.lblid = lblid;
	}

	public JLabel getLblcantidad() {
		return lblcantidad;
	}

	public void setLblcantidad(JLabel lblcantidad) {
		this.lblcantidad = lblcantidad;
	}

	public JTextField getTxtproducto() {
		return txtproducto;
	}

	public void setTxtproducto(JTextField txtproducto) {
		this.txtproducto = txtproducto;
	}

	public JTextField getTxtid() {
		return txtid;
	}

	public void setTxtid(JTextField txtid) {
		this.txtid = txtid;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JPanel getPanelCuadro() {
		return panelCuadro;
	}

	public void setPanelCuadro(JPanel panelCuadro) {
		this.panelCuadro = panelCuadro;
	}

	public JPanel getPanelCompleto() {
		return panelCompleto;
	}

	public void setPanelCompleto(JPanel panelCompleto) {
		this.panelCompleto = panelCompleto;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}
	
	

}
