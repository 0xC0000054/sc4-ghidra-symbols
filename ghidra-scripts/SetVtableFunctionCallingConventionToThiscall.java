//Sets the calling convention of all funcions in a virtual function table to thiscall.
//@author 0xC0000054 
//@category Symbol
//@keybinding 
//@menupath 
//@toolbar 
//@runtime Java

import ghidra.app.script.GhidraScript;
import ghidra.program.model.sourcemap.*;
import ghidra.program.model.lang.protorules.*;
import ghidra.program.model.mem.*;
import ghidra.program.model.lang.*;
import ghidra.program.model.pcode.*;
import ghidra.program.model.data.ISF.*;
import ghidra.program.model.gclass.*;
import ghidra.program.model.util.*;
import ghidra.program.model.reloc.*;
import ghidra.program.model.data.*;
import ghidra.program.model.block.*;
import ghidra.program.model.symbol.*;
import ghidra.program.model.scalar.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;

public class SetVtableFunctionCallingConventionToThiscall extends GhidraScript {

    public void run() throws Exception {
    	Address firstInTable = currentAddress;
    	   	
    	Function function = getFunctionFromVtableAddress(firstInTable);
    	Address nextInTable = firstInTable;
    	
    	while (function != null)
    	{
    		String callingConventionName = function.getCallingConventionName();
    		
    		if (callingConventionName == CompilerSpec.CALLING_CONVENTION_unknown)
    		{
    			println("Changing the " + function.getName() + " calling convention from unknwn to thiscall.");
    			function.setCallingConvention(CompilerSpec.CALLING_CONVENTION_thiscall);
    		}
    		
    		nextInTable = nextInTable.add(nextInTable.getPointerSize());
    		
    		function = getFunctionFromVtableAddress(nextInTable);
    	}
    }
    
    private Function getFunctionFromVtableAddress(Address vtableAddr) throws MemoryAccessException
    {
    	Address functionAddress = vtableAddr.getNewAddress(getInt(vtableAddr));
    	
    	return getFunctionAt(functionAddress);
    }

}
