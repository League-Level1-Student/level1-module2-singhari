package _01_sea_creature;

public class Nuance {
	public static void main(String[] args) {
		SeaCreature SpongeBob = new SeaCreature("Spongebob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		SpongeBob.getName();
		SpongeBob.eat();
		SpongeBob.laugh();
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
	}
}
