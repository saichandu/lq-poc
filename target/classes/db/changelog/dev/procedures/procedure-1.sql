CREATE PROCEDURE `person_alter_column`()
BEGIN
        DECLARE
CONTINUE HANDLER FOR SQLEXCEPTION
BEGIN
END;
ALTER TABLE `PERSON`
    ADD COLUMN `COUNTRY_CODE` INTEGER NULL;
END;