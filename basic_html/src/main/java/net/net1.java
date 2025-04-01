package net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;

//network java
/*
 * IP로 핸들링 : 도메인, IP (WEB,WAS)
 * IoT : 사물 인터넷
 * Bluetooth : 무선통신
 * Beacon : 비콘
 * NFC : 근거리 무선 통신
 * -------------------------------
 * 1. IP or 도메인 => Web Server, IP접속
 * 2. port - 중복으로 사용이 불가능 (TCP, UDP)
 * 3. TCP - 외부 연결 프로토톨, 전송속도가 빠름
 * 4. UDP - 내부 연결 프로토콜, 전송속도가 느림 단(1:1 경우 빠름, 내부 네트워크 통신)
 * 5. IPv4, IPv4 => ipaddress4, ipaddress6
 * 
 * cmd 명령어 (네트워크 명령어)
 * netstat : 네트워크 현황  // ex : netstat -an | find "LISTEN"
 * -a : 모든 포트를 표시
 * -n : 해당 아이피와 포트를 같이 보여주는 형태 (ex : 192.168.0.1:8080)
 * find : 해당 포트를 검색하는 명령어
 * "LISTEN" : 가동 되고 있는 포트
 * "CLOSE" : 종료 포트
 * 
 * netstat -옵션
 * netstat -옵션 | find "검색어"
 * netstat -옵션 tcp| find "검색어" : TCP 리스트
 * netstat -옵션 udp| find "검색어" : UDP 리스트
 * ex : netstat -anp udp
 */
public class net1 {

	public static void main(String[] args) {
		try {
			//getByName : 도메인명 또는 IP를 사용해야 합니다. (하나의 서버 정보)
			//getAllByName : 해당 도메인일 경우 모든 서버 정보를 가져옴 (배열)
			InetAddress ia = Inet4Address.getByName("naver.com");
			System.out.println(ia);
			System.out.println(ia.getHostAddress());  //IP만 출력
			System.out.println(ia.getHostName());  //도메인명
			
			//InetAddress ia4[] = Inet4Address.getAllByName("naver.com");
			//InetAddress ia4[] = Inet4Address.getAllByName("daum.net");
			InetAddress ia4[] = Inet4Address.getAllByName("moel.go.kr");
			System.out.println(Arrays.toString(ia4));
			
			InetAddress ia2 = Inet6Address.getByName("sonyunara.com");
			System.out.println(ia2);
			
			//getLocalHost : 자신에 할당된 IP 정보를 출력
			Inet4Address ia3 = (Inet4Address)Inet4Address.getLocalHost();
			System.out.println(ia3.getHostAddress());
		}
		catch (Exception e) {
			System.out.println("해당 IP를 확인하지 못하였습니다.");
		}		
	}
}
