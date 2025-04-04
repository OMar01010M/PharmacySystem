# PharmacySystem
# Pharmacy Ordering System

## Overview
The **Pharmacy Ordering System** is a menu-driven Java application that allows users to manage a pharmacy's inventory, process drug orders, and track daily sales. This system provides essential functionalities such as adding and removing drugs, placing orders, and retrieving total sales for the day.

## Features
- **Add Drug**: Add a new drug to the pharmacy inventory, including details like name, ID, price, category, and available quantity.
- **Remove Drug**: Remove a drug from the inventory using its unique ID.
- **Place an Order**: Check drug availability, process orders, and apply special pricing rules for cosmetics and prescription drugs.
- **Track Total Sales**: Calculate and display the total sales made during the day.
- **Capacity Limit**: Prevent adding drugs beyond the pharmacy's defined capacity.
- **Menu-Driven Interface**: Provides a simple user interface for managing pharmacy operations.

## Installation & Usage
### Prerequisites
- Java Development Kit (JDK) installed
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) or a command-line terminal

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/pharmacy-ordering-system.git
   cd pharmacy-ordering-system
   ```
2. Compile the Java files:
   ```sh
   javac *.java
   ```
3. Run the application:
   ```sh
   java PharmacySystem
   ```
4. Follow the on-screen menu to interact with the system.

## File Structure
```
├── Drug.java          # Defines the Drug class
├── Pharmacy.java      # Handles inventory and sales management
├── PharmacySystem.java # Contains the main method and menu system
├── README.md          # Documentation for the project
```

## Example Usage
```
Enter pharmacy capacity: 10

Pharmacy Menu:
1. Add drug
2. Remove drug
3. Place an order
4. Get the total sales for one day
5. Exit
Choose an option: 1
Enter drug name: Aspirin
Enter drug ID: 101
Enter price: 5.50
Enter category (cosmetics, prescription, other): prescription
Enter available quantity: 50
Drug added successfully!
```

## Contributing
If you'd like to contribute, feel free to fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.

## Author
- OMar Mo - [GitHub Profile](https://github.com/OMar01010M)

