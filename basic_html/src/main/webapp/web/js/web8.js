/*
innerHTML, innerText => 기존에 있는 데이터에서 덮어쓰기 기본
append, appendChild, insertBefore => node는 데이터를 추가
*/

//전역변수 형태로 HTML id를 가져올 경우 HTML 코드 아래에 Script를 작성해야 함
var user = document.getElementById("user");

function a(){   //노드 앞에 추가
//createElement : 태그를 생성하는 함수
//createTextNode : 태그안에 문자 데이터를 적용할 경우
//append : 해당 오브젝트에 추가(문자, 태그)하는 명령어
	var html = document.createElement("li");
	var data = document.createTextNode("홍길동");
	html.append(data);
	user.insertBefore(html, user.firstChild);
	//insertBefore : 노드 기준 상위에 데이터를추가
	//user.insertBefore(html, user.childNodes[1]);
	//user.insertBefore(html, user.firstChild);  //0번째 노드
}

function b(){   //노드 뒤에 추가
	var html = document.createElement("li");
	var data = document.createTextNode("강감찬");
	html.append(data);
	user.appendChild(html);	
	//user.insertBefore(html, user.lastChild);  //lastChild 맨 마지막 데이터 노드
}

function c(){   //노드 중간에 추가
	var html = document.createElement("li");
	var data = document.createTextNode("김유신");
	html.append(data);
	user.insertBefore(html, user.children[2]);	
}
//append, insertBefore : HTML태그를 문자로 인식

function d(){   //노드 뒤에 HTML 형태 추가
	var html = document.createElement("li");
	var data = "<span>세종대왕</span>";
	html.innerHTML = data;
	user.append(html); 
}

function z(){
	var box = document.getElementById("box");
	var html = document.createElement("input");
	html.type="text";
	html.id="email";
	html.name="email";
	html.className="mail";
	box.append(html);
}

//createElement : <태그></태그>
//input 사용시 주의해야허며,텍스트가 노출되지 않는 버그가 있을 수 있음
function n_create(){
	var nidx = document.getElementById("nidx");  //사용자 입력값
	var node = document.getElementById("node");  //출력하는 곳
	var i;
	for(i=1; i<=Number(nidx.value); i++){
		var input_tag = document.createElement("input");
		var input_text = document.createTextNode("정답" + i);
		var br_tag = document.createElement("br");
		input_tag.type="checkbox";
		input_tag.id="test" + i;
		node.append(input_tag);
		node.append(input_text);
		node.append(br_tag);
	}
}
