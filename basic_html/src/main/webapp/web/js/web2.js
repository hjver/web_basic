function aaa(){
	//console.log(this.code);   //전역변수 호출
}

aaa();

/*
응용문제1 : bbb 함수를 실행 시켰을 경우
1~10까지 출력되는 코드를 작성하시오.
*/

function bbb(){
	var x;
	for(x=1; x<=10; x++){
		//console.log(x);
	}
}
bbb();

/*
응용문제2
ccc 라는 함수명을 만들고, 해당 함수에 2개의 인수값을 적용합니다.
첫번째 인수값과 두번째 인수값을 곱한 결과값을 출력하시오.
*/

function ccc(x, y){
	//인자겂을 매개변수를 받을 경우 문자를 숫자로 변경 Number()
	//var sum = Number(x) + Number(y);
	var sum = String(x) + String(y); //숫자 => 문자 : String
	//console.log(sum);
}
ccc(10, 20);

function idcheck(){    //이벤트 핸들링 함수
	/*
	document : 현재 페이지
	getElementById : 현재 페이지에서 id 이름
	alert : 경고 메세지
	readOnly : 읽기 전용 (true, false)
	style : css를 핸들링을 할 때 사용하는속성값
	value : 사용자가 입력한 값
	*/
	var id = document.getElementById("mid");
	if(id.value == ""){
		alert("아이디를 입력하세요");
	}
	else{
		alert("해당 아이디는 사용가능 합니다.");
		id.readOnly = true;
		id.style.backgroundColor = "skyblue";
	}
}

/* 
응용문제
상품가격이 10000 이며, 사용자가 포인트 금액 입력 합니다. 포인트 적용 이라는 버튼을 클릭시
해당 상품가격에서 포인트를 제외한 퇴종 결제 금액을 console로 출력하시오.
[결과] 옛; 포인트를 1500 적용시
최종금랙 : 8500
*/

function pay(){
	var product = document.getElementById("product");
	var point = document.getElementById("point");
	
	//HTML에서 사용자가 입력하는 모든 값은 문자. 사칙연산 중 -, *, / 은 숫자 자료형 없이 계산가능
	var result = Number(product.value) - Number(point.value);
	console.log("최종금액 : " + result);
}

/*
응용문제
전역변수 있는 인증번호와 동일 인증번호를 사용자가 입력 후 인증번호 확인 버튼을 클릭시
"정상적으로 인증이 완료 되었습니다." 라는 경고 메세지를 출력하시고
다른 인증번호를 입력시 "해당 인증번호가 올바르지 않습니다." 라는 경고 메세지를 출력하시오.
*/

function check(){
	var security = document.getElementById("security");
	if(security.value == this.code){
		alert("정상적으로 인증이 완료 되었습니다.");
	}else{
		alert("해당 인증번호가 올바르지 않습니다.");
	}
}






