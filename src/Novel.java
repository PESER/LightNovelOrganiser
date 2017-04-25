import java.util.ArrayList;

public class Novel {

	private String name;
	private ArrayList<String>volume;
	private double rating;
	private String author;
	private ArrayList<String>relatedSeries;
	
	public Novel(String name, ArrayList<String>volume, double rating, String author, ArrayList<String>relatedSeries) {
		this.name = name;
		this.volume = volume;
		this.rating = rating;
		this.author = author;
		this.relatedSeries = relatedSeries;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getVolume() {
		return volume;
	}

	public void setVolume(ArrayList<String> volume) {
		this.volume = volume;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public ArrayList<String> getRelatedSeries() {
		return relatedSeries;
	}

	public void setRelatedSeries(ArrayList<String> relatedSeries) {
		this.relatedSeries = relatedSeries;
	}
	
	//prints the volumes of the series
	public void printAllVolumes() {
		System.out.println("---=Volumes=---");
		for(int i = 0; i < volume.size(); i++) {
			System.out.println((i + 1) + ": " + volume.get(i));
		}
	}
	
	//prints all related series (sequels, prequels, spin-off etc...)
	public void printAllRelatedSeries() {
		System.out.println("---=Related Series=---");
		for(String eachRelatedSeries: relatedSeries) {
			System.out.println(eachRelatedSeries);
		}
	}
	
	public void printNovelDetails() {
		System.out.println("\n-=-=-Novel Series-=-=-");
		System.out.println("Title: " + this.name);
		System.out.println("Rating: " + this.rating);
		System.out.println("Author: " + this.author);
		printAllVolumes();
		printAllRelatedSeries();
	}
	
	public void addVolume(String newVolume) {
		this.volume.add(newVolume);
	}
	
	public void addRelatedSeries(String newRelatedSeries) {
		this.relatedSeries.add(newRelatedSeries);
	}
	

}
