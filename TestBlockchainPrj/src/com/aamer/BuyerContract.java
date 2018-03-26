package com.aamer;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.2.
 */
public final class BuyerContract extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b61018e8061001f6000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063070fc2ef14610049578063c8bdb1b814610093575b600080fd5b341561005457600080fd5b61006e6004808035600019169060200190919050506100e8565b6040518083600019166000191681526020018281526020019250505060405180910390f35b341561009e57600080fd5b6100ce6004808035600019169060200190919080356000191690602001909190803590602001909190505061010c565b604051808215151515815260200191505060405180910390f35b60006020528060005260406000206000915090508060000154908060010154905082565b6000826000808660001916600019168152602001908152602001600020600001816000191690555081600080866000191660001916815260200190815260200160002060010181905550600190505b93925050505600a165627a7a7230582092ec6d6144982330f5363154b78d20b8e4e4941fbbc769d98389fceade1493630029\n";

    private BuyerContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private BuyerContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<List<Type>> buyerStructs(Bytes32 param0) {
        Function function = new Function("buyerStructs", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> StoreBuyerDetails(Bytes32 key, Bytes32 name, Uint256 value) {
        Function function = new Function("StoreBuyerDetails", Arrays.<Type>asList(key, name, value), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<BuyerContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(BuyerContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<BuyerContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(BuyerContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static BuyerContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BuyerContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static BuyerContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BuyerContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
