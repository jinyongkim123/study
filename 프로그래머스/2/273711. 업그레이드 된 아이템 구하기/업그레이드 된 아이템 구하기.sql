SELECT ITEM_ID, ITEM_NAME, RARITY FROM ITEM_INFO
WHERE ITEM_ID in (
    SELECT ITEM_ID FROM ITEM_TREE
        WHERE PARENT_ITEM_ID in (SELECT ITEM_ID FROM ITEM_INFO WHERE RARITY='RARE'))
ORDER BY ITEM_ID DESC




# select item_id, item_name, rarity
# from item_info
# where item_id in (
#     select item_id from item_tree
#         where parent_item_id in (select item_id from item_info where rarity = 'rare')
#     )
# order by item_id desc;