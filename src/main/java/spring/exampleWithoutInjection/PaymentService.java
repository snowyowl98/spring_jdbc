package spring.exampleWithoutInjection;

public class PaymentService {
	MemberDao memberDao = null;

	public PaymentService() {
		this.memberDao = new MemberDao();
	}

	public void pay() {
		memberDao.getMember();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
}