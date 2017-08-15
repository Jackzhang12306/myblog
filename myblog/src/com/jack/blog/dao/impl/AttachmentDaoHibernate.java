package com.jack.blog.dao.impl;

import java.util.List;

import com.jack.blog.dao.AttachmentDao;
import com.jack.blog.domain.Attachment;
import com.jack.blog.domain.Blog;
import com.jack.common.util.PageHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AttachmentDaoHibernate extends PageHibernateDaoSupport<Attachment> implements AttachmentDao {

    public AttachmentDaoHibernate() {
        super();
        setClass(Attachment.class);
    }

    public List<Attachment> findByBlog(Blog blog) {
        String hql = "from Attachment where blog = ? order by upload";
        return (List<Attachment>) getHibernateTemplate().find(hql, blog);
    }
}
