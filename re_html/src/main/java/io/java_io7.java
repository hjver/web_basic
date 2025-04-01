package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Stream (ASCII + Binary) - Byte
/*
 * Binary : 2진법 0, 1
 * txt, pdf, jpeg, mp4, exe, bat
 * 
 * Binary 다루는 대표적 언어 : C, C++, java, python
 * 
 * 한글.jpg 한글.txt => Server => cdn0.jpg
 * 
 * Mb : Mega bit
 * MB : Mega byte
 */
public class java_io7 {

	public static void main(String[] args) {
		String url = "D:\\ftp\\data.txt";
		try {
			/*
			 * 1. Stream : File => InputSteam 추가
			 * 2. InputSteam(문자경로) 핸들링도 가능함
			 */
			//File f = new File(url);
			InputStream is = new FileInputStream(url);
			System.out.println(is.available());  //파일 전체 용량(byte)
			byte data[] = new byte[is.available()]; //1024 = 1KB
			is.read(data);  //전체를 모두 읽어들임
			is.read(data, 0, 5); //read(byte, 0, 범위 byte 크기)
			String word = new String(data);
			System.out.println(word);
			
			List<Byte> data2 = new ArrayList<>(is.available());
			//is.read(data2); //오류 -> is.read(원시 byte배열만 가능)
			
			//List<byte[]> alldata = new ArrayList<>(Arrays.asList(data));
			//System.out.println(new String(alldata.get(0)));
			
			is.close();
			
		}catch(Exception e) {
			
		}finally {
			
		}
	}
}

//부가적인 설명 : 클래스 배열
class ex{
	
	public ex() {
		List<String> result = this.bbb();
		File abc = this.kkk();
		InputStream is = this.zzz();
	}
	public InputStream jjj() {
		return null;
	}
	public FileInputStream zzz() {
		return null;
	}
	public File kkk() {
		return null;
	}
	public ArrayList<String> aaa(){
		return null;
	}
	public List<String> bbb(){
		List<String> rdata = new LinkedList<>();
		return rdata;
	}
	public LinkedList<String> ccc(){
		return null;
	}
	public Map<String, String> ddd(){
		return null;
	}
	public HashMap<String, String> eee(){
		return null;
	}
}