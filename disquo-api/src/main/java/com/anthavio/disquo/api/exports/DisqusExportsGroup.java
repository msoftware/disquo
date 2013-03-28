package com.anthavio.disquo.api.exports;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusFeatureGroup;

/**
 * 
 * @author martin.vanek
 *
 */
public class DisqusExportsGroup extends DisqusFeatureGroup {

	public DisqusExportsGroup(Disqus disqus) {
		super(disqus);
	}

	public ExportForumMethod exportForum(String forum) {
		return new ExportForumMethod(disqus).setForum(forum);
	}

}