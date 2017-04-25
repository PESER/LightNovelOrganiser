import java.util.ArrayList;

public class NovelLibrary {
		
	private ArrayList<Novel> allNovel;
		
	public NovelLibrary(ArrayList<Novel> allNovel) {
		this.allNovel = allNovel;
	}
	
	public ArrayList<Novel> getAllNovel() {
		return allNovel;
	}
	
	public void setAllNovel(ArrayList<Novel> allNovel) {
		this.allNovel = allNovel;
	}

	public void printAllNovelDetails() {
		for(Novel eachNovel: allNovel) {
			eachNovel.printNovelDetails();
		}
	}
	
	public void printNovelName() {
		for(int i = 0; i < allNovel.size(); i++) {
			System.out.println((i + 1) + ": " + allNovel.get(i).getName());
		}
	}
	
}
