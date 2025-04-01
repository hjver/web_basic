//문자열 => 배열로 변환
var user = "홍길동|이순신|장보고|유관순|강감찬";  //문자열
console.log(user);
var data = user.split("|");  //split 특정 문자를 기준으로 배열 생성함
console.log(data);   //split으로 단어를 구분 배열의 모두 출력
console.log(data[2]);  //해당 배열값만 출력
console.log(data.length);  //배열 갯수

var w = 0;  //배열은 번호가 0부터 시작하므로
do{
	console.log(data[w]);
	w++;
}while(w < data.length);  //배열 갯수는 5개 단, 배열번호 0~4까지 이므로

//배열을 사용하는 이유?? 하나의 변수 여러개의 데이터 값을 가지기 위해서
//배열 => 반복문
//1차배열 (숫자)
var n = [10,15,22,33,8,9,3];
var ea = n.length;  //배열 총 개수
var ww = 0;  //배열 0부터 시작
while(ww < ea){  //배열 데이터 갯수만큼 반복
	console.log(n[ww]); //출력
	ww++;
}

//1차배열 (문자)
var k = ["LG냉장고", "삼성 휴대폰", "김치냉장고", "식기세척기", "전자렌지"];
//for문으로 해당 데이터를 모두 출력하시오.
var i;
for(i=0; i<k.length; i++){
	console.log(k[i]);
}
// 배열 = array
//1차배열 (복합) = 숫자, 문자가 함께 적용된 배열
var arr = ["hong", "홍길동", "hong@nat.com", 2510, 2, "2025-01-14"]
var arr_ea = arr.length;
//append(), innerHTML = , innerText =
var ww = 0;
while(ww < arr_ea){
	//console.log(arr[ww]);
	document.getElementById("info"+ww).innerHTML = arr[ww]; //배열값 => HTML 출력
	ww++;
}
