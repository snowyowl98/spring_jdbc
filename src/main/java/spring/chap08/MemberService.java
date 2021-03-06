package spring.chap08;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spring.chap03.Member;

public class MemberService {

	Logger logger = LogManager.getLogger();

	MemberDao memberDao = null;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("owl@irafe.com");
		member.setPassword("b");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("snowyowl@naver.com");
		member.setPassword("o");
		member.setName("������");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}