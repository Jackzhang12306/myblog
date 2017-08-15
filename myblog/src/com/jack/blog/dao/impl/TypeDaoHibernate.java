package com.jack.blog.dao.impl;

import com.jack.blog.dao.TypeDao;
import com.jack.blog.domain.Type;
import com.jack.common.util.PageHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TypeDaoHibernate extends PageHibernateDaoSupport<Type> implements TypeDao {

	public TypeDaoHibernate() {
		super();
		setClass(Type.class);
	}
}
