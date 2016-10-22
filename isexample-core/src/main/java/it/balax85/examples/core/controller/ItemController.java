package it.balax85.examples.core.controller;

import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andrea on 22/10/16.
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    private IItemService itemService;

    @Autowired
    public ItemController(IItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping
    public List<ItemDto> getItems() {
        return itemService.getItems();
    }

}
