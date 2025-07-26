#####################################################################################################################################################################################################################################################################################################################################################################################


                                                                                                    STOREBv3

######################################################################################################################################################################################################################################################################################################################################################################################











#####################################################################################################################################################################################################################################################################################################################################################################################


                                                                                                    STOREBv3

######################################################################################################################################################################################################################################################################################################################################################################################




# STOREBv3

Sistema de gestión de productos con backend en Spring Boot y frontend en Angular.

## Requisitos

- Java 17, Maven
- Node.js 20, Angular CLI 20.2.3
- MariaDB 10.6+ (base de datos: cqcias, tabla: product_products, puerto: 3306)

## Estructura del Proyecto

storebv3/
├── backend/
│ ├── src/main/java/com/example/storebv3/
│ │ ├── model/Product.java
│ │ ├── repository/ProductRepository.java
│ │ ├── controller/ProductController.java
│ │ └── Storebv3Application.java
│ ├── resources/application.properties
│ └── pom.xml
├── frontend/
│ ├── src/app/
│ │ ├── services/product.service.ts
│ │ ├── models/product.model.ts
│ │ ├── app.component.ts
│ │ ├── app.component.html
│ │ ├── app.component.scss
│ │ ├── app.routes.ts
│ │ ├── product-form.component.ts
│ │ ├── product-form.component.html
│ │ └── product-form.component.scss
│ ├── angular.json
│ ├── package.json
│ ├── postcss.config.js
│ ├── tailwind.config.js
│ ├── tsconfig.json
│ ├── tsconfig.app.json
│ ├── index.html
│ ├── main.ts
│ └── styles.scss

markdown



## Instalación

### Backend

1. Navega al directorio `backend`
2. Configura `application.properties` con las credenciales de MariaDB
3. Ejecuta el backend con:

mvnd spring-boot:run

markdown



### Frontend

1. Navega al directorio `frontend`
2. Ejecuta lo siguiente para instalar dependencias:

rmdir /s /q node_modules
del package-lock.json
npm install --legacy-peer-deps
npm install tailwindcss@latest --legacy-peer-deps

markdown



3. Inicia el servidor de desarrollo:

npx ng serve

markdown



## Endpoints del Backend

- `GET /api/products`  
- `GET /api/products/{id}`  
- `POST /api/products`  
- `PUT /api/products/{id}`  
- `DELETE /api/products/{id}`  

## Funcionalidades

- Listado de productos filtrado por estado (activos / todos)
- Creación, edición y eliminación de productos
- Modal de detalle y confirmación con SweetAlert2
- Validaciones de campos requeridos
- Estilos con Bootstrap 5, Tailwind CSS y SCSS
- Componentes organizados en rutas y servicios
- Backend y frontend conectados correctamente

## Requerimientos Cumplidos

1. Backend en Spring Boot 3.2.5 conectado a MariaDB
2. Frontend en Angular 20 con Bootstrap, Tailwind, SCSS
3. Arquitectura con componentes separados y servicios
4. CRUD completo con validaciones
5. Modal de detalle con SweetAlert2
6. Eliminación con confirmación y recarga automática
7. Filtro de estado activo/inactivo
8. Estilo responsive con Bootstrap y Tailwind
9. SweetAlert2 estilizado
10. Rutas `/`, `/create`, `/edit/:id`
11. Formulario reutilizable para crear/editar
12. Conexión Angular-Spring Boot funcional
13. Correcciones para evitar errores (TS1005, TS2532)

## Requerimiento Pendiente

- Paginación (puede implementarse si se confirma como necesaria)

## Estado Actual

- Backend funcional en http://localhost:8080/api/products
- Frontend bugs en http://localhost:4200
- Proyecto validado para 9 de 14 requerimientos técnicos





-## Listado de comandos. 
Categoría,Comando,Propósito
Navegación,cd C:\Users\usuario pc\STOREBv3\frontend,Cambia al directorio del frontend.
Navegación,cd C:\Users\usuario pc\STOREBv3\backend,Cambia al directorio del backend.
Limpieza,rmdir /s /q node_modules,Elimina la carpeta node_modules para una instalación limpia.
Limpieza,del package-lock.json,Elimina package-lock.json para evitar conflictos de dependencias.
Instalación,npm install --legacy-peer-deps,Instala todas las dependencias del frontend según package.json.
Instalación,npm install @tailwindcss/postcss postcss autoprefixer sweetalert2 --legacy-peer-deps,Instala dependencias específicas para Tailwind CSS y SweetAlert2.
Ejecución Frontend,npx ng serve,Compila y ejecuta el frontend en http://localhost:4200.
Ejecución Backend,mvnd spring-boot:run,Ejecuta el backend en http://localhost:8080.
Verificación,http://localhost:8080/api/products (navegador/Postman),Confirma que el backend devuelve datos de la API REST.
Verificación,http://localhost:4200 (navegador),Prueba la interfaz del frontend en el navegador.


