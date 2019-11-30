create table operations (
    id      serial not null
        constraint operations_pk
            primary key,
    op1     integer,
    op2     integer,
    op      text,
    r       integer,
    user_id integer
);

create table users (
    id serial not null
        constraint users_pk
            primary key,
    name text,
    email text
);

