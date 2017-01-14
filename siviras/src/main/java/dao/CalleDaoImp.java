package dao;


import abstractdaobean.AbstractDaoBean;
import model.Calle;

public class CalleDaoImp extends AbstractDaoBean<Calle> implements CalleDao {
	
	public CalleDaoImp(){
		
	}
	
	@Override
	public void insertarCalle(Calle calle) {
		// TODO Auto-generated method stub
		//Session ss = HibernateUtil.getSessionFactory().openSession();
		//try {
		//	ss.beginTransaction();
		//	ss.save(calle);
		//	ss.getTransaction().commit();
		//	ss.close();
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}	
		entityManager.persist(calle);
	}
	
	//@Override
	//@SuppressWarnings("unchecked")
	//public List<Calle> selectItems() {
		// TODO Auto-generated method stub
		//List<Calle> calles= null;
		//Session ss = HibernateUtil.getSessionFactory().openSession();
		//try {
		//	String sql = "FROM Calle";
		//	ss.beginTransaction();
		//	calles = ss.createQuery(sql).list();
		//	ss.getTransaction().commit();
		//  .close();
		//} catch (Exception e) {
		//	e.printStackTrace();
		//	ss.getTransaction().rollback();
		//}
		//return calles;
	//}
}
