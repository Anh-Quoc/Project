import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
	public String whatsYourName() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {
	@Override
	public String whatsYourName() {
		return "Jasmine";
	}
}

class Lily {
}

class Region {
	public Flower yourNationalFlower() {
		return An instanceof Flower;
	}
}

class WestBengal extends Region {

}

class AndhraPradesh extends Region {

}

public class CovariantReturnTypes {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine().trim();
		Region region = null;
		switch (s) {
			case "WestBengal":
				region = new WestBengal();
				break;
			case "AndhraPradesh":
				region = new AndhraPradesh();
				break;
		}
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
	}
}