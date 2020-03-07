
/**
 * Author:  balbi
 * Created: Mar 7, 2020
 */

CREATE TABLE `personalfinancedb`.`income` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(145) NOT NULL,
  `amount` INT NOT NULL,
  PRIMARY KEY (`id`)
);

/*
    init files for income table
*/
INSERT INTO personalfinancedb.income(id,category,amount) VALUES(0,'salary',1000);
INSERT INTO personalfinancedb.income(id,category,amount) VALUES(0,'bonus',400);