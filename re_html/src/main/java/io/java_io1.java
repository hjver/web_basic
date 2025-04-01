package io;
import java.util.Arrays;
//필수로 해당 코드 중 사용하는 라이브러리가 정상적으로 로드되었는지 필수적으로 확인!!
import java.util.Scanner;
import java.io.*;

//io 복습1
/*
 * I/O => try ~ catch 필수
 * String : Reader, Writer
 * byte : InputStream, OutputStream
 * memory : Buffered => 단독으로 사용하지 않음
 */
public class java_io1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			/*  //해당 코드중에 중요사항 : 디렉토리 생성 후 파일 생성
			System.out.println("해당 파일을 생성할 디렉토리 경로 및 파일명을 입력하세요 : ");
			String url = sc.nextLine();  //사용자가 지정한 경로 및 파일명 입력
			File f = new File(url);
			f.mkdir();
			f.createNewFile();  //io 해당 경로에 파일을 생성하는 역할
			*/
			
			System.out.println("불러올 디렉토리 경로를 입력하세요 : ");
			String url = sc.nextLine();
			File f = new File(url);
			//list(): 문자 원시 배열, listFiles() : File 자료형 배열
			String filename[] = f.list();  //파일명
			System.out.println(Arrays.asList(filename));
			
			//listFiles() : File 원시배열. 파일명을 로드할 경우 .getName()
			File f2 = new File(url);
			File filenm[] = f2.listFiles();  //디렉토리명 포함 + 파일명
			System.out.println(Arrays.asList(filenm));
			System.out.println(filenm[0].getName());
		}
		catch(Exception e) {
			
		}
		finally {
			sc.close();
		}
	}

}
