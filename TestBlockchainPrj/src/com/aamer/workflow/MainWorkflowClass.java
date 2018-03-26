package com.aamer.workflow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.http.HttpService;
import org.web3j.quorum.Quorum;
import org.web3j.quorum.tx.ClientTransactionManager;

import com.aamer.BuyerContract;
import com.aamer.CompareContract;
import com.aamer.SellerContract;

public class MainWorkflowClass {

	public static void main(String[] args) {
		String sellerCA = sellerContractNodeOne();
		
		String buyerCA = buyerContractNodeFour();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compareValuesInContract(sellerCA, buyerCA);
	}

	
	private static void compareValuesInContract(String sellerContractAddr , String buyerContractAddr) {
		// connect to local geth node 5
    	Quorum quorumNode5 = Quorum.build(new HttpService("http://localhost:22004"));
    	
    	// privateFor Node 4 (Buyer)
    	List<String> list = new ArrayList<String>();
		list.add("oNspPPgszVUFw0qmGFfWwh1uxVUXgvBxleXORHj07g8=");
		
		ClientTransactionManager ctm = new ClientTransactionManager(quorumNode5,"0x0638e1574728b6d862dd5d3a3e0942c3be47d996", list);

		CompareContract compareContract;
		
		String key1 = "1";
		byte[] byteValue1 = key1.getBytes();
        byte[] byteValueLen321 = new byte[32];
        System.arraycopy(byteValue1, 0, byteValueLen321, 0, byteValue1.length);
        Bytes32 value1 = new Bytes32(byteValueLen321);
		
        
        String key2 = "1";
		byte[] byteValue2 = key2.getBytes();
        byte[] byteValueLen322 = new byte[32];
        System.arraycopy(byteValue2, 0, byteValueLen322, 0, byteValue2.length);
        Bytes32 value2 = new Bytes32(byteValueLen322);
		
		
		try {
			compareContract = CompareContract.deploy(quorumNode5, ctm, new BigInteger("300000"), new BigInteger("600000"), new BigInteger("0"), new Address(sellerContractAddr), new Address(buyerContractAddr)).get();
			System.out.println("Comparision Value is :" + compareContract.CompareData(value1, value2).get(60, TimeUnit.SECONDS));
		
			
			System.out.println("Value retrieved is "+ compareContract.RetrieveBuyerSellerData(value1, value2).get(60, TimeUnit.SECONDS));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private static String buyerContractNodeFour() {
		
		String buyerContractAddress = null;
		
		// connect to local geth node 4
    	Quorum quorumNode4 = Quorum.build(new HttpService("http://localhost:22003"));
    	
    	// privateFor Node 1 and 5
    	List<String> list = new ArrayList<String>();
		list.add("BULeR8JyUWhiuuCMU/HLA0Q5pzkYT+cHII3ZKBey3Bo=");
		list.add("R56gy4dn24YOjwyesTczYa8m5xhP6hF2uTMCju/1xkY=");
		
		//set bytes32 data indirectly
		String key = "1";
		byte[] byteValue = key.getBytes();
        byte[] byteValueLen32 = new byte[32];
        System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
        Bytes32 value = new Bytes32(byteValueLen32);
		
		String name = "Aamer";
		byte[] byteValue1 = name.getBytes();
        byte[] byteValueLen321 = new byte[32];
        System.arraycopy(byteValue1, 0, byteValueLen321, 0, byteValue.length);
        Bytes32 value1 = new Bytes32(byteValueLen32);
		
		ClientTransactionManager ctm = new ClientTransactionManager(quorumNode4,"0x9186eb3d20cbd1f5f992a950d808c4495153abd5", list);
		
		BuyerContract buyerContract;
		
		try {
			buyerContract = BuyerContract.deploy(quorumNode4, ctm, new BigInteger("300000"), new BigInteger("600000"), null).get();
			buyerContractAddress = buyerContract.getContractAddress();
			System.out.println("Buyer Contract Address  = "+buyerContractAddress);
			System.out.println("StoreBuyerDetailsResult : "+buyerContract.StoreBuyerDetails(value, value1, new Uint256(new BigInteger("100"))).get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buyerContractAddress; 
	
				
	}

	private static String sellerContractNodeOne() {
		
		String sellerContractAddress = null;
		
		// connect to local geth node 1
    	Quorum quorumNode1 = Quorum.build(new HttpService("http://localhost:22000"));
    	
    	// privateFor Node 4 and 5
    	List<String> list = new ArrayList<String>();
		list.add("oNspPPgszVUFw0qmGFfWwh1uxVUXgvBxleXORHj07g8=");
		list.add("R56gy4dn24YOjwyesTczYa8m5xhP6hF2uTMCju/1xkY=");
		
		//set bytes32 data indirectly
		String key = "1";
		byte[] byteValue = key.getBytes();
        byte[] byteValueLen32 = new byte[32];
        System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
        Bytes32 value = new Bytes32(byteValueLen32);
		
		String name = "Aamer";
		byte[] byteValue1 = name.getBytes();
        byte[] byteValueLen321 = new byte[32];
        System.arraycopy(byteValue1, 0, byteValueLen321, 0, byteValue.length);
        Bytes32 value1 = new Bytes32(byteValueLen32);
		
		ClientTransactionManager ctm = new ClientTransactionManager(quorumNode1,"0xed9d02e382b34818e88b88a309c7fe71e65f419d", list);
		
		SellerContract sellerContract;
		
		try {
			sellerContract = SellerContract.deploy(quorumNode1, ctm, new BigInteger("300000"), new BigInteger("600000"), null).get();
			sellerContractAddress = sellerContract.getContractAddress();
			
			System.out.println("Seller Contract Address  = "+sellerContractAddress);
			
			System.out.println("StoreSellerDetailsResult : "+sellerContract.StoreSellerDetails(value, value1, new Uint256(new BigInteger("100"))).get());

		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return sellerContractAddress;
	}
	
}
