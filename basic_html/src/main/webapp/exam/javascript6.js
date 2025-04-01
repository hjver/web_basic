function pay() {
	var n1 = document.getElementById("n1");
	var n2 = document.getElementById("n2");
	var n3 = document.getElementById("n3");
	var result = document.getElementById("result");
	
	if(n2.value == ""){
		alert("할인율을 입력해 주세요.");
	}
	else if(isNaN(n2.value)){
		alert("할인율은 숫자로 입력해 주세요.");
	}
	else if(Number(n2.value) > 50){
		alert("할인율은 최대 50%까지 입니다.");
	}
	else if(n3.value == ""){
		alert("적립금 사용액을 입력해 주세요.");
	}
	else if(isNaN(n3.value)){
		alert("적립금 사용액은 숫자로 입력해 주세요.");
	}	
	else if(Number(n3.value) > 5000){
		alert("적립금은 최대 5000 까지 적용 가능합니다.");
	}
	else{
		var sum = n1.value - (n1.value * n2.value / 100) - n3.value;
		result.innerHTML = sum;
	}
}