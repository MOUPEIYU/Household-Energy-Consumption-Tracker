# Household-Energy-Consumption-Tracker
# ⚡ Household Energy Consumption Tracker

> [cite_start]**Course:** ITS63304 Object Oriented Programming [cite: 6]
> [cite_start]**SDG Alignment:** Goal 7 - Affordable and Clean Energy [cite: 12]

Welcome to the official repository for our OOP Group Project! [cite_start]This console-based Java application is designed to help households monitor their electricity usage, identify high-consumption appliances, and promote energy-saving behaviors[cite: 113].

---

## 🚀 Current Progress: Stage 1 (Foundation)

We are currently building the foundational data models for our application. 

### 📄 `EnergyUsageRecord.java`
* **Status:** Completed ✅
* [cite_start]**OOP Concept Demonstrated:** Encapsulation [cite: 118]

[cite_start]This class is the first building block of our system, designed to securely store and manage overall energy data[cite: 143]. 
* [cite_start]**Data Security (Encapsulation):** Attributes like `recordDate`, `totalEnergyKwh`, and `estimatedCost` are strictly declared as `private` [cite: 149-150].
* **Controlled Access:** Data can only be accessed or modified through `public` getter and setter methods. [cite_start]Basic data validation is included to prevent negative energy or cost values from being entered [cite: 151, 157-158].

---

## 👥 Next Steps & Team Handoff

To avoid code conflicts, please follow the development sequence below:

* 🧑‍💻 **Member A (High Priority):** Please begin developing the `Appliance.java` base class. This is required for everyone else to proceed. [cite_start]Ensure all attributes are encapsulated and include the base `calculateEnergyConsumption()` method[cite: 137, 149, 168].
* [cite_start]🧑‍💻 **Member C:** Once Member A uploads the `Appliance` class, you can pull this `EnergyUsageRecord` class to start building the `Household.java` logic (e.g., storing the appliance list and calculating total energy)[cite: 144, 173].
* 🧑‍💻 **Members B & D:** Please stand by. [cite_start]You will begin your sub-classes (Inheritance/Polymorphism) and Main Application tasks as soon as the `Appliance.java` base class is pushed to this repository [cite: 138-139, 145, 160-166].

---

## ⚠️ Important Project Reminders

1. **Code Quality:** Ensure all Java code is well-documented with English comments explaining the logic. [cite_start]Strictly follow standard naming conventions (PascalCase for classes, camelCase for variables/methods) [cite: 198-199].
2. [cite_start]**Plagiarism Check:** Our final report and source code must pass Turnitin with a similarity index of **below 20%** [cite: 45-46]. Please ensure all work is completely original.
3. **Commit Messages:** When pushing your code to GitHub, please use clear and descriptive commit messages (e.g., `Add Appliance base class with encapsulation`).
