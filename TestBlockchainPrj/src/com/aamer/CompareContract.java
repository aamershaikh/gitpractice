package com.aamer;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.2.
 */
public final class CompareContract extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b604051604080610624833981016040528080519060200190919080519060200190919050505b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555081600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b50505b61055b806100c96000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680633c98a45514610049578063c7a93abc14610091575b600080fd5b341561005457600080fd5b61007b600480803560001916906020019091908035600019169060200190919050506100fe565b6040518082815260200191505060405180910390f35b341561009c57600080fd5b6100c360048080356000191690602001909190803560001916906020019091905050610302565b604051808560001916600019168152602001848152602001836000191660001916815260200182815260200194505050505060405180910390f35b60006101086104f5565b610110610512565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663070fc2ef866000604051604001526040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018082600019166000191681526020019150506040805180830381600087803b15156101af57600080fd5b6102c65a03f115156101c057600080fd5b505050604051805190602001805190508360000184602001828152508260001916600019168152505050600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663941385e2856000604051604001526040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018082600019166000191681526020019150506040805180830381600087803b151561028a57600080fd5b6102c65a03f1151561029b57600080fd5b5050506040518051906020018051905082600001836020018281525082600019166000191681525050508060000151600019168260000151600019161480156102eb575080602001518260200151145b156102f957600192506102fa565b5b505092915050565b6000806000806103106104f5565b610318610512565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663070fc2ef896000604051604001526040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018082600019166000191681526020019150506040805180830381600087803b15156103b757600080fd5b6102c65a03f115156103c857600080fd5b505050604051805190602001805190508360000184602001828152508260001916600019168152505050600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663941385e2886000604051604001526040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018082600019166000191681526020019150506040805180830381600087803b151561049257600080fd5b6102c65a03f115156104a357600080fd5b505050604051805190602001805190508260000183602001828152508260001916600019168152505050816000015182602001518260000151836020015195509550955095505b505092959194509250565b604080519081016040528060008019168152602001600081525090565b6040805190810160405280600080191681526020016000815250905600a165627a7a72305820acfa14d768f9b96718463f4b6859de722412ce31e3b13ef038a4a563755256180029\n";

    private CompareContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private CompareContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Uint256> CompareData(Bytes32 key, Bytes32 key2) {
        Function function = new Function("CompareData", 
                Arrays.<Type>asList(key, key2), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<List<Type>> RetrieveBuyerSellerData(Bytes32 key, Bytes32 key2) {
        Function function = new Function("RetrieveBuyerSellerData", 
                Arrays.<Type>asList(key, key2), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public static Future<CompareContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address SellerContractAddress, Address BuyerContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(SellerContractAddress, BuyerContractAddress));
        return deployAsync(CompareContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<CompareContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address SellerContractAddress, Address BuyerContractAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(SellerContractAddress, BuyerContractAddress));
        return deployAsync(CompareContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static CompareContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CompareContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static CompareContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CompareContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
