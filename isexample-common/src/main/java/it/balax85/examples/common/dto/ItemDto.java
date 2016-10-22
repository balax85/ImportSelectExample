package it.balax85.examples.common.dto;

/**
 * Created by andrea on 22/10/16.
 */
public class ItemDto {

    private Long id;

    private String itemName;

    public ItemDto() {

    }

    public ItemDto(Long id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemDto itemDto = (ItemDto) o;

        if (!id.equals(itemDto.id)) return false;
        return itemName.equals(itemDto.itemName);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + itemName.hashCode();
        return result;
    }
}
