package spring.exampleWithoutInjection;

public class ArticleService {

	MemberDao memberDao = null;

	public ArticleService() {
		// memberDao�� ���� �ʱ�ȭ
		memberDao = new MemberDao();
	}

	public void addArticle() {
		memberDao.getMember();
		System.out.println("���� ����߽��ϴ�.");
	}
}