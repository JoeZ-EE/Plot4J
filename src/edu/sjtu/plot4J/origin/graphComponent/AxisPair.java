package edu.sjtu.plot4J.origin.graphComponent;

public class AxisPair<ST extends AxisGraphStyler> implements GraphComponent {
	
	private final Graph<AxisGraphStyler> graph;
	
	private final Axis<AxisGraphStyler> xAxis;
	private final Axis<AxisGraphStyler> yAxis;
	
	/**
	 * Constructor
	 * 
	 * @param graph
	 */
	public AxisPair(Graph<AxisGraphStyler> graph) {
		
		this.graph = graph;
		
		xAxis = new Axis<AxisGraphStyler>();
		yAxis = new Axis<AxisGraphStyler>();
	}
}
