package edu.sjtu.plot4J.origin.graphComponent;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public interface GraphComponent {
	
	BasicStroke SOLID_STROKE = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, new float[]{3.0f, 0.0f}, 0.0f);
	
	Rectangle2D getBounds();
	
	void paint(final Graphics2D g);
}
