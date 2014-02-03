--<ScriptOptions statementTerminator=";"/>

CREATE TABLE assoc.CATALOGUE (
		CODE INTEGER PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		NOM CHAR(20) NOT NULL,
		PRIX DOUBLE NOT NULL,
		STOCK INTEGER NOT NULL
	);
	
	drop table assoc.CATALOGUE;

CREATE TABLE assoc.ADHERANT (
		ID_ADH CHAR(20) NOT NULL,
		MDP CHAR(20) NOT NULL,
		NOM CHAR(20) NOT NULL,
		PRENOM CHAR(20) NOT NULL,
		ADRESSE CHAR(60) NOT NULL,
		CP CHAR(5) NOT NULL,
		VILLE CHAR(20) NOT NULL,
		PAYS CHAR(20) NOT NULL
	);

CREATE TABLE assoc.COMMANDE (
		CODE INTEGER NOT NULL,
		ID_ADH  CHAR(20) NOT NULL,
		QUANTITE INTEGER NOT NULL,
		date_commande DATE NOT NULL
	);
	drop table assoc.COMMANDE;
		
ALTER TABLE assoc.ADHERANT ADD CONSTRAINT pk PRIMARY KEY (ID_ADH);

ALTER TABLE assoc.COMMANDE ADD CONSTRAINT pk_commande PRIMARY KEY (ID_ADH,CODE);

ALTER TABLE assoc.COMMANDE ADD CONSTRAINT ID_ADH FOREIGN KEY (ID_ADH)
	REFERENCES assoc.ADHERANT (ID_ADH);

ALTER TABLE assoc.COMMANDE ADD CONSTRAINT CODE FOREIGN KEY (CODE)
	REFERENCES assoc.CATALOGUE (CODE);

