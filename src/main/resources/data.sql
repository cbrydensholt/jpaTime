INSERT INTO Category (name) VALUES ('Electronics');
INSERT INTO Category (name) VALUES ('Sports');
INSERT INTO Category (name) VALUES ('Gaming');

INSERT INTO Company_description(description) VALUES ('Tech Giant');

INSERT INTO Company (name, company_description_id) VALUES ('apple', 1);

INSERT INTO Product (description, price, product_name, company_id) VALUES ('mac laptop 17', 2500, 'Macbook 2017', 1);

INSERT INTO product_categories (products_id, categories_id) VALUES (1,1);

INSERT INTO Company VALUES (1, 'Apple', 1);


