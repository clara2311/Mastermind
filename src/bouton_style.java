import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;

public class bouton_style extends JButton {
	
	public bouton_style(Color color) {
		this.setBackground(color);
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		this.setPreferredSize(size);
		this.setContentAreaFilled(false);
	
	}
	protected void paintComponent(Graphics g) {
	     if (getModel().isArmed()) {
	           g.setColor(Color.white);
	     } else {
	          g.setColor(getBackground());
	     }
	     g.fillRect(0, 0, getSize().width-1, getSize().height-1);
	     super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	     g.setColor(getForeground());
	     g.drawRect(0, 0, getSize().width-1, getSize().height-1);
	}
	Shape shape;
	public boolean contains(int x, int y) {
	     if (shape == null || !shape.getBounds().equals(getBounds())) {
	          shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
	     }
	     return shape.contains(x, y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
