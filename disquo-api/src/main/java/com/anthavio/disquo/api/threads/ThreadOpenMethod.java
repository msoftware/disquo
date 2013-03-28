package com.anthavio.disquo.api.threads;

import com.anthavio.disquo.api.Disqus;
import com.anthavio.disquo.api.DisqusMethodConfig;
import com.anthavio.disquo.api.response.DisqusId;

/**
 * 
 * @author martin.vanek
 *
 */
public class ThreadOpenMethod extends BaseMultiThreadMethod<ThreadOpenMethod, DisqusId> {

	public ThreadOpenMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Threads.open);
	}

	@Override
	protected ThreadOpenMethod getB() {
		return this;
	}

}