package article;

import java.util.List;

public interface ArticleDao {

	/**
	 * ���
	 */
	List<Article> listArticles();

	/**
	 * ��ȸ
	 */
	Article getArticle(String articleId);

	/**
	 * ���
	 * 
	 * @return �߰��� ���� ����
	 */
	int addArticle(Article article);

	/**
	 * ����
	 * 
	 * @return ������ ���� ����
	 */
	int updateArticle(Article article);

	/**
	 * ����
	 * 
	 * @return ������ ���� ����
	 */
	int deleteArticle(String articleId);
}