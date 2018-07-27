-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Branch`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Branch` (
  `IFSC` CHAR(11) NOT NULL,
  `BranchName` VARCHAR(45) NOT NULL,
  `BranchAddress` VARCHAR(45) NOT NULL,
  `PIN` CHAR(6) NOT NULL,
  `OffNumber` CHAR(12) NOT NULL,
  PRIMARY KEY (`IFSC`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Campaign`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Campaign` (
  `Campaign_id` VARCHAR(45) NOT NULL,
  `Campaign_Tile` VARCHAR(45) NOT NULL,
  `Description` VARCHAR(70) NULL,
  `Valid_from` DATE NOT NULL,
  `Valid_to` DATE NOT NULL,
  `Average_balance` FLOAT NOT NULL,
  `Age_Of_Relationship` INT NOT NULL,
  `Professoin` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Campaign_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Campaign_Log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Campaign_Log` (
  `Date_of_updation` TIMESTAMP NOT NULL,
  `Location` VARCHAR(45) NOT NULL,
  `Campaign_Campaign_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Campaign_Campaign_id`),
  CONSTRAINT `fk_Log_Campaign1`
    FOREIGN KEY (`Campaign_Campaign_id`)
    REFERENCES `mydb`.`Campaign` (`Campaign_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Employee` (
  `EmplID` INT NOT NULL,
  `EmpFirstName` VARCHAR(25) NOT NULL,
  `EmpMidName` VARCHAR(25) NULL,
  `EmpLastName` VARCHAR(25) NOT NULL,
  `Designation` VARCHAR(45) NOT NULL,
  `DateOfBirth` DATE NOT NULL,
  `DateOfJoining` DATE NOT NULL,
  `Gender` VARCHAR(15) NOT NULL,
  `BranchDetails_BranchID` INT NOT NULL,
  `EmployeeValidation_EmpUserName` VARCHAR(20) NOT NULL,
  `UserName` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Salary` DECIMAL(10,2) NOT NULL,
  `Log_Campaign_Campaign_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`EmplID`, `BranchDetails_BranchID`, `EmployeeValidation_EmpUserName`, `Log_Campaign_Campaign_id`),
  INDEX `fk_EmployeeDetails_BranchDetails1_idx` (`BranchDetails_BranchID` ASC),
  INDEX `fk_Employee_Log1_idx` (`Log_Campaign_Campaign_id` ASC),
  CONSTRAINT `fk_EmployeeDetails_BranchDetails1`
    FOREIGN KEY (`BranchDetails_BranchID`)
    REFERENCES `mydb`.`Branch` (`IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employee_Log1`
    FOREIGN KEY (`Log_Campaign_Campaign_id`)
    REFERENCES `mydb`.`Campaign_Log` (`Campaign_Campaign_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Customer` (
  `CustomerID` INT NOT NULL,
  `CustFirstName` VARCHAR(25) NOT NULL,
  `CustMidNamel` VARCHAR(15) NULL,
  `CustLastName` VARCHAR(25) NOT NULL,
  `DateOfBirth` DATE NOT NULL,
  `MobileNum` VARCHAR(10) NOT NULL,
  `EmailID` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `PIN` VARCHAR(45) NOT NULL,
  `PAN` CHAR(10) NOT NULL,
  `AADHAR` CHAR(12) NOT NULL,
  `City` VARCHAR(45) NOT NULL,
  `State` VARCHAR(30) NOT NULL,
  `Occupation` VARCHAR(45) NOT NULL,
  `Salary` DECIMAL(12,2) NOT NULL,
  `Gender` VARCHAR(13) NOT NULL,
  `BranchDetails_BranchID` INT NOT NULL,
  `CreditScore` VARCHAR(15) NOT NULL,
  `DescCScoreUpd` VARCHAR(45) NULL,
  `CustomerValidation_CustomerUserID` VARCHAR(20) NOT NULL,
  `CustUserName` VARCHAR(45) NOT NULL,
  `CustPassword` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CustomerID`, `BranchDetails_BranchID`, `CustomerValidation_CustomerUserID`),
  UNIQUE INDEX `CustUserName_UNIQUE` (`CustUserName` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Biller`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Biller` (
  `biller_id` INT NOT NULL,
  `Biller_name` VARCHAR(45) NOT NULL,
  `Biller_address` VARCHAR(45) NOT NULL,
  `Biller_category` VARCHAR(45) NULL,
  `Biller_acc_no` INT NOT NULL,
  PRIMARY KEY (`biller_id`),
  UNIQUE INDEX `biller_id_UNIQUE` (`biller_id` ASC),
  UNIQUE INDEX `Biller_acc_no_UNIQUE` (`Biller_acc_no` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Account` (
  `AccountNumber` INT NOT NULL,
  `AccType` VARCHAR(45) NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `Balance` DECIMAL(12,2) NOT NULL,
  `OpenDate` DATE NOT NULL,
  `CloseDatel` DATE NOT NULL,
  `DateOfModification` DATE NOT NULL,
  `Nominee` VARCHAR(45) NOT NULL,
  `CustomerDetails_CustomerID` INT NOT NULL,
  `CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Branch_IFSC` CHAR(11) NOT NULL,
  `Biller_biller_id` INT NOT NULL,
  PRIMARY KEY (`AccountNumber`, `CustomerDetails_CustomerID`, `CustomerDetails_BranchDetails_BranchID`, `Branch_IFSC`, `Biller_biller_id`),
  INDEX `fk_AccountDetails_CustomerDetails1_idx` (`CustomerDetails_CustomerID` ASC, `CustomerDetails_BranchDetails_BranchID` ASC),
  INDEX `fk_Account_Branch1_idx` (`Branch_IFSC` ASC),
  INDEX `fk_Account_Biller1_idx` (`Biller_biller_id` ASC),
  CONSTRAINT `fk_AccountDetails_CustomerDetails1`
    FOREIGN KEY (`CustomerDetails_CustomerID` , `CustomerDetails_BranchDetails_BranchID`)
    REFERENCES `mydb`.`Customer` (`CustomerID` , `BranchDetails_BranchID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Account_Branch1`
    FOREIGN KEY (`Branch_IFSC`)
    REFERENCES `mydb`.`Branch` (`IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Account_Biller1`
    FOREIGN KEY (`Biller_biller_id`)
    REFERENCES `mydb`.`Biller` (`biller_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UnmappedData`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UnmappedData` (
  `AccountNumber` INT NOT NULL,
  `AccountHolder` VARCHAR(45) NOT NULL,
  `DateOfBirth` DATE NULL,
  `ADDHAR` VARCHAR(45) NULL,
  `PAN` VARCHAR(45) NULL,
  `Address` VARCHAR(45) NULL,
  `PhoneNumber` VARCHAR(45) NULL,
  `EmailID` VARCHAR(45) NULL,
  `account_type` VARCHAR(45) NULL,
  PRIMARY KEY (`AccountNumber`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Rqst_Add_on`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Rqst_Add_on` (
  `cardNo_new` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `relationship` VARCHAR(45) NULL,
  `PAN_new` INT NULL,
  `gender` VARCHAR(45) NULL,
  `DOB_new` DATE NULL,
  `address` VARCHAR(45) NULL,
  `limit_new` DECIMAL(12,2) NULL,
  `fee` VARCHAR(45) NULL,
  PRIMARY KEY (`cardNo_new`),
  UNIQUE INDEX `cardNo_new_UNIQUE` (`cardNo_new` ASC),
  UNIQUE INDEX `PAN_new_UNIQUE` (`PAN_new` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Product` (
  `pid` INT NOT NULL,
  `Prod_desc` VARCHAR(45) NULL,
  `prod_img` LONGBLOB NULL,
  `pts_req` INT NULL,
  `Productcol` VARCHAR(45) NULL,
  PRIMARY KEY (`pid`),
  UNIQUE INDEX `pid_UNIQUE` (`pid` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Credit_Card_Detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Credit_Card_Detail` (
  `card_no` INT(20) NOT NULL,
  `card_type` VARCHAR(45) NULL,
  `reward_points` INT NULL,
  `date_of_issue` DATE NULL,
  `valid_till` DATE NULL,
  `cvv` INT(5) NULL,
  `max_limit` DECIMAL(30,2) NULL,
  `min_limit` DECIMAL(30,2) NULL,
  `current_card_limit` DECIMAL(30,2) NULL,
  `req_card_limit` VARCHAR(45) NULL,
  `Account_AccountNumber` INT NOT NULL,
  `Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Account_Branch_IFSC` CHAR(11) NOT NULL,
  PRIMARY KEY (`card_no`, `Account_AccountNumber`, `Account_CustomerDetails_CustomerID`, `Account_CustomerDetails_BranchDetails_BranchID`, `Account_Branch_IFSC`),
  INDEX `fk_Credit_Card_Detail_Account1_idx` (`Account_AccountNumber` ASC, `Account_CustomerDetails_CustomerID` ASC, `Account_CustomerDetails_BranchDetails_BranchID` ASC, `Account_Branch_IFSC` ASC),
  CONSTRAINT `fk_Credit_Card_Detail_Account1`
    FOREIGN KEY (`Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC`)
    REFERENCES `mydb`.`Account` (`AccountNumber` , `CustomerDetails_CustomerID` , `CustomerDetails_BranchDetails_BranchID` , `Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Redeem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Redeem` (
  `Qty` INT NOT NULL,
  `pts_redeemed` INT NULL,
  `RedeemReqId` VARCHAR(45) NOT NULL,
  `Product_pid` INT NOT NULL,
  `Credit_Card_Detail_card_no` INT(20) NOT NULL,
  `Credit_Card_Detail_Account_AccountNumber` INT NOT NULL,
  `Credit_Card_Detail_Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Credit_Card_Detail_Account_Branch_IFSC` CHAR(11) NOT NULL,
  PRIMARY KEY (`RedeemReqId`, `Product_pid`, `Credit_Card_Detail_card_no`, `Credit_Card_Detail_Account_AccountNumber`, `Credit_Card_Detail_Account_CustomerDetails_CustomerID`, `Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID`, `Credit_Card_Detail_Account_Branch_IFSC`),
  INDEX `fk_Redeem_Product1_idx` (`Product_pid` ASC),
  INDEX `fk_Redeem_Credit_Card_Detail1_idx` (`Credit_Card_Detail_card_no` ASC, `Credit_Card_Detail_Account_AccountNumber` ASC, `Credit_Card_Detail_Account_CustomerDetails_CustomerID` ASC, `Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` ASC, `Credit_Card_Detail_Account_Branch_IFSC` ASC),
  CONSTRAINT `fk_Redeem_Product1`
    FOREIGN KEY (`Product_pid`)
    REFERENCES `mydb`.`Product` (`pid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Redeem_Credit_Card_Detail1`
    FOREIGN KEY (`Credit_Card_Detail_card_no` , `Credit_Card_Detail_Account_AccountNumber` , `Credit_Card_Detail_Account_CustomerDetails_CustomerID` , `Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` , `Credit_Card_Detail_Account_Branch_IFSC`)
    REFERENCES `mydb`.`Credit_Card_Detail` (`card_no` , `Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Customer_service_request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Customer_service_request` (
  `CSR_id` INT NOT NULL,
  `CSR_type` INT(11) NOT NULL,
  `CSR_date` TIMESTAMP NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `response` VARCHAR(45) NULL,
  `Account_AccountNumber` INT NOT NULL,
  `Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Account_Branch_IFSC` CHAR(11) NOT NULL,
  `Rqst_Add_on_cardNo_new` INT NULL,
  `Redeem_RedeemReqId` VARCHAR(45) NOT NULL,
  `Redeem_Product_pid` INT NOT NULL,
  `Redeem_Credit_Card_Detail_card_no` INT(20) NOT NULL,
  `Redeem_Credit_Card_Detail_Account_AccountNumber` INT NOT NULL,
  `Redeem_Credit_Card_Detail_Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Redeem_Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Redeem_Credit_Card_Detail_Account_Branch_IFSC` CHAR(11) NOT NULL,
  PRIMARY KEY (`CSR_id`, `Account_AccountNumber`, `Account_CustomerDetails_CustomerID`, `Account_CustomerDetails_BranchDetails_BranchID`, `Account_Branch_IFSC`, `Rqst_Add_on_cardNo_new`, `Redeem_RedeemReqId`, `Redeem_Product_pid`, `Redeem_Credit_Card_Detail_card_no`, `Redeem_Credit_Card_Detail_Account_AccountNumber`, `Redeem_Credit_Card_Detail_Account_CustomerDetails_CustomerID`, `Redeem_Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID`, `Redeem_Credit_Card_Detail_Account_Branch_IFSC`),
  INDEX `fk_Customer_service_request_Account1_idx` (`Account_AccountNumber` ASC, `Account_CustomerDetails_CustomerID` ASC, `Account_CustomerDetails_BranchDetails_BranchID` ASC, `Account_Branch_IFSC` ASC),
  INDEX `fk_Customer_service_request_Rqst_Add_on1_idx` (`Rqst_Add_on_cardNo_new` ASC),
  INDEX `fk_Customer_service_request_Redeem1_idx` (`Redeem_RedeemReqId` ASC, `Redeem_Product_pid` ASC, `Redeem_Credit_Card_Detail_card_no` ASC, `Redeem_Credit_Card_Detail_Account_AccountNumber` ASC, `Redeem_Credit_Card_Detail_Account_CustomerDetails_CustomerID` ASC, `Redeem_Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` ASC, `Redeem_Credit_Card_Detail_Account_Branch_IFSC` ASC),
  CONSTRAINT `fk_Customer_service_request_Account1`
    FOREIGN KEY (`Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC`)
    REFERENCES `mydb`.`Account` (`AccountNumber` , `CustomerDetails_CustomerID` , `CustomerDetails_BranchDetails_BranchID` , `Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_service_request_Rqst_Add_on1`
    FOREIGN KEY (`Rqst_Add_on_cardNo_new`)
    REFERENCES `mydb`.`Rqst_Add_on` (`cardNo_new`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customer_service_request_Redeem1`
    FOREIGN KEY (`Redeem_RedeemReqId` , `Redeem_Product_pid` , `Redeem_Credit_Card_Detail_card_no` , `Redeem_Credit_Card_Detail_Account_AccountNumber` , `Redeem_Credit_Card_Detail_Account_CustomerDetails_CustomerID` , `Redeem_Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` , `Redeem_Credit_Card_Detail_Account_Branch_IFSC`)
    REFERENCES `mydb`.`Redeem` (`RedeemReqId` , `Product_pid` , `Credit_Card_Detail_card_no` , `Credit_Card_Detail_Account_AccountNumber` , `Credit_Card_Detail_Account_CustomerDetails_CustomerID` , `Credit_Card_Detail_Account_CustomerDetails_BranchDetails_BranchID` , `Credit_Card_Detail_Account_Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cheque_book_request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cheque_book_request` (
  `no_of_leaves` INT NOT NULL,
  `cheque_book_no` VARCHAR(45) NULL,
  `Customer_service_request_CSR_id` INT NOT NULL,
  `Customer_service_request_Account_AccountNumber` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Customer_service_request_Account_Branch_IFSC` CHAR(11) NOT NULL,
  PRIMARY KEY (`Customer_service_request_CSR_id`, `Customer_service_request_Account_AccountNumber`, `Customer_service_request_Account_CustomerDetails_CustomerID`, `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID`, `Customer_service_request_Account_Branch_IFSC`),
  CONSTRAINT `fk_Cheque_book_request_Customer_service_request1`
    FOREIGN KEY (`Customer_service_request_CSR_id` , `Customer_service_request_Account_AccountNumber` , `Customer_service_request_Account_CustomerDetails_CustomerID` , `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` , `Customer_service_request_Account_Branch_IFSC`)
    REFERENCES `mydb`.`Customer_service_request` (`CSR_id` , `Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Stolen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Stolen` (
  `Stolen_date` DATE NOT NULL,
  `Customer_service_request_CSR_id` INT NOT NULL,
  `Customer_service_request_Account_AccountNumber` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Customer_service_request_Account_Branch_IFSC` CHAR(11) NOT NULL,
  `Customer_service_request_Rqst_Add_on_cardNo_new` INT NOT NULL,
  PRIMARY KEY (`Customer_service_request_CSR_id`, `Customer_service_request_Account_AccountNumber`, `Customer_service_request_Account_CustomerDetails_CustomerID`, `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID`, `Customer_service_request_Account_Branch_IFSC`, `Customer_service_request_Rqst_Add_on_cardNo_new`),
  CONSTRAINT `fk_Stolen_Customer_service_request1`
    FOREIGN KEY (`Customer_service_request_CSR_id` , `Customer_service_request_Account_AccountNumber` , `Customer_service_request_Account_CustomerDetails_CustomerID` , `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` , `Customer_service_request_Account_Branch_IFSC` , `Customer_service_request_Rqst_Add_on_cardNo_new`)
    REFERENCES `mydb`.`Customer_service_request` (`CSR_id` , `Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC` , `Rqst_Add_on_cardNo_new`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Transaction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Transaction` (
  `Transaction_id` INT NOT NULL,
  `Transaction_type` VARCHAR(45) NOT NULL,
  `Transaction_time` TIMESTAMP NOT NULL,
  `amount` DECIMAL NOT NULL,
  `receiver_acc_no` VARCHAR(45) NOT NULL,
  `Account_AccountNumber` INT NOT NULL,
  `Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Account_Branch_IFSC` CHAR(11) NOT NULL,
  PRIMARY KEY (`Transaction_id`, `Account_AccountNumber`, `Account_CustomerDetails_CustomerID`, `Account_CustomerDetails_BranchDetails_BranchID`, `Account_Branch_IFSC`),
  INDEX `fk_Transaction_Account1_idx` (`Account_AccountNumber` ASC, `Account_CustomerDetails_CustomerID` ASC, `Account_CustomerDetails_BranchDetails_BranchID` ASC, `Account_Branch_IFSC` ASC),
  CONSTRAINT `fk_Transaction_Account1`
    FOREIGN KEY (`Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC`)
    REFERENCES `mydb`.`Account` (`AccountNumber` , `CustomerDetails_CustomerID` , `CustomerDetails_BranchDetails_BranchID` , `Branch_IFSC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Prospective_Customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Prospective_Customers` (
  `Status` VARCHAR(45) NOT NULL,
  `Customer_CustomerID` INT NOT NULL,
  `Customer_BranchDetails_BranchID` INT NOT NULL,
  `Customer_CustomerValidation_CustomerUserID` VARCHAR(20) NOT NULL,
  `Campaign_Campaign_id1` VARCHAR(45) NOT NULL,
  `Employee_EmplID` INT NOT NULL,
  `Employee_BranchDetails_BranchID` INT NOT NULL,
  `Employee_EmployeeValidation_EmpUserName` VARCHAR(20) NOT NULL,
  `Employee_Log_Campaign_Campaign_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Status`, `Customer_CustomerID`, `Customer_BranchDetails_BranchID`, `Customer_CustomerValidation_CustomerUserID`, `Campaign_Campaign_id1`, `Employee_EmplID`, `Employee_BranchDetails_BranchID`, `Employee_EmployeeValidation_EmpUserName`, `Employee_Log_Campaign_Campaign_id`),
  INDEX `fk_Prospective_Customers_Customer1_idx` (`Customer_CustomerID` ASC, `Customer_BranchDetails_BranchID` ASC, `Customer_CustomerValidation_CustomerUserID` ASC),
  INDEX `fk_Prospective_Customers_Campaign2_idx` (`Campaign_Campaign_id1` ASC),
  INDEX `fk_Prospective_Customers_Employee1_idx` (`Employee_EmplID` ASC, `Employee_BranchDetails_BranchID` ASC, `Employee_EmployeeValidation_EmpUserName` ASC, `Employee_Log_Campaign_Campaign_id` ASC),
  CONSTRAINT `fk_Prospective_Customers_Customer1`
    FOREIGN KEY (`Customer_CustomerID` , `Customer_BranchDetails_BranchID` , `Customer_CustomerValidation_CustomerUserID`)
    REFERENCES `mydb`.`Customer` (`CustomerID` , `BranchDetails_BranchID` , `CustomerValidation_CustomerUserID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prospective_Customers_Campaign2`
    FOREIGN KEY (`Campaign_Campaign_id1`)
    REFERENCES `mydb`.`Campaign` (`Campaign_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prospective_Customers_Employee1`
    FOREIGN KEY (`Employee_EmplID` , `Employee_BranchDetails_BranchID` , `Employee_EmployeeValidation_EmpUserName` , `Employee_Log_Campaign_Campaign_id`)
    REFERENCES `mydb`.`Employee` (`EmplID` , `BranchDetails_BranchID` , `EmployeeValidation_EmpUserName` , `Log_Campaign_Campaign_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cust_Query`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cust_Query` (
  `Query_id` VARCHAR(10) NOT NULL,
  `Query` VARCHAR(200) NOT NULL,
  `Query_Rev_Date` DATE NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `Response` VARCHAR(200) NOT NULL,
  `Customer_service_request_CSR_id` INT NOT NULL,
  `Customer_service_request_Account_AccountNumber` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Customer_service_request_Account_Branch_IFSC` CHAR(11) NOT NULL,
  `Customer_service_request_Rqst_Add_on_cardNo_new` INT NOT NULL,
  PRIMARY KEY (`Query_id`, `Customer_service_request_CSR_id`, `Customer_service_request_Account_AccountNumber`, `Customer_service_request_Account_CustomerDetails_CustomerID`, `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID`, `Customer_service_request_Account_Branch_IFSC`, `Customer_service_request_Rqst_Add_on_cardNo_new`),
  INDEX `fk_Cust_Query_Customer_service_request1_idx` (`Customer_service_request_CSR_id` ASC, `Customer_service_request_Account_AccountNumber` ASC, `Customer_service_request_Account_CustomerDetails_CustomerID` ASC, `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` ASC, `Customer_service_request_Account_Branch_IFSC` ASC, `Customer_service_request_Rqst_Add_on_cardNo_new` ASC),
  CONSTRAINT `fk_Cust_Query_Customer_service_request1`
    FOREIGN KEY (`Customer_service_request_CSR_id` , `Customer_service_request_Account_AccountNumber` , `Customer_service_request_Account_CustomerDetails_CustomerID` , `Customer_service_request_Account_CustomerDetails_BranchDetails_BranchID` , `Customer_service_request_Account_Branch_IFSC` , `Customer_service_request_Rqst_Add_on_cardNo_new`)
    REFERENCES `mydb`.`Customer_service_request` (`CSR_id` , `Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC` , `Rqst_Add_on_cardNo_new`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Disp_transaction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Disp_transaction` (
  `Reason` VARCHAR(45) NULL,
  `Transaction_Transaction_id` INT NOT NULL,
  PRIMARY KEY (`Transaction_Transaction_id`),
  CONSTRAINT `fk_Disp_transaction_Transaction1`
    FOREIGN KEY (`Transaction_Transaction_id`)
    REFERENCES `mydb`.`Transaction` (`Transaction_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Make_payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Make_payment` (
  `Bill_amt` DECIMAL(12,2) NOT NULL,
  `payment_due_date` DATE NULL,
  ` payment_date` DATE NULL,
  `payment_status` VARCHAR(45) NULL,
  `Bill_no` INT NOT NULL,
  `Account_AccountNumber` INT NOT NULL,
  `Account_CustomerDetails_CustomerID` INT NOT NULL,
  `Account_CustomerDetails_BranchDetails_BranchID` INT NOT NULL,
  `Account_Branch_IFSC` CHAR(11) NOT NULL,
  `Account_Biller_biller_id` INT NOT NULL,
  `Biller_biller_id` INT NOT NULL,
  PRIMARY KEY (`Bill_no`, `Account_AccountNumber`, `Account_CustomerDetails_CustomerID`, `Account_CustomerDetails_BranchDetails_BranchID`, `Account_Branch_IFSC`, `Account_Biller_biller_id`, `Biller_biller_id`),
  INDEX `fk_Make_payment_Account1_idx` (`Account_AccountNumber` ASC, `Account_CustomerDetails_CustomerID` ASC, `Account_CustomerDetails_BranchDetails_BranchID` ASC, `Account_Branch_IFSC` ASC, `Account_Biller_biller_id` ASC),
  INDEX `fk_Make_payment_Biller1_idx` (`Biller_biller_id` ASC),
  CONSTRAINT `fk_Make_payment_Account1`
    FOREIGN KEY (`Account_AccountNumber` , `Account_CustomerDetails_CustomerID` , `Account_CustomerDetails_BranchDetails_BranchID` , `Account_Branch_IFSC` , `Account_Biller_biller_id`)
    REFERENCES `mydb`.`Account` (`AccountNumber` , `CustomerDetails_CustomerID` , `CustomerDetails_BranchDetails_BranchID` , `Branch_IFSC` , `Biller_biller_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Make_payment_Biller1`
    FOREIGN KEY (`Biller_biller_id`)
    REFERENCES `mydb`.`Biller` (`biller_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Increase_Credit_Limit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Increase_Credit_Limit` (
)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
