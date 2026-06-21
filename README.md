
# ⚡ Household Energy Consumption Tracker

> **Course:** ITS63304 Object Oriented Programming 
> **SDG Alignment:** Goal 7 - Affordable and Clean Energy 

Welcome to the official repository for our OOP Group Project! This console-based Java application is designed to help households monitor their electricity usage, identify high-consumption appliances, and promote energy-saving behaviors.

---

## 🚀 Current Progress: Stage 1 (Foundation)

We are currently building the foundational data models for our application. 

### 📄 `EnergyUsageRecord.java`
* **Status:** Completed ✅
* **OOP Concept Demonstrated:** Encapsulation 

This class is the first building block of our system, designed to securely store and manage overall energy data. 
* **Data Security (Encapsulation):** Attributes like `recordDate`, `totalEnergyKwh`, and `estimatedCost` are strictly declared as `private` .
* **Controlled Access:** Data can only be accessed or modified through `public` getter and setter methods. Basic data validation is included to prevent negative energy or cost values from being entered.

---

## 👥 Next Steps & Team Handoff

To avoid code conflicts, please follow the development sequence below:

* 🧑‍💻 **Member A (High Priority):** Please begin developing the `Appliance.java` base class. This is required for everyone else to proceed. Ensure all attributes are encapsulated and include the base `calculateEnergyConsumption()` method.
* 🧑‍💻 **Member C:** Once Member A uploads the `Appliance` class, you can pull this `EnergyUsageRecord` class to start building the `Household.java` logic (e.g., storing the appliance list and calculating total energy).
* 🧑‍💻 **Members B & D:** Please stand by. You will begin your sub-classes (Inheritance/Polymorphism) and Main Application tasks as soon as the `Appliance.java` base class is pushed to this repository .

---

## ⚠️ Important Project Reminders

1. **Code Quality:** Ensure all Java code is well-documented with English comments explaining the logic. Strictly follow standard naming conventions (PascalCase for classes, camelCase for variables/methods) .
2. **Plagiarism Check:** Our final report and source code must pass Turnitin with a similarity index of **below 20%** . Please ensure all work is completely original.
3. **Commit Messages:** When pushing your code to GitHub, please use clear and descriptive commit messages (e.g., `Add Appliance base class with encapsulation`).
