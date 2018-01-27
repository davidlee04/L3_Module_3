package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();

		Animal pig = new Pig();
		Animal cow = new Cow();
		Animal chicken = new Chicken();
		Animal sheep = new Sheep();

		farm.add(pig);
		farm.add(cow);
		farm.add(chicken);
		farm.add(sheep);
		farm.add(pig);
		farm.add(cow);

		for (int i = 0; i < farm.size(); i++) {
			System.out.println(farm.get(i).makeNoise());
			System.out.println(farm.get(i).countLegs());

		}

	}
}
