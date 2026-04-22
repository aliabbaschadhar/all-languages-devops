const express = require("express");

const app = express();
const port = process.env.PORT || 3000;
const greeting = process.env.GREETING || "Hello, World!";

app.get("/", (_request, response) => {
	response.json({ message: greeting });
});

app.get("/health", (_request, response) => {
	response.json({ status: "ok" });
});

app.listen(port, () => {
	console.log(`Express server listening on port ${port}`);
});
