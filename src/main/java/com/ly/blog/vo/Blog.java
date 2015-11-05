package com.ly.blog.vo;

import java.util.Date;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.View;
import org.nutz.dao.entity.annotation.Readonly;


@Table("blog")
@View("blog_view")
public class Blog{

	@Id
	@Column
	private Long id;

	@Column
	@Readonly
	private String blogclassname;
		

	@Column
	private Long blogclassid;


	@Column
	private String titile;


	@Column
	private String info;


	@Column
	private String infomd;


	@Column
	private Date adddate;


	@Column
	private Date editdate;


	@Column
	private Long userid;


	@Column
	private Long gotop;





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getBlogclassname() {
		return blogclassname;
	}

	public void setBlogclassname(String blogclassname) {
		this.blogclassname = blogclassname;
	}


	public Long getBlogclassid() {
		return blogclassid;
	}

	public void setBlogclassid(Long blogclassid) {
		this.blogclassid = blogclassid;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfomd() {
		return infomd;
	}

	public void setInfomd(String infomd) {
		this.infomd = infomd;
	}

	public Date getAdddate() {
		return adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public Date getEditdate() {
		return editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getGotop() {
		return gotop;
	}

	public void setGotop(Long gotop) {
		this.gotop = gotop;
	}
}
