package basic_html;

import java.util.ArrayList;
import java.util.Comparator;

public class notice_list {
	public static void main(String[] args) {
		notice_list_box nl = new notice_list_box();
		nl.view_list();
	}
}

class notice_list_box{
	datalist list = null;
	String[][] notice = null;
	notice_DTO dto = null;
	ArrayList<String> news = null;
	ArrayList<ArrayList<String>> news_list = null;
	
	public void view_list() {
		this.list = new datalist();
		this.news_list = new ArrayList<ArrayList<String>>();
		this.notice = list.notice();
		int z;
		for(z=0; z<notice.length; z++) {
			this.dto = new notice_DTO(this.notice[z]);
			this.news = this.dto.news();
			this.news_list.add(this.news);
		}
		
		for(z=0; z<news_list.size(); z++) {
			System.out.println(news_list.size()-z + ". " + this.news_list.get(z).get(0) + " - " + this.news_list.get(z).get(1) + " [" + this.news_list.get(z).get(2) + "]");
		}
	}
}
