import './assets/styles/App.css'
import {useEffect, useState} from "react";
import {Product} from "./model/product.ts";
import Catalog from "./features/catalog/Catalog.tsx";
import axios from "axios";

function App() {
  const [products, setProduct] = useState<Product[]>([]);

    useEffect(() => {
        async function fetchProducts() {
            const res = await axios.get<Product[]>("api/products/")
            const data = res.data;
            setProduct(data)
        }
        fetchProducts()
    }, []);

  return (
      //JSX
      <div>
          <div>
              <Catalog products={products}/>
          </div>
      </div>
  )

}

export default App
