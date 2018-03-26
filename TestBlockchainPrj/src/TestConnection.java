import java.util.concurrent.ExecutionException;

import org.web3j.protocol.http.HttpService;
import org.web3j.quorum.Quorum;
import org.web3j.quorum.methods.response.QuorumNodeInfo;

public class TestConnection {

	public static void main(String[] args) {
		Quorum quorum = Quorum.build(new HttpService("http://localhost:22001"));
		QuorumNodeInfo quorumNodeInfo;
		try {
			quorumNodeInfo = quorum.quorumNodeInfo().send();
			String voteAccount = quorumNodeInfo.getNodeInfo().getVoteAccount();
			System.out.println("vote account is"+voteAccount);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
