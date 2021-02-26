CREATE USER 'crypto'@'localhost' IDENTIFIED BY 'cryptopwd';
CREATE DATABASE crypto_bdd;
GRANT ALL PRIVILEGES ON crypto_bdd.* TO 'crypto'@'localhost';
FLUSH PRIVILEGES;

USE crypto_bdd;

CREATE TABLE crypto_monnaies(
   Id_crypto_monnaies INT AUTO_INCREMENT,
   nom VARCHAR(20) NOT NULL,
   label VARCHAR(10) NOT NULL,
   prix_actuel DECIMAL(15,2) NOT NULL,
   PRIMARY KEY(Id_crypto_monnaies),
   UNIQUE(nom),
   UNIQUE(label)
);

CREATE TABLE porte_monnaies(
   Id_porte_monnaies INT AUTO_INCREMENT,
   PRIMARY KEY(Id_porte_monnaies)
);

CREATE TABLE contenu(
   Id_crypto_monnaies INT,
   Id_porte_monnaies INT,
   nombre_unite DECIMAL(15,2) NOT NULL,
   date_achat DATE NOT NULL,
   delta DECIMAL(15,2) NOT NULL,
   prix_achat DECIMAL(15,2) NOT NULL,
   PRIMARY KEY(Id_crypto_monnaies, Id_porte_monnaies),
   FOREIGN KEY(Id_crypto_monnaies) REFERENCES crypto_monnaies(Id_crypto_monnaies),
   FOREIGN KEY(Id_porte_monnaies) REFERENCES porte_monnaies(Id_porte_monnaies)
);