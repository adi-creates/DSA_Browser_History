# DSA Browser History Simulator

This Java application simulates a browser history using a doubly linked list. It keeps track of the current page and allows navigation to previous and next pages.

## Features

- Start with a homepage
- Visit new URLs
- Move backward in history
- Move forward in history
- Handle navigation after visiting a new page

## How it works

The program stores each visited URL as a node in a doubly linked list:

- `prev` points to the previous page
- `next` points to the next page
- `curr` points to the current page

### Linked list usage in this application

A doubly linked list is useful for browser history because users can move both backward and forward through visited pages.

- Each page is stored as a `Node`.
- The `Node` contains the page URL (`data`) and two pointers: `prev` and `next`.
- When the user visits a new page, the new node is created and linked to the current page:
  - `urlNode.prev = curr`
  - `curr.next = urlNode`
- The `curr` pointer always points to the page the user is currently viewing.
- When the user presses back, the program moves `curr` to the previous node using `curr.prev`.
- When the user presses forward, the program moves `curr` to the next node using `curr.next`.

This structure allows efficient browsing history navigation without needing to store all pages in an array. It also supports moving backward and forward naturally, which matches browser behavior.

## Run the application

1. Open a terminal in this folder.
2. Compile the Java file:

```bash
javac BrowserHistory.java
```

3. Run the program:

```bash
java BrowserHistory
```

## Example

The program starts with:

```java
BrowserHistory obj = new BrowserHistory("nykaa.org");
```

Then it visits:

- instagram.com
- bookmyshow.com
- tcet.com
- linkedin.com

It prints the current page after navigating backward and forward.

## Sample output

```text
bookmyshow.com
instagram.com
bookmyshow.com
linkedin.com
instagram.com
nykaa.org
```

This shows how the browser history moves between pages.
