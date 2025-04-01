package basic_html;

import java.util.ArrayList;

public class notice_DTO {
	String title, newspaper, date, like;
	ArrayList<String> news = null;
	
	public notice_DTO(String[] notice) {
		this.title = notice[0];
		this.newspaper = notice[1];
		this.date = notice[2];
		this.like = notice[3];
	}
	
	public ArrayList<String> news() {
		news = new ArrayList<String>();
		news.add(this.title);
		news.add(this.newspaper);
		news.add(this.date);
		news.add(this.like);
		return news;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(String newspaper) {
		this.newspaper = newspaper;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
}
