var n = Math.ceil(Math.random()*10);
console.log(n);
if(n >= 1 && n <= 4){
	console.log("5미만의 숫자 입니다.");
}else if(n >= 5 && n <= 7){
	console.log("8미만의 숫자 입니다.");
}else if(n >= 9 && n <= 10){
	console.log("9이상의 숫자 입니다.");
}else{
	console.log("숫자 8입니다.");
}