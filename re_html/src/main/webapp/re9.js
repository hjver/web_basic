/*
[외부 배열 데이터를 로드 하여 다음과 같이
결과가 나오도록 코드를 작성하시오]

데이터변수명 : productlist

**a_view 라는 키 중에서 Y에 해당되는 값만 출력을 시켜야 합니다.
만약 판매가격만 있고, 할인율 및 할인금액 없는 상품은 콘솔에서 
판매가격만 출력되도록 해야 합니다.

console.log 로 출력 결과 예시
상품명 : 볼티아 트림 부츠컷 팬츠  (a_wktitle)
판매가격 : 24200             (a_wkpd)
할인율 : 40%                 (a_wkdp)
할인금액 : 14500             (a_wkap)
*/
//console.log(productlist);
//console.log(productlist["best_product"]);
//console.log(productlist["best_product"].length);  //8

var x;
for(x=0; x<productlist["best_product"].length; x++){
	//console.log(x);
	if(productlist["best_product"][x]["a_view"] == "Y"){
		console.log("상품명 : " + productlist["best_product"][x]["a_wktitle"]);
		console.log("판매가격 : " + productlist["best_product"][x]["a_wkpd"]);
		if(productlist["best_product"][x]["a_wkdp"] != "")
			console.log("할인율 : " + productlist["best_product"][x]["a_wkdp"]);
		if(productlist["best_product"][x]["a_wkap"] != "")
			console.log("할인금액 : " + productlist["best_product"][x]["a_wkap"]);	
	}
}