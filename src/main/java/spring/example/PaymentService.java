package spring.example;

public class PaymentService {
	MemberDao memberDao;
	
	// property memberDao setter
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void pay() {
		memberDao.getMember();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
}