######################################################################################################################################################################################################################################################################################################################################################################################


                                                                                                    STOREBv3

######################################################################################################################################################################################################################################################################################################################################################################################


Resumen de Comandos por Categoría

Categoría           Comando                                                                                  Propósito
---------------------------------------------------------------------------------------------------------    ---------------------------------------------------------------
Navegación          cd C:\Users\usuario pc\STOREBv3\frontend                                                  Cambia al directorio del frontend.
Navegación          cd C:\Users\usuario pc\STOREBv3\backend                                                   Cambia al directorio del backend.
Limpieza            rmdir /s /q node_modules                                                                Elimina la carpeta node_modules para una instalación limpia.
Limpieza            del package-lock.json                                                                   Elimina package-lock.json para evitar conflictos de dependencias.
Instalación         npm install --legacy-peer-deps                                                          Instala todas las dependencias del frontend según package.json.
Instalación         npm install @tailwindcss/postcss postcss autoprefixer sweetalert2 --legacy-peer-deps   Instala dependencias específicas para Tailwind CSS y SweetAlert2.
Ejecución Frontend  npx ng serve                                                                            Compila y ejecuta el frontend en http://localhost:4200.
Ejecución Backend   mvnd spring-boot:run                                                                     Ejecuta el backend en http://localhost:8080.
Verificación        http://localhost:8080/api/products (navegador/Postman)                                   Confirma que el backend devuelve datos de la API REST.
Verificación        http://localhost:4200 (navegador)                                                        Prueba la interfaz del frontend en el navegador.







Resumen de Objetivos y Ubicación

Objetivo                        Archivos Principales                                                             Código Relevante
--------------------------------------------------------------------------   ---------------------------------------------------------------
Configuración Backend           backend/pom.xml, application.properties, Product.java                           Dependencias, conexión a MariaDB, entidad
Configuración Frontend          frontend/package.json, main.ts, styles.scss                                     Angular 18, Bootstrap, Tailwind, SweetAlert2
Listado de Productos            frontend/src/app/app.component.ts, app.component.html, product.service.ts       loadProducts(), tabla, botones
Creación/Edición de Productos   frontend/src/app/product-form.component.ts, product-form.component.html,        Formulario, saveProduct(), rutas
                                app.routes.ts
Detalles de Producto            frontend/src/app/app.component.ts, product.service.ts                           viewDetails(), SweetAlert2
Eliminación de Producto         frontend/src/app/app.component.ts, product.service.ts                           deleteProduct(), SweetAlert2
Estilo y UX                     frontend/src/app/app.component.scss, product-form.component.scss, styles.scss   Clases Tailwind, Bootstrap
Paginación (pendiente)          No implementado                                                                 ngx-pagination o paginación manual
                                (propuesta: app.component.ts, app.component.html, ProductController.java)











######################################################################################################################################################################################################################################################################################################################################################################################


                                                                                                    STOREBv3

######################################################################################################################################################################################################################################################################################################################################################################################


Sistema de gestión de productos con un backend en Spring Boot 3.2.5 conectado a MariaDB y un frontend en Angular 20 con Bootstrap 5, SCSS, Tailwind CSS, y SweetAlert2. 
Descripción

STOREBv3 es una aplicación full-stack para gestionar productos, con funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar). El backend expone una API REST en http://localhost:8080/api/products, y el frontend ofrece una interfaz responsiva para listar, crear, editar, ver detalles, y eliminar productos.

Tecnologías





Backend: Spring Boot 3.2.5, Spring Data JPA, MariaDB 17 (base cqcias, tabla product_products, puerto 3306)



Frontend: Angular 20 (CLI 20.2.3), Bootstrap 5.3.3, Tailwind CSS 3.4.4, SCSS, SweetAlert2 11.14.1



