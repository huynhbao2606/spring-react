import { Product } from '../../model/product';

type CatalogProps = {
    products: Product[]
}

function Catalog({products}: CatalogProps){
    return (
        <ul>
            {products.map(product => (
                <li key={product.id}>
                    <h2>{product.name}</h2>
                    <p>{product.description}</p>
                    <p>{product.unitPrice}</p>
                    <p>{product.unitsInStock}</p>
                    <p>{product.brand}</p>
                    <p>{product.category}</p>
                </li>
            ))}
        </ul>
    )
}

export default Catalog;