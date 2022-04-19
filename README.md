# GraalVM Test

## Compiling Rust 

```
gu install llvm-toolchain
```

Create a `rust-toolchain.toml` file to pin the llvm version. GraalVM supports
LLVM 12.0.1. I am using Rust's `nightly-2021-05-10`.

```
rustc --emit=llvm-bc --crate-type=lib helloworld.rs 
```

If we wanted to execture it we could run:
```
lli --lib $(rustc --print sysroot)/lib/libstd-* helloworld.bc
```

## Compiling Java

```
java -version
javac HelloWorld.java
java HelloWorld
```

