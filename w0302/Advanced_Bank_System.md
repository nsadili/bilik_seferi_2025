# 🏦 Task 4: Advanced Bank System (with Exceptions, Generics, and Collections)

## **1. Custom Exceptions**

Create custom exception classes to handle errors in the banking system:

- `InsufficientFundsException` → should be thrown when a card does not have enough balance.  
- `CardBlockedException` → should be thrown when trying to use a blocked card.  
- `InvalidAmountException` → should be thrown when a negative or zero amount is used for deposit or withdrawal.

Each exception must:
- Have a constructor that accepts a message.  

---

## **2. Bank System with Generics, Exceptions, and Collections**

### **2.1 Generic Bank Repository**

1. Create a **generic interface** `BankRepository<T>` that defines methods for adding, removing, finding, and listing items.  
2. Implement this interface in a class called `BankCardRepository` which will manage a collection of `BankCard` objects.  
3. The repository should internally use any `List` implementation to store cards.

---

### **2.2 Bank System Operations (with Exception Handling)**

1. Create a class `BankSystem` that manages the logic of all operations.  
2. It should have a `BankCardRepository` instance to store and manage cards.  
3. Implement methods to perform:
   - `registerCard(BankCard card)`  
   - `depositToCard(String cardNumber, double amount)`  
   - `withdrawFromCard(String cardNumber, double amount)`  
   - `executePayment(String cardNumber, double amount)`  

4. Each method should:
   - Validate card existence and status.  
   - Validate transaction amounts.  
   - Throw appropriate exceptions when errors occur.  

5. Use `try-catch` blocks in the `main` method to handle these exceptions gracefully.

---

### **2.3 Working with Collections**

Add methods to work with and analyze multiple cards in the system:

- `getAllActiveCards()` → should return all cards that are active.  
- `getTop3CardsByBalance()` → should return the three cards with the highest balance.  
- `groupCardsByOwner()` → should return cards grouped by their owner’s name.

Students may use **Collections API** or **Stream API** for these operations.

---

### **2.4 Demonstration in Main**

In the `Main` class:

1. Create at least **two `DebitCard`** and **two `CreditCard`** objects.  
2. Register them in the `BankSystem`.  
3. Perform various deposit, withdrawal, and payment operations.  
4. Trigger each type of exception at least once (to test your exception handling).  
5. Display:
   - All active cards  
   - Top 3 cards by balance  
   - Cards grouped by owner  

---

## **3. (Optional Bonus)**

For extra points:

- Add **file operations** (`saveToFile()` and `loadFromFile()`) in the `BankSystem` using serialization.  
- Create **separate repositories** for `CreditCard` and `DebitCard` that extend the generic `BankRepository<T>`.  
- Use **Streams and Comparators** for sorting, filtering, and grouping data instead of loops.

---
