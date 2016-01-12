package assignment4;

//import our classes and library objects
import assignment4.Agent;
import java.io.IOException;
import java.util.Random;

public class DiscussionDirector {
	//main method
		public static void main(String[] args) throws IOException {
			System.out.println("This program gives 2 conversations between two Agents");
			System.out.println(" ");
	
		//we need to create 2 instances A and B of our Agent	
			Agent A = new Agent();
			Agent B = new Agent();
			
		//Give these 2 instances default values
			A = Agent.generateAgent();
			B = Agent.generateAgent();
			
		//call discuss 1 and 2
			System.out.println("CONVERSATION 1");
			discuss(A,B);
			System.out.println(" ");
			
			//System.out.println("CONVERSATION 2");
			//discuss2(A,B);
		}//endmain
	
	//public random variable	
		public static Random rand = new Random();
	
	//public method discuss	
		public static void discuss (Agent A, Agent B){
		//first get the names/cities of our agents
			String NameOfA=A.getName();
			String NameOfB=B.getName();
			String CityFromA=A.getCityBorn();
			String CityFromB=B.getCityBorn();

		//fist statement
				A.sayHello();
			
		//.5chance as to the next 2 statements
				if(rand.nextBoolean()==true){
						B.sayHowAreYou(NameOfA);
						A.saywhereYouFrom();
						B.sayCityBorn();
						A.sayDoNotLikeBecause(CityFromB);	
						//.3 and .7 percent chance as to the next statement
							if(rand.nextInt(3)==0){
								B.sayFascinating();
							}
							else{
								B.sayLoveGroove();
								A.sayThanksYourName();
								B.sayHelloTo(NameOfA);
								A.saySorryGottaGo(NameOfB);	
							}
				}
				else{
						B.sayHelloToFeeling(NameOfA);
						//.8 and .2 percent chance as to the next statement
							if(rand.nextInt(5)==0){
								A.sayIDontCare(NameOfB);
									//.1 and .9 percent chance as to the next statement
										if(rand.nextInt(10)==0){
											B.saySorryCanadian();
											A.saySorryGottaGo();
										}
										else{
											B.sayNoMajorRude();
											A.saySorryGottaGo();
										}
							}
						else{
								A.saywhyNotFeelGood(NameOfB);
								B.sayJustLeftHome();
								A.sayWasFromNowIn();
								//.3 and .7 percent chance as to the next statement
									if(rand.nextInt(3)==0){
										B.saySorryCanNotSpeak(CityFromA);
									}
									else{
										B.sayFascinating();
									}
						}
				}
		
	}//enddiscuss

	//additional method discuss2
		public static void discuss2 (Agent A,Agent B){
			//first get the names and information of our two agents we need
			String nameOfA = A.getName();
			String nameOfB = B.getName();
			String majorB = B.getMajor();
			String cityfromA=A.getCityBorn();
			
			//first statement
			A.sayHello();
						
			//.4,.1 and.5 percent chance as to the next 3 statements
			if(rand.nextInt(2)==0){
				//do the 50% probability statement
					B.sayHelloTo(nameOfA);
					A.sayJustLeftHome();
					
					//.7 and .3 percent chance as to what happens next
						if(rand.nextInt(2)==0){
							//.3 percent chance statement here
							B.sayHateFrom(cityfromA);
								//.2 and .8 probability as to the next 2 statements
								if (rand.nextInt(5)==0){
									//.2 percent chance statement here
									A.sayByethen();
								}
								else{
									//.8 percent chance statement here
									A.sayBeFriends();
								}
						}
						else{
							//.7 percent chance statement here
							B.sayLoveFrom(cityfromA);
							A.sayBeFriends();
							B.saySorryGottaGo();
						}
					
				
			}
			//Do the 40% or 10% statements
			else{
				if((rand.nextInt(5)==0)){
					B.sayHeySupBetter();
						//.3 and .7 percent chance as to what happens next
							if(rand.nextInt(3)==0){
								//do 30% chance statement
								A.sayNoOneLikes(nameOfB, majorB);
									//.2 and .8 percent chance as to the next 2 statements
										if(rand.nextInt(5)==0){
											//do 20% chance statement
												B.sayEveryonedoes();
										}
										else{
											//do 80% chance statement
												B.sayDoNotLikeBecause(cityfromA);
										}
							}
							else{
								//do 70% chance statement
									A.sayWhatYourMajor();
										//.5 and .5 percent chance as to what happens next
											if(rand.nextBoolean()==true){
												B.sayNoMajorTell();
											}
											else{
												B.sayMajorAwesome();
											}
							}
				}
				//This is the outer 10% chance statement
				else{
					B.sayGoAway();
				}
			}	
		}//enddiscuss2

}//endDiscussionDirector
