package sample.spring.prtc;

import java.util.Map;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao memberDao;
	
	@Override
	public String create(Map<String, Object> map) {
	    int affectRowCount = this.memberDao.insert(map);
	    if (affectRowCount ==  1) {
	        return map.get("member_id").toString();
	    }
	    return null;

	}
}
