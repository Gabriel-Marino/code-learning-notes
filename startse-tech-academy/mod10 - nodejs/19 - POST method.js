"use-strict";

import express from "express";
import { StatusCodes } from "http-status-codes";

const PORT = 6969;
const APP = express();
APP.use(express.json());

APP.listen(PORT, () => {
	console.log(`Server running in http://localhost:${PORT}`);
});

APP.get("/", (request, response) => {
	return response.send(
		`<h1>Working with ExpressJS.</h1>` +`\n` +
		`<a href="http://localhost:${PORT}/users">USERS</a>`
	);
});

let users = [
	{
		id: "0x0001",
		name: "namenamename",
	},
	{
		id: "1x0001",
		name: "emanemaneman",
	},
];
APP.get("/users", (request, response) => {
	return response.send(users);
});
APP.get("/users/:id", (request, response) => {
	return response.send(users.find(user => user.id === request.params.id));
});

// use thunder client extension in VSCode to test post method
APP.post("/users", (request, response) => {
	const NEWUSER = request.body;

	users.push(NEWUSER);

	return response.status(StatusCodes.CREATED).send(NEWUSER);
});