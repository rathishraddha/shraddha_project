const express = require('express');
const mongoose = require('mongoose');
const Product = require('./models/product.model.js');
const productRoute = require('./routes/product.rot.js');
const app = express()

//middlewares
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

mongoose.connect("mongodb://127.0.0.1:27017/crudapi")
.then(() => {
    console.log("Connected to MongoDB");
})
.catch(() => {
    console.log("Error connecting to MongoDB");
});

//routes
app.use("/api/products", productRoute);

app.get('/',(req,res) => {
    res.send('Hello World shraddha');
});

app.listen(3000, () => {
    console.log('server is running on 3000');
});