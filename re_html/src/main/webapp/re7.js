//배열번호는 무조건 0 부터 시작
var data1 = [5, 10, 15, 20, 30, 35, 40, 45];  //원시배열
var data2 = {"no": [5, 10, 15,20, 30, 50, 60, 100]};  //키 배열

//console.log(data1);
//console.log(data1[0]);
//console.log(data2["no"][1]);
//console.log(data2.no[1]);

/* 
응용편1
해당 data1은 짝수값만 출력 되도록 합니다.
data2 배열응 홀수 값만 출력 되도록 합니다.

용용편2
data2 키배열의 모든 합한 총합계 결과를 출력하는 코드를 작성합니다.
*/

console.log("짝수값만 출력")
var i;
for(i=0; i<data1.length; i++){
	if(data1[i] % 2 == 0) console.log(data1[i]);
}

console.log("홀수값만 출력")
for(i=0; i<data2.no.length; i++){
	if(data2.no[i] % 2 == 1) console.log(data2.no[i]);
}

console.log("합계 출력")
var sum=0;
for(i=0; i<data2.no.length; i++){
	sum += data2.no[i];
}
console.log(sum);

var a1 = 10;
var a2 = 20;
var a3 = 30;
var a4 = 40;
var a5 = 50;

var f;
for(f=1; f<=5; f++){
	console.log(eval("a"+f)); //a+1 => eval => a1 변수로 핸들링
}
