package assignment4;

//import classes and library objects
import java.io.IOException;
import assignment4.WordList;
import java.util.Random;
import java.util.Calendar;

public class Agent {

	//private properties of Agent Class
		private boolean Gender;
		private int Birthday[]=new int[3];
		private String name;
		private String CityBorn;
		private String CurrentCity;
		private String CurrentMajor;
		
	//create our Random static variable
		public static Random rand = new Random();
		
	//methods of Agent Class
		public String getCityNow(){
			return CurrentCity;
		}
		public String getCityBorn(){
			return CityBorn;
		}
		public String getName(){
			return name;
		}
		public String getGender(){
			if (Gender==true){
				return "Male";
			}
			else{
				return "Female";
			}
		}
		public String getMajor(){
			return CurrentMajor;
		}
		public String getBirthday(){
			//create an array with all the names of the month
			String [] MonthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			
			String BirthdayString;
			BirthdayString="Born: " + (this.Birthday[0])+"th of " +(MonthNames[(this.Birthday[1])]) +", " + (this.Birthday[2]);
			return BirthdayString;
		}
		
	//public methods of Agent Class
		public void sayHello(){
			System.out.println(this.name + " says: Hello my dear!");
		}
		public void sayCityBorn(){
			System.out.println(this.name + " says: I was born in " + (this.CityBorn));
		}
		public void howOldAreYou(){
			int age;
			int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
			int CurrentMonth = Calendar.getInstance().get(Calendar.MONTH);
			int CurrentDay = Calendar.getInstance().get(Calendar.DATE);
			
			int BirthYear= this.Birthday[2];
			int BirthMonth= this.Birthday[1];
			int BirthDate= this.Birthday[0];
			
			if(CurrentYear>=BirthYear && CurrentMonth>=BirthMonth && CurrentDay>=BirthDate){
			age=CurrentYear-BirthYear;
			}
			else{
			age=(CurrentYear-BirthYear)-1;	
			}
			
			System.out.println(this.name + " says: I am " + (age) + " years old.");
		}
		public void sayGender(){
			if (this.Gender==true){
				System.out.println(this.name + " says: I am a Male");
			}
			else{
				System.out.println(this.name + " says: I am a Female");
			}
			
		}
		public void sayCityNow(){
			System.out.println(this.name + " says: I currently live in " + (CurrentCity));
		}
		public void sayMajor(){
			System.out.println(this.name + " says: My Major is " + (this.CurrentMajor));
		}
		
