var a = "전역변수";
var z,k;   //전력변수를 선언암 한 상황

//this : 전역변수를 호출 할 때 사용하는 명령어
function aaa(){  //즉시 실행 함수
	var a = "a 지역변수 생성!!";
	console.log(this.a);  //전역변수의 값을 가져와서 출력
	console.log(a);  //지역변수의 a 변수값을 가져옴
	var b = "지역변수";
}

function bbb(){  //일반함수
	this.a = "aaa 변수 생성";   //전역변수 값을 변경함
	var b = "bbb에서 사용하는 지역변수";
	console.log(b);	
}

function aaa(){  //함수명이 중복 될 경우 기존에 사용딘 함수는 함수는 실행되지 않습니다.
	console.log("회원가입")
}
bbb();
aaa();  //함수 실행

function ccc(mid, mpass){  //(매개변수, 매개변수)
	console.log(mid);
	console.log(mpass);
}

ccc("hong", "a12345");  //인자겂 2개를 ccc 함수 전달
ccc(10, 20);          //인수값 2개를 ccc 함수 전달
ccc("kim", 20000);    //인자값 + 인수값 ccc 함수 전달
ccc("park");       //인자(인수) 하나만 적용 했을 경우 undefined 발생이 됨(매개변수는 2개)

function ddd(point){
	console.log(point);
}

ddd(10000, 5000);  //인수는 2개. 매개변수 1개 => 데이터 loss 발생

function box(){
	//2. 지역변수 생성 값을 적용
	var usernm = "홍길동";
	var userlevel = "일반회원";
	box2(usernm, userlevel)  //3. box2 함수에 인자겂을 적용하여 실행 
}

function box2(nm, level){  //4. 매개변수 전달값을 받음
	console.log(nm);       //5. 매개변수값을 출력
	console.log(level);
}

box(); //1. 함수 실행