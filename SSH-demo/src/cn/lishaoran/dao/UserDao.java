package cn.lishaoran.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.lishaoran.entity.Users;

public class UserDao extends HibernateDaoSupport{

	public List<Users> getAllUser(){
		Object execute =super.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException{
				String hql ="from users";
				Query query =session.createQuery(hql);
				return query.list();
			}
		});
		return (List<Users>) execute;
	}
}
