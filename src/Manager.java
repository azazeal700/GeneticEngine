 /*
 * Class in control of managing a group of workers, tasking new workers to
 * threads and passing fitness results to the tasker
 */
public class Manager {
	Manager() {
		
	}
	public void createPool() {
		//Initialise the task pool
	}
	private void addTasks() {
		//Add tasks to the pool
	}
	private void sendResults() {
		//Send top genome to tasker for analysis
	}
	private void breedGenome() {
		//Breed the genomes after the weak are killed off
	}
	private void killGenomes() {
		//Take test results from analyze genomes and kill the weak
	}
	private void analyseGenomes() {
		//Test genome fitness
	}
}
