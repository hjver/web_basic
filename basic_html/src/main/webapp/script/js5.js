var a = 1;     //시작값
do{            //do시작
	//console.log(a);  //출력
	a++;       //증가, 감소
}while(a < 10);  //범위값


var b = 10;
do{
	//console.log(b);
	b--;
}while(b > 0);

var c = 60;
do{
	if(c % 2 == 0){  //나머자 값이 0으로 적용되었을 경우(짝수)
		//console.log(c);
	}
	c--;
}while(c > 0);

/* 
응용문제1
do~while문으로 다음과 같이 출력되는 코드를 작성하시오.
구구단 9단 중 찍수 값만 모두 합친 결과값을 출력하시오.
*/

var x = 1;
var y;
var sum = 0;  //짝수 합계를 적용하는 변수
do{
	y = 9 * x;   //9단 계산 결과
	if(y % 2 == 0){
		sum += y;
	}
	x++;
}while(x < 10);
//console.log("최종 짝수 합계 : " + sum);

/* 
응용문제2
do~while문 이용하여 코드를 작성합니다.
1~100까지 숫자 중 8의 배수중에서 60 이상인 숫자만 출력하시오.
*/

var k = 1;
do{
	if(k % 8 == 0 && k >= 60) { //8의 배수중에서 60 이상인 숫자
		console.log(k);
	}
	k++;
}while(k <= 100);



