ALTER TABLE topicos ADD CONSTRAINT UK_topicos_titulo UNIQUE (titulo);
ALTER TABLE topicos ADD CONSTRAINT UK_topicos_mensaje UNIQUE (mensaje);