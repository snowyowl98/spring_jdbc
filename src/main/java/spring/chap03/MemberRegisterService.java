package spring.chap03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MemberRegisterService {

	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void regist(RegisterRequest req) throws DuplicateMemberException {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		// ȸ���� �̹� �����ϸ� ���� �߻�
		if (member != null) {
			throw new DuplicateMemberException("�̸��� �ߺ� " + req.getEmail());
		}

		// ȸ������ ����
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("ȸ�� ������ �����߽��ϴ�.");
	}
}