package it.balax85.examples.core.service;

import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.service.IItemService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by andrea on 22/10/16.
 */
@Service
public class ItemService implements IItemService {
    @Override
    public List<ItemDto> getItems() {
        return Arrays.asList(new ItemDto(1L, "Core Item"));
    }
}
