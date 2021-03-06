package net.anthavio.disquo.browser;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import net.anthavio.disquo.api.ArgumentConfig.PostState;
import net.anthavio.disquo.api.response.JsonStringBuilder;


/**
 * 
 * @author martin.vanek
 *
 */
public class PostSearchCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long category;

	private Long thread;

	private String forum;

	private Date since;

	private List<PostState> includes = new LinkedList<PostState>();

	public PostSearchCriteria() {
		includes.add(PostState.approved);
	}

	@Override
	public String toString() {
		return JsonStringBuilder.toString(this);
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public Long getThread() {
		return thread;
	}

	public void setThread(Long thread) {
		this.thread = thread;
	}

	public String getForum() {
		return forum;
	}

	public void setForum(String forum) {
		this.forum = forum;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public List<PostState> getIncludes() {
		return includes;
	}

	public void setIncludes(List<PostState> states) {
		this.includes = states;
	}

}
