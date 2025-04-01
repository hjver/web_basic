var data = [
	["hong", "park", "kim"],
	["25", "30", "11"]
];

var data2 = {
	"notice": [
		{
			"subject": "신한카드 시스템 점검",
			"writer": "관리자"
		},
		{
			"subject": "2025년 설 이벤트!!",
			"writer": "관리자"
		}
	]
}
//console.log(data)
//console.log(data[0][1], data[1][1]);
//console.log(data2["notice"][1]["subject"], data2["notice"][1]["writer"])

console.log(data.length);  //2
console.log(data[0].length);  //3

var f;
for(f=0; f<data[0].length; f++){
	if(Number(data[1][f]) >= 20){
		console.log("아이디 : " + data[0][f]);
		console.log("나이 : " + data[1][f]);
	}
}

console.log(data2["notice"].length);

var w = 0;
while(w < data2["notice"].length){
	console.log(data2["notice"][w]["subject"]);
	console.log(data2["notice"][w]["writer"]);
	w++;
}

//console.log(news);
//innerHTML : HTML태그를 사용가능함 (단, 신규데이터를 입력시 최기화 되는 현상 => 누적시키는 변수)
//append, insertBefore : Node 형태미며, 순차적으로 데이터를 적용시킬수 잇으 (단, HTML태그가 미적용)
var search_word = "";  //검색단어를 적용할 전역변수
var all_view = "Y";  //전체 리스트를 핸들링하는 변수

var all_news = function(){  //전체 버튼
	this.all_view = "Y";	//전역변수 N => Y
	news_datalist();   //함수를 재실행
}

var search_news = function(){  //검색 버튼
	this.all_view = "N";  //전역변수 Y => N
	this.search_word = document.getElementById("corp").value; //전역변수 검색어 Setter
	news_datalist();  //함수를 재실행
}

function news_datalist(){
	var news_notice = document.getElementById("news_notice");
	var html = "";
	var z = news.length-1;
	while(z >= 0){ //5
		if(this.search_word == news[z][1] && this.all_view == "N"){
		    html += "<li>";
			var zz = 0;
			while(zz < news[0].length){ //3
				html += news[z][zz] + "&nbsp;";
				zz++;
			}
			html += "</li>";
		}
		else if(this.all_view == "Y"){
		    html += "<li>";
			var zz = 0;
			while(zz < news[0].length){ //3
				html += news[z][zz] + "&nbsp;";
				zz++;
			}
			html += "</li>";			
		}
		z--;
	}
	news_notice.innerHTML = html;
}

news_datalist(); //함수 강제 실행
