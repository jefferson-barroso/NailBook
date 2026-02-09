# 💅 NailBook

Sistema de agendamento para manicures desenvolvido para treinar **Java (Spring Boot)** no backend e **Angular** no frontend, seguindo boas práticas de arquitetura, organização de projeto e desenvolvimento ágil.

---

## 📌 Sobre o Projeto

O **NailBook** nasceu para resolver um problema comum em pequenos negócios de beleza: o gerenciamento de horários ainda é frequentemente feito via WhatsApp, papel ou planilhas, o que pode gerar conflitos de agenda, esquecimentos e dificuldade de organização.

Este sistema permite que clientes agendem horários de forma simples enquanto a manicure mantém total controle sobre sua agenda.

> ⚠️ Este projeto foi construído com mentalidade de produto real, simulando o fluxo de trabalho de um time de engenharia — incluindo backlog, sprints e evolução contínua.

---

## 🎯 Objetivo

Este projeto tem como foco principal:

* Praticar desenvolvimento **fullstack**
* Aplicar conceitos de **arquitetura MVC**
* Implementar **autenticação segura com JWT**
* Trabalhar com **regras de negócio reais** (conflito de horários, disponibilidade, cancelamentos)
* Simular um ambiente de desenvolvimento profissional

---

## 🧠 Arquitetura

O sistema segue a arquitetura **MVC (Model-View-Controller)** no backend:

**Model** → Entidades e regras de domínio
**View** → Responsabilidade do Angular (frontend)
**Controller** → Exposição dos endpoints da API

Além disso, o projeto utiliza uma separação em camadas:

```
controller → service → repository → database
```

Essa abordagem melhora a organização do código, facilita testes e aproxima o projeto de padrões utilizados no mercado.

---

## 🛠️ Tecnologias

### 🔙 Backend

* Java
* Spring Boot
* Spring Data JPA
* Spring Security
* JWT
* PostgreSQL
* Maven

### 🔜 Frontend

* Angular
* TypeScript
* RxJS
* Angular Router
* Reactive Forms

---

## 👥 Perfis do Sistema

### 💅 Manicure (Admin)

* Definir horários disponíveis
* Visualizar agenda
* Cancelar agendamentos

### 🙋 Cliente

* Criar conta
* Fazer login
* Visualizar horários disponíveis
* Realizar agendamentos
* Cancelar horários

---

## 🚀 Funcionalidades do MVP

* Autenticação de usuários
* Cadastro de clientes
* Criação de horários disponíveis pela manicure
* Agendamento de serviços
* Bloqueio automático de horários ocupados
* Cancelamento de agendamentos
* Visualização da agenda diária

---

## 🔮 Roadmap (Evoluções Futuras)

* Docker
* Deploy em cloud
* Testes automatizados
* Documentação com Swagger
* Sistema multi-tenant (várias manicures)
* Notificações

---

## ▶️ Como Executar o Projeto

### Backend

```bash
# clonar repositório
git clone https://github.com/jefferson-barroso/NailBook

# entrar na pasta
cd nailbook-backend

# rodar aplicação
./mvnw spring-boot:run
```

### Frontend

```bash
cd nailbook-frontend
npm install
ng serve
```

---

## 💡 Status do Projeto

🚧 Em desenvolvimento

Este projeto está sendo construído de forma incremental, priorizando qualidade de código, boas práticas e clareza arquitetural.

---


