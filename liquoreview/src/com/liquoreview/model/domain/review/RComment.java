package com.liquoreview.model.domain.review;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.liquoreview.model.domain.member.Member;

public class RComment {
	private int r_comment_id;
	private Review review;
	private Member member;
	private String detail;
	private int like_hit;
	private int hate_hit;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Timestamp regdate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Timestamp last_modi_ymd;

	//getters and setters
	public int getR_comment_id() {
		return r_comment_id;
	}
	public void setR_comment_id(int r_comment_id) {
		this.r_comment_id = r_comment_id;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getLike_hit() {
		return like_hit;
	}
	public void setLike_hit(int like_hit) {
		this.like_hit = like_hit;
	}
	public int getHate_hit() {
		return hate_hit;
	}
	public void setHate_hit(int hate_hit) {
		this.hate_hit = hate_hit;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public Timestamp getLast_modi_ymd() {
		return last_modi_ymd;
	}
	public void setLast_modi_ymd(Timestamp last_modi_ymd) {
		this.last_modi_ymd = last_modi_ymd;
	}

	@Override
	public String toString() {
		return "RComment [r_comment_id=" + r_comment_id + ", review=" + review + ", member=" + member + ", detail="
				+ detail + ", like_hit=" + like_hit + ", hate_hit=" + hate_hit + ", regdate=" + regdate
				+ ", last_modi_ymd=" + last_modi_ymd + "]";
	}
}
