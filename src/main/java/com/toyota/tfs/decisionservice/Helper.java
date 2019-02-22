package com.toyota.tfs.decisionservice;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Helper implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	static Long ListID;

	@org.kie.api.definition.type.Description(value = "random number in [0,1) used in early stage business rules")
	private double rand1;
	@org.kie.api.definition.type.Description(value = "random number in [0,1) used for load balancing ListId's of late stage accounts")
	private double rand2;
	@org.kie.api.definition.type.Description(value = "random ListID value")
	private String listID;

	public Helper() {
	}

	public double getRand1() {
		return this.rand1;
	}

	public void setRand1(double rand1) {
		this.rand1 = rand1;
	}

	public double getRand2() {
		return this.rand2;
	}

	public void setRand2(double rand2) {
		this.rand2 = rand2;
	}

	public String getListID(String L1, String L2, String L3, String L4) {
		final long l1 = Long.parseLong(L1);
		final long l2 = Long.parseLong(L2);
		final long l3 = Long.parseLong(L3);
		final long l4 = Long.parseLong(L4);
		double d;
		if (rand2 < 0.5) 
			d = (l2 - l1) * 2 * rand2 + l1; 
		else 
			d = (l4 - l3) * 2 * (rand2 - 0.5) + l3;
		long l = (long) d;
		String L = Long.toString(l);
		return L;
	}

	public Helper(double rand1, double rand2) {
		this.rand1 = rand1;
		this.rand2 = rand2;
	}

}