pragma solidity ^0.4.6;

contract TestLogsEvents {

   event Print(uint res);
   
   function multiply(uint input) public returns (uint result) {
      emit Print(input * 7);
      return input * 7;
   }
}