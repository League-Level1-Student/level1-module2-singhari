package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		//Handy Smurf
		Smurf handy = new Smurf("Handy");
		System.out.println(handy.getName());
		handy.eat();
		System.out.println("Handy has a "+handy.getHatColor()+ " colored hat.");
		System.out.println("Handy is a "+handy.isGirlOrBoy());
		//Papa Smurf
		Smurf Papa_Smurf = new Smurf("Papa");
		System.out.println(Papa_Smurf.getName());
		Papa_Smurf.eat();
		System.out.println("Papa Smurf has a "+Papa_Smurf.getHatColor()+ " colored hat.");
		System.out.println("Papa Smurf is a "+Papa_Smurf.isGirlOrBoy());
		//Smurfette
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		Smurfette.eat();
		System.out.println("Smurfette has a "+Smurfette.getHatColor()+ " colored hat.");
		System.out.println("Smurfette is a "+Smurfette.isGirlOrBoy());
	}
}
