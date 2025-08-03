/**
 * Time to pause and test your new regex writing skills.
 * A group of criminals escaped from jail and ran away, but you don't know how many.
 * However, you do know that they stay close together when they are around other people.
 * You are responsible for finding all of the criminals at once.
 * 
 * Write a greedy regex that finds one or more criminals within a group of other people.
 * A criminal is represented by the capital letter C.
 */

// regex asked to find one or more criminals in a hunt
let reCriminals = /C+/; // Change this line

// data to test the regex against, comments are the expected results
const criminals = [
                    "C",                                                            // "C"
                    "CC",                                                           // "CC"
                    "P1P5P4CCCcP2P6P3",                                             // "CCC"
                    "P6P2P7P4P5CCCCCP3P1",                                          // "CCCCC"
                    "",                                                             // null
                    "P1P2P3",                                                       // null
                    "P2P1P5P4CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCP3"  // "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC"
                  ];

console.log(criminals.map(x => `${x}: ${x.match(reCriminals)}`));