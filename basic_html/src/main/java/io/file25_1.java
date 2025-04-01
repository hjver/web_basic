package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class file25_1 {
	public static void main(String[] args) throws Exception {
		new csv_in_out_1();
	}
}

class csv_in_out_1{
	String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\user.csv";
	String tri = "D:\\site\\basic_html\\src\\main\\java\\io\\";
	String company_file[] = {"SKT1.CSV", "KT1.CSV", "LGT1.CSV", "알들폰1.CSV"};
	ArrayList<ArrayList<String>> all = null;
	ArrayList<String> al = null;
	String user[] = null;
	File f = null;
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	public csv_in_out_1() throws Exception{
		this.csv_read();
		this.csv_write();
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
	
	private void csv_write() throws Exception{
		try {
			int w0=0, w1=0, w2=0, w3=0;
			boolean w0_is_new = false;
			boolean w1_is_new = false;
			boolean w2_is_new = false;
			boolean w3_is_new = false;
			for(ArrayList<String> al : this.all) {
				String csv_data = "";
				for(int k=0; k<al.size(); k++) {
					if(k == 0)
						csv_data += al.get(k);
					else
						csv_data += "," + al.get(k);
					
				}
				switch(al.get(1)){
				case "SKT":
					if(w0 != 0) {
						w0_is_new = true;
					}
					this.fw = new FileWriter(this.tri + this.company_file[0], Charset.forName("euc-kr"), w0_is_new);
					w0++;
					break;
				case "KT":
					if(w1 != 0) {
						w1_is_new = true;
					}
					this.fw = new FileWriter(this.tri + this.company_file[1], Charset.forName("euc-kr"), w1_is_new);
					w1++;
					break;			
				case "LGT":
					if(w2 != 0) {
						w2_is_new = true;
					}
					this.fw = new FileWriter(this.tri + this.company_file[2], Charset.forName("euc-kr"), w2_is_new);
					w2++;
					break;			
				case "알뜰폰":
					if(w3 != 0) {
						w3_is_new = true;
					}
					this.fw = new FileWriter(this.tri + this.company_file[3], Charset.forName("euc-kr"), w3_is_new);
					w3++;
					break;
				default:
					break;
				}
				this.bw = new BufferedWriter(this.fw);
				this.bw.write(csv_data + "\n");
				this.bw.flush();
			}			
		}catch(Exception e){
			System.out.println("해당 경로 또는 파일에 문제가 있습니다.");
		}finally {
			this.bw.close();
			this.fw.close();
		}
	}
}
