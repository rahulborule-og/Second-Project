package com.grocerystore.grocery.store.service.implementation;

import com.grocerystore.grocery.store.dao.GroceryDao;
import com.grocerystore.grocery.store.entity.Groceries;
import com.grocerystore.grocery.store.exceptions.ReourceNotFound;
import com.grocerystore.grocery.store.mapper.DaoMappedtoEntity;
import com.grocerystore.grocery.store.mapper.EntityMappedtoDto;
import com.grocerystore.grocery.store.repository.GroRepoistory;
import com.grocerystore.grocery.store.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Implementations implements GroceryService {
    @Autowired
    private GroRepoistory grrepo;

    @Override
    public GroceryDao addGrocery(GroceryDao gdao) {
        Groceries gr1= DaoMappedtoEntity.maptoDao(gdao);
         Groceries addedGro=grrepo.save(gr1);
        return EntityMappedtoDto.mapEntitytoDto(gr1);
    }

    @Override
    public GroceryDao getGroceryDetail(Long id) {
        Groceries fetchedg=grrepo.findById(id).orElseThrow(()->new ReourceNotFound("This grocery does not exist"));
        return EntityMappedtoDto.mapEntitytoDto(fetchedg);

    }

    @Override
    public void deleteGrocery(Long id) {
        Groceries todeletegro=grrepo.findById(id).orElseThrow(()->new ReourceNotFound("This grocery does not exist"));
        grrepo.deleteById(id);
    }
}
