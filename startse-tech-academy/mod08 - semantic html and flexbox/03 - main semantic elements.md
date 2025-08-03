### main

#### Define the main content of a page. ***It's considered as main content that one which is direct related to the main topic or the main functionality of the page or application.***

> *Should exists only one per page.*\
> *main can't be child of:* article, aside, footer, header, nav, etc.\

---
### article

#### An independent composition in an document, page, app or domain or it's supposed to be distributed in an independent or reusable way.

> Example can be a post in a forum or ablog, or an article from a mag or newspapper, a comment in a post, *basically any independent content.*\
> when nested the inside element represent an article related to the outside element.\
> Info about the author can be passed through address element, but the address element can't be nested within article\
> date and time can be shown with the pubdate attribute of the time element.\

---
### aside

#### Represent contents which are tangent to the surrounding content, is most represented as sidebars.

> Example can be side explanations, glossary definitions, warnings, author biography, profile info, related links.

---
### footer

#### Represent a footer to the content of the nearest parent. Normally have info about the author of the section, copyrights or related links.

---
### section

#### It's used when there are no more specific semantic element to represent a given section.

> *Every section element have to be identified with a h element at the begin as a child.*\
> If is possible to break the content is different parts then is recommended to use the article elelement to each part.\
> Not to be used as a genreic container to be stylised, for this use the div element, is used section element when the content must be shown logically in the document structure.\
> Example a search form should be in the nav element, but the results are shown in a section element because there are no more specific semantic element.\

---
