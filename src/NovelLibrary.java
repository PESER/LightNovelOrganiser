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

}
