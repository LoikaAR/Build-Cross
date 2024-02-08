# Build-Cross

Build&Cross is a rogue like game where the player needs to build passage
through natural obstacles for a constantly moving train. The player needs to
travel around the map to find the correct materials (e.g. wood, iron) to
construct the passages. After traversing one obstacle, the train will move to
a different environment with a different obstacle, and to win, the player
needs to get the train to the end of the map. If the train reaches
the obstacle before the passage is built, the game is lost.

## Project Structure

This project is both a Maven project and a BlueJ project.
You can open, compile, test, and run the code within BlueJ
by opening `src/package.bluej`.

You can use Maven to compile, test, and check the code
by running `mvn` in this top-level directory (see below).

You can run the code compiled by Maven from the terminal (see below).

The code is structured into three packages:

* `model` - all the model classes and their tests
* `tui` - text user interface (works in a terminal)
* `gui` - Swing-based graphical user interface (opens a window)

Note that the classes in the `model` package MUST NOT refer to any
classes in the `tui` or `gui` packages.

The classes in the `tui` package must not refer to any classes in the `gui` package.

The classes in the `gui` package must not refer to any classes in the `tui` package.

The classes in the `tui` and `gui` packages SHOULD refer to classes in the `model` package.

The classes in the `model` package need to come with unit tests.
(The classes in the `tui` and `gui` packages do not need to be covered with tests.)

## How build using Maven

In this top-level directory:

```bash
mvn compile
```

## How to run the application

To run the application from outside BlueJ, first build it with Maven.
This generates the compiled classes in the directory `target/classes`.

### Running the TUI

To run this application, with the TUI, from the command line:

```bash
java -cp target/classes tui.Main
```

Key screenshots for tui:

![TUI INIT SSHOT](https://user-images.githubusercontent.com/100407700/170678186-03357b86-9735-4a85-856a-c3f214de6956.png)

This is the initial state of the game, the user is able to study the grid before they spawn the player.

![TUI KEY SSHOT(1)](https://user-images.githubusercontent.com/100407700/170678400-fc4314f4-3b87-49fc-a482-38e14117b1df.png)

After the player is spawned, the user has in front of them the list of all possible actions to remind them of how to play.

### Running the GUI

To run this application, with the GUI, from the command line:

```bash
java -cp target/classes gui.Main
```

DESCRIPTION OF COMMAND LINE ARGUMENTS

### How run the JUnit tests with Maven

```bash
mvn test
```

### How to run Checkstyle with Maven

```bash
mvn compile
mvn checkstyle:check
```

### How to run PMD with Maven

```bash
mvn compile
mvn pmd:check
```

### How to run PMD's CPD with Maven

```bash
mvn compile
mvn pmd:cpd-check
```

### How to determine test coverage with Maven

```bash
mvn site
```

Then open `target/site/index.html` and find the JaCoCo report.
