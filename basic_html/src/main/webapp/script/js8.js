var a = 1;   //큰 반복문 시작 값
do{
	var aa = 1;   //작은 반복문 시작 값
	do{
		//console.log(a + aa);  //연산에 대한 결과를 출력
		aa++;
	}while(aa < 11);  //작은 반복문 범위값
	a++;
}while(a < 11);  //큰 반복문 범위값


/*
응용문제7
구구단 2~4단 까지 2*1 ~ 4*9의 모든 결과값을 더해서 최종 값을 출력하시오.
*/

var sum = 0;
var x = 2;
do{
	var y = 1;
	do{
		sum += x * y;
		y++;
	}while(y <= 9);
	x++;
}while(x <= 4);
//console.log(sum);

/*
응용문제8
구구단 8~9단까지 모든 결과 숫자를 합하여, 짝수인지 홀수인지를 출력인지를
출력하는 코드를 작성하시오.
단, 결과는 최종합계는 짝수, 홀수 입니다. 라고 출력합니다. 
*/

var sum = 0;
var m = 8;
do{
	var n = 1;
	do{
		sum += m * n;
		n++;
	}while(n <= 9);
	m++;
}while(m <= 9);

if(sum % 2 == 0){
	console.log("최종합계는 " + sum + "이고, 짝수 입니다.")
}
else{
	console.log("최종합계는 " + sum + "이고, 홀수 입니다.")
}



