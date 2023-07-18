
create sequence hibernate_sequence start with 1 increment by 1;

    create table cliente (
       id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        primary key (id)
    );

    create table produto (
       id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        preco double,
        quantidade integer,
        cliente_id bigint,
        primary key (id)
    );

    alter table produto 
       add constraint FK7mbtw084rx7hgg0xsgjfxpioi 
       foreign key (cliente_id) 
       references cliente;
