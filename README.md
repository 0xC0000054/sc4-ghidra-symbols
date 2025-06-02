# sc4-ghidra-symbols

This repository contains Ghidra symbol and function identification information for SimCity 4.

## Data Type Archives

### How to Use

See [Using the Data Type Archive](./Use-Data-Type-Archive.md)

### SimCity4.gdt

This archive contains interface, class, and structure information.
The class and interface information was extracted from the 32-bit Mac ports of SimCity 4 Deluxe (PowerPC and x86), which were shipped with debug symbols.

### Gimex.gdt

This archive contains structure information for the Gimex (Graphics IMport EXport) library used by SimCity 4 and other EA titles.
The types were extracted from the [Gimex header](https://github.com/electronicarts/CnC_Generals_Zero_Hour/blob/main/Generals/Code/Libraries/Source/Compression/EAC/gimex.h) that was released with the Command & Conquer Generals source code.
The version in that header (3.46) is one revision newer than what was used in SimCity 4 (3.45), but the only change in 3.46 appears to have been defining a new bit field in space that was already reserved.

## Function ID Databases

These databases assist Ghidra in attempting to identify library functions in the Windows version of SimCity 4.
Because the Windows version was never shipped with debug symbols, the imported OS calls will often be the only functions with known names.'

See the [read-me](./function-id/README.md) in the function-id folder for more information.
