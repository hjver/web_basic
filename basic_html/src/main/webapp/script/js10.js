//for문 while문 if문 사용 (짝수단만 출력)
var a;  //for문 변수
for(a=2; a<=9; a++){
	if(a % 2 == 0){
		var b=1;   //while 시자값 변수
		while(b <= 9){  //변수
			//console.log(a + "*" + b + "=" + a*b);  //출력
			b++;
		}
	}
}

/*
응용문제
구구단 2 ~ 8단까지 중 4단, 7단, 8단 만 출력하시오.
반복문은 do~while문 + for문
*/

var m = 2;
var n;
do{
	if(m==4 || m==7 || m==8){
		for(n=1; n<=9; n++){
			//console.log(m + "*" + n + "=" + m*n);
		}
	}
	m++;
}while(m <= 8);

/*
응용문제(**숙제**)
사용자가 2개의 숫자를 입력합니다. 2개의 숫자 범위 해당되는 구구단을 출력시키시오.
단, 작은 반복문에 작동시 짝수에 해당하는 정수만 사용합니다. (while + do while)
예시
var no = 3;
var no2 = 5;
3*2=
3*4=
...
5*8=
*/

var no = 4;
var no2 = 7;
do{
	g = 1
	while(g <= 9){
		if(g % 2 == 0){
			console.log(no + "*" + g + "=" + no*g);
		}
		g++;
	}
	no++
}while(no <= no2);




