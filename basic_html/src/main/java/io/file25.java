package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

//CSV 데이터 응용편
//http://mekeyace.dothome.co.kr/user.csv
/*
 * 해당 데이터를 운영팀에서 전달 받은 상황입니다. 해당 csv 데이터 값을 사용하여
 * 다음과 같은 결과가 되도록 코드를 작성합니다.
 * 
 * 사용자 정보 중 통신사 입니다. SKT, KT, LGT, 알뜰폰 구분이 되어 있는 상황입니다.
 * 각각의 통신사별로 CSV를 저장하시오.
 * SKT.CSV
 * KT.CSV
 * LGT.CSV
 * 알뜰폰.CSV
 */
public class file25 {
	public static void main(String[] args) throws Exception{
		new csv_in_out();
	}
}

class csv_in_out{
	String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\user.csv";
	String tri = "D:\\site\\basic_html\\src\\main\\java\\io\\";
	String company_file[] = {"SKT.CSV", "KT.CSV", "LGT.CSV", "알들폰.CSV"};
	ArrayList<ArrayList<String>> all = null;
	ArrayList<ArrayList<String>> skt = null;
	ArrayList<ArrayList<String>> kt = null;
	ArrayList<ArrayList<String>> lgt = null;
	ArrayList<ArrayList<String>> adf = null;
	ArrayList<ArrayList<String>> company_data[] = null;
	ArrayList<String> al = null;
	String user[] = null;
	File f = null;
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	public csv_in_out() throws Exception{
		this.csv_read();
		this.data_handling();
		this.csv_write(0, this.skt);
		this.csv_write(1, this.kt);
		this.csv_write(2, this.lgt);
		this.csv_write(3, this.adf);
	}
	
	private void csv_read() throws Exception{
		this.all = new ArrayList<ArrayList<String>>();
		this.f = new File(this.ori);
		try {
			this.fr = new FileReader(this.f, Charset.forName("euc_kr"));
			this.br = new BufferedReader(this.fr);
			String data = "";
			while((data = br.readLine()) != null) {
				this.user = data.split(",");
				this.al = new ArrayList<String>(Arrays.asList(user));
				this.all.add(this.al);
			}
		}
		catch(Exception e) {
			System.out.println("해당 경로 또는 파일에 문제가 있습니다.");
		}
		finally {
			this.br.close();
			this.fr.close();
		}
	}
	
	private void data_handling() {
		this.skt = new ArrayList<ArrayList<String>>();
		this.kt = new ArrayList<ArrayList<String>>();
		this.lgt = new ArrayList<ArrayList<String>>();
		this.adf = new ArrayList<ArrayList<String>>();
		
		for(int k=0; k<this.all.size(); k++) {
			switch(this.all.get(k).get(1)) {
			case "SKT":
				this.skt.add(this.all.get(k));
				break;
			case "KT":
				this.kt.add(this.all.get(k));
				break;			
			case "LGT":
				this.lgt.add(this.all.get(k));
				break;			
			case "알뜰폰":
				this.adf.add(this.all.get(k));
				break;
			default:
				break;
			}
		}
		
		try {
			this.company_data[0] = this.skt;
			this.company_data[1] = this.kt;
			this.company_data[2] = this.lgt;
			this.company_data[3] = this.adf;			
		}catch(Exception e) {
			
		}
	}
	
	private void csv_write(int n, ArrayList<ArrayList<String>> company) {
		try {
			this.fw = new FileWriter(this.tri + this.company_file[n], Charset.forName("euc-kr"));
			this.bw = new BufferedWriter(this.fw);
			for(ArrayList<String> al : company) {
				String csv_data = "";
				for(int k=0; k<al.size(); k++) {
					if(k == 0)
						csv_data += al.get(k);
					else
						csv_data += "," + al.get(k);
					
				}
				System.out.println(csv_data);
				this.bw.write(csv_data + "\n");
				this.bw.flush();
			}
			this.bw.close();
			this.fw.close();
			
		}catch(Exception e){
			System.out.println("해당 경로 또는 파일에 문제가 있습니다.");
		}finally {
			
		}
	}
}