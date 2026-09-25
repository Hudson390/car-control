# 🚗 Sistema de Controle de Carro (Car Control System)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

<p align="center">
  <strong>Simulador interativo de controle de veículo via console (CLI), desenvolvido em Java com Programação Orientada a Objetos (POO).</strong>
</p>

[Sobre](#-sobre-o-projeto) •
[Funcionalidades](#-funcionalidades) •
[Regras de Negócio](#-regras-de-negócio-e-marchas) •
[Como Executar](#-como-executar) •
[Estrutura](#-estrutura-do-projeto) •
[Autor](#-autor)

---

</div>

## 📌 Sobre o Projeto

O **Sistema de Controle de Carro** é uma aplicação em console que simula o funcionamento realista do painel de bordo e da dinâmica de condução de um automóvel. O sistema gerencia estados como ignição, engate de marchas sincronizado com faixas de velocidade, aceleração progressiva, frenagem e esterçamento seguro.

---

## ⚡ Funcionalidades

- 🔑 **Partida e Desligamento Seguros**: O carro só desliga se estiver completamente parado (0 KM/H) e em ponto morto (Marcha 0).
- ⚙️ **Câmbio Manual (6 Marchas)**: Progressão e redução de marchas com validação de limites de velocidade.
- 🏎️ **Aceleração e Frenagem Escalonadas**: Cada marcha possui um teto e piso operacional com incremento/decremento de `10 KM/H`.
- 🔄 **Controle de Direção (Curvas)**: Sistema de segurança que restringe manobras (virar para a esquerda/direita) apenas entre `1` e `40 KM/H`.
- 📟 **Painel de Bordo em Tempo Real**: Exibição contínua da velocidade atual, marcha engatada e status do motor.
- 🧹 **Console Dinâmico**: Limpeza automática de tela para uma experiência limpa e fluida no terminal.

---

## 🎯 Regras de Negócio e Marchas

Para acelerar ou desacelerar, o motorista precisa respeitar a correlação entre a velocidade atual e a marcha engatada:

| Marcha | Faixa de Aceleração | Faixa de Redução | Velocidade Máxima da Marcha |
| :---: | :---: | :---: | :---: |
| **0** (Neutro) | Desengatado | — | 0 KM/H |
| **1ª Marcha** | 0 a 19 KM/H | 20 a 10 KM/H | 20 KM/H |
| **2ª Marcha** | 20 a 39 KM/H | 40 a 21 KM/H | 40 KM/H |
| **3ª Marcha** | 40 a 59 KM/H | 60 a 41 KM/H | 60 KM/H |
| **4ª Marcha** | 60 a 79 KM/H | 80 a 61 KM/H | 80 KM/H |
| **5ª Marcha** | 80 a 99 KM/H | 100 a 81 KM/H | 100 KM/H |
| **6ª Marcha** | 100 a 119 KM/H | 120 a 101 KM/H | 120+ KM/H |

> ⚠️ **Atenção:** Manobras de curva (Esquerda/Direita) só são permitidas com o carro ligado e em velocidade entre **1 KM/H** e **40 KM/H**. Em velocidades superiores, o sistema emite alerta de segurança para diminuir a velocidade.

---

## 🖥️ Demonstração do Menu Interativo

```text
======= Painel =======
Velocidade: 0 KM/H
Marcha: 0
Status: Carro Desligado
======================
Digite a opção: 
1 - Ligar Carro
2 - Desligar Carro
3 - Acelerar
4 - Diminuir velocidade
5 - Virar para Esquerda
6 - Virar para Direita
7 - Verificar velocidade
8 - Trocar de marcha
9 - Reduzir marcha
0 - Sair do Carro
```

---

## 🚀 Como Executar

### Pré-requisitos
- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/) instalado na máquina.
- Git instalado (opcional, para clonar o repositório).

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Hudson390/car-control.git
   cd car-control
   ```

2. **Compile as classes:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Inicie o simulador:**
   ```bash
   java -cp bin App
   ```

*(Alternativamente, basta abrir a pasta na sua IDE de preferência como IntelliJ IDEA, Eclipse ou VS Code e executar a classe `App.java`).*

---

## 📁 Estrutura do Projeto

```text
sistema-controle-carro/
├── src/
│   ├── App.java          # Ponto de entrada (Main), loop de execução e menu interativo
│   ├── Car.java          # Lógica de negócio, validações de marcha, velocidade e estado
│   └── Clearscreen.java  # Utilitário para renovação visual do console
├── .gitignore
└── README.md
```

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (Orientação a Objetos)
- **Estruturas:** Switch Expressions (Java 14+), Encapsulamento, Validações de Fluxo e Condicionais

---

## 👤 Autor

Desenvolvido por **[Hudson](https://github.com/Hudson390)**.

Sinta-se à vontade para enviar pull requests, reportar issues ou sugerir novas melhorias!
