 /*
 * Single worker unit for control of testing a single genome
 * Class in charge of reproduction and fitness testing.
 * 
 * Unsure if should only be for calculating one tick or if each worker
 * should have various multipliers like a throttle and gradient mutliplier
 * and use those to simulate a whole flight
 */
public class Worker {
	
	Worker() {
		
	}
	private void testFitness() {
		//Tests fitness and passes up to manager
	}
	private void simulate() {
		//Called by testFitness to run step by step calculation
	}
	private void physicsCalculations() {
		//Runs all the physical calculations and passes it up to simulate()
	}
	void process() {
		//Call other methods and pass out to the manager
	}
}
