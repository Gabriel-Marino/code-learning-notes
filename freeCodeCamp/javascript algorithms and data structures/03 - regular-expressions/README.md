## Regular Expressions usually "regex" or "regexp" are patterns that help in finding, matching and replacing text in a string. Are very powerful, but can be easily confusing.

```JavaScript
/**
 * Regular Expressions are powerfull matching tools, usually written betweeen slashes, like /regex/
 * They are patterns used to find and replace text in a string.
 * The test method is used to test if a string matches a regular expression, is used regex.test(string) and return a boolean.
 * Is possible to use the alternation operator | in the regex to look for multiple alternatives.
 * Afther the slash in the regex is possible to use modifiers, the first is i to ignore case.
 * the match method is used to find the first match of a regular expression in a string, is used regex.match(string) and return an array with the match or null if not found.
 * Another modifier is g to match all, instead of stopping at the first match will search for all matches.
 * The wildcard, dot or period is a char used in the regex when is unknown all the characters wanted, so it can be used to match any pattern
*/

const str = "Hello World";

const regex = /Hello/;
const test = regex.test(str);       // true

const regexOr = /Hello|Jello/;
const test = regexOr.test(str);     // true

const regexI = /HELLO/i;
const test = regexI.test(str);      // true, without the i modifier it would be false

const match = str.match(regex);     // ["Hello"]

const regexG = /repeat/gi;          // g global, i ignore case
const str = "REPEAT in uppercase, repeat in lowercase, RepeAt, Repeat"
const match = str.match(regexG);   // ["Repeat", "Repeat", "Repeat", "Repeat"]

const str = "run in the sun to have some fun and make some pun with nun and bun"
const regex = /.un/gi;
const match = str.match(regex);    // ["run", "fun", "pun", "nun", "bun"]

/**
 * Until now we only have saw literal patterns, but it's possible to be more flexible.
 * Using character classes, we can match any character in the class, definig then insine square brackets.
 * Is possible to match ranges too, like [a-z] or [0-9] or [^a-z] or [^0-9], the ^ is used to negate the class (negated character sets).
 * And combine ranges, like all alphanumeric characters are found by /[a-z0-9]/
 * The + modifier is used to match characters which occur one or more times in a row. And is used without the brackets.
 * The * modifier is used to match characters which occur zero or more times in a row. And is used without the brackets.
 */

const str = "A big bag of a bug begged to bog";
const regexClass = /b[aeiou]g/gi;
const match = str.match(regexClass);    // ["bag", "big", "bug", "beg", "bog"]

const str = "Like any other constant in math, Pi is a very excentric and beautiful one and is approximately 3.14159265359";
const notVowelOrNumber = /[^aeiou0-9]/gi;
const match = str.match(notVowelOrNumber);  // return ['L', 'k', ' ', 'n', 'y', ' ', 't', 'h', 'r', ' ', 'c', 'n', 's', 't', 'n', 't', ' ', 'n', ' ', 'm', 't', 'h', ',', ' ', 'P', ' ', 's', ' ', ' ', 'v', 'r', 'y', ' ', 'x', 'c', 'n', 't', 'r', 'c', ' ', 'n', 'd', ' ', 'b', 't', 'f', 'l', ' ', 'n', ' ', 'n', 'd', ' ', 's', ' ', 'p', 'p', 'r', 'x', 'm', 't', 'l', 'y', ' ', '.']

const regex = /a+/gi;
const match "a a a".match(regex);       // ["a", "a", "a"]
const match "aa a aa".match(regex);     // ["aa", "a", "aa"]
const match "aaa".match(regex);         // ["aaa"]

const goRegex = /go*/gi;
const match = "Gooooooooooooooooooal!".match(goRegex);      // ["Goooooooooooooooooo"]
const match = "Gut fellings".match(goRegex);                // ["G"]
const match = "fly me to the moon".match(goRegex);          // null

const AaREGEX = /Aa*/g; // will match all sub-strings with A but not necessarily with a
const match = "Aaaaaaaaaaaaaaaarrrgh!".match(AaREGEX);                                  // ["Aaaaaaaaaaaaaaaa"]
const match = "Let him have it. It's not wise to upset a Wookiee.".match(AaREGEX);      // null

/**
 * A greedy regex is a regex that will match the longest possible string. The alternative is a lazy regex, which will match the shortest possible string.
 * The greedy regex is used like /t[a-z]*i/ applied in "titanic" would return "titani", and the lazy regex write as /t[a-z]*?i/ would return "ti".
 * it's not recommend to parsing html with regex, but to match a string in the html with regex is fine.
 */

const greedy = /<.*>/;
const lazy = /<.*?>/;
const html = "<h1>Hello World</h1>";
const match = html.match(greedy);   // ["<h1>Hello World</h1>"]
const match = html.match(lazy);     // ["<h1>"]

/**
 * The negate operator (caret character) inside characters set will negate all characters except the ones in the set,
 * but when used outside a character set, it will search only for the first substring that matches the pattern.
 * The alternative for the caret and match a pattern within the end of a string is the dollar sign, which will match the last substring.
 * The dolar sign is used at the end of the regex.
 */

const caretRegex = /^Hello/;
const test = caretRegex.test("Hello World");                                             // true
const test = caretRegex.test("Good Morning, Hello World");                               // false
const test = caretRegex.test("Hello first and can be found");                            // true
const test = caretRegex.test("If you say anything before Hello, it can't be found");     // false

const dollarRegex = /World$/;
const test = dollarRegex.test("Hello World");                                           // true
const test = dollarRegex.test("Hello Wolrd, I am here");                                // false
const test = dollarRegex.test("Wolrd is not the last word in the sentence");            // false

/**
 * shorthand character classes are shortcuts to common character sets,
 * like \w is for all alphanumeric characters ([a-zA-Z0-9_]), \d for all digits ([0-9]), \s for all whitespace characters.
 * \s is the equivalent of [\r\t\v\n\f]. In the case of \w it has one more character besides the alphanumeric characters, the underscore.
 * And you can access the negated versions of the shorthands by using the same letter but in Capital, like the negation of \w is \W.
 * Beside + and *, you can match a certain range of patterns, so is possible to specify the range using curly brackets after the pattern.
 * For example, the regex /[a-z]{2,4}/ will match all strings with at least two characters and at most four characters.
 * And still possible to define only the minimum number of characters, so the regex /[a-z]{2,}/ will match all strings with at least two characters.
 * And if you want a specific number of characters, is just need to use the curly brackter without the comma and the exact number of characters.
 * For example, the regex /[a-z]{2}/ will match all strings with exactly two characters.
 */

const regex = /[a-z]{2,4}/g; // will match all strings with at least two characters and at most four characters
const regex = /[a-z]{6,}/g;  // will match all strings with at least six characters
const regex = /[a-z]{12}/g;   // will match all strings with exactly twelve characters

/**
 * Some languages although being "the same" have little differences in their syntax,
 * like American English and British English or Brazilian Portuguese and Portugal Portuguese.
 * So is possible sometimes a character exists or not in the pattern given the language. Then to verify if a character exists in a pattern,
 * you can use the question mark (?) character to match the pattern even the character doesn't exist in the string.
 * lookaheads are patterns to match multiple patterns over the same string, the lookaheads can be positive or negative.
 * A positive (?=) lookahead is used to test if the patterm is present in the string and return the matching string.
 * A negative (?!) lookahead is used to test if the pattern is not present and case isn't then return the match of the string.
 */

const regex = /colou?r/; // will match "color" and "colour"

const positive = /portug(?=u)/gi;
const match = "Portugual".match(positive);  // ["Portug"]
const match = "Portugal".match(positive);   // null
const test = positive.test("Portugual");    // true
const test = positive.test("Portugal");     // false

const negative = /portug(?!u)al/gi;
const test = negative.test("Portugal");     // true
const test = negative.test("Portugual");    // false
const match = "Portugal".match(negative);   // ["Portugal"]
const match = "Portugual".match(negative);  // null

/**
 * You can use the parentheses to group patterns, so is possible to match a group of patterns.
 * For example if you want to match pumpkin and/or penguin, you can use the regex /p(engu|umpk)in/gi.
 * You can use the parentheses to create capture groups, so you can match a pattern which repeat in row through the string without knowing the pattern.
 * Capture groups are created by enclosing the pattern in parentheses. And they're stored like a "variable" and can be accessed by the regex where
 * they're defined using backlashes and the number of the group, the groups are numbered from 1 and in the order they're defined.
 * Is needed to repeat the backlashes the amount of times minus 1 the pattern can be repeated in the string.
 * Like if you want to match the three repetitions, the first is the group definition and then the second and third are matched with the backlashes.
 */

const pInRegex = /p(engu|umpk)in/gi;
const test = pInRegex.test("Pumpkin"); // true
const test = pInRegex.test("Penguin"); // true
const match = "Pumpkin and Penguin".match(pInRegex); // ["Pumpkin", "Penguin"]

const groupRegex1 = /(\d+) \1 \1/;           // will match all numbers that are repeated three times
const test = groupRegex1.test("1 1 1");      // true
const test = groupRegex1.test("24 42 42");   // false
const test = groupRegex1.test("242 42 42");  // true, matches the 42's
const test = groupRegex1.test("24 4 42");    // true, matches the 4's

const groupRegex2 = /(\d+) \1/;              // will match all numbers that are repeated twice
const test = groupRegex2.test("1 1");        // true
const test = groupRegex2.test("24 42");      // true, matches the 4's

let testString = "test test test";
let reRegex = /(test)(\s)\1\2\1/;       // \1 repeat "test" and \2 repeat the \s (whitespace).
let result = reRegex.test(testString);  // true

/**
 * Beyond the search methods (match, test), you have methods to replace patterns in a string.
 * You can call the replace method on a string with .replace(/regex/, "string to replace").
 * Beside a string, is possible to pass a function to replace to do some custom logic.
 * Is possible even to use capture groups and call them in the second parameter of the replace to do some custom logic.
 * Like string.replace(/(\w+)\s(\w+)/, "$2 $1") will shift the first and second words in the string.
 */

const reverseRegex = /(\w+)\s(\w+)/;    // wiil reverse the first and second words in the string
const reverseString = "John Doe".replace(reverseRegex, "$2 $1");        // "Doe John"
const reverseString = "one two three".replace(reverseRegex, "$2 $1");   // "two one three"

const removeWSRegex = /^(\s+)|(\s+)$/g; // will remove the whitespace at the beginning and end of the string, do the same as trim()
```

[Regular Expressions Cheatsheet](https://www.shortcutfoo.com/app/dojos/regex/cheatsheet)