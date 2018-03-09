package mvc.service;

import java.util.UUID;

import org.springframework.stereotype.Service;


@Service
public class JoinService {
	/*
	 * 특정 이메일 주소로 인증키를 보내는 기능을 만들꺼임.
	 * java mail api를 쓰면 메일보낼수 있음.
	 */
	
	public boolean sendAuthKey(String email) {
		String[] uuids = UUID.randomUUID().toString().split("-");
		String key = uuids[0]+"-"+uuids[1];
		
		
		return true;
	}
	
	
}
