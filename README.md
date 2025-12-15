![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Ignacio Andrés Ibáñez Fariña
- **Sección:** I_003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Modalidad Online

---

## 📘 Descripción general del sistema
Sistema de Gestión de Personal para la empresa salmonera Salmontt (Puerto Montt, Chile).

Versión 1.0: Modelo básico con clases Persona, Empleado y Direccion aplicando encapsulamiento, herencia y composición.

Versión 2.0: Sistema completo que carga empleados desde archivo, permite búsquedas por RUT y departamento, usa colecciones (ArrayList) y maneja excepciones.

Versión 3.0 (actual):Sistema completo con interfaz gráfica, polimorfismo y validación de tipos en tiempo de ejecución.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 SistemaGestionSalmontt/
│
├── 📁 src/
│   ├── 📁 ui/
│   │   └── Main.java              # Clase principal
│   │
│   ├── 📁 model/
│   │   ├── Registrable.java # Interfaz común para todas las entidades
│   |   ├── Persona.java # Clase base
│   |   ├── Empleado.java # Hereda de Persona, implementa Registrable
│   |   ├── Proveedor.java # Implementa Registrable
│   |   ├── Cliente.java # Implementa Registrable
│   |   └── Direccion.java # Clase de composición
│   │
│   ├── 📁 data/
│       ├── GestorEmpleados.java # Búsquedas y filtros
│       └── GestorEntidades.java # Gestión de colección polimórfica
│
│
│
├── 📄 empleados.txt
└── 📄 README.md
````
---
---

## 🎯 Funcionalidades Principales

### 1. Gestión de Entidades
- **Agregar Empleado** con validación de campos obligatorios
- **Agregar Proveedor** con datos específicos del rubro
- **Agregar Cliente** con información empresarial

### 2. Visualización y Consultas
- **Mostrar todas las entidades** con detalles específicos por tipo
- **Mostrar por tipo** usando `instanceof` para conteo diferenciado
- **Buscar por ID** con downcasting seguro según el tipo encontrado

### 3. Características Técnicas
- **Polimorfismo**: Todas las entidades implementan `Registrable`
- **Colección dinámica**: `ArrayList<Registrable>` almacena diferentes tipos
- **Validación en tiempo real**: Uso de `instanceof` para diferenciación de tipos
- **Interfaz amigable**: Menús y formularios con `JOptionPane`

---
⚙️ Instrucciones para clonar y ejecutar el proyecto
1. Clona el repositorio desde GitHub:
git clone https://github.com/Broskiwi/SistemaGestionSalmontt.git
2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos .txt estén correctamente ubicados.

4. Ejecuta el archivo Main.java desde el paquete ui.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).

---
**Repositorio GitHub:** \https://github.com/Broskiwi/SistemaGestionSalmontt.git
**Fecha de entrega:**

Sumativa 1 (v1.0): 09-11-2025
Sumativa 2 (v2.0): 23-11-2025
Sumativa 3 (v3.0): 15-12-2025

---

© Duoc UC | Escuela de Informática y Telecomunicaciones



