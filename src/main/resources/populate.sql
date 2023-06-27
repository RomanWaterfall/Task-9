INSERT INTO users (age, name, password,salary,surname)
VALUES
    (25, 'mmm', '$2a$12$EY1OsWztR/9oRCcXaFmLNO3zHCWXgoO0mw8QipmBZPeXRwVCBt2Fu', 3000, 'Мария'),
    (30, 'aaa', '$2a$12$EY1OsWztR/9oRCcXaFmLNO3zHCWXgoO0mw8QipmBZPeXRwVCBt2Fu', 5000, 'Алексей');
INSERT INTO roles (name)
values
    ('ROLE_ADMIN'),
    ('ROLE_USER');
INSERT INTO users_roles (users_id, role_id)
values
    (1, 1),
    (1, 2),
    (2,2);