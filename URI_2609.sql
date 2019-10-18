select categories.name as name, sum(products.amount) as sum from categories
inner join products on categories.id = products.id_categories
group by categories.name;
