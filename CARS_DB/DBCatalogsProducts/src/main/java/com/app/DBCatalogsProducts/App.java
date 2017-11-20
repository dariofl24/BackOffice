package com.app.DBCatalogsProducts;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.hibernate.service.CatalogService;
import com.app.hibernate.srcs.Catalog;
import com.app.hibernate.srcs.Category;

public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("BeanLocations.xml");
    	
    	CatalogService service = (CatalogService) appContext.getBean("catalogService");
    	
		 //Catalog cat = new Catalog();
		 //cat.setName("Alfa Romeo");
		 //cat.setCatalogId("alfaRomeo");
		 
		 //service.saveCatalog(cat);
    	
    	List<Catalog> list=service.findAllCatalogs();
    	
    	System.out.println("Z: "+list.size());
    	
    	list.stream().forEach(new Consumer<Catalog>() {
    		
			public void accept(Catalog catalog) {
				System.out.println(catalog);
			}
			
		});
    	
    	Catalog mb=service.findById("mercedesBenz");
    	
    	System.out.println(mb);
    	
    	Category cat = new Category();
    	
    	cat.setCategoryId("mercedesBenz_currentModels");
    	cat.setDescription("Merces Benz current models".getBytes());
    	cat.setName("Merces Benz current models");
    	
    	
    }
}
