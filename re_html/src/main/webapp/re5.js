/*
var abc= function(){
	console.log("test");
}
*/

var abc = () => {
	//console.log("test");
	var no = document.getElementById("no");
	var no2 = document.getElementById("no2");
	
	var ck1 = Number(no.value); //숫자 자료형에 문자 들어갈 경우 NaN
	var ck2 = Number(no2.value);
	
	//문자를 입력 되었을 경우
	if(isNaN(ck1) || isNaN(ck2)){
		alert("숫자를 입력하셔야 합니다.");
	}
	else{  //두 개의 입력값이 모두 숫자로 등록 되었을 경우
		if(ck1 > ck2){ //첫번째 숫자가 두번째 숫자보다 클 경우(내람차순)
			gugu_for1(ck1, ck2);
		}
		else if(ck1 < ck2){ //두번째 숫자가 첫번째 숫자보다 클 경우(오름차순)
			gugu_for2(ck1, ck2);
		}
	}
}

var f,ff;  //반복문에 사용하는 전역변수

var gugu_for1 = function(ck1, ck2){ //내림차순 구구단 (ck1이 클 경우)
	for(f=ck1; f>=ck2; f--){  //역순
		for(ff=1; ff<=9; ff++){ // 1~9
			console.log(f + "*" + ff + "=" + f*ff);
		}
	}
}

var gugu_for2 = function(ck1, ck2){ //오름차순 구구단
	f = ck1;
	do{
		ff = 1;
		while(ff<=9){
			console.log(f + "*" + ff + "=" + f*ff);
			ff++;
		}
		f++;
	}while(f<=ck2);
}
