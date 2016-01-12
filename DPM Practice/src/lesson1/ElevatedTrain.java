package lesson1;

//This class is inheriting methods from two classes!
public class ElevatedTrain extends MassTransit implements RailedVehicle {

	@Override //We had to implement this method
	public int getLineNumber() {
		return 0;
	}

	@Override
	public int getNumberOfLocomotives() {
		return 0;
	}

}

//What is the difference between abstract classes and interfaces.
//Interfaces only have blank methods
//Abstract classes have implementations and interfaces

//You can design an entire project in terms of interfaces, go separate ways. Monday is about syncrhonization, 
//Threads and various things. UNDERSTAND INTERFACES. READ THE ORACLE TUTORIALS ON JAVA