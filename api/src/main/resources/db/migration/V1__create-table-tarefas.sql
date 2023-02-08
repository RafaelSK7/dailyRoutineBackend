create table tarefas(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    horario varchar(5) not null,
    status tinyint,
    descricao varchar(100),


    primary key(id)

);