CREATE TABLE USER 
(
    U_ID INT,
    U_FIRSTNAME VARCHAR2(4000) NOT NULL,
    U_LASTNAME VARCHAR2(4000) NOT NULL,
    U_USERNAME VARCHAR2(4000) UNIQUE NOT NULL,
    U_PASSWORD VARCHAR2(4000) NOT NULL,
    U_EMAIL VARCHAR2(4000) NOT NULL,
    OC_ID INT,
    PRIMARY KEY(U_ID)
);
    
    
CREATE TABLE OWN_CHARACTER(
  OC_ID INT,
  C_ID INT,
  U_ID INT,
  PRIMARY KEY(OC_ID)
);