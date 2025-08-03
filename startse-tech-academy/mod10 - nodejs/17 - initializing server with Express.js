"use-strict";

// npm install express
// in package.json use type: "module"

import express from "express";

const PORT = 6969;
const APP = express();

APP.listen(PORT, () => {
	console.log(`Server running in http://localhost:${PORT}`);
});

APP.get("/", (request, response) => {
	return response.send("<h1>Working with ExpressJS.</h1>");
});
