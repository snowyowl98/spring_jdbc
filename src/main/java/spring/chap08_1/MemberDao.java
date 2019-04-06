package spring.chap08_1;

import java.util.List;

import spring.chap03.Member;

public interface MemberDao {

	Member selectByEmail(String email);

	void insert(Member member);
	
	void update(Member member);

	List<Member> selectAll(int offset, int count);
}