#include <cstdlib>
#include <iostream>

int main() {
    const char* greeting = std::getenv("GREETING");
    std::cout << (greeting != nullptr ? greeting : "Hello, World!") << std::endl;
    return 0;
}
