var auth_no = "";

function send_auth_num(){
	var no1 = document.getElementById("no1");
	var no2 = document.getElementById("no2");
	var no3 = document.getElementById("no3");

	if(no1.value == "" || no2.value == "" || no3.value == ""){
		alert("휴대폰 번호를 입력하세요");
	}
	else if(isNaN(no1.value) || isNaN(no2.value) || isNaN(no3.value)){
		alert("휴대폰 번호는 숫자로 입력해 주세요.");
	}
	else if(no1.value.length != 3 || no2.value.length != 4 || no3.value.length != 4){
		alert("휴대폰 번호의 자릿수가 맞지 않습니다.");
	}
	else{
		for(var i=0; i<6; i++){
			this.auth_no += Math.ceil(Math.random()*10 - 1);
		}
		console.log(auth_no);
	}
}

function verify_auth(){
	var auth_num = document.getElementById("auth_num");
	if(this.auth_no == auth_num.value){
		alert("인증이 완료 되었습니다.");
	}
	else{
		alert("인증번호를 다시 확인해 주세요");
	}
}