INSERT INTO cliente (id,cuit,mail,razon_social) VALUES (1,'272564564789','arg@hotmail.com','ARG_SRL');
INSERT INTO cliente (id,cuit,mail,razon_social) VALUES (2,'232564564711','antares@hotmail.com','antares');
INSERT INTO cliente (id,cuit,mail,razon_social) VALUES (3,'272565554789','papelitos@hotmail.com','papelitos');
INSERT INTO cliente (id,cuit,mail,razon_social) VALUES (4,'272789445589','imagine@hotmail.com','imagine');
INSERT INTO cliente (id,cuit,mail,razon_social) VALUES (5,'22323445589','ger@hotmail.com','ger s.a');

INSERT INTO especialidad (id,nombre) VALUES (11,'windows');
INSERT INTO especialidad (id,nombre) VALUES (12,'SAP');

INSERT INTO tecnico (id,telefono,mail,nombre) VALUES (101,'2214879856','jorgito78@hotmail.com','Jorge Cobo');
INSERT INTO tecnico (id,telefono,mail,nombre) VALUES (102,'2215647894','andy_bsso@hotmail.com','Andres Arruabarrena');
INSERT INTO tecnico (id,telefono,mail,nombre) VALUES (103,'2214567894','mariana_gls@hotmail.com','Mariana Lito');
INSERT INTO tecnico (id,telefono,mail,nombre) VALUES (104,'01145678943','martina_polska@hotmail.com','Martina Polska');

INSERT INTO tecnico_especialidades (especialidades_id,tecnico_id) VALUES (11,101);
INSERT INTO tecnico_especialidades (especialidades_id,tecnico_id) VALUES (12,104);


INSERT INTO servicio (nombre) VALUES ('windows');
INSERT INTO servicio (nombre) VALUES ('SAP');

INSERT INTO incidente (resuelto,fecha_Desde,fecha_estimada,fecha_hasta,id,alias,consideracion) VALUES (false,STR_TO_DATE('18/02/2019 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('20/02/2019 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('22/02/2019 11:15:45','%d/%m/%Y %H:%i:%s'),1,'windows','windows');
INSERT INTO incidente (resuelto,fecha_Desde,fecha_estimada,fecha_hasta,id,alias,consideracion) VALUES (true,STR_TO_DATE('18/02/2022 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('20/02/2022 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('22/02/2022 11:15:45','%d/%m/%Y %H:%i:%s'),2,'sap','SAP');
INSERT INTO incidente (resuelto,fecha_Desde,fecha_estimada,fecha_hasta,id,alias,consideracion) VALUES (false,STR_TO_DATE('18/02/2019 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('19/02/2019 11:15:45','%d/%m/%Y %H:%i:%s'),STR_TO_DATE('18/02/2019 16:15:45','%d/%m/%Y %H:%i:%s'),3,'windows','windows');


INSERT INTO tecnico_incidentes (tecnico_id,incidentes_id) VALUES (101,1);
INSERT INTO tecnico_incidentes (tecnico_id,incidentes_id) VALUES (104,2);
INSERT INTO tecnico_incidentes (tecnico_id,incidentes_id) VALUES (101,3);
