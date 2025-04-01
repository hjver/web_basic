package io;

import java.io.FileWriter;

/*
 * 응용문제 gugu.txt 파일을 이용하여 해당 파일에 데이터가 입력되도록 코드를 작성하시오.
 * 구구단 8단이 입력되도록 합니다.
 * [결과]
 * 8 * 1 = 8
 * 16
 * 24
 * ..
 * 64
 */
public class file5 {
	public static void main(String[] args) {
		try {
			new files_box().gugudan();
		} catch(Exception e) {
			System.out.println("해당 메소드가 잘못 되었습니다.");
		}
	}
}

class files_box{
	String url = "D:\\site\\basic_html\\src\\main\\java\\io\\gugu.txt";
	FileWriter fw = null;
	
	//throws Exception : try~catch 없이 운용이 가능함
	public void gugudan() throws Exception {
		this.fw = new FileWriter(this.url, true);
		for(int k=1; k<=9; k++) {
			//this.fw.write("" + 8*k + "\n");
			String sum = "8 * " + k + " = " + 8*k;
			this.fw.write("\n" + sum);
		}
		System.out.println("8단이 잘 작성되었습니다.");
		this.fw.close();
	}
}