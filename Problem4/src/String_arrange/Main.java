package String_arrange;

// This the main class please press the run button only

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// This is the required text

		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		// Creating object of the class that perform extraction of words & sorting of
		// them from the text
		Stringe_seperate data = new Stringe_seperate();
		// Printing text to observe result is correct
		System.out.println(text);

		System.out.println("====================================");
// passing a copy of the text using setter function 
		data.Set_String(text);

		System.out.println("Words after sorting : ");

// Printing data
		data.Print_Wors();

	}

}
