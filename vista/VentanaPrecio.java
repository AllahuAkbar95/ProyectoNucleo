package vista_26_04_16;

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

public class VentanaPrecio extends JFrame implements ActionListener {

	private JButton btnConsultar, btnCancelar;
	private JPanel panelBotones, panelCompleto, panelimagen;
	private JLabel lblimagen;
	
public VentanaPrecio() {
	
		setTitle(" Consulta Precio");
		setSize(400, 400);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	    
	    Color verde= new Color(20, 60, 18);
	    
	    btnConsultar=new JButton("Consulta");
	    btnConsultar.addActionListener(this);
	    btnConsultar.setFont(letra);
	    btnConsultar.setBackground(verde);
	    btnConsultar.setForeground(Color.WHITE);
	    
	    btnCancelar=new JButton("Cancelar");
	    btnCancelar.addActionListener(this);
	    btnCancelar.setFont(letra);
	    btnCancelar.setBackground(verde);
	    btnCancelar.setForeground(Color.WHITE);
	    
	    ImageIcon img=new ImageIcon("logo2.jpg");
	    lblimagen= new JLabel(img);
	    
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
	    
	    panelimagen= new JPanel();
	    panelimagen.setLayout(new GridBagLayout());
	    
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnConsultar, gbc);
	    
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnCancelar, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelimagen.add(lblimagen, gbc);
		
		
	    
        panelCompleto =new JPanel();
        panelCompleto.add(panelBotones);
        panelCompleto.add(panelimagen);
		
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelimagen.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelBotones.setBackground(Color.WHITE);
		panelCompleto.setBackground(Color.WHITE);
		
		this.add(panelCompleto);
}
	
	
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getSource()==btnConsultar){
//			VentanaPrecio vp=new VentanaPrecio();
//			vp.setVisible(true);
//			vp.pack();
//			vp.setLocationRelativeTo(null);
//			this.setVisible(false);
			JOptionPane.showMessageDialog(this, "se consulto el precio! ");
			
		}
		
		if(evento.getSource()==btnCancelar){
			VentanaCampesino vc=new VentanaCampesino();
			vc.setVisible(true);
			vc.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		
	}
	
	
	

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
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

	public JPanel getPanelCompleto() {
		return panelCompleto;
	}

	public void setPanelCompleto(JPanel panelCompleto) {
		this.panelCompleto = panelCompleto;
	}
	

}
