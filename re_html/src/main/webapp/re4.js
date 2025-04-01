function web(){
	//id로 값을 가져오는 방식
	var a = document.getElementById("se");        //id
	
	//form이 없는 상황에서 name 속성명으로 값을 js로 가져오는 방식
	var b = document.getElementsByName("se")[0];  //name
	console.log(a.value);
	//console.log(b.value);
	
	//form에 method="get" 방식고 동일한 형태
	location.href="http://search.naver.com/search.naver?query=" + a.value;
}
	
function fluit(){
	var count = 0; //카운팅 하는 변수
	var x;
	//javascript에서 html에 없는 id명을 입력시 오류가 발생합니다.
	for(x=1; x<=3;x++){
		var ck = document.getElementById("f"+x).checked;
		if(ck == true){
			count++;
			//count += 1;
			//count = count + 1;
		}
	}
	//반복문 결과 카운트값을 확인하여 진행
	if(count==0){
		alert("한가지 이상 선택해 주셔야 합니다.");
	}
	else{
		location.href="https://nate.com";
	}
}

function agree(){
	var ag1 = document.getElementById("ag1");
	console.log(ag1.checked);
	if(ag1.checked == false){  //boolean (true, falde)
		alert("동의하셔야만 회원가입이 잔행됩니다.");
	}
}

function delivery(){
	var dy = document.getElementById("dy");
	if(dy.value==""){  //option의 value값
		alert("배송방법을 선택하셔야 합니다.");
	}
	else{
		alert(dy.value + "을 선택하셨습니다.");
	}
}

