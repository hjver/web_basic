package io;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
/*
 * ASCII 형태의 파일 복사하는 형태
 * 1. 생성할 파일을 제작해야 함 (경로에 해당 파일이 있어야 함)
 * 2. 원본파일과 복사할 파일을 로드하여 데이터를 복사 시킵니다.
 */
public class file10 {

	public static void main(String[] args) {
		//복사할 파일을 생성
		//File => 디렉토리 설정 => createNewFile() => 기존 데이터를 복사할 파일 이관
		
		String ori = "D:\\site\\basic_html\\src\\main\\java\\io\\agree.txt";
		String ori_copy = "D:\\\\site\\\\basic_html\\\\src\\\\main\\\\java\\\\io\\\\agree2.txt";
		
		//io + nio
		File f1 = new File(ori);   //io
		File f2 = new File(ori_copy);
		
		try {
			//io
			//f2.createNewFile();
			
			//nio(Files)
			//Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
			//-------------------------------------------------------------
			//io(RandomAccessFiles(부모) - interface)
			//r : read(읽기), w : write(쓰기), x : execution(실행)
			//RandomAccessFiles(자식클래스) : 해당 파일 권한에 맞춰서 쓰기, 읽기 설정하는 클래스
			RandomAccessFile f3 = new RandomAccessFile(ori, "r");
			RandomAccessFile f4 = new RandomAccessFile(ori_copy, "rw");
			//-------------------------------------------------------------
			//FileChennal : nio 클래스 (파일 읽기, 쓰기, 맵핑)
			FileChannel fc = f3.getChannel();
			System.out.println(fc.size());  //byte 크기
			FileChannel fc2 = f4.getChannel();
			fc.transferTo(0, fc.size(), fc2);
		}
		catch(Exception e) {
			System.out.println("경로 및 파일명 오류 발생!!");
		}
	}
}
