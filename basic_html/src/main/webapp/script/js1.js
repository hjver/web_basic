//js 주석코드 (Javascript => ES)
console.log("js 파일 정상로드");  //console.log() => 결과값응 임시 도구틀에 출력

// var : 변수를 선언하는 선언문
// "" : 문자값
var a = "유관순";
a = "이순신";
var login = a + "님 환영합니다.";
console.log(login);

//+ : 문자와 문자를 결합, 숫자를 게산하는 기능
var b = 50;    //숫자는 ""를 사용하지 않음
var c = 25;
var sum = b + c;  // +, -. /, *, %
console.log(sum);

var point = 5000;
var sum2 = point * 2 + 10000 * 2;
console.log(sum2);

/* 
응용문제 : 55000 상품가격이 있습니다.
해당 상품가겨을 20% 할인된 갸격을 출력시키시오.
*/
var product = 55000;
var result = product * (1 - 0.2);
console.log(result);

var userid = "hong";  //사용자 아이디
var userpw = "a123456"; //사용자 패스워드

//조건문 if문 ~ elseif, else
if(userid == "hong"){   //무조건 if로 시작
	console.log("동일한 아이디 입니다.");
}
else{    //else는 if외에 모든 조건 사항을 말합니다.
	console.log("아이디가 다릅니다.");
}

if(userpw == "a123456"){
	console.log("패스워드가 확인 되었습니다.");	
}
else if(userpw != "a123456"){
	console.log("패스워드가 다릅니다.");	
}

//아이디와 패스워드를 모두 검토 조건문 (if문 안에 if문)
if(userid == "hong"){   //아이디 체크
	if(userpw == "a123456"){
		console.log("로그인 하셨습니다.");
	}
	else{
		console.log("패스워크가 올바르지 않습니다.");
	}
}
else{
	console.log("아이디가 다릅니다.")
}


 