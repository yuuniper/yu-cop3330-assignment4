# COP3330 Assignment 4: To-Do List Application (design skeleton)

A JavaFX project started for **COP3330 (Object-Oriented Programming), Summer 2021, at UCF**. This is archived coursework, kept for reference and not maintained.

## What it is

This assignment was the **design phase** of a to-do list application. It contains the JavaFX user interface and the planned structure of the code, but **the features are not implemented**:

- `HomePage.fxml` / `EditList.fxml` define the screens (list of to-do lists; edit a list's items with title, description, due date, and a completed checkbox).
- `HomePageController` and `EditListController` contain the button handlers as empty stubs, with comments describing what each one should do.
- The JUnit tests are likewise outlines in comments, so they pass trivially.
- `uml/ToDoList.puml` is the PlantUML class diagram for the design.

The working implementation was built in the follow-up project, [To-do-list](https://github.com/yuuniper/To-do-list).

## Tools

- Java 16 or newer with JavaFX 16 (fetched automatically by the Gradle JavaFX plugin)
- Gradle (the included wrapper uses 8.14.3, which runs on JDK 17 through 21)
- JUnit 5

## Build and run

```bash
./gradlew build
./gradlew run
```

On Windows, use `gradlew.bat` instead of `./gradlew`. `run` opens the empty home screen; buttons do nothing yet.
