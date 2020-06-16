package in.sabnar.songs.dto;

public class Song {

	private Long id;
	private String name;
	private Float rating;

	public Song(Long id, String name, float f) {
		super();
		this.id = id;
		this.name = name;
		this.rating = f;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

}
