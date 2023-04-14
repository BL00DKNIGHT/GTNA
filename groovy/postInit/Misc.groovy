crafting.remove('enderstorage:ender_chest')
crafting.remove('enderstorage:ender_tank')
crafting.remove('enderstorage:ender_pouch')

crafting.addShaped('ender_chest', item('enderstorage:ender_storage:0'), [
        [ore('plateObsidian'), ore('wool'), ore('plateObsidian')],
        [ore('stickBlaze'), ore('chestEnder'), ore('stickBlaze')],
        [ore('plateObsidian'), item('appliedenergistics2:material:48'), ore('plateObsidian')]])

crafting.addShaped('ender_tank', item('enderstorage:ender_storage:1'), [
        [ore('stickBlaze'), ore('wool'), ore('stickBlaze')],
        [ore('paneGlass'), ore('enderpearl'), ore('paneGlass')],
        [ore('plateObsidian'), item('appliedenergistics2:material:48'), ore('plateObsidian')]])

crafting.addShaped('ender_pouch', item('enderstorage:ender_pouch'), [
        [ore('leather'), ore('enderpearl'), ore('leather')],
        [ore('wool'), metaitem('crate.wood'), ore('wool')],
        [ore('leather'), item('appliedenergistics2:material:47'), ore('leather')]])