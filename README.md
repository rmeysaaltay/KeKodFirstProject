# Switch-Controlled Bottom Navigation App

Hey there! Welcome to the **KekodFirstProject App**. This is a simple Android project that shows how to use UI components and Jetpack Navigation in a fun way.

## Features

### Step 1: Getting Started
- When you open the app, you’ll see 6 switches. The "Ego" switch is ON by default.
- While "Ego" is ON, you can’t turn on the other 5 switches.
- When you turn "Ego" OFF, you can play around with the other switches.

### Step 2: BottomNavigationBar Visibility
- The BottomNavigationBar shows up when "Ego" is OFF. It disappears when "Ego" is ON.

### Step 3: Adding Items to the BottomNavigationBar
- Each time you turn on a switch, an icon and text are added to the BottomNavigationBar.
- The items appear in the order you turn the switches on.
- The main screen, where the switches are, is always added to the BottomNavigationBar, but you’ll only see it when "Ego" is OFF.

### Step 4: Limiting Items in the BottomNavigationBar
- The BottomNavigationBar can show the main screen plus 4 more switch buttons.
- The last switch you turn on won’t be added.

### Step 5: Removing Items from the BottomNavigationBar
- If you turn off a switch, its corresponding item is removed from the BottomNavigationBar.

### Step 6: Navigating to Detail Screens
- Tapping an item in the BottomNavigationBar takes you to a detail screen for that item.

### Step 7: Using Data Binding
- We’ve used DataBinding or ViewBinding across all screens for easy UI management.

## Getting Started

To start using this app, clone the repository and open it in Android Studio.

```bash
git clone https://github.com/yourusername/switch-controlled-bottom-navigation.git
