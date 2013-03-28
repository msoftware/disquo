package com.anthavio.disquo.api.posts;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.response.DisqusId;

/**
 * 
 * @author martin.vanek
 *
 */
public class PostRemoveMethod extends BaseMultiPostMethod<PostRemoveMethod, DisqusId> {

	public PostRemoveMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Posts.remove);
	}

	@Override
	protected PostRemoveMethod getB() {
		return this;
	}

}