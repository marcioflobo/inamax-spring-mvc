
CREATE TABLE tbCarteira (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    cod_negociador VARCHAR(5) NOT NULL,
    data_acordo date NOT NULL,
    cpf VARCHAR(16) NOT NULL,
    nome_cliente VARCHAR(50) NOT NULL,
    id_cliente VARCHAR(9) NOT NULL,
    telefone VARCHAR(12) NOT NULL,
    saldo_devedor DECIMAL(10, 2) NOT NULL,
    valor_acordo DECIMAL(10, 2) NOT NULL,
    data_vencimento date NOT NULL,   
    parcelas INT(10) NOT NULL,
    valor_entrada DECIMAL(10, 2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    modificadoPor VARCHAR(50) ,
    iniciado_em date ,
    finalizado_em date,
    tipo_negociacao VARCHAR(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

