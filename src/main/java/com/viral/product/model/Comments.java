package com.viral.product.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8378810844487045506L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="commentId_pk", columnDefinition = "INT")
	private Long commentId;
	
	@Column(name="COMMENTS")
	private String comment;
	
	@Column(name="NO_OF_LIKES")
	private int noOfLikes;
	
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="COMMENT_ID")
	private List<CommentReply> commentReply;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public List<CommentReply> getCommentReply() {
		return commentReply;
	}

	public void setCommentReply(List<CommentReply> commentReply) {
		this.commentReply = commentReply;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