	//additional public methods for Discussion	
		//Greetings
			public void sayHelloToFeeling(String Name){	
			System.out.println(this.name + " says: "+"Hello " + Name + " I am " + this.name + " and I'm not feeling so good.");	
			}
			public void sayHowAreYou(String Name){
			System.out.println(this.name + " says: "+"How are you " + Name +"?");
		}
			public void saywhyNotFeelGood(String Name){
				System.out.println(this.name + " says: "+Name + " why are you not feeling so good?");
			}
			public void sayHelloTo(String Name){
				System.out.println(this.name + " says: "+"Hello " + Name + ", my name is " + this.name + ".");
			}
		//Questions
			public void saywhereYouFrom(){
				System.out.println(this.name + " says: "+"Fine, where are you from?");
			}
			public void sayWhatYourMajor(){
			System.out.println(this.name + " says: " + "Oh yea well what's your major?");
		}
		//Friendly Answers
			public void sayJustLeftHome(){
				System.out.println(this.name + " says: "+"I just left my hometown " + this.CityBorn + ".");		
			}
			public void sayWasFromNowIn(){
				System.out.println(this.name + " says: "+"I just left my hometown too, I was from" + this.CityBorn + " but I am now in " + this.CurrentCity + ".");
			}
			public void sayThanksYourName(){
				System.out.println(this.name + " says: "+"Thank you but I do not know your name.");
			}
			public void sayLoveFrom(String cityfrom){
				System.out.println(this.name + " says: " + "Well I love people from " + (cityfrom) + ".");
			}
			public void sayBeFriends(){
				System.out.println(this.name + " says: " + "" +"We can be friends then!");	
			}
			public void sayGonnaFriends(){
			System.out.println(this.name + " says: " + "well I can tell we're going to be great friends.");
		}
		//Pointless Answers
			public void saySorryCanadian(){
				System.out.println(this.name + " says: "+"Well I'm sorry I'm Canadian.");
			}
			public void sayFascinating(){
				System.out.println(this.name + " says: "+"That is so fascinating!");
			}
			public void sayLoveGroove(){
			System.out.println(this.name + " says: "+"I love your groove.");
		}
		//Mean answers
			public void sayIDontCare(String Name){
				System.out.println(this.name + " says: "+"Well " + Name + " I don't care because I was born in " + this.CityBorn);
				
			}
			public void sayGoAway(){
				System.out.println(this.name + " says: " + "Yea I don't want to talk to you go away I'm leaving.");
			}
			public void sayNoMajorRude(){
				System.out.println(this.name + " says: "+"Well no one in my major of " + this.CurrentMajor + " is this this rude.");
			}
			public void sayDoNotLikeBecause(String cityfrom){
				System.out.println(this.name + " says: "+"I don't like people from " + cityfrom + " because I am from " + this.CityBorn +".");
			}
			public void saySorryCanNotSpeak(String CityFrom){
				System.out.println(this.name + " says: "+"Sorry I cannot speak with people from " + CityFrom + ".");
			}
			public void sayHeySupBetter(){
				System.out.println(this.name + " says: " + "Hey what's up I'm better than you.");
			}
			public void sayHateFrom(String cityfrom){
				System.out.println(this.name + " says: " + "Well I hate people from " + (cityfrom) + ".");
			}
			public void sayEveryonedoes(){
				System.out.println(this.name + " says: " + "Yea yea actually everyone does.");
			}
			public void sayNoMajorTell(){
				System.out.println(this.name + " says: " + "I don't need to tell you my major, I'm from " + (this.CityBorn) +".");
			}
			public void sayNoOneLikes(String name,String major){
				System.out.println(this.name + " says: " + "Well " + (name) + ", no one from my major of " + (this.CurrentMajor) + "likes anyone from your major of " + (major)+".");
			}
			public void sayMajorAwesome(){
			System.out.println(this.name + " says: " + "I major in being better than your major.");
		}
		//Farewells		
			public void saySorryGottaGo(){
				System.out.println(this.name + " says: "+"Sorry I have to go.");
			}
			public void saySorryGottaGo(String name){
				System.out.println(this.name + " says: "+"Sorry " + name + " I have to go.");
			}
			public void sayByethen(){
			System.out.println(this.name + " says: " + "well bye then.");
		}
		
	//special WhoAreYou Method
		public void whoAreYou(){
			sayHello();
			sayCityBorn();
			howOldAreYou();
			sayGender();
			sayCityNow();
			sayMajor();
			
		}
		
	//static method generate Agent
		public static Agent generateAgent(){
			//names of our files
				String Cities="Cities";
				String Majors="Majors";
				String MaleNames="MaleNames";
				String FemaleNames="FemaleNames";
			
			//first create a new Agent
				Agent RandomAgent = new Agent();
			
			//Now give the random agent attributes, default values if can't find WordLists	
				//Gender
						RandomAgent.Gender=rand.nextBoolean();
				//Birthday
						
							int	day=(rand.nextInt(30))+1;
							int	month=(rand.nextInt(12));
							int	year=rand.nextInt(Calendar.getInstance().get(Calendar.YEAR));	
							RandomAgent.Birthday[0]=day;
							RandomAgent.Birthday[1]=month;
							RandomAgent.Birthday[2]=year;
				//Cities	
						try{
							WordList CityList = new WordList(Cities);
							//choose city born in at random
								RandomAgent.CityBorn=CityList.getRandomWord();
							//choose current city at random
								RandomAgent.CurrentCity=CityList.getRandomWord();	
								
						}
						catch (IOException e){
							RandomAgent.CityBorn="NoCityGiven";
							RandomAgent.CurrentCity="NoCityGiven";
						}
				//Major	
						try{
							WordList MajorList = new WordList(Majors);
							//choose a major at random
								RandomAgent.CurrentMajor=MajorList.getRandomWord();
								
						}
						catch (IOException e){
							RandomAgent.CurrentMajor="NoMajorGiven";
						}
				//Names,(Gender==true) means Male
						if(RandomAgent.Gender==true){
							
							try{
								WordList MaleNameList = new WordList(MaleNames);
								RandomAgent.name=MaleNameList.getRandomWord();
							}
							catch (IOException e){
								RandomAgent.name="NoNameGiven(Male)";
							}
						}
						else {
							try{					
								WordList FemaleNameList = new WordList(FemaleNames);
								RandomAgent.name=FemaleNameList.getRandomWord();
							}
							catch (IOException e){
								RandomAgent.name="NoNameGiven(Female)";
							}
						}
			//Finally return our random Agent
					return RandomAgent;
	}//endGenerateAgent
				
}//endAgent
	
	
	
		
	
