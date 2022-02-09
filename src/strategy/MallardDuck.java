package strategy;

public class MallardDuck extends strategy.Duck {

	public MallardDuck() {

		quackBehavior = new strategy.Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
