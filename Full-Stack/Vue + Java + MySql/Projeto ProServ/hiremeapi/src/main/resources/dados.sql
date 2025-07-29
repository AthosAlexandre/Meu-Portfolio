-- Habilita a extensão pgcrypto para geração de UUID, se ainda não estiver habilitada
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

--------------------------------------------------
-- Tabela: cliente
--------------------------------------------------
CREATE TABLE cliente (
                         cliente_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                         nome VARCHAR(255),
                         email VARCHAR(255),
                         senha VARCHAR(255),
                         telefone VARCHAR(50),
                         cpf VARCHAR(20),
                         data_nascimento VARCHAR(50),
                         sexo VARCHAR(20),
    -- Campos do Endereço
                         cep VARCHAR(20),
                         logradouro VARCHAR(255),
                         bairro VARCHAR(100),
                         numero VARCHAR(20),
                         cidade VARCHAR(100),
                         complemento VARCHAR(255),
                         uf VARCHAR(2),
                         latitude DOUBLE PRECISION,
                         longitude DOUBLE PRECISION,
                         foto BYTEA,
    -- Campos para dados do cartão de crédito
                         numero_cartao VARCHAR(50),
                         nome_cartao VARCHAR(255),
                         validade_cartao VARCHAR(10),
                         cvv VARCHAR(10)
);

--------------------------------------------------
-- Tabela: prestadordeservico
--------------------------------------------------
CREATE TABLE prestadordeservico (
                                    prestador_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                                    nome VARCHAR(255),
                                    email VARCHAR(255),
                                    senha VARCHAR(255),
                                    telefone VARCHAR(50),
                                    cpf VARCHAR(20),
                                    data_nascimento VARCHAR(50),
                                    sexo VARCHAR(20),
    -- Campos do Endereço
                                    cep VARCHAR(20),
                                    logradouro VARCHAR(255),
                                    bairro VARCHAR(100),
                                    numero VARCHAR(20),
                                    cidade VARCHAR(100),
                                    complemento VARCHAR(255),
                                    uf VARCHAR(2),
                                    latitude DOUBLE PRECISION,
                                    longitude DOUBLE PRECISION,
    -- Enum de serviços prestados (armazenado como texto)
                                    servico_aprestar VARCHAR(50),
                                    foto BYTEA,
                                    pix_key VARCHAR(255)
);

--------------------------------------------------
-- Tabela: contrato
--------------------------------------------------
CREATE TABLE contrato (
                          contrato_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                          cliente_id UUID NOT NULL,
                          prestador_id UUID NOT NULL,
    -- Enum de status do contrato (armazenado como texto)
                          status VARCHAR(50),
                          data_contrato TIMESTAMP,
                          CONSTRAINT fk_contrato_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(cliente_id),
                          CONSTRAINT fk_contrato_prestador FOREIGN KEY (prestador_id) REFERENCES prestadordeservico(prestador_id)
);

--------------------------------------------------
-- Tabela: mensagem
--------------------------------------------------
CREATE TABLE mensagem (
                          mensagem_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                          contrato_id UUID NOT NULL,
    -- Conforme o código original, esse campo (nomeado como prestador_id) referencia a tabela cliente.
                          prestador_id UUID NOT NULL,
                          conteudo TEXT,
                          data_envio TIMESTAMP,
                          CONSTRAINT fk_mensagem_contrato FOREIGN KEY (contrato_id) REFERENCES contrato(contrato_id),
                          CONSTRAINT fk_mensagem_remetente FOREIGN KEY (prestador_id) REFERENCES cliente(cliente_id)
);
