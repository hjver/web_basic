var data = [
	["홍길동", "이순신", "유관순"],
	["A형", "O형","B형"]
];
//2차배열 => 배열[그룹번호][데이터번호]
//console.log(data[1][1]);
//console.log(data.length);
var w = 0;
while(w < data[0].length){ //해당 배열 그룹의 데이터 개수
	
	var ww=0;
	while(ww < data.length){  //해당 배열 그룹 갯수
		//console.log(data[ww][w]);
		ww++;
	}
	w++;
}

var w = 0;
while(w < data.length){ //해당 배열 그룹의 데이터 개수
	
	var ww=0;
	while(ww < data[0].length){  //해당 배열 그룹 갯수
		//console.log(data[w][ww]);
		ww++;
	}
	w++;
}

/*
응용문제
다음 해당 내용의 배열을 확인 하여 console로 추력되도록 코드를 작성하시오.
출력결과
5000쿠폰
5000
./01.jpg
!+1 이벤트
1EA
./02.jpg
*/
var event = [
	["5000쿠폰", "1+1 이벤트", "식자재 30% 전품목 할인", "배송비 무료", "10대 간식 20%할인"],
	["5000", "1EA", "30", "0", "20"],
	["./01.jpg", "./02.jpg", "./03.jpg", "./04.jpg", "./05.jpg"]
]
var box = document.getElementById("box");
//node 출력
var html_span, html_img, html_text;
var i;
for(i=0; i<event[0].length; i++){
	html_span = document.createElement("span");
	html_img = document.createElement("img");
	var j;
	for(j=0; j<event.length; j++){
		//console.log(event[j][i]);
		if(j==0){
			html_img.title = event[j][i];			
		}
		else if(j==1){
			html_text = document.createTextNode(event[j][i]);
		}
		else{
			html_img.src = event[j][i];
			html_img.style = "width:180px;height:108px;";
		}
	}
	html_span.append(html_img);
	html_span.append(html_text);
	box.append(html_span);
}


//innerHTML 반복문 출력 (DOM)
/*
var html = "";
for(var x=0; x<event[0].length; x++){
	html += `<span>
	<img src="`+ event[2][x] +`" title="`+ event[0][x] +`"
	style="width:180px;height:108px;">
	`+ event[1][x] +`
	</span>`
}
box.innerHTML= html;
*/
