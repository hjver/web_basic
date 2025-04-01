function view(){
	//DOM 형태의 출력 방식
	var box = document.getElementById("box");
	//innerText : 문자만 출력 (기존 데이터는 사라질 수 있스니다.)
	//innerHTML : HTML태그와 함께 출력 (기존 데이터는 사라질 수 있스니다.)
	
	//inner 사용시 "", '' 의 역할이 있으므로 주의해서 사용하셔야 합니다.
	
	//box.innerText = "javascript 데이터값";
	box.innerHTML = "<span class='a'>javascript 데이터값</span>";
}

function view2(){
	var data = document.getElementById("data");
	var w = 1;
	while(w <= 10){
		data.innerHTML += "<li>" + w + "</li>";
		w++;
	}
}

function telok(){
	var tel = document.getElementById("tel");
	var se = document.getElementById("se");
	if(tel.value != ""){  //입력값이 있을 경우
		//HTML 코드를 javascript에 포함
		se.innerHTML = "<input type='text' id='seno'>\
		<input type='button' value='인증확인' onclick='aaa()'>";		
	}
	else{
		alert("휴대폰 번호를 입력하세요");
	}
}

function aaa(){
	console.log("testsets");
	alert("testsets");
}



