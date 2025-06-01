# sc4-ghidra-symbols

This repository contains Ghidra symbol and function identification information for SimCity 4.

## Data Type Archive (SimCity4.gdt)

This archive contains interface, class, and structure information.
The class and interface information was extracted from the 32-bit Mac ports of SimCity 4 Deluxe (PowerPC and x86), which were shipped with debug symbols.

### How to Use

See [Using the Data Type Archive](./Use-Data-Type-Archive.md)

## Function ID Databases

These databases assist Ghidra in attempting to identify library functions in the Windows version of SimCity 4.
Because the Windows version was never shipped with debug symbols, the imported OS calls will often be the only functions with known names.'

See the [read-me](./function-id/README.md) in the function-id folder for more information.
