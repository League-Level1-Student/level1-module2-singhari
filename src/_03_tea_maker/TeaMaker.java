package _03_tea_maker;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

public class TeaMaker {
	public static void main(String[] args) {
	Kettle jerry = new Kettle();	
	jerry.boil();
	TeaBag fun = new TeaBag("Mint");
	Cup h = new Cup();
	h.makeTea(fun, jerry.getWater());
	}
	/* Figure out how to make a cup of tea in this runner class, using the other classes below */
}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
		if(flavor.equals("Green")) {
			flavor = GREEN;
		}
		else if(flavor.equals("Mint")) {
			flavor = MINT;
		}
		else if(flavor.equals("Chamomile")) {
			flavor = CHAMOMILE;
		}
		else {
			flavor = PASSION_FRUIT;
		}
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}


