# 📚 Book Library Management System (REST API)

## 📝 Overview

The **Book Library Management System** is a RESTful API built using **Spring Boot**, **JPA**, and **H2 Database**.  
It enables librarians to efficiently manage a library’s book collection, supporting full CRUD operations along with advanced search features by **author**, **genre**, and **publication**.

---

## 🚀 Features

- Add new books to the library  
- Retrieve all books or search by specific attributes  
- Update existing book information  
- Delete books from the database  
- Filter books by **author**, **genre**, or **publication**

---

## 🧱 Technologies Used

- **Java 25**
- **Spring Boot 3.5.7**
- **Spring Data JPA**
- **H2 Database (in-memory)**
- **Gradle**

---

## 🗂️ Entity Structure

```java
private Long id; // Primary key, auto-generated
private String title;
private String author;
private String publication;
private Integer publicationYear;
private Integer availableCopies;
private String genre;
````

---

## 🌐 API Endpoints

| Method     | Endpoint                               | Description                             |
| ---------- | -------------------------------------- | --------------------------------------- |
| **POST**   | `/api/books`                           | Add a new book to the library           |
| **GET**    | `/api/books`                           | Retrieve all books in the library       |
| **GET**    | `/api/books/{id}`                      | Get a specific book by ID               |
| **PUT**    | `/api/books/{id}`                      | Update a specific book's details        |
| **DELETE** | `/api/books/{id}`                      | Delete a specific book from the library |
| **GET**    | `/api/books/author/{authorName}`       | Find all books by a specific author     |
| **GET**    | `/api/books/genre/{genre}`             | Find all books in a specific genre      |
| **GET**    | `/api/books/publication/{publication}` | Get all books by a specific publication |

---

## 📦 Sample JSON Data

```json
[
  {
    "title": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "publication": "Charles Scribner's Sons",
    "publicationYear": 1925,
    "availableCopies": 4,
    "genre": "Classic"
  },
  {
    "title": "To Kill a Mockingbird",
    "author": "Harper Lee",
    "publication": "J.B. Lippincott & Co.",
    "publicationYear": 1960,
    "availableCopies": 6,
    "genre": "Fiction"
  },
  {
    "title": "1984",
    "author": "George Orwell",
    "publication": "Secker & Warburg",
    "publicationYear": 1949,
    "availableCopies": 5,
    "genre": "Dystopian"
  },
  {
    "title": "The Hobbit",
    "author": "J.R.R. Tolkien",
    "publication": "George Allen & Unwin",
    "publicationYear": 1937,
    "availableCopies": 3,
    "genre": "Fantasy"
  },
  {
    "title": "A Brief History of Time",
    "author": "Stephen Hawking",
    "publication": "Bantam Books",
    "publicationYear": 1988,
    "availableCopies": 7,
    "genre": "Science"
  },
  {
    "title": "Animal Farm",
    "author": "George Orwell",
    "publication": "Secker & Warburg",
    "publicationYear": 1945,
    "availableCopies": 8,
    "genre": "Dystopian"
  },
  {
    "title": "The Fellowship of the Ring",
    "author": "J.R.R. Tolkien",
    "publication": "George Allen & Unwin",
    "publicationYear": 1954,
    "availableCopies": 5,
    "genre": "Fantasy"
  },
  {
    "title": "Tender Is the Night",
    "author": "F. Scott Fitzgerald",
    "publication": "Charles Scribner's Sons",
    "publicationYear": 1934,
    "availableCopies": 2,
    "genre": "Classic"
  },
  {
    "title": "Go Set a Watchman",
    "author": "Harper Lee",
    "publication": "J.B. Lippincott & Co.",
    "publicationYear": 2015,
    "availableCopies": 4,
    "genre": "Fiction"
  },
  {
    "title": "The Universe in a Nutshell",
    "author": "Stephen Hawking",
    "publication": "Bantam Books",
    "publicationYear": 2001,
    "availableCopies": 6,
    "genre": "Science"
  }
]
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/nNEWBE/book-library-management-api.git
cd book-library-management-api
```

### 2. Open and Run in IntelliJ IDEA Ultimate

1. **Open IntelliJ IDEA Ultimate**
2. Select **Open Project** → Choose the cloned project folder
3. IntelliJ will automatically detect **Gradle** and download all dependencies

---

### 3. Run the Application

1. Open the main class file (e.g., `BookLibraryManagementApplication.java`)
2. Click the **▶ Run** button at the top of IntelliJ
3. Wait for the **Spring Boot application** to start successfully


### 4. Access the Application

Once the server starts, open your browser or Postman and navigate to:

```
http://localhost:8080/api/books
```

### 5. H2 Database Console

Access the in-memory H2 database at:

```
http://localhost:8080/h2-console
```

Use the following details:

* **JDBC URL:** `jdbc:h2:mem:libraryDb`
* **Username:** `sa`
* **Password:** *(leave blank)*

---

## 🔍 Example Requests

### ➕ Add a Book

```http
POST /api/books
Content-Type: application/json
```

```json
{
  "title": "The Hobbit",
  "author": "J.R.R. Tolkien",
  "publication": "George Allen & Unwin",
  "publicationYear": 1937,
  "availableCopies": 3,
  "genre": "Fantasy"
}
```

### 🔎 Get All Books

```http
GET /api/books
```

### ✏️ Update a Book

```http
PUT /api/books/1
```

### 🗑️ Delete a Book

```http
DELETE /api/books/1
```