## Introduction to GUI Programming

GUI programming is essentially creating graphical interfaces users can use to interact with their computers, which triggers events to perform various actions.

GUI programs are **event-driven**, meaning; user actions such as clicking on a button or pressing a key on a keyboard generates events, and the program responds to such events as they occur. Events are objects, like Color, fonts, etc handled by instance methods contained in objects.

Most people interact with their computers exclusively through a GUI. A GUI program offers a much richer type of user interface, where the user uses a mouse and keyboard
to interact with GUI components such as windows, menus, buttons, check boxes, text input
boxes, scroll bars, and so on.

## Basic Hello World GUI Program

```java
import javax.swing.JOptionPane;

public class HelloWorldGUI {
  public static void main (String[] args) {
    JOptionPane.showMessageDialog(null, "Hello World!");
  }
}
```

When this program is run, a window appears on the screen that contains the message
“Hello World!”. The window also contains an “OK” button for the user to click after reading
the message. When the user clicks this button, the window closes and the program ends

This GUI program is possible due to the built-in `JOptionPane` class that contains the `showMessageDialog` static method.

## Example 2

```java
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorld2 {
  private static class HelloWorldDisplay extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("Hello World!", 20, 30);
    }
  }

  private static class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    HelloWorldDisplay displayPanel = new HelloWorldDisplay();
    JButton okButton = new JButton("Ok");
    ButtonHandler listener = new ButtonHandler();
    okButton.addActionListener(listener);

    JPanel content = new JPanel();
    content.setLayout(new BorderLayout());
    content.add(displayPanel, BorderLayout.CENTER);
    content.add(okButton, BorderLayout.SOUTH);

    JFrame window = new JFrame("GUI Test");
    window.setContentPane(content);
    window.setSize(500, 250);
    window.setLocation(100, 100);
    window.setVisible(true);
  }
}
```

In a Java GUI program, each GUI component in the interface is represented by an object in the program. One of the most fundamental type of component is the `window`. Windows have many behaviors. They can be opened, closed, resized. They can contain tiltes displayed in the title bar, and most importantly, they can contain other GUI components such as buttons and menus.

## JFrame

There are several types of windows but the most common type is the `JFrame` class included in the `javax.swing` package.

The main program above declares a variable, window, of type `JFrame` and sets it to refer to
a new window object with the statement:

```java
JFrame window = new JFrame("GUI Test");
```

The parameter `("GUI Test")` in the constructor specifies the title that will be displayed in the titlebar of the window. This line creates the window object, but the window itself is not yet visible on the screen. Before making it visible, some of its properties are set with these statments.

```java
window.setContentPane(content); // sets the content of the window
window.setSize(250, 100); // specifies the size (width, height) of the window in pixels
window.setLocation(100, 100); // sets the position (x, y) axis of the window.
window.setVisible(true) // makes the window visible on the screen.
```

The content displayed in a `JFrame` is called its **content pane**. In the sample program above,
the line `window.setContentPane(content)` replaces the original blank content pane with a
different component.

## JPanel

`JPanel` is another fundamental classes in Swing. By default, it is a plane rectangle with different ways to interact with it. They include:

- Adding other components
- Drawing something on the panel.

In the program above, `content` is used to contain other components, and `displayPanel`, is used as a drawing surface.

The `displayPanel` is a variable of type `HelloWorldDisplay`, which is a static nested class. This class defines a single instance method `paintComponent()`, that overrides a method of the same name in the JPanel class.

```java
private static class HelloWorldDisplay extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawString("Hello World!", 20, 30);
  }
}
```

The `paintComponent()` method is called by the system when a component needs to be painted on the screen. In the JPanel class, the paintComponent method simply fills the panel with
the panel’s background color. Then it calls `g.drawString()` to paint the string **“Hello World!"** onto the panel. The net result is that whenever a `HelloWorldDisplay` is shown on the screen, it displays the string **“Hello World!”**.

JPanels are often used this way; as drawing surfaces, they define a class that is a subclass of `JPanel` and contains a `paintComponent()` method in that class to draw the desired content in the panel.

> **Note**
> The JPanel subclass can be defined either as a separate class in it's own file or as a nested class. In simple cases, the nested class is recommended for convenience.

## Components and Layout

As we've learned previously, the `JPanel` can be used to hold other components. In the above sample program, the variable named `content` refers to a JPanel that is used as a container.

This `content` container from `JPanel` holds other components:

```java
content.add(displayPanel, BorderLayout.CENTER); // Displays the "Hello World!" message
content.add(okButton, BorderLayout.SOUTH); // Adds the button the user clicks to close the window.
```

The `BorderLayout` is a class that contains a layout manager object for arranging the components in the container.

```java
content.setLayout(new BorderLayout());
```

## Events and Listeners

GUIs are largely event-driven; that is, the program waits for events that are generated by the user’s actions (or by some other cause). When an event occurs, the program responds by executing an event-handling method . In order to program the behavior of a GUI, you have to write event-handling methods to respond to the events that you are interested in.

The most common technique for handling events in Java is to use event listeners. This is an object that includes one or more event-handling methods. When an event is detected by another object, such as a button or menu, the listener object is notified and it responds by running the appropriate event-handling method.
