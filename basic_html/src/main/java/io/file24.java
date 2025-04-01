package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//CSV 데이터 저장(엑셀 또는 구글 시트)
//http://mekeyace.dothome.co.kr/member.zip
public class file24 {
	public static void main(String[] args) {
		//new file_csv().csv_save();
		new file_csv().csv_load();
	}
}

class file_csv{
	String url = "D:\\site\\basic_html\\src\\main\\java\\io\\member.csv";
	File f = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	//해당 CSV 파일에 있는 데이커를 출력
	public void csv_load() {
		this.f = new File(url);
		try {
			this.fr = new FileReader(this.f, Charset.forName("euc-kr"));
			this.br = new BufferedReader(this.fr);
			String csv_data = "";
			while((csv_data = this.br.readLine()) != null) {
				//System.out.println(csv_data);
				//split은 해단 문자 기준으로 원시배열로 생성하는 메소드
				String user[] = csv_data.split(",");  
				if(user[1].equals("INTP")) {   //해당 되는 배열 값 중 INTP에 해당하는 요소
					System.out.println(user[0]);  //사용자명을 출력
				}
			}
		}catch(Exception e) {
			System.out.println("해당 경로에 CSV 파일이 존재하지 않습니다.");
		}
	}
	
	//해당 데이터 배열을 CSV에 저장 메소드
	public void csv_save() {
		try {
			//Charset.forName("euc-kr") : 한글전용 언어셋
			//csv 파일형태 (,) 기준으로 구분
			this.f = new File(url);  //해당 경로를 load 하는 객체 생성
			this.fw = new FileWriter(this.f, Charset.forName("euc-kr"));  //해당 파일에 데이터를 저장
			this.bw = new BufferedWriter(this.fw);  //메모리를 활용하여 파일에 저장시키는 방식
			List<String> mb = new ArrayList<String>();
			mb.add("유재석,ISFP");  //, 기준으로 열 구 부분하게 됨(csv)
			mb.add("강호동,ENFP");
			mb.add("조정석,INTP");
			mb.add("차은우,ENTP");
			
			for(String m : mb) {
				this.bw.write(m + "\n");
				//this.bw.flush();  //write 사용시 flush 메모리 초기화
			}
			this.bw.close();
			this.fw.close();
		}catch(Exception e) {
			System.out.println("해당 경로에 CSV 파일이 존재하지 않습니다.");
		}
	}
}