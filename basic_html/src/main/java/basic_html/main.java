package basic_html;

/*
 MVC => Module(Setter, getter, method, interface),
 View(jsp, jstl, thymeleaf),
 Controller(Rest, Controller)
*/
//MVV(Model, View, ViewModel) or MVVM(Model, View, ViewModel, Model)
public class main {

	//Controller
	public static void main(String[] args) {
		dataload dl = new dataload(5, 10, 15, 20);
		System.out.println("모든수 합계 : " + dl.calc('+'));
		System.out.println("모든수 곱한값 : " + dl.calc('*'));
		System.out.println("odd 합계 : " + dl.odd());
		System.out.println("even 합계 : " + dl.even());
	}

}
