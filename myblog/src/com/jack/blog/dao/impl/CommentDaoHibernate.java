package com.jack.blog.dao.impl;

import java.util.List;

import com.jack.blog.dao.CommentDao;
import com.jack.blog.domain.Blog;
import com.jack.blog.domain.Comment;
import com.jack.common.util.PageHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoHibernate extends PageHibernateDaoSupport<Comment> implements CommentDao {

    public CommentDaoHibernate() {
        super();
        setClass(Comment.class);
    }

    public List<Comment> findByBlog(Blog blog) {
        return (List<Comment>) getHibernateTemplate().find("from Comment where blog = ? order by date desc", blog);
    }

}
