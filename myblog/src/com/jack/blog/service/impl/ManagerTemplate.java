package com.jack.blog.service.impl;

import org.directwebremoting.WebContextFactory;
import com.jack.blog.component.ConfigComponent;
import com.jack.blog.dao.AttachmentDao;
import com.jack.blog.dao.BlogDao;
import com.jack.blog.dao.CommentDao;
import com.jack.blog.dao.IllustrationDao;
import com.jack.blog.dao.TypeDao;
import com.jack.blog.service.AdminManager;
import com.jack.blog.service.impl.ConfigManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpSession;

public class ManagerTemplate {

	@Autowired
	protected BlogDao blogDao;

	@Autowired
	protected CommentDao commentDao;

	@Autowired
	protected TypeDao typeDao;

	@Autowired
	protected IllustrationDao illustrationDao;

	@Autowired
	protected AttachmentDao attachmentDao;

	@Autowired
	protected ConfigComponent configComponent;
	
	private WebApplicationContext context = null;

	public void setContext(WebApplicationContext context) {
		this.context = context;
	}

	public WebApplicationContext getContext() {
		if(context == null) {
			context = WebApplicationContextUtils.getWebApplicationContext(WebContextFactory.get().getServletContext());
		}
		return context;
	}

	public boolean checkAdminSession(HttpSession session) {
		return session.getAttribute(AdminManager.AdminFlag) != null;
	}

}
