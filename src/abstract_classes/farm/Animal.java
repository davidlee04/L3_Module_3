package abstract_classes.farm;

public abstract class Animal {
	int legs;

	abstract String makeNoise();

	int countLegs() {
		return legs;
	}

}
