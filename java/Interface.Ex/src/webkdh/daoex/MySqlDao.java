package webkdh.daoex;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB 생성");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB 저장");		
	}

	@Override
	public void update() {
		System.out.println("MySql DB 수정");		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB 삭제");		
	}

}
