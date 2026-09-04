# 🧩 CreateNewUser

This program generates a unique **User String** based on customer input. It reads user information such as name, age, address, city, state, zip code, and phone number 
from the console, then performs a series of **string manipulations** and **numeric operations** to produce a coded user identifier.

---

## 📂 Files

- [`CreateNewUser.java`](./CreateNewUser.java) — main source code file containing the program logic.  
- [`SampleOutput.md`](./SampleOutput.md) — contains example case demonstrating how the program looks when running.

---

## 🧠 Program Description

The `CreateNewUser` program prompts the user for several pieces of personal information:

1. **First and Last Name** — used to extract and combine specific letters.  
2. **Age** — digits are summed and padded to a 3-digit format.  
3. **Street Address** — spaces are removed, and the string is converted to lowercase.  
4. **City** — the first three letters are used (in uppercase).  
5. **State** — character codes are used to calculate a numeric value using modulus operations.  
6. **Zip Code** — digits are multiplied, then reduced using a modulo operation.  
7. **Phone Number** — the last four digits are appended.

The total input length is also included as part of the final string.  
After all transformations, the program removes the characters `'O'`, `'o'`, `'I'`, and `'i'` from the result before displaying the final **Assigned User String**.

---

## ⚙️ How It Works (Step-by-Step Example)

You can find sample test inputs and outputs in [`SampleOutput.md`](./SampleOutput.md),  
but here’s a general overview of the process:

1. Program prompts the user for input values.
2. Each piece of data is transformed based on specific rules.
3. All parts are concatenated into one long, encoded user identifier.
4. Certain characters are removed to ensure uniqueness and avoid confusion.
5. The resulting string is printed as the **Assigned User String**.

---

## 👀 Check Out My Other Projects!
- Here is an easier way to get there:
  
  --> [`HobbyRecommender`](https://github.com/Royalj25/HobbyRecommender) 
  
  --> [`WordGuesser`](https://github.com/Royalj25/WordGuesser) 

- Wanna get back to the main repository? --> [`Portfolio`](https://github.com/Royalj25/Portfolio)
