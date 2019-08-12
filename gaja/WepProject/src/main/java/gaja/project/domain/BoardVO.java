package gaja.project.domain;

import java.util.Date;

public class BoardVO {
	
	private String bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	private String password;
	private String replycnt;
	
	
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReplycnt() {
		return replycnt;
	}
	public void setReplycnt(String replycnt) {
		this.replycnt = replycnt;
	}
	
	

}
