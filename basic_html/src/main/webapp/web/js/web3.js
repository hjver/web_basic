function gopage(){
	var url = document.getElementById("weburl");
	//location.href : js에서 해당 웹페이지로 강제 이동시키는 함수
	
	//confirm : tjsxor aptpwl if(확인), else(취소)
	if(confirm("해당 페이지로 이동 하시겠습니까?")){
		location.href = url.value;
	}
	else{
		alert("해당 페이지 이동을 취소 하셨습니다.")
	}
}

function pwd(){
	var pw1 = document.getElementById("pw1");
	var pw2 = document.getElementById("pw2");
	if(pw1.value == pw2.value){
		alert("패스워드가 올바르게 변경 되었습니다.");
	}else{
		alert("동일한 패스워드를 입력하세요.");
	}
}

//checkbox 전체 선택 클릭시 작동되는 함수
/*
checkbox(on) : true
checkbox(off) : false

mouse로 클릭하는 오브젝트(checkbox, radio)
*/
function fnall(){
	var a = document.getElementById("all");
	console.log(a.checked);  //체크가 되면 true, 체크아웃 false
	
	if(a.checked == true){ //전체선택에 클릭하여 체크된 경우
		console.log("전체 선택");
		var z;
		for(z=1; z<=3; z++){  //반복문을 이용하여 1~3까지
			//해당 "box" 문자와 반복문에서 반복되는 변수의 값을 조합하여 적용하는 방식
			document.getElementById("box" + z).checked = true;
		}
	}else{     //전체선택에 크릭하여 체크 아웃 된 경우
		console.log("전체 해제");
		var z;
		for(z=1; z<=3; z++){
			document.getElementById("box" + z).checked = false;
		}
	}
}