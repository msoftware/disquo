package net.anthavio.disquo.api;

import net.anthavio.httl.HttlBuilder;
import net.anthavio.httl.HttlRequest;
import net.anthavio.httl.HttlSender.Multival;
import net.anthavio.httl.SenderConfigurer;
import net.anthavio.httl.util.MockTransport;

import org.junit.BeforeClass;

/**
 * 
 * @author martin.vanek
 *
 */
public class DisqusMethodTest {

	protected static MockTransport mock;

	protected static DisqusApi disqus;

	@BeforeClass
	public static void setup() {
		mock = HttlBuilder.transport("x.y.z").mock().build();
		mock.setStaticResponse(200, "application/json", "{\"code\" : 0, \"response\" : null }");
		SenderConfigurer config = HttlBuilder.sender(mock);
		disqus = new DisqusApi(new DisqusApplicationKeys("publicKey", "secretKey", "accessToken"), config);
	}

	protected HttlRequest getRequest() {
		return mock.getLastRequest();
	}

	protected Multival<String> getParameters() {
		return getRequest().getParameters();
	}
}
