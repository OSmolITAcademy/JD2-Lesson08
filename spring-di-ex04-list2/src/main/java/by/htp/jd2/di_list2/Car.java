package by.htp.jd2.di_list2;

import java.util.List;

public class Car {

	// generate setters...
	private List<String> carNames; // primitive string array
	private List<Engine> engines; // secondary string array

	public void setCarNames(List<String> carNames) {
		this.carNames = carNames;
	}

	public void setEngines(List<Engine> engines) {
		this.engines = engines;
	}

	// business logic
	public void carDetails() {

		System.out.println("CAR NAME......");
		for (String car : carNames) {
			System.out.println(car);
		}
		System.out.println("\nMODEL YEAR......");
		for (Engine engine : engines) {
			System.out.println(engine.getModelYear());
		}
	}
} 