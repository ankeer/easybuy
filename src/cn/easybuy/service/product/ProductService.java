package cn.easybuy.service.product;

import cn.easybuy.entity.Product;

import java.util.List;

public interface ProductService {
	
	public boolean add(Product product);
	
	public boolean update(Product product);
	
	public boolean deleteProductById(Integer productId);
	
	public Product getProductById(Integer productId);
	
	public List<Product> getProductList(Integer currentPageNo,Integer pageSize,
										String proName,Integer categoryId,Integer level);
	
	public int count(String proName,Integer categoryId,Integer level);
	
	public boolean updateStock(Integer productId,Integer stock);
	
}
