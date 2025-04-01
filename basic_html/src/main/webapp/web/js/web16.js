var data = {
	"members":[
		{
			"id":"hong",
			"name":"홍길동",
			"age":"32",
			"area":"서울"
		},
		{
			"id":"ygsoon",
			"name":"유관순",
			"age":"16",
			"area":"경기도"
		},
		{
			"id":"jangbo",
			"name":"장보고",
			"age":"39",
			"area":"강원도"
		},
	]
}
//Object.keys : 대표키, 보조키의 리스트를 확인하는 함수
console.log(Object.keys(data["members"][0]));
console.log(data["members"].length); //대표키 기준그룹 개수
console.log(data["members"][1]["area"]) //해당 키에 대한 데이터 출력

/*
응용문제
해당 키 배열에서 사용자의 아이디와 나이만 출력하는 코드르 작성하시오.
[출력예시]
hong
32
ygsoon
16
jangbo
39
*/
var z;
for(z=0; z<data["members"].length; z++){
	console.log(data["members"][z]["id"]);
	console.log(data["members"][z]["age"]);
}

