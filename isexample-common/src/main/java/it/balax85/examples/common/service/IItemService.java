package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.ItemDto;

import java.util.List;

/**
 * Created by andrea on 22/10/16.
 */
public interface IItemService {

    List<ItemDto> getItems();

}
