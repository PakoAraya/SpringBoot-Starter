
-- Example Script to practice JPA on Spring Boot
CREATE TABLE products(
	id 						SERIAL PRIMARY KEY,
	name 					VARCHAR(200) UNIQUE NOT NULL,
	brand					VARCHAR(200) NOT NULL,
	category			VARCHAR(200) NOT NULL,
	price					NUMERIC(12, 2) NOT NULL CHECK (price > 0),
	description		TEXT,
	created_at			TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	image_path			VARCHAR(500)
);

INSERT INTO products (name, brand, category, price, description, image_path) 
VALUES
('Laptop Pro', 'TechBrand', 'Electronics', 1200.50, 'A high-end laptop with amazing features.', '/images/laptop-pro.jpg'),
('Smartphone X', 'PhoneMaker', 'Electronics', 899.99, 'A flagship smartphone with cutting-edge technology.', '/images/smartphone-x.jpg'),
('Wireless Headphones', 'AudioBrand', 'Accessories', 199.99, 'Noise-canceling wireless headphones.', '/images/headphones.jpg');


SELECT *
FROM products ;

