const express = require('express');
const router = express.Router();
const Employee = require('../models/employee.model');

//Get all employees
router.get("/",async (req,res) => {
    const employee = await Employee.find();
    try{
      res.status(200).json({
          error: false,
          data: employee
      })
    }catch(err){
      res.status(400).json({
          error: false,
          message: "Data not found"
      });
    }
    
});
router.get("/:id",async (req,res) => {
    const employee = await Employee.findById(req.params.id);
    try{
      res.status(200).json({
          error: false,
          data: employee
      })
    }catch(err){
      res.status(400).json({
          error: false,
          message: "Data not found"
      });
    }
    
});
  //Update Employee
  router.put("/:id",async(req,res) => {
        const emp = await Employee.findByIdAndUpdate(req.params.id,req.body,{
            new: true
        });
        if(!emp)
        {
            res.status(404).json({
                error: true,
                message: "Wrong employee id"
            })
        }try{
        res.status(200).json({
          error: false,
          data: emp
      });}
      catch(err)
      {
        res.status(404).json({
            error: false,
            message: err.message
        });
      }
  });
 //Create Employee 
 router.post("/",async(req,res) => {
     let emp = req.body;
     console.log(emp);
     let doc = await Employee.create(emp)
     try{
      res.status(201).json({
          error: false,
          data: doc
      });
      }catch(err)
      {
          res.status(400).json({
              error: true,
              message: "Cannot create"
          })
      }
  });
  //Delete Employee
  router.delete("/:id",async(req,res) => {
    const emp = await Employee.findByIdAndDelete(req.params.id,req.body);
    if(!emp){
        res.status(400).json({
            error: true,
            message: "Id not found"
        });
    }
    try{
      res.status(200).json({
          error: false,
          data: emp
      });}
      catch(err){
          res.status(400).json({
              error: true,
              message: "Unable to delete"
          });
      }
  });
  module.exports = router;