package io;

import java.io.FileOutputStream;

//Stream (OutputSteam)
public class file15 {

	public static void main(String[] args) {
		String url = "D:\\site\\basic_html\\src\\main\\java\\io\\test.txt";
		String word = "[개인보호 정책 약관]!!!!";
		try {
			//FileOutputStream : 파일에 사용자가 입력한 내용을 저장하는 기능
			//true(기존 데이터 보존을 하고 쓰기), false(기본)-tofhdns epdlxjfh ejvdjTmrl
			FileOutputStream fs = new FileOutputStream(url, true);
			byte[] data = word.getBytes();  //문자를 무조건 byte로 변환 후 Stream에 저장
			fs.write(data);
			fs.flush();
			fs.close();
		}catch (Exception e) {
			System.out.println("해당 경로의 파일을 확인하지 못하였습니다.");
		}
	}

}
