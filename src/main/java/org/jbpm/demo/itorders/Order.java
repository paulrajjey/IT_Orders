package org.jbpm.demo.itorders;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.String name;
	private double amount;

	public Order() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Order(java.lang.String id, java.lang.String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

}