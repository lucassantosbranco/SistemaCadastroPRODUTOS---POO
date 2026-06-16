# 📦 Sistema de Cadastro de Produtos — POO

Sistema desenvolvido em **Java** com foco nos conceitos de **Programação Orientada a Objetos (POO)**, como parte das atividades acadêmicas da **ULBRA**. O projeto permite o cadastro, listagem e gerenciamento de produtos por meio de uma aplicação de linha de comando.

---

## 🚀 Funcionalidades

- Cadastro de produtos com atributos como nome, código, preço e quantidade
- Listagem de produtos cadastrados
- Aplicação dos pilares de POO: encapsulamento, herança, polimorfismo e abstração
- Estrutura organizada em pacotes (`br.ulbra`)

---

## 🛠️ Tecnologias utilizadas

- **Java** (100%)
- **NetBeans IDE** (projeto configurado com `nbproject/` e `build.xml`)
- **Apache Ant** (build system via `build.xml`)

---

## 📁 Estrutura do projeto

```
SistemaCadastroPRODUTOS---POO/
├── build/
│   └── classes/
│       └── br/ulbra/        # Classes compiladas
├── nbproject/               # Configurações do NetBeans
├── src/
│   └── br/ulbra/            # Código-fonte principal
├── build.xml                # Script de build (Ant)
├── manifest.mf              # Manifesto do JAR
└── README.md
```

---

## ▶️ Como executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/) instalado
- [NetBeans IDE](https://netbeans.apache.org/) (recomendado) **ou** Apache Ant

### Pelo NetBeans

1. Clone o repositório:
   ```bash
   git clone https://github.com/lucassantosbranco/SistemaCadastroPRODUTOS---POO.git
   ```
2. Abra o NetBeans e vá em **File → Open Project**
3. Selecione a pasta do projeto clonado
4. Clique em **Run Project** (F6)

### Pela linha de comando (Ant)

```bash
git clone https://github.com/lucassantosbranco/SistemaCadastroPRODUTOS---POO.git
cd SistemaCadastroPRODUTOS---POO
ant run
```

---

## 🎓 Conceitos de POO aplicados

| Conceito | Descrição |
|---|---|
| **Encapsulamento** | Atributos privados com getters e setters |
| **Herança** | Classes que estendem comportamentos base |
| **Polimorfismo** | Sobrescrita de métodos (`@Override`) |
| **Abstração** | Modelagem de entidades do mundo real em classes |

---

## 👤 Autor

**Lucas Santos Branco**  
 — ULBRA  
[GitHub](https://github.com/lucassantosbranco)

---

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos. Sinta-se livre para usá-lo como referência de estudo.
