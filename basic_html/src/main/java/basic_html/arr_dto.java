package basic_html;

import java.util.ArrayList;

//DTO : 데이터 전송 객체 (setter, getter, 1차 클래스 배열)
//setter를 먼저 실행하고 getter를 실행하게 되면 값을 정상적으로 가져올수 있음
public class arr_dto {
	String name, email, id, passwd;

	//1차 클래스 배열
	public ArrayList<String> member(){
		//1차 클래스 배열을 생성
		ArrayList<String> m = new ArrayList<String>();
		//getter 메소드를 실행시켜서 setter값을
		m.add(getName());
		m.add(getEmail());
		m.add(getId());
		m.add(getPasswd());
		
		return m;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {  //getter => 전역변수의 값을 가져오는 역할
		return name;
	}

	public void setName(String name) { //setter => 전역변수의 값을 이관하는 하는 역할
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
