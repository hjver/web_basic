/*
while, do~while 더블 사용시 작은 반복문에 대한 변수 선언을
안에 적용해야만 정상적으로 번영할수 있음
*/

var a = 2;    //큰 반복문 시작값
while(a <= 4){
	var aa = 1;    //작은 반복문 시작값
	while(aa <= 9){
		//console.log(a * aa);
		aa++;
	}
	a++;
}

/*
응용문제5
다음 결과 처럼 출력되는 더블 번복문 코드를 작성하시오(while 전용)
[결과]
7 * 9 = 63
7 * 8 = 56
...
3 * 1 = 3
*/

var i = 7;
while(i >= 3){
	var j = 9;
	while(j >= 1){
		//console.log(i + "*" + j + "=" + i*j);
		j--;
	}
	i--;
}

//더블 while문 + if문
//2단 ~ 9단 결과값이 40이상인 구구단만 출력

var h=2;
while(h <= 9){
	var hh=1;
	while(hh <= 9){
		sum = h * hh;
		if(sum >= 40){
			//console.log(h + "*" + hh + "=" + sum);
		}
		hh++;
	}
	h++;
}

/*
응용문제6
double while문 + if문을 이용하여 다음 결과가 나올수 있도록 출력하시오.
[결과]
구구단 6~8단까지 중 결과값이 홀수 및 짝수 각각의 총 합계를 출력하시오.
*/

var sum1=0, sum2=0;
var t;
var x=6;
while(x<=8){
	var y=1;
	while(y<=9){
		t = x * y;
		if(t % 2 != 0){
			sum1 += t;
		}
		else{
			sum2 += t;
		}
		y++;
	}
	x++;
}
//console.log("홀수 합게 : " + sum1);
//console.log("짝수 합게 : " + sum2);


//NaN 오류 : Not a Number
var k = 1;
var total;
while(k <= 10){
	//sum2 += k;
	total = total + k;
	k++;
}
console.log(total);
