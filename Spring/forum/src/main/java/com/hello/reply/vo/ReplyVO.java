package com.hello.reply.vo;

import com.hello.member.vo.MemberVO;

/**
 * REPLY
 */
public class ReplyVO {

	/**
	 * 댓글 계층조회를 위한 Level 데이터
	 */
	private int depth;
	private int replyId;
	private int topicId;
	private String reply;
	private String email;
	private String crtDt;
	private String mdfyDt;
	private int prntReplyId;
	private MemberVO memberVO;
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCrtDt() {
		return crtDt;
	}
	public void setCrtDt(String crtDt) {
		this.crtDt = crtDt;
	}
	public String getMdfyDt() {
		return mdfyDt;
	}
	public void setMdfyDt(String mdfyDt) {
		this.mdfyDt = mdfyDt;
	}
	public int getPrntReplyId() {
		return prntReplyId;
	}
	public void setPrntReplyId(int prntReplyId) {
		this.prntReplyId = prntReplyId;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	
	
}