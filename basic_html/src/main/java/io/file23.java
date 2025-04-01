package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Stream + Reader, Writer + Buffered (응용편)
/*
 * InputStream > BufferedReader (X)
 * InputStream > BufferedInputStream (O)
 * InputStreamReder > BufferedReader (O)
 * InputStream > InputStreamReader > BufferedReader (O)
 * FileinputStream > BufferedReader (X)
 */
public class file23 {
	public static void main(String[] args) throws Exception{
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\paper.txt";
		File f = new File(url);
		FileOutputStream fs = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		FileInputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			/* 
			 * FileOutStream(byte로 최종저장) > 
			 * OutputStreamWriter(String -> Byte > 
			 * BufferedWriter(메모리에 문자를 등록)
			 */
			/*
			fs = new FileOutputStream(f, true);
			osw = new OutputStreamWriter(fs);
			bw = new BufferedWriter(osw);
			bw.append("홍길동님 5000원 결제 되었습니다.");
			bw.newLine();
			bw.append("삼성카드 5000원 결제!!");
			*/
			
			//input 파일 로드
			is = new FileInputStream(f);  //byte
			isr = new InputStreamReader(is);  //byte => String
			br = new BufferedReader(isr);  //String
			//System.out.println(br.readLine());
			String txt = "";
			while((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
		}
		catch(Exception e) {
			
		}
		finally {
			/*
			bw.close();
			osw.close();
			fs.close();	
			*/	
			br.close();
			isr.close();
			is.close();
		}
	}
}
