package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

//강사 코드
public class file20_1 {
	public static void main(String[] args) {
		new upload();
	}
}

class upload{
	String dir1 = "D:\\user\\";    //원본 디렉토리
	String dir2 = "D:\\ftp\\";     //이미지를 복사하는 위치 디렉토리
	FileInputStream fs = null;     //해당 파일을 로드(read)
	FileOutputStream os = null;    //해당 파일을 저장(save)
	byte[] file = null;            //해당 파일의 크기는 byte로 분할하여 배열화
	//File arr1[] = null;            //원본 디렉토리 파일리스트를 저장하는 배열
	ArrayList<File> arr = null;    //원본 디렉토리 파일리스트를 저장하는 ArrayList
	Integer limit_size = 2097152;  //파일 용량 제한 크기(byte)
	
	public upload() {
		this.copyfile();
	}
	
	private void copyfile() {
		File f = new File(this.dir1);  //해당 디렉토리를 호출
		//File f2 = new File(this.dir2);  //File : 파일 크기, 디렉토리 생성, 삭제
		//this.arr1 = f.listFiles();  //해당 디렉토리의 파일을 모두 원시배열로 전환
		//System.out.println(Arrays.asList(this.arr1));
		this.arr = new ArrayList<File>(Arrays.asList(f.listFiles()));
				//해당 디렉토리의 파일을 ArrayList로 전환
		//System.out.println(this.arr);
		int w = 0;  //파일명을 0~ 순서대로 적용하기 위한 변수
		try {
			for(File filenm : this.arr) {
				this.fs = new FileInputStream(filenm);
				if(this.fs.available() <= this.limit_size) {
					//파일 어떤 형태로 구분하여 로드 상황을 구성
					this.file = new byte[this.fs.available()]; 
					this.fs.read(this.file);
					//파일 속성 타입 .기준으로 가져옴 => 예시 .png, .jpeg
					int n = String.valueOf(filenm).lastIndexOf(".");
					String rename = "cdn_" + w + String.valueOf(filenm).substring(n);
					
					//해당 원본 파일을 이름변경하여 ftp 디렉토리에 복사
					this.os = new FileOutputStream(this.dir2 + rename);
					this.os.write(this.file);
					this.os.flush();
					this.os.close();
					w++;  //해당 조건에 맞을 경우 +1씩 증가하여 파일명에 순차적으로 적용
				}
				this.fs.close();  //해당 조건과는 관계없이 해당 파일을 종료
			}
			System.out.println("2MB 이하의 이미지를 모두 복사 완료 하였습니다.");
		}catch(Exception e) {
			System.out.println("해당 경로 및 파일을 확인해 주시기 바랍니다!!");
		}
		
	}
}