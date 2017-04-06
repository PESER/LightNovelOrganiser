package Practice1;

import java.util.ArrayList;

public class Novel {

	private String name;
	private int volume;
	private double rating;
	private String author;
	private ArrayList<String>relatedSeries;
	
	public Novel(String name, int volume, double rating, String author, ArrayList<String>relatedSeries) {
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

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
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


}
