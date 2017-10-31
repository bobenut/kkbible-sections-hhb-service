package com.kkbible.service.sections.hhb.domain;

import org.springframework.data.annotation.Id;

/**
 * 和合本圣经每一节实体对象
 * @author Aisen
 *
 */
public class HhbSection {
	@Id
	private String id;
	
	/**
	 * 代表是新约还是旧约的编号
	 */
	private int testamentNo;
	
	/**
	 * 新旧约的中文名
	 */
	private String testamentNameCn;
	
	/**
	 * 新旧约的英文名
	 */
	private String testamentNameEn;
	
	/**
	 * 新旧约里面的哪一篇的编号
	 */
	private int pieceNo;
	
	/**
	 * 新旧约里面的哪一篇的中文名
	 */
	private String pieceNameCn;
	
	/**
	 * 新旧约里面的哪一篇的英文名
	 */
	private String pieceNameEn;
	
	/**
	 * 某一篇中的哪一章的编号
	 */
	private int chapterNo;
	
	/**
	 * 某一章中哪一节的编号
	 */
	private String sectionNo;
	
	/**
	 * 某一章中哪一节的内容
	 */
	private String sectionContent;
	
	public HhbSection() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTestamentNo() {
		return testamentNo;
	}

	public void setTestamentNo(int testamentNo) {
		this.testamentNo = testamentNo;
	}

	public String getTestamentNameCn() {
		return testamentNameCn;
	}

	public void setTestamentNameCn(String testamentNameCn) {
		this.testamentNameCn = testamentNameCn;
	}

	public String getTestamentNameEn() {
		return testamentNameEn;
	}

	public void setTestamentNameEn(String testamentNameEn) {
		this.testamentNameEn = testamentNameEn;
	}

	public int getPieceNo() {
		return pieceNo;
	}

	public void setPieceNo(int pieceNo) {
		this.pieceNo = pieceNo;
	}

	public String getPieceNameCn() {
		return pieceNameCn;
	}

	public void setPieceNameCn(String pieceNameCn) {
		this.pieceNameCn = pieceNameCn;
	}

	public String getPieceNameEn() {
		return pieceNameEn;
	}

	public void setPieceNameEn(String pieceNameEn) {
		this.pieceNameEn = pieceNameEn;
	}

	public int getChapterNo() {
		return chapterNo;
	}

	public void setChapterNo(int chapterNo) {
		this.chapterNo = chapterNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getSectionContent() {
		return sectionContent;
	}

	public void setSectionContent(String sectionContent) {
		this.sectionContent = sectionContent;
	}
}
