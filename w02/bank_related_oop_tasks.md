### **Task 1: Bank Card Operations**

1. Create a class `BankCard` with the following private fields:

   * `cardNumber` → unique number identifying the card
   * `ownerName` → name of the card holder
   * `balance` → current balance of the card

2. Add the following methods:

   * `deposit(double amount)` → adds the specified amount to `balance`
   * `withdraw(double amount)` → subtracts the amount from `balance` if sufficient; otherwise prints `"Insufficient funds"`

3. In a main method:

   * Create two `BankCard` objects
   * Call `deposit` and `withdraw` methods with different amounts
   * Print the resulting `balance` for each object

---

### **Task 2: Bank Notification System**

1. Create an interface `NotificationService` with the following method:

   * `sendNotification(message, recipient)`

2. Create a class `EmailNotificationService` that implements `NotificationService`:

   * Add a private field: `senderEmail` → the email address used to send notifications
   * Implement `sendNotification` method: For now, just print a message to the console showing the `senderEmail`, `recipient`, and `message`

3. Create a class `SMSNotificationService` that implements `NotificationService`:

   * Add a private field: `senderNumber` → the phone number used to send SMS notifications
   * Implement `sendNotification` method: For now, just print a message to the console showing the `senderNumber`, `recipient`, and `message`

4. In a main method:

   * Create objects of `EmailNotificationService` and `SMSNotificationService`
   * Call `sendNotification` for each service with sample messages and recipients

---

### **Task 3: Bank Card Operations – Extended**

1. Create a class `BankCard` with the following private fields:

   * `cardNumber` → unique number identifying the card
   * `ownerName` → name of the card holder
   * `balance` → current balance of the card
   * `status` → current status of card(ACTIVE, BLOCKED, EXPIRED)

2. Add the following methods:

   * `deposit(double amount)` → adds the specified amount to `balance`
   * `withdraw(double amount)` → subtracts the amount from `balance` if sufficient and status is eligible for withdraw; otherwise prints `"Insufficient funds"`
   * `executePayment(double amount)` → subtracts the amount from `balance` if sufficient and status is eligible for payments; otherwise prints `"Insufficient funds"`

3. Create the first subclass `DebitCard` which inherits `BankCard`:

   * Add fields:

     * `cashbackRate` → cashback percentage for each transaction
     * `currentCashback` → total accumulated cashback
   * Override `executePayment` method: Deduct amount from `balance` if sufficient and status is eligible for payment then calculate cashback amount.

4. Create the second subclass `CreditCard` which inherits `BankCard`:

   * Add fields:

     * `totalLimit` → maximum allowed usage for the credit card
     * `interestDebt` → current interest accumulated on the card
     * `cardType` → type of card (`STANDARD` or `PLUS`). Based on the card type, set the interest rate (e.g., `STANDARD` = 10%, `PLUS` = 8%)
   * Override `executePayment` method: Deduct amount from `balance` if sufficient and status is eligible for payment and calculate interest amount, storing it in `interestDebt`
   * **[HINT]**: Can create a private method to calculate interest dept

5. In a main method:

   * Create an object of `DebitCard` and two objects of `CreditCard`
   * Call `deposit` and `withdraw` methods on each object multiple times
   * At the end, display `balance`, `interestDebt`, and `currentCashback` values from the related objects
