package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/*
 * http://mekeyace.dothome.co.kr/imgs.zip 해당 파일을 다운받은 후
 * user라는 디렉토리 이미지를 압축 풀어 줍니다.
 * ftp라는 디렉토리에 이미지를 복사합니다. 단, 2MB(2097152) 이상되는 이미지는 복사하지 않습니다.
 * 또한 이미지 파일명을 다음과 같이 셋팅 합니다.
 * cdn_0.속성명
 * cdn_1.속성명
 * cdn_2.속성명
 * cdn_3.속성명
 * 다음 이름처럼 저장 되도록 하시오.
 */
public class file20 {

	public static void main(String[] args) {
		final int max_size = 2097152;
		String ori = "D:\\user\\";
		String tri = "D:\\ftp\\";
		File of = new File(ori);
		File allfile[] = of.listFiles();
		FileInputStream is = null;
		FileOutputStream os = null;

		try {
			int k = 0;
			while(k < allfile.length) {
				is = new FileInputStream(allfile[k]);
				if(is.available() < max_size) {
					byte[] by = new byte[is.available()];
					is.read(by);
					String filename = allfile[k].getName();
					int n = filename.lastIndexOf(".");
					String attr = filename.substring(n);
					os = new FileOutputStream(tri + "cdn_" + k + attr);
					os.write(by);	
					os.flush();
				}
				k++;
			}
			System.out.println("2MB 이상 이미지 파일 복사를 정상 완료하였습니다.");
			
		}catch (Exception e) {
			System.out.println("파일 경로에 문제가 있습니다.");
		}finally {
			try {
				os.close();
				is.close();
			}catch(Exception e) {
				System.out.println("파일이 정상적으로 닫히지 않았습니다.");
			}
		}
	}
}

