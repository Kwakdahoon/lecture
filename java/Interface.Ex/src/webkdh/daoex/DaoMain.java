package webkdh.daoex;

public class DaoMain {
	// 다형성 부모요소 받아와벌이기
	public static void doWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		doWork(new OracleDao());
		doWork(new MySqlDao());
	}

}
