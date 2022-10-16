# family-restaurant
Family Restaurant is a restaurant that provides a variety of delicious dishes consists of two menus, namely the Regular menu and the Special menu. As a programmer, I was asked to make a program in Java that is used to manage the Family Restaurant menu list with using the concept of OOP (using Inheritance) and stored using Vector / List of Arrays.

When the program is run for the first time, it will display 6 options, namely **Add
Regular Menu, Add Special Menu, Show All Menu, Delete Regular Menu, Delete Special Menu and Exit.**
Validate the user can only enter choices between 1-6 and in the form of numbers. If the input does not match
then the program will ask the user to enter the option again.

![image](https://user-images.githubusercontent.com/55536824/196021816-d2b196c5-3126-4d84-989c-7e18a63d75d3.png)

## 1. Add Regular Menu:
When the user enters the option "1" then the program will ask the user to enter data
for the regular menu, namely:
- Menu Code = 
Validate the menu code length is 4 characters and the first letter "R".
Menu code cannot be the same.
- Menu Name = 
Validate menu name length between 5 to 20 characters.
Menu names may be the same.
- Price =
Validate menu prices between 10000 – 100000 and must be a number.

When the user finishes entering data for the regular menu, the program will display a message
"Add Success".

![image](https://user-images.githubusercontent.com/55536824/196022589-6e522e45-f532-4544-848c-2845494b4f2d.png)

## 2. Add Special Menu:
When the user enters option "2", the program will ask the user to enter data
for special menus, namely:
- Menu Code =
Validate the menu code length of 4 characters and the first letter "S".
Menu code cannot be the same.
- Menu Name =
Validate menu name length between 5 to 20 characters.
Menu names may be the same.
- Price = 
Validate menu prices between 10,000 – 100,000 and must be a number.
- Discount = 
Validate discounts only 10, 25 and 50 percent.

When the user finishes entering data for the regular menu, the program will display a message
"Add Success".

![image](https://user-images.githubusercontent.com/55536824/196022976-43670635-260f-4529-9ba5-bac2b1191066.png)

## 3. Show All Menu:
When the user enters the "3" option, the program will display all the regular menu data and special menus.

![image](https://user-images.githubusercontent.com/55536824/196023007-99bb7bc6-8f20-481e-8cfb-01e30b5722c0.png)

## 4. Delete Regular Menu
When the user enters the "4" option, the program will ask the user to enter the regular menu code that they want to delete. Validate that the menu code length is 4 characters and the first letter "R". If there is a regular menu code entered, the menu will be deleted and the program will display the message "Delete Success". If there is no regular menu code entered, the program will display the message “Code is Wrong”.

![image](https://user-images.githubusercontent.com/55536824/196023138-fdcc2520-524d-4cfe-849f-d79bedffb26f.png)

![image](https://user-images.githubusercontent.com/55536824/196023146-017e9cba-7e67-4823-ae0e-09f5f62af274.png)

## 5. Delete Special Menu
When the user enters the option “5”, the program will ask the user to enter the special menu code that they want to delete. Validate the menu code length of 4 characters and the first letter "S". If there is a special menu code entered, the menu will be deleted and the program will display the message "Delete Success". If there is no special menu code entered, the program will display the message "Code is Wrong"

![image](https://user-images.githubusercontent.com/55536824/196023221-d8e1ea4d-0480-4df1-bd88-256353a9bf24.png)

![image](https://user-images.githubusercontent.com/55536824/196023227-0972aca6-6009-43f8-883b-c8c31d0b8151.png)

## 6. Exit
When the user enters the option "6" then the program will exit and close.
