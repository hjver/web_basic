package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

//Stream으로 이미지를 활용하는 형태
public class file17 {

	public static void main(String[] args) {
		//원본 이미지
		String ori_img = "D:\\site\\basic_html\\src\\main\\java\\io\\img.jpg";
		try {
			FileInputStream fs = new FileInputStream(ori_img);
			//전체복사
			//byte by[] = new byte[fs.available()];
			
			//부분복사
			byte by[] = new byte[fs.available() / 100];
			//fs.read(by);  //파일 이미지를 모두 읽어드림
			
			//사본 이미지 경로 및 파일명 (복사시 파일 속성을 강제 변경할 경우 오류가 발생할 수 있음
			String copy_img = "D:\\site\\basic_html\\src\\main\\java\\io\\";
			FileOutputStream os = new FileOutputStream(copy_img+"img2.jpg");
			//os.write(by);  //원본 이미지를 복사 이미지로 copy 함
			
			//Progess bar 만들기
			int w = 0;  //읽은 바이트 수
			int check = 0;  //읽은 횟수
			while(true) {
				w = fs.read(by);  //전체용량 / 100 => 전체파일 용량을 1% 부분으로 나눔
				if(w == -1) {
					break;
				}
				else {
					//해당 byte만큼 지속적으로 이미지를 조합하여 사용하는 방식
					//(byte객체이름, 0, 읽은 byte 숫자)
					os.write(by, 0, w);
				}
				check++;
				if(check % 2 == 0) {  //progress 진행 상황
					System.out.println(check + "%");
				}
			}
						
			os.flush();
			os.close();
			fs.close();
			
		}catch (Exception e) {
			System.out.println("해당 이미지 경로가 잘못 되었습니다.");
		}
	}

}
