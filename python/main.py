import os


def main():
    print(os.getenv("GREETING", "Hello, World!"))


if __name__ == "__main__":
    main()
