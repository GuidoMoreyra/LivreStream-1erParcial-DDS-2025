
# 📺 LivreStream - Primera Parte del Primer Parcial (Diseño de Sistemas - 2025)

Este proyecto corresponde a la **primera parte del primer parcial** de la materia **Diseño de Sistemas (DDS)**, cursada en el año 2025.  
La consigna consiste en modelar e implementar las funcionalidades básicas de una plataforma ficticia de transmisión de video en vivo, llamada **LivreStream**, inspirada en Twitch pero con foco en mayor control, transparencia y flexibilidad para usuarios y streamers.

---

## 🧾 Enunciado

Podés encontrar el enunciado completo en el archivo:

📄 [`[DDSi] [2025] Primer Parcial - LivreStream - Primera Parte.docx`](https://docs.google.com/document/d/1RbQ2l2eZEts7aJ0oj9sL3NVzaD4Zzv1MqsjoMZCKAgE/edit?usp=sharing)

---

## 🎯 Funcionalidades requeridas

En esta primera etapa, el sistema debe permitir:

- Registro de personas internas y creación de un canal.
- Inicio y finalización de transmisiones en vivo.
- Listado de:
  - Canales registrados.
  - Transmisiones en curso.
  - Transmisiones pasadas de un canal.
- Unirse a una transmisión en curso como participante.
- Envío y lectura de mensajes en el chat de la transmisión.
- Suscripciones a canales.
- Envío de muestras de apoyo anónimas a canales (valor simbólico de 1 a 10).

---

## 🛠️ Estructura del proyecto

El proyecto se organiza en torno a las siguientes clases principales:

- `Canal`: representa a cada streamer/usuario administrador.
- `Transmicion`: representa una transmisión en curso o pasada.
- `Mensaje`: representa mensajes enviados al chat.
- `RepositorioDeCanales`: gestiona los canales registrados en la plataforma (Singleton).

---

## 📚 Notas adicionales

- Esta implementación asume una **única muestra de apoyo por usuario a cada canal**, manteniendo el anonimato desde el punto de vista del canal.
- No se implementa lógica de red ni transmisión real de video/audio.
- Las categorías asignadas a transmisiones son textos libres.

---

## 🧑‍🏫 Materia

- **Diseño de Sistemas**
- Universidad Tecnológica Nacional (UTN)
- Año: 2025
- Parcial 1 - LivreStream
