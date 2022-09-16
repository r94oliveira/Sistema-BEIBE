/* Lógico_1: */

CREATE TABLE Cliente (
    idPessoa INTEGER PRIMARY KEY,
    nomeCompletoCliente VARCHAR,
    emailCliente VARCHAR,
    ruaEnderecoCliente VARCHAR,
    cpfCliente VARCHAR,
    numeroEndercoCliente INTEGER,
    bairroEnderecoCliente VARCHAR,
    cidadeEnderecoCliente VARCHAR,
    cepEnderecoCliente VARCHAR,
    estadoEnderecoCliente VARCHAR,
    telefoneCliente VARCHAR,
    senhaCliente VARCHAR,
    complementoEnderecoCliente VARCHAR,
    UNIQUE (cpfCliente, emailCliente)
);

CREATE TABLE Atendimento (
    idAtendimento INTEGER PRIMARY KEY,
    dataHoraAtendimento TIMESTAMP,
    descricaoAtendimento VARCHAR,
    solucaoApresentada VARCHAR,
    situacaoAtendimento INTEGER,
    fk_Cliente_idPessoa INTEGER,
    fk_Produto_idProduto INTEGER,
    fk_Tipo_Atendimento_idTipoAtendimento INTEGER,
    fk_Funcionario_idFuncionario INTEGER
);

CREATE TABLE Tipo_Atendimento (
    idTipoAtendimento INTEGER PRIMARY KEY,
    nomeTipoAtendimento VARCHAR UNIQUE
);

CREATE TABLE Produto (
    idProduto INTEGER PRIMARY KEY,
    descricaoProduto VARCHAR,
    pesoProduto DOUBLE,
    fk_Categoria_Produto_idCategoria INTEGER,
    nomeProduto VARCHAR UNIQUE
);

CREATE TABLE Categoria_Produto (
    nomeCategoria VARCHAR UNIQUE,
    idCategoria INTEGER PRIMARY KEY
);

CREATE TABLE Funcionario (
    senhaFuncionario VARCHAR,
    numeroEndercoFuncionario INTEGER,
    estadoEnderecoFuncionario VARCHAR,
    cepEnderecoFuncionario VARCHAR,
    complementoEnderecoFuncionario VARCHAR,
    idFuncionario INTEGER PRIMARY KEY,
    nomeCompletoFuncionario VARCHAR,
    cidadeEnderecoFuncionario VARCHAR,
    ruaEnderecoFuncionario VARCHAR,
    telefoneFuncionario VARCHAR,
    emailFuncionario VARCHAR,
    cpfFuncionario VARCHAR,
    bairroEnderecoFuncionario VARCHAR,
    cargo VARCHAR,
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