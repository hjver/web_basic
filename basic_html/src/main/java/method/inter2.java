package method;

public interface inter2 {
	String data[] = {"유재석", "강호동", "신동엽", "정상훈", "아이유"};
	public void money();
};

/*
 * interface에 쿠가 코드를 이용하여 추가 메소드 및 데이터를 적용할 경우
 * extends를 사용해서 interface를 옵션을 작성하게 됩니다.
 */
interface inter2_2 extends inter2{
	Integer p = 1000;
	public void point();
}
