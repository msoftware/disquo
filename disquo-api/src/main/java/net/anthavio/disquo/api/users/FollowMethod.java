package net.anthavio.disquo.api.users;

import net.anthavio.disquo.api.Disqus;
import net.anthavio.disquo.api.DisqusMethod;
import net.anthavio.disquo.api.DisqusMethodConfig;
import net.anthavio.disquo.api.QUser;

/**
 * 
 * @author martin.vanek
 *
 */
public class FollowMethod extends DisqusMethod<FollowMethod, Object> {

	public FollowMethod(Disqus disqus) {
		super(disqus, DisqusMethodConfig.Users.follow);
	}

	public FollowMethod setUser(long userId) {
		return setUser(QUser.build(userId));
	}

	public FollowMethod setUser(String username) {
		return setUser(QUser.build(username));
	}

	public FollowMethod setUser(QUser user) {
		addParam("target", user);
		return this;
	}

	@Override
	protected FollowMethod getB() {
		return this;
	}

}