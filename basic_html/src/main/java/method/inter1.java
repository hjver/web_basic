package method;

//interface : 다른 클래스 사이의 중간 매개체 역할 담당하는 추상 클래스 의미합니다.
//abstract와 비슷힌 성격을 가지고 있음, 단 모든 메소드를 그룹화합
public interface inter1 {
	//필드에 선언한 변수는 기본으로 상수(final)
	String userid = "hong";
	
	public String names();
	public Integer levels();
	public void search();
	//default : interface에서 유일하게 기본 메소드를 활용할 수 있는 선언문
	default void setbox(String id) {
		
	}
	default String getbox() {
		return null;
	}
}
