import java.util.ArrayList;

public class NovelTester {

	public static void main(String[] args) {
		
		String myName = "Test Novel"; double myRating = 4.0; String myAuthor = "Test Author";
		ArrayList<String> myVolume = new ArrayList<String>();
		ArrayList<String> myRelatedSeries = new ArrayList<String>();
		myVolume.add("Volume 1"); myVolume.add("Volume 2"); myVolume.add("Volume 3");
		myRelatedSeries.add("Sequel"); myRelatedSeries.add("Spin-off");
		
		Novel myNovel = new Novel(myName, myVolume, myRating, myAuthor, myRelatedSeries);
		myNovel.setVolume(myVolume);
		
		myNovel.printNovelDetails();
		
		myNovel.setName("Test name 2"); //testing a new novel name
		System.out.println(myNovel.getName()); //prints title using getter method
	}

}
