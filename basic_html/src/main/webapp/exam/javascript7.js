const m = [
    ["hong","홍길동"],
    ["lee","이순신"],
    ["kims","김유신"],
    ["yuri","유리왕"],
    ["kang","강감찬"]
];

function member(){
	var list = document.getElementById("list");
	var label;
	var text;
	for(var i=0; i<m.length; i++){
		label = document.createElement("label")
		text = document.createTextNode(m[i][0]);
		label.append(text);
		list.append(label);
		label = document.createElement("label")
		text = document.createTextNode(m[i][1]);
		label.append(text);
		list.append(label);
	}
}