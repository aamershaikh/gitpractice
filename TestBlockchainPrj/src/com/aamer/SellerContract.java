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
public final class SellerContract extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b61018e8061001f6000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680632b355d8e14610049578063941385e21461009e575b600080fd5b341561005457600080fd5b610084600480803560001916906020019091908035600019169060200190919080359060200190919050506100e8565b604051808215151515815260200191505060405180910390f35b34156100a957600080fd5b6100c360048080356000191690602001909190505061013e565b6040518083600019166000191681526020018281526020019250505060405180910390f35b6000826000808660001916600019168152602001908152602001600020600001816000191690555081600080866000191660001916815260200190815260200160002060010181905550600190505b9392505050565b600060205280600052604060002060009150905080600001549080600101549050825600a165627a7a7230582036508e05561f15445127d91e0244827941df190a9976149d884f341971b943750029\n";

    private SellerContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private SellerContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> StoreSellerDetails(Bytes32 key2, Bytes32 name, Uint256 value) {
        Function function = new Function("StoreSellerDetails", Arrays.<Type>asList(key2, name, value), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<List<Type>> sellerStructs(Bytes32 param0) {
        Function function = new Function("sellerStructs", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public static Future<SellerContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(SellerContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<SellerContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(SellerContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static SellerContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SellerContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static SellerContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SellerContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
