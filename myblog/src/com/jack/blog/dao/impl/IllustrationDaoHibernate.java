package com.jack.blog.dao.impl;

import java.util.List;

import com.jack.blog.dao.IllustrationDao;
import com.jack.blog.domain.Blog;
import com.jack.blog.domain.Illustration;
import com.jack.common.util.PageHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class IllustrationDaoHibernate extends PageHibernateDaoSupport<Illustration> implements IllustrationDao {

    public IllustrationDaoHibernate() {
        super();
        setClass(Illustration.class);
    }

    public List<Illustration> findByBlog(Blog blog) {
        String hql = "from Illustration where blog = ? order by upload";
        return (List<Illustration>) getHibernateTemplate().find(hql, blog);
    }

}
