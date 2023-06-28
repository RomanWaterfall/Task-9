-- CREATE TABLE IF NOT EXISTS Users (
--                                      id SERIAL PRIMARY KEY,
--                                      "username" VARCHAR(255) NOT NULL,
--                                      password VARCHAR(255) NOT NULL
-- );
-- ALTER TABLE users ADD CONSTRAINT unique_username UNIQUE (username);
-- ALTER TABLE users ADD COLUMN enabled boolean;
--
-- CREATE TABLE Role(
--                                     username varchar(255) NOT NULL,
--                                     authority varchar(255) NOT NULL,
--                                     FOREIGN KEY (username) REFERENCES users (username)
-- );
--
-- create table authorities(
--                             username varchar(255) NOT NULL,
--                             authority varchar(255) NOT NULL,
--                             FOREIGN KEY (username) REFERENCES users (username)
-- )
-- CREATE TABLE IF NOT EXISTS Users
-- (
--     id      SERIAL PRIMARY KEY,
--     "name"  VARCHAR(20),
--     surname VARCHAR(20),
--     age     VARCHAR(20),
--     salary  int
--  );
-- ALTER TABLE authorities ADD COLUMN username VARCHAR(255);
--ALTER TABLE users ADD COLUMN password VARCHAR(255);
--ALTER TABLE users ADD COLUMN enabled BOOLEAN;
-- CREATE TABLE users_roles (
--                              user_id BIGINT NOT NULL,
--                              role_id INT NOT NULL,
--                              PRIMARY KEY (user_id, role_id),
--                              FOREIGN KEY (user_id) REFERENCES users(id),
--                              FOREIGN KEY (role_id) REFERENCES roles(id)
-- );
--
--
-- ALTER TABLE users ADD COLUMN username VARCHAR(255);
--
-- ALTER TABLE users ADD COLUMN enabled BOOLEAN DEFAULT TRUE;
--

-- CREATE TABLE authorities (
--                              id SERIAL PRIMARY KEY,
--                              name VARCHAR(255) NOT NULL
-- );
--
-- ALTER TABLE authorities ALTER COLUMN name DROP NOT NULL;
--
--
-- UPDATE users SET id = 10 WHERE id = 1;
-- UPDATE users_roles SET user_id = 10 WHERE user_id = 1;
--
-- INSERT INTO users_roles (user_id,role_id) VALUES (1,1);
-- INSERT INTO users_roles (role_id) VALUES (1,1);
--


-- CREATE TABLE roles (
--                        id INT PRIMARY KEY,
--                        name VARCHAR(255)
-- );

INSERT INTO roles
values
    (1,'ROLE_ADMIN'),
    (2,'ROLE_USER');












-- INSERT INTO roles (username)
-- values
-- ('ROLE_USER'),('ROLE_ADMIN');
-- insert into users (username,password,age,salary)
-- values
-- ('user','$2a$12$EY1OsWztR/9oRCcXaFmLNO3zHCWXgoO0mw8QipmBZPeXRwVCBt2Fu',12,3000);
-- insert into users_roles (user_id,role_id) values (1,1)