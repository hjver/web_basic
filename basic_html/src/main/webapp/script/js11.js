//var level = 3;  //숫자 type
var level = "3";  //문자 type => default로 적용됨

switch(level){
	case 1:
	//case ~ break 사이에 문법을 적용: if, else if, else, for, while, do~while
	//console.log("일반회원");
	break;   //break : 문법을 강제 종료하는 것을 말함
	
	case 2:
	//console.log("실버회원");
	break;

	case 3:
	//console.log("골드회원");
	break;
	
	case 4:
	//console.log("VIP회원");
	break;	

	default:  //else와 같은 설격을 가지고 있음
	//(case 외에 데이터값은 default)
	//console.log("비회원");
	break;	
}

//결제 시스템 사용자가 선택하는 결제항목
var pay = "card";
var msg = "";
switch(pay){          //multi case 사용방법
	case "card": case "CARD": case "신용카드":
	msg = "신용카드 결제";
	break;

	case "bank":
	case "BANK":
	case "계좌이체":
	msg = "계좌이체 결제";
	break;

	case "vbank":
	msg = "가상계좌이체 결제";
	break;

	case "card":
	msg = "신용카드 결제";
	break;

	default:
	msg = "해당 결제 서비는 사용 불가능";
	break;
}
//console.log(msg);

/*
으ㅡ용문제
다음과 같이 단축 단어를 입력 하였을 경우 통신사가 출력 되도록 합니다.
S,s => SKT, K,k => KT, L,l => LGT, 그 외 알뜰폰으로 출력되는 switch문을
작성하시오.
*/

c = "S";
msg = "";
switch(c){
	case "S": case "s":
	msg = "SKT";
	break;

	case "K": case "k":
	msg = "KT";
	break;

	case "L": case "l":
	msg = "LGT";
	break;

	default:
	msg = "알뜰폰";
	break;
} 
console.log(msg);







