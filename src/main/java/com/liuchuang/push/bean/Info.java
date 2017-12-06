package com.liuchuang.push.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Info implements Serializable{
	private Integer id;

	private Integer type1;

	private Integer type2;

	private String title;

	private String note;

	private Date addtime;

	private Date edittime;

	private Integer isDel;

	private Integer isCome;

	private BigDecimal willDecimal;

	private BigDecimal realDecimal;

	private Integer userId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType1() {
		return type1;
	}

	public void setType1(Integer type1) {
		this.type1 = type1;
	}

	public Integer getType2() {
		return type2;
	}

	public void setType2(Integer type2) {
		this.type2 = type2;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getEdittime() {
		return edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsCome() {
		return isCome;
	}

	public void setIsCome(Integer isCome) {
		this.isCome = isCome;
	}

	public BigDecimal getWillDecimal() {
		return willDecimal;
	}

	public void setWillDecimal(BigDecimal willDecimal) {
		this.willDecimal = willDecimal;
	}

	public BigDecimal getRealDecimal() {
		return realDecimal;
	}

	public void setRealDecimal(BigDecimal realDecimal) {
		this.realDecimal = realDecimal;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		String format = "用户ID:%s %s%d元 备注%s";
		return String.format(format, userId,isCome==1?"收入":"支出",isCome==1?realDecimal.intValue():willDecimal.intValue(),note);
	}

	
	
}