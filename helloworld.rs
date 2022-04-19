#[no_mangle]
fn get_hello_world() -> String {
    // We want to link our Java code (the one loading the LLVM bitcode for this file) to Rust's
    // libstd in order to use Strings.
    // Note: returning i64 should just work 
    // $HOME/.local/share/rustup/toolchains/nightly-2021-05-10-x86_64-unknown-linux-gnu/lib/libstd-c6dddd3d354e6bea.so
    "Hello, world!".to_string()
}

#[no_mangle]
fn get_number() -> i64 {
    42
}
