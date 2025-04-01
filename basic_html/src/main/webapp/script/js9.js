var a;  //for문의 사용하는 변수
for(a=2; a<=5; a++){
	var b = 1;   //while문에서 사용하는 변수
	while(b<=9){
		//console.log(a + "*" + b + "=" + a*b);  //결괴
		b++;
	}
}

/* 응용문제 dowhile + for문으ㅗ 위아 같은 결과를 출력하는 코드를 작성하시오. */
var x = 2;
var y;
do{
	for(y=1; y<=9; y++){
		//console.log(x + "*" + y + "=" + x*y)
	}
	x++;
}while(x <= 5);

/* 
응용문제
사용 반복문은 do~while문 while문을 이요앟여 코드를 작성합니다.
결과에 대힌 사항은 다음괴 같습니다.
2*2=4
3*2=6
3*3=9
4*2=8
4*3=12
4*4=16
5*2=10
5*3=15
5*4=20
5*5=25
*/

var x = 2;
do{
	var y = 2;
	while(y <= x){
		//console.log(x + "*" + y + "=" + x*y);
		y++;
	}
	x++;
}while(x <= 5);

/*
숙제1
반복문은 do~while문 for문을 이용하여 코드를 작성합니다.
다음 결과 처럼 출력이 되어야 합니다.
구구단 6단 ~ 2단까지 역순으로 출력되는 결과
6 * 9 =
6 * 8 =
...
2 * 1 =
*/
var p = 6;
var q;
do{
	for(q=9; q>=1; q--){
		console.log(p + "*" + q + "=" + p*q);
	}
	p--;
}while(p >= 2);
