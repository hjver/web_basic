//var = new Array();  //빈배열 생성
var data = [];  //빈배열 생성

function add_arr(){
	var no = document.getElementById("no");
	var ea = this.data.length;
	data[ea] = no.value;  //빈배열로 값을 적용
	console.log(data);
}

function add_arr2(){
	var no = document.getElementById("no");
	data.push(Number(no.value));  //배열번호 기준 맨 마지막 기준으로 데이터 추가
	console.log(data);	
}

function add_arr3(){
	var no = document.getElementById("no");
	data.unshift(no.value);  //배열번호 기준으로 맨 앞에 추가
	console.log(data);	
}

function add_arr4(){
	data.shift(no.value);  //배열의 데이터 값을 맨앞에서부터 삭제
	console.log(data);	
}

function add_arr5(){
	data.pop(no.value);  //배열의 데이터 값을 기준으로 맨뒤에서서부터 삭제
	console.log(data);	
}