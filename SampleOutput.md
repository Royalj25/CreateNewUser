# 🖥️ Sample Program Run — CreateNewUser

This file shows a **sample run** of the `CreateNewUser` program, including example inputs and the resulting **Assigned User String**.

---

## Sample Input & Output
Enter Customer First Name:
Alexander
Enter Customer Last Name:
Hamilton
Enter Customer Age:
24
Enter Customer Street Address:
1234 Elm Street
Enter Customer City:
Cleveland
Enter Customer State:
OH
Enter Customer Zip Code:
44110
Enter Customer Phone Number:
7654944600
The Assigned User String is 59006HMLE1234elmstreetCLE02000-4600


---

## Notes

- The program transforms each piece of input using a combination of **letter selection, numeric operations, and string formatting**.  
- Spaces are removed and certain letters (`O`, `o`, `I`, `i`) are excluded to create a **unique identifier string**.  
- All other inputs will generate a similar string, following the same rules.

---

## 🎬 Behind The Scenes 
// First Name:
firstName = "ALEXANDER"
second = firstName.charAt(1) = 'L'
secondLast = firstName.charAt(firstName.length() - 2) = 'E'
name1 = "LE"

// Last Name:
lastName = "HAMILTON"
first = lastName.charAt(0) = 'H'
third = lastName.charAt(2) = 'M'
name2 = "HM"
name = name2 + name1 = "HMLE"

// Age:
digitSum = 2 + 4 = 6
age = String.format("%03d", digitSum) = "006"

// Street Address:
streetAddress = "1234 Elm Street"
address = streetAddress.toLowerCase().replace(" ", "") = "1234elmstreet"

// City:
customerCity = "CLEVELAND"
city = customerCity.substring(0, 3) = "CLE"

// State:
customerState = "OH"
firstChar = 'O' = 79
secondChar = 'H' = 72
mod6 = 79 % 6 = 1
mod5 = 72 % 5 = 2
mod = 1 * 2 = 2
state = String.format("%02d", mod) = "02"

// ZIP Code:
digits = 4,4,1,1,0
code = (4*4*1*1*0) % 100 = 0
zipCode = String.format("%03d", 0) = "000"

// Phone Number:
number = last 4 digits = "4600"
phoneNumber = "-" + number = "-4600"

// Total Input + Assemble Final String:
inputLength = length of all inputs
firstName(9) + lastName(8) + age(2) + street(14) + city(9) + state(2) + zip(5) + phone(10) = 59
user = inputLength + age + name + address + city + state + zipCode + phoneNumber
user = "59006HMLE1234elmstreetCLE02000-4600"

// Removes "o", "O", "I", "i":
removed = user.replace("O","").replace("o","").replace("I","").replace("i","")
removed = "59006HMLE1234elmstreetCLE02000-4600"
