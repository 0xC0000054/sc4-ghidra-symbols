# SC4 Ghidra Scripts

This folder contains various helper scripts for working with the SC4 binaries in Ghidra.

## SetVtableFunctionCallingConventionToThiscall.java

Used with the selected address at the start of the class vtable to set the calling convention
of all vtable functions to thiscall.
Ghidra appears to omit the this pointer for class vtable functions by default when dissembling
the 32-bit Mac x86 binary.