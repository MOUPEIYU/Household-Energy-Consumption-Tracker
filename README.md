# ⚡ Household Energy Consumption Tracker - Project Update

# 23.6.2026

> **Phase 1 (Foundation) is officially COMPLETE! 🎉**
> We are now moving into **Phase 2: Core Expansion**.

---

## 🚀 Recent Updates

Huge thanks to **Member A** for successfully completing and pushing the core base class!

### 📄 `Appliance.java`
* **Status:** Completed ✅
* **OOP Concept Demonstrated:** Class Design & Encapsulation
* **What's inside:** This class serves as the rock-solid foundation for our project. All attributes (`name`, `powerRating`, `usageDuration`) are properly encapsulated with `private` modifiers. Robust data validation is already implemented in the setter methods (e.g., preventing negative power ratings). It also includes the base `calculateEnergyConsumption()` method ready to be overridden.

*(Note: The `EnergyUsageRecord.java` data class was also completed previously. Both foundational files are now available in the repository.)*

---

## 👥 Phase 2: Action Items & Team Handoff

Now that the foundation is laid, Members B and C can officially begin their coding tasks! **Please `git pull` the latest code to get `Appliance.java` and `EnergyUsageRecord.java` before you start.**

### 🧑‍💻 @Member B: Subclasses (Inheritance & Polymorphism)
* **Your Task:** Create `LightAppliance.java` and `CoolingAppliance.java`.
* **Instructions:**
  1. Use the `extends` keyword to inherit from the `Appliance` base class.
  2. Add specific attributes for each subclass (e.g., `boolean isLED` for lights, `double temperatureSetting` for cooling appliances).
  3. **Crucial OOP Requirement:** Override the `calculateEnergyConsumption()` method in both subclasses to demonstrate Polymorphism (e.g., apply a discount multiplier if the light is an LED).

### 🧑‍💻 @Member C: Business Logic (`Household` Class)
* **Your Task:** Create `Household.java`.
* **Instructions:**
  1. Create an `ArrayList<Appliance>` to store the devices. (Using the parent class reference here is key for our OOP grade).
  2. Implement a method to add appliances to the list: `public void addAppliance(Appliance app)`.
  3. Implement logic using loops to calculate the total household energy consumption (by calling the overridden `calculateEnergyConsumption()` for each appliance).
  4. Write a method with conditional statements to identify and return the appliance with the highest consumption.

### 🧑‍💻 @Member D & @Team Leader
* **Status:** Standby / Support.
* Member D will begin Phase 3 (`EnergyTrackerApp.java` console UI) once Members B and C push their completed classes to the repository.

---

## ⚠️ Reminders
* **Comments & Clean Code:** Please ensure your new classes are well-commented explaining the logic, following PascalCase for classes and camelCase for methods/variables.
* **Testing:** Don't forget to write a temporary `main` method in your own classes to test if your logic works before pushing! Keep those screenshots for our final report.

Happy coding! 💻✨ Let's keep this momentum going!



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
