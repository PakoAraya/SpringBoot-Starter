
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

INSERT INTO products (name, brand, category, price, description, image_path) 
VALUES
-- Electronics
('Gaming Laptop Pro', 'GameMaster', 'Electronics', 2500.00, 'High-performance laptop for demanding gamers.', '/SpringBoot-Starter/images/Electronics/1836786.jpeg'),
('4K Ultra HD Smart TV', 'VisionMax', 'Electronics', 799.99, '4K Smart TV with vibrant colors and streaming apps.', '/SpringBoot-Starter/images/Electronics/1498054.jpeg'),
('Smartphone Z Ultra', 'PhoneTech', 'Electronics', 999.99, 'Latest generation smartphone with AI-powered camera.', '/SpringBoot-Starter/images/Electronics/3727659.jpeg'),
('Wireless Noise-Canceling Headphones', 'AudioPro', 'Accessories', 129.99, 'Compact high-quality headphones with noise cancellation.', '/SpringBoot-Starter/images/Electronics/280238.jpeg'),
('Portable Bluetooth Speaker', 'SoundBlaster', 'Accessories', 49.99, 'Portable speaker with powerful sound and long battery life.', '/SpringBoot-Starter/images/Electronics/3408742.jpeg'),

-- Appliances
('Smart Robot Vacuum', 'CleanBot', 'Appliances', 299.99, 'Automatic vacuum cleaner with intelligent navigation.', '/SpringBoot-Starter/images/Appliances/3289805.jpeg'),
('XL Air Fryer', 'CookMate', 'Appliances', 149.99, 'Large-capacity air fryer for healthy cooking.', '/SpringBoot-Starter/images/Appliances/4041077.jpeg'),
('Professional Espresso Machine', 'CafePro', 'Appliances', 399.99, 'Professional coffee machine with milk frother.', '/SpringBoot-Starter/images/Appliances/2964519.jpeg'),
('Smart Refrigerator', 'FreshMax', 'Appliances', 2000.00, 'Smart refrigerator with Wi-Fi and energy efficiency.', '/SpringBoot-Starter/images/Appliances/1230617.jpeg'),
('Quick Electric Kettle', 'QuickBoil', 'Appliances', 29.99, 'Fast-boiling electric kettle with safety features.', '/SpringBoot-Starter/images/Appliances/2397659.jpeg'),

-- Furnitures
('Ergonomic Office Chair', 'SitWell', 'Furniture', 189.99, 'Comfortable and adjustable office chair.', '/SpringBoot-Starter/images/Furnitures/4226127.jpeg'),
('Height-Adjustable Desk', 'WorkComfort', 'Furniture', 299.99, 'Height-adjustable desk for a healthier workspace.', '/SpringBoot-Starter/images/Furnitures/3136915.jpeg'),
('Modern Organizer Shelf', 'HomeStyle', 'Furniture', 89.99, 'Elegant shelving unit with ample storage space.', '/SpringBoot-Starter/images/Furnitures/3428215.jpeg'),
('Contemporary Sofa', 'ComfyHome', 'Furniture', 799.99, 'Contemporary sofa with comfortable cushions.', '/SpringBoot-Starter/images/Furnitures/3264726.jpeg'),
('Elegant Dining Set', 'DiningPlus', 'Furniture', 599.99, 'Elegant dining table with 6 chairs.', '/SpringBoot-Starter/images/Furnitures/3702156.jpeg'),

-- Fashion
('Smartwatch Series 8', 'TechWear', 'Fashion', 399.99, 'Latest smartwatch with health and fitness tracking.', '/SpringBoot-Starter/images/Fashion/2228571.jpeg'),
('Running Shoes', 'FitGear', 'Fashion', 129.99, 'Lightweight running shoes with maximum comfort.', '/SpringBoot-Starter/images/Fashion/1306062.jpeg'),
('Leather Wallet', 'StylePro', 'Fashion', 49.99, 'Premium leather wallet with RFID protection.', '/SpringBoot-Starter/images/Fashion/1852350.jpeg'),
('Winter Jacket', 'WarmWear', 'Fashion', 199.99, 'Insulated jacket for extreme cold climates.', '/SpringBoot-Starter/images/Fashion/4822190.jpeg'),
('Polarized Sunglasses', 'SunStyle', 'Fashion', 79.99, 'Polarized sunglasses with UV protection.', '/SpringBoot-Starter/images/Fashion/1671917.jpeg');

SELECT *
FROM products ;

