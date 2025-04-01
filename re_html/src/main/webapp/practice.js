var gugu = function(){
	var no = document.getElementById("no");
	var no2 = document.getElementById("no2");

	if(no.value == "" || no2.value == "")
		alert("값을 입력하세요.");
	else{
		if(no.value > no2.value) gugu_calc(no.value, no2.value, -1);
		else if(no.value < no2.value) gugu_calc(no.value, no2.value, 1);
		else gugu_calc(no.value, no2.value, 0);
	}
}

var i, j;
var gugu_calc = function(no, no2, c){
	if(c == -1)
		for(i=no; i>=no2; i--)
			for(j=1; j<=9; j++)
		 		console.log(i + "*" + j + "=" + i*j);
	else if(c == 1)
		for(i=no; i<=no2; i++)
			for(j=1; j<=9; j++)		
		 		console.log(i + "*" + j + "=" + i*j);	
	else
		for(j=1; j<=9; j++)	
			console.log(no + "*" + j + "=" + no*j);
}

var gugu2 = function(s){
	no = document.getElementById("no3");
	no2 = document.getElementById("no4");
	if(no.value == "" || no2.value == "") alert("숫자를 입력하세요.");
	else gugu2_calc(no.value, no2.value, s);
}

var gugu2_calc = function(no, no2, s){
	var check;
	if(s == "even") check = 0;
	else check = 1;

	for(i=no; i<=no2; i++)
		if(i % 2 == check)
			for(j=1; j<=9; j++)
				console.log(i + "*" + j + "=" + i*j);	
}

news_list = document.getElementById("news_list");

function view_newslist(word){
	html = "";
	for(i=0; i<news.length; i++){
		if(word == "all") {
			html += "<li>"
			for(j=0; j<news[0].length; j++){
				html += news[i][j] + "&nbsp";
			}	
			html += "</li>"		
		}
		else{
			if(news[i][1] == word) {
				html += "<li>"
				for(j=0; j<news[0].length; j++){
					html += news[i][j] + "&nbsp";
				}
				html += "</li>"
			}
		}
	}	
	news_list.innerHTML = html;
}

view_newslist("all");

function search_news(){
	search_word = document.getElementById("search_word").value;
	view_newslist(search_word);
}

function all_view(){
	view_newslist("all");
}
