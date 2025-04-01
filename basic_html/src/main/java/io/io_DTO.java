package io;

import java.util.ArrayList;
import java.util.List;

//고객명, 통신사, 생일
public class io_DTO {
	String nm, corp, birth;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	//List 1차배열을 생성 (getter 메소드를 이용)
	public List<String> datalist(){
		List<String> all = new ArrayList<String>();
		all.add(getNm());  //고객명
		all.add(getCorp());  //통신사
		all.add(getBirth());  //생년월
		return all;
	}
}
