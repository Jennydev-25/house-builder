# 🏠 House Builder

> Aquí las casas se levantan paso a paso, con `.build()`

Proyecto en **Java 21** con **Maven** que aplica el patrón de diseño **Builder** (GoF) a una entidad `House`, permitiendo construir distintos tipos de casa a partir de una combinación de características (garaje, jardín, piscina, estatuas decorativas) de forma flexible, escalable y desacoplada. Desarrollado siguiendo **TDD** (**JUnit 5 + Hamcrest**), con cobertura de tests medida con **JaCoCo**.

---

## 📑 Índice

- [Descripción](#-descripción)
- [Tecnologías](#-tecnologías)
- [Autora](#-autora)

---

## 📋 Descripción

**House Builder** aplica el patrón de diseño creacional **Builder** a la entidad `House`, permitiendo construir distintos tipos de casa sin depender de un único constructor con todos los parámetros posibles.

Cada casa se construye combinando estas características:

- Garaje
- Jardín
- Piscina
- Estatuas decorativas

El builder se implementa mediante una interfaz (`IHouseBuilder`), con `HouseBuilder` como única implementación concreta.

---

## 🛠️ Tecnologías

- **[Java 21](https://www.oracle.com/java/technologies/downloads/)** — Lenguaje de programación del proyecto
- **[Apache Maven](https://maven.apache.org/)** — Gestor de dependencias y construcción del proyecto
- **[JUnit 5](https://junit.org/junit5/)** — Framework de tests unitarios
- **[Hamcrest](https://hamcrest.org/JavaHamcrest/)** — Librería de matchers para aserciones legibles
- **[JaCoCo](https://www.jacoco.org/jacoco/)** — Medición de la cobertura de tests
- **[Visual Studio Code](https://code.visualstudio.com/)** — Editor usado para desarrollar y gestionar el proyecto
- **[Markdown](https://www.markdownguide.org/)** — Lenguaje de marcado para el README
- **[Git](https://git-scm.com/)** / **[GitHub](https://github.com/)** — Control de versiones y alojamiento del proyecto

---

## 👩‍💻 Autora

**[Jenny Sánchez Requejo](https://github.com/Jennydev-25)**

[Volver arriba](#-house-builder-en-java)
