

   
    create sequence fornecedor_seq start with 1 increment by 50;

    create sequence produtos_seq start with 1 increment by 50;

    create table fornecedor (
        id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        primary key (id)
    );

    create table produtos (
        preco float(53),
        fornecedor_id bigint,
        id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        primary key (id)
    );

    alter table produtos 
       add constraint FKf7x1wtofw4bkn6119onhegexv 
       foreign key (fornecedor_id) 
       references fornecedor;

    create sequence fornecedor_seq start with 1 increment by 50;

    create sequence produtos_seq start with 1 increment by 50;

    create table fornecedor (
        id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        primary key (id)
    );

    create table produtos (
        preco float(53),
        fornecedor_id bigint,
        id bigint not null,
        descricao varchar(255),
        nome varchar(255),
        primary key (id)
    );

    alter table produtos 
       add constraint FKf7x1wtofw4bkn6119onhegexv 
       foreign key (fornecedor_id) 
       references fornecedor;
