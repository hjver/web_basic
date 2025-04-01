var data = {
    "products":{
        "product_name":["모니터","키보드","마우스","CPU","GPU"],
        "product_money":{
            "money":["360000","48000","37000","298000","578000"],
            "money_sales":["299000","","30000","220000",""]
        },
        "product_ico":["NEW","","","","BEST"]
    }
}

/*응용문제
해당 배열을 응용하여 다음과 같이 웹에 출력되는 코드를 작성하시오.
상품명: 모니터
가격:360000
세일가격: 299000
상품명: 키보드
가격: 48000
세일가격:
*/
var x;
for(x=0; x<data["products"]["product_name"].length; x++){
	console.log("상품명 : " + data["products"]["product_name"][x]);
	console.log("가격 : " + data["products"]["product_money"]["money"][x]);
	console.log("세일가격 : " + data["products"]["product_money"]["money_sales"][x]);
}
