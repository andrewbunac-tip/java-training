##Expense Manager App
Create a Java program that can help user to track their daily Expenses

1. Create a class named `Item`. This class must have below details or attributes:
   * `date` yyyy-MM-dd HH:mm (2023-04-05) (LocalDateTime) https://www.baeldung.com/java-8-date-time-intro
   * `item` (String) Maximum 15 characters (add blank space to have 15 characters)
   * `description` (String) Maximum 30 characters (add blank space to have 30 characters)
   * `amount` (Big Decimal
2. The attributes of class `Item` must be encapsulated,  create getters and setters and/or create constructors
3. Create Class named `MyExpences`
4. `MyExpenses` class must have below Attributes:
   * `myExpenses` (`List<Item>`) (List<Item> myExpenses = new ArrayList<>()))
   *  `totalExpences` (BigDecimal)
5. This Attributes must be encapsulated. Create assessor(getters) but don't create mutators(setters)
6. In `MyExpenses` class, create method  name `add` with parameter `Item`. this method will Accept Item, compute the total expenses and save it to `totalExpences` attribute of `MyExpenses` class
7. In `MyExpenses` class, create a method name `displayMyExpenses`, this method will print all expenses  in below in table format
   ```
      Date                    Item              Description    Amount
      [2022-04-05 12:30]      Bottled Water     1L of water    30
      [2022-04-05 15:55]      Bread             From bakery    40
   ```
8. Lastly, In `MyExpenses` class, create method name `displayDailyExpenses` where this method will display the total `expenses` per day, You need to group the expenses by date and print it using System.out.print
   ```
      Date              Amount
      [2022-04-05]      599
      [2022-04-06]      1200
   ```
9. Create Main Class, add at leaset 10 expenses.


