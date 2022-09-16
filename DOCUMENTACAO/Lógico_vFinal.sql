/* SCRIPT BANCO DE DADOS BEIBE */

CREATE DATABASE web2;

USE web2;

CREATE TABLE Cliente (
    idPessoa INTEGER PRIMARY KEY AUTO_INCREMENT,
    nomeCliente VARCHAR(255),
    sobrenomeCliente VARCHAR(255),
    emailCliente VARCHAR(255),
    cpfCliente VARCHAR(11),
    ruaEnderecoCliente VARCHAR(255),
    numeroEndercoCliente INTEGER,
    complementoEnderecoCliente VARCHAR(255),
    bairroEnderecoCliente VARCHAR(255),
    cidadeEnderecoCliente VARCHAR(255),
    cepEnderecoCliente VARCHAR(255),
    estadoEnderecoCliente VARCHAR(255),
    telefoneCliente VARCHAR(255),
    senhaCliente VARBINARY(255), 
    UNIQUE (cpfCliente, emailCliente)
);

CREATE TABLE Atendimento (
    idAtendimento INTEGER PRIMARY KEY AUTO_INCREMENT,
    dataHoraAtendimento TIMESTAMP,
    descricaoAtendimento VARCHAR(255),
    solucaoApresentada VARCHAR(255),
    situacaoAtendimento INTEGER,
    fk_Cliente_idPessoa INTEGER,
    fk_Produto_idProduto INTEGER,
    fk_Tipo_Atendimento_idTipoAtendimento INTEGER,
    fk_Funcionario_idFuncionario INTEGER
);

CREATE TABLE Tipo_Atendimento (
    idTipoAtendimento INTEGER PRIMARY KEY AUTO_INCREMENT,
    nomeTipoAtendimento VARCHAR(255) UNIQUE
);

CREATE TABLE Produto (
    idProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
    descricaoProduto VARCHAR(255),
    pesoProduto DOUBLE,
    fk_Categoria_Produto_idCategoria INTEGER,
    nomeProduto VARCHAR(255) UNIQUE
);

