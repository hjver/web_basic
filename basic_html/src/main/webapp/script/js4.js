var a = 1;    //시작값
while(a < 11){   //범위값
	//console.log(a);
	a++;         //증가, 감소 * 증가 또는 감소를 적용하지 않을 경우 loop
}

// while문 역순
var b= 10;
while(b > 0){
	//console.log(b);
	b--
}

//구구단 7단  7*1= ~ 7*9+
var c = 1;
while(c <= 9){
	//console.log(7 + "*" + c + "=" + 7*c);
	c++;
}

//while + if문 (홀수만) 1 ~10까지
var d = 1;
while(d < 11){
	if(d % 2 == 1){
		//console.log(d);
	}
	d++;
}

/*
응용문제(숙제)
while문과 조건문을 이요앟여 다음과 같은 결과가 되도록 코드를 작성하시오
1 ~ 100까지 숫자 중 5의 배수만 출력 되도록 합니다.
*/
var i = 1;
while(i <= 100){
	if(i % 5 == 0){
		console.log(i);
	}
	i++;
}

/*
응용숙제 : 반복문(for)를 이용하여 다음과같은 결과가 나오도록 출력
1~10 모든 수자를 합한 결과값을 출력
*/
var sum = 0;
for(var i=0; i<=10; i++){
	sum += i
}
console.log("1~10범위 모든 숫자 합계 : " + sum);

/*
응용문제 숙제
1~20까지의 숫자 반복문 중 짝수, 홀수 가각의 최종합계를 출력하는
ㅋ드를 작성하시오.
2 4 6 8 10 12 14 16 18 20
짝수 :
1 3  5 7 9 11 13 15 17 19
홀수 :
*/
var sum1 = 0;
var sum2 = 0;
for(var i=1; i<=20; i++){
	if(i % 2 == 0){
		sum1 += i;
	}
	else{
		sum2 += i;
	}
}
console.log("1~20범위 짝수 최종 합계 : " + sum1);
console.log("1~20범위 홀수 최종 합계 : " + sum2);

/* 사용자가 직접 2개의 숫자를 입력시 반복문으로 작동되는 코드
딘, 첫번째 입력값보다 두번째 입력값이 더 큰 숫자를 무조건 입력
*/
var no1 = 25;
var no2 = 17;
if(no1 > no2){
	console.log("숫값을 잘못 입력하셨습니다.")
}
else if(no1 == no2){
	console.log("두 숫자값이 같으므호 입력을 다시 적용하세요.")
}
else{
	while(no1 < no2){  //변수를 서로 비교하여 반복문 적용
		console.log(no1)
		no1++;
	}
}