package re_html;

import java.util.ArrayList;

public class re_java7 {
	public static void main(String[] args) {
		//new lotto_game();
		new lotto_game2();
	}
}

class lotto_game{
	ArrayList<Integer> lottos = null;
	Integer no = null;
	
	public lotto_game() {
		this.lottos = new ArrayList<Integer>();
		this.no = (int)Math.ceil(Math.random()*46);
		this.lottos.add(this.no);
		boolean is_six = false;
		while(is_six == false) {
			this.no = (int)Math.ceil(Math.random()*46);
			boolean is_duplicte = false;
			int k;
			for(k=0; k<this.lottos.size(); k++) {
				if(this.lottos.get(k) == this.no) {
					is_duplicte = true;
					break;
				}
			}
			if(is_duplicte == false) {
				this.lottos.add(this.no);
			}
			if(this.lottos.size() == 6) {
				is_six = true;
			}
		}
		System.out.println(this.lottos);
	}
}

class lotto_game2{
	//pc가 선택한 숫자를 담는 배열
	ArrayList<Integer> no = null;
	Integer result = null;
	
	public lotto_game2() {  //즉시실행
		this.no = new ArrayList<Integer>();
		games();
	}
	
	private void games() {  //결과 출력
		for(;;) {  //무한 loop
			this.result = this.pc_lotto();
			boolean callback = this.number_check(this.result);
			if(this.no.size() < 7) {
				if(callback == true) {  //이미 선택한 숫자가 없을 경우
					this.no.add(this.result);
				}
				else {  //배열에 이미 선택한 숫자가 있을 경우
					continue;
				}				
			}
			else {
				break;
			}
		}
		System.out.println(this.no);
	}
	
	private boolean number_check(Integer result) {
		boolean ck = true;
		int w = 0;
		while(w < this.no.size()) {
			if(result == this.no.get(w)) {
				ck = false;
			}
			w++;
		}
		return ck;
	}
	
	private Integer pc_lotto() {  //pc가 1~46 숫자 중 한가지를 무작위 선택
		Integer no = (int)Math.ceil(Math.random()*46);
		return no;
	}
}
