# 💰 GG Bank - Simple Java Banking System

A beginner-friendly Java console application simulating basic banking operations like checking balance, depositing money, and withdrawing funds.

---

## 🧠 Features

- Check current account balance
- Deposit money with a limit check
  - Allows special permission (`ggwp`) for large deposits
- Withdraw money with balance validation
- Exit safely with a friendly UI

---

## 📋 Menu Options

    Show balance

    Deposit

    Withdraw

    Exit bank


---

## 📦 How to Run

### Prerequisites
- Java installed (JDK 8+ recommended)
- Any code editor or terminal

### Steps

1. **Clone or download the repository**  
2. **Compile the Java file**

```bash
javac Main.java

    Run the application

java Main

💡 Sample Screenshot

        _____________________
       /                     \
      /       GG BANK         \
     /_________________________\
     ||   ||   ||   ||   ||   ||
     ||   ||   ||   ||   ||   ||
     ||   ||   ||   ||   ||   ||
     ||___||___||___||___||___||
     |                         |
     |   ___             ___   |
     |  |   |           |   |  |
     |  |___|           |___|  |
     |_________________________|
1.Show balance
2.Deposit
3.Withdraw
4.Exit bank
Enter your desired Choice (1-4)... :

📘 Code Highlights

    Uses Scanner to get user input

    Proper use of format specifier %.2f for currency

    Input validation for both deposits and withdrawals

    Clean and readable switch-case logic with Java 14+ arrow syntax (case ->)

🛠 Future Improvements (Optional)

    Add user account login system

    Save transaction history

    Introduce file I/O for persistence

    GUI version using Swing or JavaFX
