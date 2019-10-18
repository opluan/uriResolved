select products.name as name,
providers.name as name
from products
inner join providers on products.id_providers = providers.id
where id_categories=6;
