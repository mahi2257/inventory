package com.viral.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commentReply")
public class CommentReply implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5531517836240784048L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="commntReplyId_fk", columnDefinition = "INT")
	private Long repId;
	
	@Column(name="COMMENT_REPLY")
	private String commentReply;
	
	@Column(name="NO_OF_LIKES")
	private int noOfLikes;

	public Long getRepId() {
		return repId;
	}

	public void setRepId(Long repId) {
		this.repId = repId;
	}

	public String getCommentReply() {
		return commentReply;
	}

	public void setCommentReply(String commentReply) {
		this.commentReply = commentReply;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
}
