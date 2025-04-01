package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class file25_2 {

	public static void main(String[] args) throws Exception{
		String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\user.csv";
		String tri = "D:\\site\\basic_html\\src\\main\\java\\io\\";
		String company_file[] = {"SKT2.CSV", "KT2.CSV", "LGT2.CSV", "알들폰2.CSV"};
		BufferedReader br = new BufferedReader(new FileReader(ori, Charset.forName("euc_kr")));
		FileWriter fw = null;
		String user[] = null;
		int w0=0, w1=0, w2=0, w3=0;
		boolean w0_is_new = false;
		boolean w1_is_new = false;
		boolean w2_is_new = false;
		boolean w3_is_new = false;
		String data = "";
		while((data = br.readLine()) != null) {
			user = data.split(",");
			switch(user[1]){
			case "SKT":
				if(w0 != 0) {
					w0_is_new = true;
				}
				fw = new FileWriter(tri + company_file[0], Charset.forName("euc-kr"), w0_is_new);
				w0++;
				break;
			case "KT":
				if(w1 != 0) {
					w1_is_new = true;
				}
				fw = new FileWriter(tri + company_file[1], Charset.forName("euc-kr"), w1_is_new);
				w1++;
				break;			
			case "LGT":
				if(w2 != 0) {
					w2_is_new = true;
				}
				fw = new FileWriter(tri + company_file[2], Charset.forName("euc-kr"), w2_is_new);
				w2++;
				break;			
			case "알뜰폰":
				if(w3 != 0) {
					w3_is_new = true;
				}
				fw = new FileWriter(tri + company_file[3], Charset.forName("euc-kr"), w3_is_new);
				w3++;
				break;
			default:
				break;
			}	
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data + "\n");
			bw.flush();
			bw.close();
			fw.close();
		}
	}

}
