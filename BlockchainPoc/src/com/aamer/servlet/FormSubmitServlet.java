package com.aamer.servlet;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web3j.protocol.http.HttpService;
import org.web3j.quorum.Quorum;
import org.web3j.quorum.methods.request.PrivateTransaction;
import org.web3j.quorum.methods.response.QuorumNodeInfo;
import org.web3j.quorum.tx.ClientTransactionManager;

/**
 * Servlet implementation class FormSubmitServlet
 */
@WebServlet("/formSubmitServlet")
public class FormSubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSubmitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("inputText");
		System.out.println("Value is :"+ value);
		
		
		Quorum quorum = Quorum.build(new HttpService("http://localhost:22001"));
		QuorumNodeInfo quorumNodeInfo;
		try {
			quorumNodeInfo = quorum.quorumNodeInfo().sendAsync().get();
			String voteAccount = quorumNodeInfo.getNodeInfo().getVoteAccount();
			System.out.println("Vote Account is :"+voteAccount);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		/*Quorum quorum = Quorum.build(new HttpService("http://localhost:22001"));
		quorum.ethSendTransaction(new PrivateTransaction("0xed9d02e382b34818e88b88a309c7fe71e65f419d", nonce, new BigInteger("300000"),, 2000, data, "ROAZBWtSacxXQrOe3FGAqJDyJjFePR5ce4TSIzmJ0Bc"))
		
		// web3j 
		ClientTransactionManager clientTransactionManager =  new ClientTransactionManager(new Web3, "0xed9d02e382b34818e88b88a309c7fe71e65f419d", "ROAZBWtSacxXQrOe3FGAqJDyJjFePR5ce4TSIzmJ0Bc");
		*/
	}

}
