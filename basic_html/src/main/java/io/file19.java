package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

//파일 속성 및 디렉토리 리스트 + 다른 경로로 복사
public class file19 {

	public static void main(String[] args) {
		String dc = "D:\\copy\\";  //원본 디렉토리
		String dc2 = "D:\\copy2\\";  //복사할 디렉토리 (미생성)
		try {
			File of = new File(dc);
			File f = new File(dc2);
			boolean result = f.mkdir();  //mkdir : make Directory 디렉토리 생성 메소드
			//System.out.println(result);
			//f.delete();  //delete() : 파일삭제, 디렉토리 삭제
			File allfile[] = of.listFiles();  //해당 디렉토리의 모든 파일을 원배열로 변환
			System.out.println(Arrays.asList(allfile));
			System.out.println(Arrays.toString(allfile));
			
			//attr.java 예시를 응용(필수로 알아야함)
			int w = 0;
			while(w < allfile.length) {
				FileInputStream is = new FileInputStream(allfile[w]);
				byte[] by = new byte[is.available()];
				is.read(by);
				//파일명을 다른 이름으로 변경(lastIndexOf, indexOf, substring 모두다 문자열에만 적용)
				int n = String.valueOf(allfile[w]).lastIndexOf(".");
				
				//파일명 변환 파일명 형태 (예시 file0.jpg)
				String rename = "file" + w + String.valueOf(allfile[w]).substring(n);
				System.out.println(rename);
				
				//해당 복사할 디렉ㅌ리에 변경돤 파일명으로 저장
				FileOutputStream fs = new FileOutputStream(dc2 + rename);
				fs.write(by);  //파일 저장
				fs.flush();  //메모리를 비워둠
				fs.close();
				is.close();
				w++;
			}
			System.out.println("모든 파일 정상적으로 복사되었습니다.");
			
		}catch (Exception e) {
			System.out.println("디렉토리가 올바르지 않습니다.");
		}
	}

}
