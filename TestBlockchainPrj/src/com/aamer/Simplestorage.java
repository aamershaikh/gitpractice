package com.aamer;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.0.
 */
public final class Simplestorage extends Contract {
    private static final String BINARY = "6060604052341561000c57fe5b60405160208061013a833981016040528080519060200190919050505b806000819055505b505b60f9806100416000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680632a1afcd914604e57806360fe47b11460715780636d4ce63c14608e575bfe5b3415605557fe5b605b60b1565b6040518082815260200191505060405180910390f35b3415607857fe5b608c600480803590602001909190505060b7565b005b3415609557fe5b609b60c2565b6040518082815260200191505060405180910390f35b60005481565b806000819055505b50565b600060005490505b905600a165627a7a72305820a4a8401a6f9241ec5843c67861d31d3a352fa1dd4acd293dcaf38aabe3ddf9900029\n";

    private Simplestorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Simplestorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Uint256> storedData() {
        Function function = new Function("storedData", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> set(Uint256 x) {
        Function function = new Function("set", Arrays.<Type>asList(x), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> get() {
        Function function = new Function("get", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<Simplestorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 initVal) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(initVal));
        return deployAsync(Simplestorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<Simplestorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Uint256 initVal) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(initVal));
        return deployAsync(Simplestorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Simplestorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Simplestorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Simplestorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Simplestorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
