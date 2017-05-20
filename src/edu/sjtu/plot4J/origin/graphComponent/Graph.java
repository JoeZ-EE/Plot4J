package edu.sjtu.plot4J.origin.graphComponent;

import java.awt.Graphics2D;;

/**
 * Graph SuperClass
 *  @author zhanghe
 */

public abstract class Graph<ST extends Styler> {
	
	public abstract void plot(Graphics2D g, int width, int height);
	
	protected ST styler;
	
	/**
	 *  Properties
	 */
	private int width;
	private int height;
	private String title = "";
	private String xAxisTitle = "";
	private String yAxisTitle = "";
	
	/**
	 *  Graph Parts
	 */
	protected AxisPair axisPair;
	protected Cutline cutline;  // 图例
	
	/**
	 * Constructor
	 * @param width
	 * @param height
	 * @param styler
	 */ 
	public Graph(int width, int height, ST styler) {
		this.width = width;
		this.height = height;
		this.styler = styler;
	}
	
	/**
	 *  Properties Getters and Setters 
	 */
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getXAxisTitle() {
		return xAxisTitle;
	}

	public void setXAxisTitle(String xAxisTitle) {
		this.xAxisTitle = xAxisTitle;
	}

	public String getYAxisTitle() {
		return yAxisTitle;
	}

	public void setYAxisTitle(String yAxisTitle) {
		this.yAxisTitle = yAxisTitle;
	}
	
	/**
	 *  Graph Parts Getters
	 */
	public AxisPair getAxisPair() {
		return axisPair;
	}
 	
	public Cutline getCutline() {
		return cutline;
	}
	
}
