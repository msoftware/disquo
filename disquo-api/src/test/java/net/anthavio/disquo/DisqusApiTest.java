package net.anthavio.disquo;

import java.util.List;

import net.anthavio.disquo.api.DisqusApi;
import net.anthavio.disquo.api.DisqusApi.Identity;
import net.anthavio.disquo.api.response.DisqusImportDetails;
import net.anthavio.disquo.api.response.DisqusResponse;
import net.anthavio.disquo.api.response.DisqusThread;
import net.anthavio.httl.transport.HttpClient4Config;

public class DisqusApiTest {

	public static void main(String[] args) {
		TestInputData tidata = TestInputData.load("disqus-test.properties");
		HttpClient4Config config = new HttpClient4Config(tidata.getUrl());
		DisqusApi disqus = new DisqusApi(tidata.getApplicationKeys(), config.sender());

		DisqusResponse<List<DisqusThread>> list = disqus.threads().list()
				//.threadIdent("newident").forum("dajc").execute();
				//.thread(1028737684).execute();
				.threadLink("http://example.com/thread/828101508").execute();
		System.out.println(list);

		//disqus.getSender().
		//DisqusResponse<DisqusThread> value = disqus.threads().details(100, null);
		//System.out.println(value);

		//ListThreadsBuilder builder = disqus.threads().list();
		//List<DisqusThread> threads = builder.forum("testforum").include(ThreadState.open, ThreadState.closed).execute()
		//		.getResponse();
		/*
		List<DisqusThread> threads = disqus.threads().set(1092529193, 1045227591, 1807462718, 2853108846l).getResponse();
		for (DisqusThread thread : threads) {
			System.out.println(thread);
		}
		
		if (true)
			return;
		*/
		//postid=1516808009
		//tidata.getAccessToken()

		//DisqusResponse<List<DisqusImportDetails>> created = disqus.imports().list("dajc", null);
		//System.out.println(created);

		//disqus.users();
		//System.out.println(forum2);

		//System.out.println(response.getResponse());
		disqus.close();
	}
}
