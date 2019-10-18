select products.id as id, products.name as name from products
inner join categories on products.id_categories = categories.id
where categories.name like 'super%';
