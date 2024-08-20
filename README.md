> [!CAUTION]
>**puerto utilizado:** http://localhost:9090 o [presiona aquí](http://localhost:9090)

## [proy1](/proy1)
num 3 - 10ago : http://localhost:9090/api/prueb
> [!NOTE]
> Dependencias utilizadas:
> - springweb

> [!TIP]
> En `proy1` se realiza:
> - creacción del proyecto utilizando [spring initializr](https://start.spring.io/).
> - creación de `proy1/src/main/java/com/pyto/taller/controller/Prueba.java` [link](proy1/src/main/java/com/pyto/taller/controller/Prueba.java) (controlador y la clase prueba).
> - cambio del puerto del servidor `proy1/target/classes/application.properties` [link](proy1/target/classes/application.properties) mediante `server.port=9090`.

## [proy2](/proy2)
*Se requiere crear la BD en postgresql de acuerdo a las propiedades del proyecto `application.properties`, en este caso la BD se llamará* `academia`
```sql
CREATE DATABASE academia;
```
*creamos las tablas*
```sql
create table personal(
	codper serial not null,
	nombre varchar(40) not null,
	ap varchar(40),
	am varchar(40),
	estado integer default 1 not null,
	primary key(codper)
);
```
*insertamos datos y realizamos una consulta*
```sql
insert into personal values(1, 'JOSE','MIRANDA','MERCADO',1);
insert into personal values(2, 'RAUL','ARANDIA','GUZMAN',1);
select * from personal;
```
> [!NOTE]
> Dependencias utilizadas:
> - springweb
> - posgresql
> - jpa
> - jdbc

> [!TIP]
> En `proy2` se realiza:
> - Insertacion de dependencias en el `pom.xml`:
> 	- posgresql
> 	- jpa
> 	- jdbc
>  - creación de BD en postgresql
>  - creación de:
> 	- `proy2/src/main/java/com/pyto/taller/controller/PersonalController.java` [link](proy2/src/main/java/com/pyto/taller/controller/PersonalController.java)
>  	- `proy2/src/main/java/com/pyto/taller/model/PersonalModel.java` [link](proy2/src/main/java/com/pyto/taller/model/PersonalModel.java)
>  	- `proy2/src/main/java/com/pyto/taller/repository/PersonalRepo.java` [link](proy2/src/main/java/com/pyto/taller/repository/PersonalRepo.java)

## [proy3](/proy3)
> [!NOTE]
> Dependencias utilizadas:
> - springweb
> - posgresql
> - jpa
> - jdbc

## [proy4](/proy4)
> [!NOTE]
> Dependencias utilizadas:
> - springweb
> - posgresql
> - jpa
> - jdbc

## [proy5](/proy5)
> [!NOTE]
> Dependencias utilizadas:
> - springweb
> - posgresql
> - jpa
> - jdbc

---
[Todos los proyectos](https://github.com/jjehu/taller1-springboot/tree/main)

[.](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
