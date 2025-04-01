var n = [26,33,31,37,28,60,3,41,44,50];
var odd = 0;
for(var i=0; i<n.length; i++){
	if(n[i] % 2 == 1){
		odd += 1;
	}
}
console.log("결과 : " + odd);