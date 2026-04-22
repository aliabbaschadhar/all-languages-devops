use std::env;

fn main() {
    let greeting = env::var("GREETING").unwrap_or_else(|_| "Hello, World!".to_string());
    println!("{}", greeting);
}
