function aaa(){
	//"" : 사용자가 아무것도 입력하지 않은 것
	var no = document.getElementById("no");
	if(no.value==""){
		alert("해당 입력값에 데이터를 입력하세요!")
	}
	else{
		//HTML에서 입력된 모든 값은 string(문자)
		console.log(typeof(no.value));
		var no2 = Number(no.value);
		console.log(no2);
		console.log(typeof(no2));
	}
}

function bbb(){
	if(frm.no.value==""){
		alert("해당 입력값에 데이터를 입력하세요!")
	}
}