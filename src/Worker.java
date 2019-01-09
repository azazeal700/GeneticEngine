 /*
 * Single worker unit for control of testing a single genome
 * Class in charge of reproduction and fitness testing.
 * 
 * Unsure if should only be for calculating one tick or if each worker
 * should have various multipliers like a throttle and gradient mutliplier
 * and use those to simulate a whole flight
 */
public class Worker implements Runnable {
	private int Genome = null;
	private int Goal = null;
	Worker(String Genome, String Goal) {
		this.Genome = Genome;
		this.Goal = Goal;
	}
	public void run() {
		process();
	}
	private void testFitness() {
		//Tests fitness and passes up to manager
	}
	private void simulate() {
		//Called by testFitness to run step by step calculation
		//For now a nothing function, just guessing numbers
	}
	private void physicsCalculations() {
		//Runs all the physical calculations and passes it up to simulate()
		//For now a nothing function, just guessing numbers
	}
	void process() {
		//Call other methods and pass out to the manager
	}
}
