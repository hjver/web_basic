//[] : 일반 데이터 배열, {} : key 배열
var arr = {
	"members": ["홍길동", "강감찬", "이순신"]
};
console.log(arr["members"][2]);
console.log(arr.members[2]);
console.log(arr["members"].length);

/*
응용문제
해당 배열값 중 홀수 데이터만 모두 출력되는 코드를 작성하시오.
*/
var data = {
	"no": [20,11,21,13,7,6,33,31,3,42,48,41]
}
var i;
for(i=0; i<data["no"].length; i++){
	if(data["no"][i] % 2 != 0){
		console.log(data["no"][i]);
	}
}

/*
응용문제
다음 포인트 전체의 총 합계를 구하는 코드를 작성하시오.
총 포인 트: 8910
*/
var db = {
	"point": [2500, 1500, 560, 420, 170, 2810, 950]
}
var j;
var sum=0;
for(j=0; j<db["point"].length; j++){
	sum += db["point"][j];
}
console.log(sum);