CREATE TABLE IF NOT EXISTS datasource (
    dataId INT PRIMARY KEY auto_increment,
    countryName VARCHAR(200),
    baseName VARCHAR (200),
    latitude VARCHAR(200),
    longitude VARCHAR (200),
    baseNumber INT,
    lilyPadsNumber INT,
    usFundedNumber INT,
    note VARCHAR(1000),
    sources VARCHAR (1000)
);