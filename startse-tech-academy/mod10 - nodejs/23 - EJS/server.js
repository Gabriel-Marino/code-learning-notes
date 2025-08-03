"use-strict";

/**
 * EJS are Embedded JavaScript templates.
 * EJS help us creating dynamic HTML pages.
 * 
 * --save-dev : save the package in the devDependencies section of package.json, so the package will be only installed in the development environment, not in the production environment.
 * add dev script in package.json : "dev": "nodemon index.js" and run with "npm run dev"
 * to wirte a variable in a file .ejs use : <%= varname %> and the when render call .render("template", {varname: value})
 */

import express from "express";
// import { getArticles, getArticleByDoi } from "./articleService";
import * as ArticlesService from "./articleService.js";

const PORT =  process.env.PORT || 4269;
const APP = express();

APP.set("view engine", "ejs");
APP.set("views", "./views");

APP.listen(PORT, () => {
    console.log(`Server is running on port: ${PORT}`);
    console.log(`Visualize here: http://localhost:${PORT}`);
});

APP.get("/", (request, response) => {
    const title = "Working with EJS";
    const articles = ArticlesService.getArticles();
    response.render("pages/home", {title, articles});
});

APP.get("/abstract/:id", (request, response) => {
    const ID = request.params.id;
    const ARTICLE = ArticlesService.getArticleByDoi(ID);
    response.render("pages/abstract", {ARTICLE});
});