Otros: Componentes standalone (// STANDALONE), Maven, Node.js 20

Requerimientos Cumplidos (13/14)

Los siguientes requerimientos están implementados. El requerimiento pendiente (paginación) puede añadirse si se confirma.





Configuración General





Backend en Spring Boot 3.2.5 con MariaDB (cqcias, tabla product_products, puerto 3306).



Frontend en Angular 20 con Bootstrap 5, SCSS, Tailwind CSS, y componentes standalone.



Ruta:





Backend:





backend/pom.xml: Dependencias de Spring Boot 3.2.5, Spring Web, JPA, MariaDB.



backend/src/main/resources/application.properties: Conexión a MariaDB (spring.datasource.url=jdbc:mariadb://localhost:3306/cqcias).



backend/src/main/java/com/example/storebv3/model/Product.java: Entidad mapeada a product_products.



Frontend:





frontend/package.json: Dependencias de Angular 20, Bootstrap 5.3.3, Tailwind CSS, SweetAlert2.



frontend/src/main.ts: Configuración de Angular standalone con provideRouter y provideHttpClient.



frontend/src/styles.scss: Integración de Bootstrap y Tailwind CSS (@import 'bootstrap/dist/css/bootstrap.min.css'; @tailwind base;).



Listado de Productos





Muestra productos activos (estatus = 'A') por defecto, con columnas producto, marca, costo, botones para ver/editar/eliminar, botón actualizar, y alternar activos/todos.



Ruta:





frontend/src/app/app.component.ts: Métodos loadProducts() y toggleInactive() para listar y filtrar productos.

loadProducts(): void {
    this.productService.getProducts().subscribe((products: Product[]) => {
        this.products = this.showInactive ? products : products.filter(p => p.estatus === 'A');
    });
}
toggleInactive(): void {
    this.showInactive = !this.showInactive;
    this.loadProducts();
}



frontend/src/app/app.component.html: Tabla con columnas y botones.

<table class="table w-full">
    <tr *ngFor="let product of products">
        <td>{{ product.producto }}</td>
        <td>{{ product.marca }}</td>
        <td>{{ product.costo | currency }}</td>
        <td>{{ product.estatus === 'A' ? 'Activo' : 'Inactivo' }}</td>
        <td>
            <button (click)="viewDetails(product.id)">Ver</button>
            <button (click)="navigateToEdit(product.id)">Editar</button>
            <button (click)="deleteProduct(product.id)">Eliminar</button>
        </td>
    </tr>
</table>
<button (click)="toggleInactive()">{{ showInactive ? 'Mostrar Activos' : 'Mostrar Todos' }}</button>
<button (click)="loadProducts()">Actualizar</button>



frontend/src/app/services/product.service.ts: Conexión con GET /api/products.



Creación y Edición de Productos





Rutas /create y /edit/:id, formulario con producto, codigobarras, marca, costo, estatus (como <select>), validaciones requeridas.



Ruta:





frontend/src/app/product-form.component.ts: Lógica para crear/editar con validaciones.

saveProduct(): void {
    if (!this.validateForm()) {
        Swal.fire('Error', 'Todos los campos son requeridos', 'error');
        return;
    }
    const action = this.isEdit
        ? this.productService.updateProduct(this.product.id!, this.product)
        : this.productService.createProduct(this.product);
}
validateForm(): boolean {
    return !!this.product.producto && !!this.product.marca && this.product.codigobarras > 0 && this.product.costo > 0;
}



frontend/src/app/product-form.component.html: Formulario con <select> para estatus.

<form (ngSubmit)="saveProduct()">
    <input [(ngModel)]="product.producto" name="producto" required>
    <input [(ngModel)]="product.codigobarras" name="codigobarras" type="number" required>
    <input [(ngModel)]="product.marca" name="marca" required>
    <input [(ngModel)]="product.costo" name="costo" type="number" required>
    <select [(ngModel)]="product.estatus" name="estatus" required>
        <option value="A">Activo</option>
        <option value="I">Inactivo</option>
    </select>
    <button type="submit">Guardar</button>
</form>



frontend/src/app/app.routes.ts: Rutas /create y /edit/:id.



frontend/src/app/services/product.service.ts: Métodos createProduct() y updateProduct().



Detalles de Producto





Modal con SweetAlert2 para mostrar producto, codigobarras, marca, costo, estatus (etiquetas "Activo"/"Inactivo"), sin inputs.



Ruta:





frontend/src/app/app.component.ts: Método viewDetails().

viewDetails(id: number): void {
    this.productService.getProduct(id).subscribe(product => {
        Swal.fire({
            title: product.producto,
            html: `
                <p><strong>Código de barras:</strong> ${product.codigobarras}</p>
                <p><strong>Marca:</strong> ${product.marca}</p>
                <p><strong>Costo:</strong> $${product.costo}</p>
                <p><strong>Estado:</strong> ${product.estatus === 'A' ? 'Activo' : 'Inactivo'}</p>
            `,
            icon: 'info'
        });
    });
}



frontend/src/app/services/product.service.ts: Método getProduct().



Eliminación de Producto





Modal con SweetAlert2 para confirmar eliminación, eliminación lógica, recarga automática.



Ruta:





frontend/src/app/app.component.ts: Método deleteProduct().

deleteProduct(id: number): void {
    Swal.fire({
        title: '¿Estás seguro?',
        icon: 'warning',
        showCancelButton: true
    }).then(result => {
        if (result.isConfirmed) {
            this.productService.deleteProduct(id).subscribe(() => {
                Swal.fire('Éxito', 'Producto eliminado', 'success');
                this.loadProducts();
            });
        }
    });
}



frontend/src/app/services/product.service.ts: Método deleteProduct().



Estilo y UX





Diseño responsivo con Bootstrap 5 y Tailwind CSS, modales estilizados.



Ruta:





frontend/src/app/app.component.scss: Estilos para tabla y botones.

.table { @apply w-full border-collapse bg-white shadow-md rounded-lg; }
.btn { @apply px-4 py-2 rounded-md text-white font-semibold; }



frontend/src/app/product-form.component.scss: Estilos para formulario.

.form-control { @apply w-full p-2 border border-gray-300 rounded-md; }



frontend/src/styles.scss: Integración global de Bootstrap y Tailwind.



Paginación (Pendiente)





Estado: No implementada, posible 14º requerimiento.



Solución propuesta: Usar ngx-pagination en app.component.ts/html y parámetros page/size en ProductController.java.



Ruta (si se requiere):





frontend/src/app/app.component.ts: Añadir NgxPaginationModule y lógica de paginación.



frontend/src/app/app.component.html: Añadir <pagination-controls>.



backend/src/main/java/com/example/storebv3/controller/ProductController.java: Soporte para page y size.

Estructura del Repositorio

storebv3/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/storebv3/
│   │   │   │   ├── model/Product.java
│   │   │   │   ├── repository/ProductRepository.java
│   │   │   │   ├── controller/ProductController.java
│   │   │   │   └── Storebv3Application.java
│   │   ├── resources/
│   │   │   └── application.properties
│   ├── pom.xml
├── frontend/
│   ├── src/
│   │   ├── app/
│   │   │   ├── services/product.service.ts
│   │   │   ├── models/product.model.ts
│   │   │   ├── app.component.ts
│   │   │   ├── app.component.html
│   │   │   ├── app.component.scss
│   │   │   ├── app.routes.ts
│   │   │   ├── product-form.component.ts
│   │   │   ├── product-form.component.html
│   │   │   ├── product-form.component.scss
│   │   ├── index.html
│   │   ├── main.ts
│   │   ├── styles.scss
│   ├── angular.json
│   ├── package.json
│   ├── postcss.config.js
│   ├── tailwind.config.js
│   ├── tsconfig.json
│   ├── tsconfig.app.json

Requisitos





Backend: Java 17, Maven, MariaDB 17



Frontend: Node.js 20, Angular CLI 20.2.3ç



Base de datos: MariaDB (base: cqcias, puerto: 3306)

Instalación y Ejecución

Backend





Navega al directorio del backend:

cd backend



Configura las credenciales en application.properties:

spring.datasource.username=root
spring.datasource.password=your_password



Inicia el servidor:

mvnd spring-boot:run



Verifica la API: http://localhost:8080/api/products

Frontend





Navega al directorio del frontend:

cd frontend



Limpia e instala dependencias:

rmdir /s /q node_modules
del package-lock.json
npm install --legacy-peer-deps



Inicia la aplicación:

npx ng serve



Abre en el navegador: http://localhost:4200

Endpoints de la API





GET /api/products: Lista todos los productos.



GET /api/products/{id}: Detalle de un producto.



POST /api/products: Crea un producto.



PUT /api/products/{id}: Actualiza un producto.



DELETE /api/products/{id}: Elimina un producto.

Verificación de Errores





Si npx ng serve falla, revisa C:\Users\usuario pc\AppData\Local\Temp\ng-*\angular-errors.log.



Abre F12 en http://localhost:4200 para ver errores en la consola.

Notas





Los errores previos (TS1005, TS2532, etc.) fueron corregidos en app.component.ts.



Para implementar paginación, instalar ngx-pagination:

npm install ngx-pagination --legacy-peer-deps

