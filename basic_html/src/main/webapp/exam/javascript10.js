var product = ["셔링 숄더백","루이까또즈 숄더백","꾸찌 오피디아 미디엄 백팩","백스테이 베르스 서류가방"];
var count = 0;
function product_view(){
	var list = document.getElementById("list");
	var li = document.createElement("li");
	var data = document.createTextNode(this.product[count]);
	li.append(data);
	list.appendChild(li);	
	this.count++;
	if(count > product.length){
		alert("추가할 상품이 없습니다.")
	}
}