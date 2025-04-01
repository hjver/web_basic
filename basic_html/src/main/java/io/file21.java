package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//Buffered + Stream (동영상)
public class file21 {
	public static void main(String[] args) {
		new file21_box().copys();
	}
}

class file21_box{
	//영상 경로파일
	String mp = "D:\\site\\basic_html\\src\\main\\webapp\\nonono.mp4";
	String dir = "D:\\ftp\\";   //복사할 위치 디렉토리
	
	public void copys() {
		try {
			//InputStream : 부모 클래스
			InputStream is = new FileInputStream(this.mp);
			BufferedInputStream bs = new BufferedInputStream(is);
			byte file[] = new byte[bs.available()];  //buffered의 임시 데이터를 byte 변환
			OutputStream os = new FileOutputStream(dir + "mr.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			bs.read(file);  //전체 파일을 모두 읽어드림
			bos.write(file);  //buffered로 저장함
			bos.flush();
			bos.close();
			
			/* buffered 미사용을 저장하는 방식 */
			//os.write(file);  //해당 디렉토리에 다른 파일명으로 복사
			//os.flush();  //메모리를 비우는 작업
			
			os.close();
			bs.close();
			is.close();
			
		}catch(Exception e) {
			System.out.println("경로 및 영상 파일 올바르지 않습니다.");
		}
	}
}
