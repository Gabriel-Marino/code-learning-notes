"use-strict";

import fetch from 'node-fetch';

const USER = 'Gabriel-Marino';
const APIURL = 'https://api.github.com';

// {
// fetch(`${APIURL}/users/${USER}`)
// 	.then((response) => {
// 		return response.json();
// 	})
// 	.then((user) => {
// 		console.log(user);
// 	});
// }

const RESPONSE = await fetch(`${APIURL}/users/${USER}`);
const DATA = await RESPONSE.json();
console.log(DATA);