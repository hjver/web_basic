var corp_value = ["", "SKT","LGT","KT","알뜰폰"];
var corp_text = ["통신사 선택", "SKT","LGT","KT","알뜰폰"];

function abc(){
	var box = document.getElementById("box");
	var option;
	for(var i=0; i<corp_value.length; i++){
		option = document.createElement("option");
		option.value = corp_value[i];
		text = document.createTextNode(corp_text[i]);
		option.append(text);
		box.append(option);
	}
}
