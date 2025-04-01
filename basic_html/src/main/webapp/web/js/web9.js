function make_select(){
	var no = document.getElementById("no"); //사용자 입력값
	var box = document.getElementById("box"); //출력장소
	var select = document.createElement("select");  //select태그
	select.id = "ea";  //태그에 id이름을 부여
	var i;
	var option;
	var text;
	for(i=1; i<=no.value; i++){
		option = document.createElement("option");
		option.value = i; //option태그에 value 부여
		text = document.createTextNode(i + "EA"); //textNode 문자만 생성
		option.append(text);
		select.append(option);  //select 태그에 option태그 node 생성
	}
	box.append(select);
}

function calc(){
	var no1 = document.getElementById("no1");
	var no2 = document.getElementById("no2");
	result = calculate(Number(no1.value), Number(no2.value));
	console.log(result);
}

function calculate(n1, n2){
	var k;
	var sum=0;
	for(k=n1; k<=n2; k++){
		sum += k;
	}
	return sum;
}

function pay(){
	var num1 = document.getElementById("num1");
	var num2 = document.getElementById("num2");
	var num3 = document.getElementById("num3");
	result = pay_calc(Number(num1.value), Number(num2.value), Number(num3.value));
	console.log(result);
	var total = document.getElementById("total");
	total.append(result);
}

function pay_calc(n1, n2, n3){
	var num;
	num = n1 * (1 - n2/100) - n3;
	return num;
}