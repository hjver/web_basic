package basic_html;

import java.util.Arrays;

//1차 배열값을 2차 배열로 변경하시오.
public class arr5 {

	public static void main(String[] args) {
		String data1[] = {"hong", "kim", "park", "jang"}; //사용자 id
		String data2[] = {"1520", "1000", "3600", "4100"}; //포인트
		
		//위에 각각의 1차배열을 2차 배열 data3으로 생성되도록 코드를 작성하시오.
		//결과출력 [[hong, kim, park, jang], [1520, 1000, 3600, 4100]]
		
		String data3[][] = new String[2][data1.length];
		int z;
		for(z=0; z<data1.length; z++) {
			data3[0][z] = data1[z];
			data3[1][z] = data2[z];
		}	
		System.out.println("결과출력 : " + Arrays.deepToString(data3));

		/*
		 * 1차 배열 -> 2차 배열로 변환 응용편
		 * 90,22,16,13,8,42,49,37,1,9 해당 데이터가 있습니다. 짝수5개, 홀수5개가 있으며
		 * 각각 2차 배열로 짝수 그룹, 홀수 그룹으로 나누어서 출력 되도록 코드를 제작하시오.
		 * [[90, 22, 16, 8, 42], [13, 49, 37, 1, 9]]
		 */
		int no[] = {90,22,16,13,8,42,49,37,1,9};
		//홀수와 짝수의 카운팅을 각각 분리하여 그룹에 저장될 수 있도록 변수를 카운팅함
		int odd = 0;  //홀수
		int even = 0; //짝수
		int group[][] = new int[2][5];
		int ff;
		for(ff=0; ff < no.length; ff++) {
			if(no[ff] % 2 == 0) {  //짝수
				group[0][even] = no[ff];  //짝수일 경우 0번째 그룹에 데이털르 순차적으로 적용
				even++;
			}
			else {
				group[1][odd] = no[ff];  //홀수일 경우 0번째 그룹에 데이털르 순차적으로 적용
				odd++;
			}
		}

		System.out.println("결과출력 : " + Arrays.deepToString(group));
		
	}
}
