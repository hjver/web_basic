function mails(m){
	var email2 = document.getElementById("email2");
	email2.value = m;
}

function lotto(){ //1~45
	/* 1~10 올림 */
	//var no = Math.ceil(Math.random() * 10);
	/* 0~9 절사 */
	//var no = Math.floor(Math.random() * 10);
	/* 0~10 반올림 */
	var no = Math.round(Math.random() * 10);
	//console.log(no);
	
	/* 1 ~ 45 의 숫자 중 하나를 선택하여 출력 */
	var no2 = Math.ceil(Math.random() * 45);
	console.log(no2)
}

//인증번호 4, 5, 6 => Math.random => 0 ~ 9 
/*
응용문제 인증번호 5자리를 생성하는 코드를 작성하시오.
인증번호는 console로 출력
*/
function cn(){
	var k;
	var no = "";
	for(k=1; k<=5; k++){
		no += Math.floor(Math.random() * 10);
	}
	console.log(no);
}