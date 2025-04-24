# Workbook 2 – Java Practice Projects

This folder contains my Java exercises from Workbook 2.  

---

## 📘 Exercises Included

### ✅ AddressBuilder
- Prompts the user to enter their full name, billing address, and shipping address
- Uses `StringBuilder` and the `append()` method to dynamically build a formatted address block
- Displays the customer’s full name followed by billing and shipping addresses
- Adds blank lines between sections for clear formatting
- Great practice for working with `StringBuilder`, user input, and string formatting

### ✅ CellPhoneService
- Builds a `CellPhone` class with fields like:
  - `serialNumber`
  - `model`
  - `carrier`
  - `phoneNumber`
  - `owner`
- Implements:
  - A parameterless constructor with default values.
  - An overloaded constructor to initialize all fields at once.
- Provides getter and setter methods for each field.
- Includes a `dial` method:
  - Allows dialing a phone number.
  - Overloaded to simulate one `CellPhone` object dialing another.
- In the main application:
  - Prompts the user to enter details for two cell phones.
  - Sets the details using setters and retrieves them using getters.
  - Displays the phone's properties in a formatted output.
  - Adds a separator line between the details of each phone for better readability.
  - Simulates dialing between the two phones using the `dial` method.
  - Creates a third `CellPhone` object using the overloaded constructor.
  - Initializes the third phone's fields using setters and displays its details.
  - Simulates dialing from the third phone to the first phone.
- Great practice for:
  - Working with classes, constructors, setters, and getters.
  - Handling user input with `Scanner`.
  - Formatting console output for clarity.
  - Overloading methods for enhanced functionality. 
 
### ✅ HighScoreWins
- Prompts the user to enter a game result in the format `TeamA:TeamB|ScoreA:ScoreB`
- Splits the input to extract both team names and their scores
- Compares the scores and prints the winning team
- Displays "It's a tie!" if both scores are equal
- Great for practicing string splitting, parsing, and conditionals

### ✅ LoopingExercises
- A set of small apps demonstrating each loop type in Java:
  - **WhileLoop**: prints “I love Java” five times using a `while` loop  
  - **DoWhileLoop**: prints “I love Java” five times using a `do…while` loop  
  - **ForLoop**: counts down from 10 to 1 with a `for` loop, pauses 1 second between numbers with `Thread.sleep(1000)`, and ends with “Launch!”  
- Great practice for:
  - Understanding loop syntax and flow control  
  - Managing loop conditions and loop bodies  
  - Introducing delays in console apps with exception handling
 
### ✅ RollTheDice
- Simulates rolling a pair of dice 100 times using a custom `Dice` class
- The `Dice` class includes a `roll()` method that returns a random number between 1 and 6
- In the main app:
  - Rolls two dice per loop iteration
  - Prints each pair’s values and their sum in the format: `Roll 1: 4 - 6 Sum: 10`
  - Tracks how often the sums 2, 4, 6, and 7 appear
- After all rolls, displays the total count of how many times 2, 4, 6, and 7 were rolled
- Great practice for:
  - Using loops and random number generation
  - Creating and using methods in a separate class
  - Working with counters and conditional logic

### ✅ TestStatistics
- Creates an array of 10 test scores
- Calculates and displays:
  - The average score
  - The highest score
  - The lowest score
- Bonus: Calculates and displays the median score
- Great practice for:
  - Using arrays to store and access data
  - Performing calculations like average, min, max, and median
  - Working with sorting methods and conditional logic

### ✅ TheaterReservations
- Prompts the user for their full name, show date (in `MM/dd/yyyy` format), and number of tickets
- Automatically reformats the date to `yyyy-MM-dd` for clarity
- Displays a confirmation message showing the number of tickets, formatted date, and the name as `LastName, FirstName`
- Handles plural and singular ticket wording (e.g., “1 ticket” vs. “3 tickets”)
- Great practice for string manipulation and Java date formatting using `LocalDate` and `DateTimeFormatter`

### ✅ VehicleInventory
- Console app that simulates a basic inventory system for a used car dealership
- Uses a `Vehicle` class with fields:
  - `vehicleId`, `makeModel`, `color`, `odometerReading`, and `price`
- Main features:
  - Preloads the system with 6 sample vehicles
  - Presents a menu to the user to choose different actions:
    - `1` - List all vehicles
    - `2` - Search by make/model
    - `3` - Search by price range
    - `4` - Search by color
    - `5` - Add a new vehicle
    - `6` - Quit
- Each menu option is handled by a method to keep code organized
- Uses arrays, conditionals, and loops to manage data and control flow
- Great for practicing:
  - Class design and object-oriented thinking
  - Menu-driven programs and switch statements
  - Working with arrays of objects
  - Filtering and searching logic based on user input

---

---

## ✨ What I Learned
- How to use `Scanner` to collect user input from the console
- How to handle optional inputs and conditionally add parts to a string
- How to use `String.trim()` and `String.isEmpty()` to clean up and validate text
- How to use `if`, `else if`, and `else` to build different outcomes based on input
- How to keep console output clean and readable
- How to use `String.split()` and arrays to parse flexible user input
- How to use for, while, and do-while loops effectively
- How to use `Thread.sleep()` to add delays in loop execution
- How to use `StringBuilder` to build and format dynamic strings
- How to create and use custom classes, constructors, getters, and setters
- How to store and manipulate objects in arrays
- How to design menu-driven applications using `switch` statements
- How to write modular code by breaking tasks into methods
- How to filter and search object data based on user-defined criteria

