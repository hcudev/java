## Generic Programming and Collection Classes

## Collection Hierachy

The Collection Hierachy plays a crucial role in managaing and manipulating groups of objects in Java. This hierachy consists of various interfaces such as `List`, `Set`, `Map`, and `Iterator` which provides different ways to store, retrieve and manipulate data.

## List and Sets

A list consists of a sequence of items arranged in a linear order. It has a definite order, but it is not necessarily sorted.

A set is a collection that has no duplicate entries. The elements of a set might or might not be arranged into some defninite order.

## ArrayList and LinkedList

There are two obvious ways to represent a list: as a dynamic array and as a linked list. Both of these options are available in generic form as the collection classes `java.util.ArrayList` and `java.util.LinkedList`. These classes are part of the Java Collection Framework. Each implements the interface `List<T>` and therefore the interface `Collection<T>`.

- An object of type `ArrayList<T>` represents an ordered sequence of objects of type `T`, stored in an array that will grow in size whenever necessary as new items are added.
- An object of type `LinkedList<T>` also represnts an ordered sequence of objects of type `T`, but the objects are stored in nodes that are linked together with pointers.

`LinkedList` class is more efficient in removing or adding items at the beginning or middle of a list. In `ArrayList` this requires moving a large number of items up or down one position in the array to make a space for a new item or fill up a space left by a removed item.

In terms of asymptotic analysis, adding an element at the beginning or in the middle of an array has runtime `0(n)`, where n represents the number of items in the array.

In a `LinkedList`, nodes can be added or removed at any position by changing a few pointer variables, which has a run time of `0(1)`. Meaning, the operations takes only some constant amount of time, independent of how many items are in the list.

All lists implements the method from interface `Collection<T>`. These methods includes:

- `size()`
- `isEmpty()`
- `add(T)`
- `remove(Object)`
- `clear()`
