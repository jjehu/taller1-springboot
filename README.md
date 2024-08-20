> [!CAUTION]
>**puerto utilizado:** http://localhost:9090 o [presiona aquí](http://localhost:9090)

## [proy1](/proy1)
3-10ago : http://localhost:9090/api/prueb
> [!NOTE]
> Dependencias utilizadas:
> - springweb

## [proy2](/proy2)
*creamos la BD en postgresql de acuerdo a las propiedades del proyecto `application.properties`, en este caso la BD se llamará* `academia`
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

## [proy3](/proy3)
> [!NOTE]
> Dependencias utilizadas:
> - springweb

## [proy4](/proy4)
> [!NOTE]
> Dependencias utilizadas:
> - springweb

## [proy5](/proy5)
> [!NOTE]
> Dependencias utilizadas:
> - springweb

---
[Todos los proyectos](https://github.com/jjehu/taller1-springboot/tree/main)
