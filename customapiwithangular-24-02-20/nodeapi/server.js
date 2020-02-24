const express = require('express');
const employeeRoutes = require("./routes/employee");
const app = express();
const port = 3636;
const morgan = require('morgan');
const mongoose = require('mongoose');
const cors = require('cors');
mongoose.connect(
    'mongodb://localhost:27017/employeeDB',
    {
    useNewUrlParser: true,
    useUnifiedTopology: true
  },
  err => {
      if (err) {
          console.log("Unable to connect");
      }else  {
          console.log("Mongo DB is connected");
      }
  }
  );

//Middleware
app.use(express.json());
app.use(morgan('dev'));
app.use(cors());
app.use("/api/v1/employee",employeeRoutes);

//Default Root
app.get("/",(req,res) => {

    res.status(200).json({
        error: false,
        message: "API is up and running"
    });
});

app.listen(port,(req,res)=>
{
    console.log("Runnning");
   
});