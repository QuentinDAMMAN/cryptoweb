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

INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Bitcoin", "BTC", 150);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Ethereum", "ETH", 20);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Binance Coin", "BNB", 50);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Tether", "USDT", 30);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Cardano", "ADA", 70);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Polkadot", "DOT", 40);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("XRP", "XRP", 200);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Litecoin Coin", "LTC", 50);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Chainlink", "LINK", 30);
INSERT INTO crypto_monnaies (nom,label,prix_actuel) values ("Bitcoin Cash", "BCH", 70);
INSERT INTO porte_monnaies (Id_porte_monnaies) values (1);