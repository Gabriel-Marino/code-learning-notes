/**
 * Restrict Possible Usernames
 * Usernames are used everywhere on the internet. They are what give users a unique identity on their favorite sites.
 * 
 * 1. You need to check all the usernames in a database. Here are some simple rules that users have to follow when creating their username.
 * 2. Usernames can only use alpha-numeric characters.
 * 3. The only numbers in the username have to be at the end. There can be zero or more of them at the end. Username cannot start with the number.
 * 4. Username letters can be lowercase and uppercase.
 * 5. Usernames have to be at least two characters long. A two-character username can only use alphabet letters as characters.
 */

let username = "JackOfAllTrades";
let userCheck = /^[a-zA-Z](\d{2,}|[a-zA-Z]+\d*)$/; // Change this line
let result = userCheck.test(username);

/**
 * ^ - Start of pattern, negate the pattern
 * [a-zA-Z] - Match any character between a and z in the alphabet ignoring case
 * \d{2,} - Match any number of 2 or more digits
 * | - OR
 * [a-zA-Z]+\d* - Match any character between a and z in the alphabet ignoring case followed by any number of digits
 * $ - End of pattern, match the parentheses content with the end of the string
 */