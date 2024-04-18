-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Nov-2023 às 11:38
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `teste`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `centrosdeadocao`
--

CREATE TABLE `centrosdeadocao` (
  `ID` int(3) NOT NULL,
  `NomeFantasia` varchar(30) NOT NULL,
  `CNPJ` varchar(20) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Celular` varchar(15) NOT NULL,
  `Instagram` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `centrosdeadocao`
--

INSERT INTO `centrosdeadocao` (`ID`, `NomeFantasia`, `CNPJ`, `Endereco`, `Celular`, `Instagram`, `Email`, `Senha`) VALUES
(2, 'JuninhoPets', '42.424.242/0001-44', 'Rua Tocantins, Bairro das Mangueiras, Cruzeiro SP', '(12) 99789-4458', '@juninhopets', 'junior@gmail.com', '123456'),
(7, 'PetLovers', '13.494.922/0001-44', 'Rua das Floras, 63, Jardim Primavera', '(12) 98136-7855', '@PetLovers', 'pet-lovers@gmail.com', '112233');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dadospets`
--

CREATE TABLE `dadospets` (
  `ID` int(3) NOT NULL,
  `Especie` varchar(20) NOT NULL,
  `Outro` varchar(20) NOT NULL,
  `Raca` varchar(20) NOT NULL,
  `Cor` varchar(30) NOT NULL,
  `Idade` varchar(10) NOT NULL,
  `TipoIdade` varchar(10) NOT NULL,
  `Porte` varchar(10) NOT NULL,
  `Sexo` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contato` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `dadospets`
--

INSERT INTO `dadospets` (`ID`, `Especie`, `Outro`, `Raca`, `Cor`, `Idade`, `TipoIdade`, `Porte`, `Sexo`, `Email`, `Contato`) VALUES
(26, 'Cão', '', 'Pastor Alemão', 'Preto', '2', 'Meses', 'Pequeno', 'Macho', 'adriana.silva@gmail.com', '(12) 99745-8635'),
(27, 'Felino', '', 'Siamês', 'Cinza', '3', 'Semanas', 'Pequeno', 'Macho', 'adriana.silva@gmail.com', '(12) 99745-8635'),
(28, 'Outro Tipo', 'Ave', 'Canário', 'Marrom', '1', 'Anos', 'Pequeno', 'Fêmea', 'pet-lovers@gmail.com ', '(12) 99752-3645'),
(29, 'Felino', '', 'American Shorthair', 'Branco', '9', 'Meses', 'Pequeno', 'Fêmea', 'pet-lovers@gmail.com ', '(12) 99752-3645'),
(30, 'Cão', '', 'Border Collie', 'Preto e Branco', '5', 'Meses', 'Pequeno', 'Macho', 'pet-lovers@gmail.com ', '(12) 99752-3645');

-- --------------------------------------------------------

--
-- Estrutura da tabela `doadores`
--

CREATE TABLE `doadores` (
  `ID` int(3) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `DataNascimento` varchar(10) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Celular` varchar(15) NOT NULL,
  `Instagram` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `doadores`
--

INSERT INTO `doadores` (`ID`, `Nome`, `CPF`, `DataNascimento`, `Sexo`, `Endereco`, `Celular`, `Instagram`, `Email`, `Senha`) VALUES
(2, 'Adriana Silva', '015.151.555-23', '23/05/1968', 'Feminino', 'rua joaquim manoel siqueira, 56', '(12) 99745-8635', '@adriana.silva', 'adriana.silva@gmail.com', '112233'),
(4, 'Gabriel Moreira', '445.125.452-48', '13/06/1997', 'Feminino', 'Avelino Junior, 361, Jardim S Jose', '(12) 98245-3658', '@gabriel.moreira', 'gabriel_moreira@fatec.sp.gov.br', '112233');

-- --------------------------------------------------------

--
-- Estrutura da tabela `test`
--

CREATE TABLE `test` (
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `test`
--

INSERT INTO `test` (`name`) VALUES
('samuhel');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(3) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CPF` varchar(15) NOT NULL,
  `DataNascimento` varchar(10) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Celular` varchar(15) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`ID`, `Nome`, `CPF`, `DataNascimento`, `Sexo`, `Endereco`, `Celular`, `Email`, `Senha`) VALUES
(6, 'Luiz Henrique Guedes', '425.415.265-38', '14/03/1997', 'Masculino', 'Rua das Araras, 45, mavisou', '(12) 98845-7256', 'Luiz.Guedes@hotmail.com', '112233'),
(7, 'Luiz Gustavo', '445.214.526-85', '14/05/1998', 'Masculino', 'Rua Sao Camilo, 47, VIla Brasil', '(12) 98145-7825', 'gustavo-luiz14@hotmail.com', '112233');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `centrosdeadocao`
--
ALTER TABLE `centrosdeadocao`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `dadospets`
--
ALTER TABLE `dadospets`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `doadores`
--
ALTER TABLE `doadores`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `centrosdeadocao`
--
ALTER TABLE `centrosdeadocao`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `dadospets`
--
ALTER TABLE `dadospets`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de tabela `doadores`
--
ALTER TABLE `doadores`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
