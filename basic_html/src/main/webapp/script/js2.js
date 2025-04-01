var a = 150;
var b = 150;
/*
자료형 : number, string, boolean(true, false), object(배열)
*/
var c = "홍길동";
var d = true;
console.log(typeof(a)); //typedf => 자료형
console.log(typeof(c));
console.log(typeof(d));

// 연산기호 : ==, !=, <, >, <=, >=, ===, !==
if(a > b){
	console.log(a + "값이 큽니다.");
}
else if(a < b){
	console.log(b + "값이 큽니다.");
}
else{
	console.log("두 값이 같습니다.");
}

/*
응용문제1
다음 숫자를 계산하여 어느 값이 작은 값인지 출력하시오.
단, 변수는 2개만 사용하빈다.
1. 25 * 6 + 11 + 42
2. 33 + 7 * 14 * 8
*/

var x = 25 * 6 + 11 + 42;
var y = 33 + 7 * 14 * 8;
if (x < y){
	console.log("첫번째가 작은 값입니다.");
}
else if (x > y){
	console.log("두번째가 작은 값입니다.");
}
else{
	console.log("두 값이 같습니다.");
}


/*
응용문제2
1~120까지의 숫자를 임의로 변수에 입력 합니다.
다음과 같이 결과가 console.log 출력되도록 합니다.
10미만의 숫자 입니다.
10이상의 숫자 입니다.
20이상의 숫자 입니다.
45이상의 숫자 입니다.
100이상의 숫자 입니다.
*/

var user = 16;
if (user >= 100) {
	console.log("100이상의 숫자 입니다.");
}
else if (user >= 45) {
	console.log("45이상의 숫자 입니다.");
}
else if (user >= 20) {
	console.log("20이상의 숫자 입니다.");
}
else if (user >= 10) {
	console.log("10이상의 숫자 입니다.");
}
else {
	console.log("10미만의 숫자 입니다.");
}

/* 
논리 연산자 : &&(AND), ||(OR)
논리 연산자를 사용하는 이유는 여러가지의 조건을 복합적으로 체크하는 역할

*/
var mid = "kim";
var mpass = "a123";
if(mid == "kim" && mpass == "a1234"){
	console.log("로그인 하였습니다.");
}
else{
	console.log("아이디 또는 패스워드를 확인하세요.");
}


/*
응용문제3(논이 연산기호를 사용하여)
사용자가 임의 숫자를 하나 입력합니다.
숫자의 이벽 범위는 1~150사이의 숫자를 입력하게 됩니다.
다음과 같이 임의 숫자에 맞는 결과 값을 출력하는 코드를 작성하시오.
"1~50까지의 범위 숫자 입니다."
"51~100까지의 범위 숫자 입니다."
"101~150까지의 범위 숫자 입니다."
"숫자는 1~150까지만 입력 가능합니다."
*/

var num = 120;
if (num >=1 && num <= 50){
	console.log("1~50까지의 범위 숫자 입니다.");
}
else if (num >=51 && num <= 100){
	console.log("51~100까지의 범위 숫자 입니다.");
}
else if (num >=101 && num <= 150){
	console.log("101~150까지의 범위 숫자 입니다.");
}
else{
	console.log("숫자는 1~150까지만 입력 가능합니다.");	
}

// 나머지를 이용하여 짝수, 홀수 값을 구분하는 방법
var n  = 102;
if(n % 2 == 0){
	console.log("찍수 값 입니다.")
}
else if(n % 2 != 0){
	console.log("홀수 값 입니다.")
}







