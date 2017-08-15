package com.jack.blog.dao;

import java.util.List;

import com.jack.blog.domain.Blog;
import com.jack.blog.domain.Illustration;
import com.jack.common.util.CrudDao;

public interface IllustrationDao extends CrudDao<Illustration> {

	/**
	 * 根据博文查找插图
	 * @param blog
	 * @return
	 */
	List<Illustration> findByBlog(Blog blog);
}
