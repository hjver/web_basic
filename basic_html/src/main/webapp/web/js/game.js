/*
1 : 주먹
2 : 보
3 : 가위
*/

var userno = 0;   //사용자기 뽑은 값을 저장하는 전역변수

function usergame(n){  //사용자가 클릭한 값을 받는 함수
	this.userno = n;
	pcgame();
}

function pcgame(){  //pc 1~3까지의 숫자를 무작위로 하나 선택
	var pc = Math.ceil(Math.random()*3);
	
	//pc 선택한 값을 이미지로 변환하여 HTML에 출력하는 코드
	var pcview = document.getElementById("pcview");
	pcview.innerHTML = "<img src='./game/pc" + pc + ".png'>";
	//console.log(pc);
	gameresult(pc);
}

function gameresult(pcno){  //결과 발표
	console.log("사용자 선택 : " + conversion(this.userno) + "(" + this.userno + ")");
	console.log("컴퓨터 선택 : " + conversion(pcno) + "(" + pcno + ")");
	
	var msg = "";
	
	switch(this.userno){
		case 1:
		if(pcno == 1){
			msg = "[결과] : 비겼습니다";
		}else if(pcno == 2){
			msg = "[결과] : 컴퓨터가 이겼습니다";
		}else{
			msg = "[결과] : 사용자가 이겼습니다";
		}
		break;
		
		case 2:
		if(pcno == 2){
			msg = "[결과] : 비겼습니다";
		}else if(pcno == 3){
			msg = "[결과] : 컴퓨터가 이겼습니다";
		}else{
			msg = "[결과] : 사용자가 이겼습니다";
		}
		break;
		
		case 3:
		if(pcno == 3){
			msg = "[결과] : 비겼습니다";
		}else if(pcno == 1){
			msg = "[결과] : 컴퓨터가 이겼습니다";
		}else{
			msg = "[결과] : 사용자가 이겼습니다";
		}
		break;
		
		default:
	}
	console.log(msg);
}

function conversion(k){
	if(k == 1){
		return "주먹";
	}else if(k == 2){
		return "보";
	}else{
		return "가위";
	}
}