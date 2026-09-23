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
