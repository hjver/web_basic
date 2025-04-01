package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//강사 코드
public class file25_0 {
	public static void main(String[] args) {
		new csv_members();
	}
}

class csv_members{
	//DTO 클래스를 필드에 로드 하여 setter, getter 활용함
	io_DTO dto = null;
	//원본 데이터 파일
	String url = "D:\\site\\basic_html\\src\\main\\java\\io\\user.csv";
	String copys = "D:\\site\\basic_html\\src\\main\\java\\io\\";
	
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	final String telcorp[] = {"SKT", "KT", "LGT", "알뜰폰"};
	
	public csv_members() {
		this.dto = new io_DTO();
		try {
			this.check_members();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("각 통신사별 분배작업 및 저장 오류 발생");
		}
	}
	
	//각 통신사별 뷴배작업 및 저장
	private void check_members() throws Exception {
		File f = new File(this.url);  //원본
		//File f2 = new File(this.copys);  //
		try {
			int w = 0;
			//각 통신사별로 csv를 분할하여 
			while(w < telcorp.length) {
				List<List<String>> result = this.corp_arr(this.telcorp[w], f);
				
				//2차배열 데이터 foreach로 반복하여 해당 파일에 데이터를 저장함
				for(List<String> p : result) {
					String newfile = this.copys + this.telcorp[w] + "0.csv";
					//join : split 반대 형태 메소드이며, 배열을 해 당 문자기준으로 문자열을 변환 
					String word = String.join(",", p);
					//System.out.println(word);
					//해당 파일을 생성하면서 데이터를 보존(true)하도록 셋팅한 코드
					this.os = new FileOutputStream(newfile, true); //객체 생성시 파일도 생성
					//byte => String : 언어셋 변경
					this.osw = new OutputStreamWriter(this.os, Charset.forName("euc-kr"));
					//String => 메모리에 등록시켜서 저장
					this.bw = new BufferedWriter(this.osw);
					this.bw.write(word);
					this.bw.newLine();  // \n과 동일함
					this.bw.flush();  //메모리를 비워서 재활용 할 수 있도록 조정
				}
				
				w++;
			}
		}
		catch(Exception e) {
			System.out.println("파일이 올바르게 생성 및 데이터 오류 발생하였습니다.");
		}
		finally {
			this.bw.close();
			this.osw.close();
			this.os.close();
		}
	}
	
	//해당 파일을 오픈하여 1차배열에 해당 데이터를 모두 수집하고 2차배열로 연동 메소드
	//메소드의 매개변수는 다양한 자료형 선언문을 생성할 수 있습니다.
	//(매개변수) => String, Integer, String[], int, File, ArrayList...
	private List<List<String>> corp_arr(String corp, File f) throws Exception{
		List<List<String>> csvdata = new ArrayList<List<String>>();  //2차배열 return
		try {  //프로세스 진행
			this.is = new FileInputStream(f);  //해당 경로에 파일을 load
			this.isr = new InputStreamReader(this.is, Charset.forName("euc-kr"));  //byte => String
			this.br = new BufferedReader(this.isr);  //String 데이터를 메모리네 저장
			
			String data = "";  //Buffered에 있는 문자를 담는 역할을 하는 변수
			
			//해당 조건형태 buffer에 더 이상 문자가 없을 경우 반복문 종료
			while((data=this.br.readLine()) != null) {
				List<String> recall = new ArrayList<String>();
				String part[] = data.split(",");
				if(part[1].equals(corp)) {
					this.dto.setNm(part[0]);    //고객명
					this.dto.setCorp(part[1]);  //통신사
					this.dto.setBirth(part[2]); //생년월
					recall = this.dto.datalist();  //dto에서 생성된 1차 배열값을 return
					csvdata.add(recall);  //생성된 1차 배열을 2차 배열에 추가 
				}
			}
			
		}catch(Exception e) {  //예외 처리
			System.out.println("파일 불러오기에 대한 오류가 발생 하였습니다.");
		}finally {  //파일 종료
			this.br.close();
			this.isr.close();
			this.is.close();
		}

		return csvdata;
	}
}