var userid = "hong";

//가상 함수로 핸들링 (ES5)
/* this 종류
1. 전역변수를 this로 핸들링 => 참조변수 (self)
2. 객체 자신의 참고값을 가지고 올때 => this.value
3. 함수명에 맞춰서 자신의 객체를 가르키는 this 호출자
*/
//class 선언식
class box2{
	zbox(){
		this.msg = "";
		console.log(this.msg);
	}
}

//class 표현식
var ddd = class box{ //box class
	//가상 메소드
	zbox(){
		console.log("zbox 메소드 호출!!");
	} 
	kbox(n){  //n의 매개변수를 이용하여 인수값을 받은 후 처리
		var no = 500 * n;
		console.log(no);
		console.log("kbox 메소드 호출!!");		
	}
	
}
function ccc(){
	this.c1 = function(){  //가상 함수
		var id = "hong";
		console.log(id);
		var name = "이순신";
		this.c2(name);
	}
	this.c2 = function(user){
		console.log(user);
	}
}

var m = new ccc();  //new ccc라는 함수의 연산자를 붙여서 생성하여 m 변수에 이관

//변수명 함수 장착하여 핸드링
var bbb = function(){  //함수 표현식
	console.log("변수로 함수를 할당하여 출력하는 파트!!")
}

//함수 선언문
function aaa(){   //메인 함수
	//함수 위치에 따라서 지역번수, 전역변수
	var a = "홍길동";
    var b = "실버등급";

	var c = function(){  //서브 함수
		var login = a + b;
		console.log(login);
	}
	console.log("Test");
	return c;
}