CREATE TABLE Categoria_Produto (
    nomeCategoria VARCHAR(255) UNIQUE,
    idCategoria INTEGER PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE Funcionario (
    idFuncionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    nomeFuncionario VARCHAR(255),	
    sobrenomeFuncionario VARCHAR(255),	
    emailFuncionario VARCHAR(255),
    cpfFuncionario VARCHAR(255),
    ruaEnderecoFuncionario VARCHAR(255),
    numeroEndercoFuncionario INTEGER,
    complementoEnderecoFuncionario VARCHAR(255),
    bairroEnderecoFuncionario VARCHAR(255),
    cidadeEnderecoFuncionario VARCHAR(255),
    cepEnderecoFuncionario VARCHAR(255),
    estadoEnderecoFuncionario VARCHAR(255),
    telefoneFuncionario VARCHAR(255),
    senhaFuncionario VARBINARY(255),
    cargo VARCHAR(255),
    UNIQUE (emailFuncionario, cpfFuncionario)
);
 
ALTER TABLE Atendimento ADD CONSTRAINT FK_Atendimento_2
    FOREIGN KEY (fk_Cliente_idPessoa)
    REFERENCES Cliente (idPessoa)
    ON DELETE CASCADE;
 
ALTER TABLE Atendimento ADD CONSTRAINT FK_Atendimento_3
    FOREIGN KEY (fk_Produto_idProduto)
    REFERENCES Produto (idProduto)
    ON DELETE CASCADE;
 
ALTER TABLE Atendimento ADD CONSTRAINT FK_Atendimento_4
    FOREIGN KEY (fk_Tipo_Atendimento_idTipoAtendimento)
    REFERENCES Tipo_Atendimento (idTipoAtendimento)
    ON DELETE CASCADE;
 
ALTER TABLE Atendimento ADD CONSTRAINT FK_Atendimento_5
    FOREIGN KEY (fk_Funcionario_idFuncionario)
    REFERENCES Funcionario (idFuncionario)
    ON DELETE SET NULL;
 
ALTER TABLE Produto ADD CONSTRAINT FK_Produto_2
    FOREIGN KEY (fk_Categoria_Produto_idCategoria)
    REFERENCES Categoria_Produto (idCategoria)
    ON DELETE CASCADE;


/* BASE DE DADOS PARA INCLUIR */

INSERT INTO `web2`.`funcionario`
(`nomeFuncionario`,`sobrenomeFuncionario`,`emailFuncionario`,`cpfFuncionario`, `ruaEnderecoFuncionario`,`numeroEndercoFuncionario`,`complementoEnderecoFuncionario`, `bairroEnderecoFuncionario`, `cidadeEnderecoFuncionario`, `cepEnderecoFuncionario`, `estadoEnderecoFuncionario`, `telefoneFuncionario`, `senhaFuncionario`, `cargo`)
VALUES ('testeFuncionario','fUNCIONARIO','b@b.com','69722735012','rua x','3030','','Bairro lindo','cidade linda','25845970','estado lindo','9428611611',aes_encrypt('123','beibe'),'1');

INSERT INTO `web2`.`funcionario`
(`nomeFuncionario`,`sobrenomeFuncionario`,`emailFuncionario`,`cpfFuncionario`,`ruaEnderecoFuncionario`,`numeroEndercoFuncionario`,`complementoEnderecoFuncionario`,`bairroEnderecoFuncionario`,`cidadeEnderecoFuncionario`,`cepEnderecoFuncionario`,`estadoEnderecoFuncionario`,`telefoneFuncionario`,`senhaFuncionario`,`cargo`)
VALUES
('rafa','soares','rs@rs','12332','ruadasruas','6565','bloco3','quitandinha','mandirituba','8568','sergipe','565898',aes_encrypt('123','beibe'),'1');

INSERT INTO `web2`.`funcionario`
(`nomeFuncionario`,`sobrenomeFuncionario`,`emailFuncionario`,`cpfFuncionario`,`ruaEnderecoFuncionario`,`numeroEndercoFuncionario`,`complementoEnderecoFuncionario`,`bairroEnderecoFuncionario`,`cidadeEnderecoFuncionario`,`cepEnderecoFuncionario`,`estadoEnderecoFuncionario`,`telefoneFuncionario`,`senhaFuncionario`,`cargo`)
VALUES
('nomeDoFuncionario','soares','f@f','12332','ruadasruas','6565','bloco3','quitandinha','mandirituba','8568','sergipe','565898',aes_encrypt('123','beibe'),'1');

INSERT INTO `web2`.`funcionario`
(`nomeFuncionario`,`sobrenomeFuncionario`,`emailFuncionario`,`cpfFuncionario`,`ruaEnderecoFuncionario`,`numeroEndercoFuncionario`,`complementoEnderecoFuncionario`,`bairroEnderecoFuncionario`,`cidadeEnderecoFuncionario`,`cepEnderecoFuncionario`,`estadoEnderecoFuncionario`,`telefoneFuncionario`,`senhaFuncionario`,`cargo`)
VALUES
('nomeDoGerente','soares','g@g','12332','ruadasruas','6565','bloco3','quitandinha','mandirituba','8568','sergipe','565898',aes_encrypt('123','beibe'),'2');

INSERT INTO `web2`.`tipo_atendimento` (`nomeTipoAtendimento`) VALUES ('Reclamação');
INSERT INTO `web2`.`tipo_atendimento` (`nomeTipoAtendimento`) VALUES ('Elogio');
INSERT INTO `web2`.`tipo_atendimento` (`nomeTipoAtendimento`) VALUES ('Informação');
INSERT INTO `web2`.`tipo_atendimento` (`nomeTipoAtendimento`) VALUES ('Sugestão');

INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Pes');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Maos');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Rosto');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Corpo');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Boca');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Cabelo');
INSERT INTO `web2`.`categoria_produto` (`nomeCategoria`) VALUES ('Perfumaria');

