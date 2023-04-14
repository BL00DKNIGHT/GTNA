mods.hei.yeet(item('storagedrawers:keybutton:*'))
mods.hei.hide(item('storagedrawers:upgrade_creative:*'))

//Drawers
    //Controller
crafting.replaceShaped('storagedrawers:controller', item('storagedrawers:controller'), [
        [ore('plateStone'), ore('drawerBasic'), ore('plateStone')],
        [metaitem('crate.wood'), ore('circuitLv'), metaitem('crate.wood')],
        [ore('plateStone'), ore('drawerBasic'), ore('plateStone')]])

assembler.recipeBuilder()
    .inputs(ore('plateStone')*4, metaitem('crate.wood')*2, ore('drawerBasic')*2, ore('circuitLv'))
    .outputs(item('storagedrawers:controller'))
    .duration(20)
    .EUt(30)
    .buildAndRegister()
    //Slave
crafting.replaceShaped('storagedrawers:controller_slave', item('storagedrawers:controllerslave'), [
        [ore('plateStone'), ore('circuitUlv'), ore('plateStone')],
        [ore('chestWood'), ore('drawerBasic'), ore('chestWood')],
        [ore('plateStone'), ore('circuitUlv'), ore('plateStone')]])

assembler.recipeBuilder()
    .inputs(ore('plateStone')*4, ore('chestWood')*2, ore('drawerBasic'), ore('circuitUlv')*2)
    .outputs(item('storagedrawers:controllerslave'))
    .duration(20)
    .EUt(15)
    .buildAndRegister()
    //Compacting
crafting.replaceShaped('storagedrawers:compacting_drawer', item('storagedrawers:compdrawers'), [
        [ore('plateStone'), ore('craftingPiston'), ore('plateStone')],
        [ore('workbench'), ore('drawerBasic'), ore('workbench')],
        [ore('plateStone'), ore('craftingPiston'), ore('plateStone')]])

assembler.recipeBuilder()
    .inputs(ore('plateStone')*4, ore('workbench')*2, ore('drawerBasic'), ore('craftingPiston')*2)
    .outputs(item('storagedrawers:compdrawers'))
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Tanks
crafting.replaceShaped('fluiddrawers:tank', item('fluiddrawers:tank'), [
        [ore('plateIron'), ore('plateIron'), ore('plateIron')],
        [ore('paneGlass'), item('minecraft:bucket'), ore('paneGlass')],
        [ore('plateIron'), ore('plateIron'), ore('plateIron')]])

assembler.recipeBuilder()
    .inputs(ore('plateIron')*6, ore('paneGlass')*2, item('minecraft:bucket'))
    .outputs(item('fluiddrawers:tank'))
    .duration(10)
    .EUt(7)
    .buildAndRegister()
    //Drawer
/*def makingdrawerinput  = [item('minecraft:planks:0'), item('minecraft:planks:1'), item('minecraft:planks:2'), item('minecraft:planks:3'), item('minecraft:planks:4'), item('minecraft:planks:5')]
def basicdrawer1 = [item('storagedrawers:basicdrawers:0').withNbt(["material": "oak"]), item('storagedrawers:basicdrawers:0').withNbt(["material": "spruce"]), item('storagedrawers:basicdrawers:0').withNbt(["material": "birch"]), item('storagedrawers:basicdrawers:0').withNbt(["material": "jungle"]), item('storagedrawers:basicdrawers:0').withNbt(["material": "acacia"]), item('storagedrawers:basicdrawers:0').withNbt(["material": "dark_oak"])]
def basicdrawer2 = [item('storagedrawers:basicdrawers:1').withNbt(["material": "oak"]), item('storagedrawers:basicdrawers:1').withNbt(["material": "spruce"]), item('storagedrawers:basicdrawers:1').withNbt(["material": "birch"]), item('storagedrawers:basicdrawers:1').withNbt(["material": "jungle"]), item('storagedrawers:basicdrawers:1').withNbt(["material": "acacia"]), item('storagedrawers:basicdrawers:1').withNbt(["material": "dark_oak"])]
def basicdrawer4 = [item('storagedrawers:basicdrawers:2').withNbt(["material": "oak"]), item('storagedrawers:basicdrawers:2').withNbt(["material": "spruce"]), item('storagedrawers:basicdrawers:2').withNbt(["material": "birch"]), item('storagedrawers:basicdrawers:2').withNbt(["material": "jungle"]), item('storagedrawers:basicdrawers:2').withNbt(["material": "acacia"]), item('storagedrawers:basicdrawers:2').withNbt(["material": "dark_oak"])]

assembler.recipeBuilder()
    .inputs(makingdrawerinput.copy()*6, ore('chestWood'))
    .outputs(basicdrawer1)
    .duration(10)
    .EUt(7)
    .buildAndRegister()

assembler.recipeBuilder()
    .inputs(makingdrawerinput.copy()*7, ore('chestWood')*2)
    .outputs(basicdrawer2*2)
    .duration(10)
    .EUt(7)
    .buildAndRegister()

assembler.recipeBuilder()
    .inputs(makingdrawerinput.copy()*5, ore('chestWood')*4)
    .outputs(basicdrawer4*4)
    .duration(10)
    .EUt(7)
    .buildAndRegister()*/

//Upgrades
    //Template
crafting.replaceShaped('storagedrawers:upgrade_template', item('storagedrawers:upgrade_template')*2, [
        [ore('plateWood'), ore('stickWood'), ore('plateWood')],
        [ore('stickWood'), ore('drawerBasic'), ore('stickWood')],
        [ore('plateWood'), ore('stickWood'), ore('plateWood')]])

assembler.recipeBuilder()
    .inputs(ore('plateWood')*4, ore('stickWood')*4, ore('drawerBasic'))
    .outputs(item('storagedrawers:upgrade_template')*2)
    .duration(10)
    .EUt(7)
    .buildAndRegister()
    //Void
crafting.replaceShaped('storagedrawers:upgrade_void', item('storagedrawers:upgrade_void')*2, [
        [ore('plateObsidian'), ore('chestWood'), ore('plateObsidian')],
        [item('gregtech:item_pipe_normal:*'), item('storagedrawers:upgrade_template'), item('gregtech:item_pipe_normal:*')],
        [ore('plateObsidian'), ore('enderpearl'), ore('plateObsidian')]])

assembler.recipeBuilder()
    .inputs(ore('plateObsidian')*4, item('gregtech:item_pipe_normal:*')*2, ore('chestWood'), ore('enderpearl'), item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_void')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Conversion
crafting.replaceShaped('storagedrawers:upgrade_conversion', item('storagedrawers:upgrade_conversion')*2, [
        [ore('ingotIron'), ore('stickWood'), ore('ingotGold')],
        [ore('stickWood'), item('storagedrawers:upgrade_template'), ore('stickWood')],
        [ore('gemLapis'), ore('stickWood'), ore('gemLapis')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*4, ore('gemLapis')*2, ore('ingotIron'), ore('ingotGold'), item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_conversion')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Redstone Reg
crafting.replaceShaped('storagedrawers:upgrade_redstone_combined', item('storagedrawers:upgrade_redstone', 0)*2, [
        [item('minecraft:lever'), ore('stickWood'), item('minecraft:lever')],
        [ore('stickWood'), item('storagedrawers:upgrade_template'), ore('stickWood')],
        [ore('dustRedstone'), ore('stickWood'), ore('dustRedstone')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*4, ore('dustRedstone')*2, item('minecraft:lever')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_redstone', 0)*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Redstone Reg I
crafting.replaceShaped('storagedrawers:upgrade_redstone_max', item('storagedrawers:upgrade_redstone', 1)*2, [
        [ore('dustRedstone'), ore('chestWood'), ore('dustRedstone')],
        [ore('stickWood'), item('storagedrawers:upgrade_template'), ore('stickWood')],
        [ore('stickWood'), ore('dustRedstone'), ore('stickWood')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*4, ore('dustRedstone')*3, ore('chestWood'), item('storagedrawers:upgrade_template'))
    .notConsumable(metaitem('circuit.integrated').withNbt([Configuration: 1]))
    .outputs(item('storagedrawers:upgrade_redstone', 1)*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Redstone Reg II
crafting.replaceShaped('storagedrawers:upgrade_redstone_min', item('storagedrawers:upgrade_redstone', 2)*2, [
        [ore('stickWood'), ore('dustRedstone'), ore('stickWood')],
        [ore('stickWood'), item('storagedrawers:upgrade_template'), ore('stickWood')],
        [ore('dustRedstone'), ore('chestWood'), ore('dustRedstone')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*4, ore('dustRedstone')*3, ore('chestWood'), item('storagedrawers:upgrade_template'))
    .notConsumable(metaitem('circuit.integrated').withNbt([Configuration: 2]))
    .outputs(item('storagedrawers:upgrade_redstone', 2)*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Redstone I
crafting.replaceShaped('storagedrawers:upgrade_status_level1', item('storagedrawers:upgrade_status', 0)*2, [
        [item('minecraft:repeater'), ore('dustRedstone'), ore('craftingRedstoneTorch')],
        [ore('stickWood'), item('storagedrawers:upgrade_template'), ore('stickWood')],
        [ore('dustRedstone'), ore('stickWood'), ore('dustRedstone')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*3, ore('dustRedstone')*3, ore('craftingRedstoneTorch'), item('minecraft:repeater'), item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_status', 0)*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Redstone II
crafting.replaceShaped('storagedrawers:upgrade_status_level2', item('storagedrawers:upgrade_status', 1)*2, [
        [item('minecraft:repeater'), ore('craftingRedstoneTorch'), item('minecraft:comparator')],
        [ore('stickTreatedWood'), item('storagedrawers:upgrade_template'), ore('stickTreatedWood')],
        [ore('dustRedstone'), ore('stickTreatedWood'), ore('dustRedstone')]])

assembler.recipeBuilder()
    .inputs(ore('stickTreatedWood')*3, ore('dustRedstone')*2, ore('craftingRedstoneTorch'), item('minecraft:repeater'), item('minecraft:comparator'), item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_status', 1)*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //One Stack up
crafting.replaceShaped('storagedrawers:upgrade_one_stack', item('storagedrawers:upgrade_one_stack')*2, [
        [ore('stickWood'), ore('gemFlint'), ore('stickWood')],
        [ore('gemFlint'), item('storagedrawers:upgrade_template'), ore('gemFlint')],
        [ore('stickWood'), ore('gemFlint'), ore('stickWood')]])

assembler.recipeBuilder()
    .inputs(ore('stickWood')*4, ore('gemFlint')*4, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_one_stack')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Obsidian  - I   (NA)
crafting.replaceShaped('storagedrawers:upgrade_storage_obsidian', item('storagedrawers:upgrade_storage', 0)*2, [
        [ore('stickTreatedWood'), null, ore('stickTreatedWood')],
        [ore('plateObsidian'), item('storagedrawers:upgrade_template'), ore('plateObsidian')],
        [ore('stickTreatedWood'), null, ore('stickTreatedWood')]])

assembler.recipeBuilder()
    .inputs(ore('stickTreatedWood')*4, ore('plateObsidian')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_storage:0')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Wrought   - II  (LV)
crafting.replaceShaped('storagedrawers:upgrade_storage_iron', item('storagedrawers:upgrade_storage', 1)*2, [
        [ore('stickSteel'), null, ore('stickSteel')],
        [ore('plateWroughtIron'), item('storagedrawers:upgrade_template'), ore('plateWroughtIron')],
        [ore('stickSteel'), null, ore('stickSteel')]])

assembler.recipeBuilder()
    .inputs(ore('stickSteel')*4, ore('plateWroughtIron')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_storage:1')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Rose Gold - III (MV)
crafting.replaceShaped('storagedrawers:upgrade_storage_gold', item('storagedrawers:upgrade_storage', 2)*2, [
        [ore('stickAluminium'), null, ore('stickAluminium')],
        [ore('plateRoseGold'), item('storagedrawers:upgrade_template'), ore('plateRoseGold')],
        [ore('stickAluminium'), null, ore('stickAluminium')]])

assembler.recipeBuilder()
    .inputs(ore('stickAluminium')*4, ore('plateRoseGold')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_storage:2')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Diamond   - IV  (HV)
crafting.replaceShaped('storagedrawers:upgrade_storage_diamond', item('storagedrawers:upgrade_storage', 3)*2, [
        [ore('stickStainlessSteel'), null, ore('stickStainlessSteel')],
        [ore('plateDiamond'), item('storagedrawers:upgrade_template'), ore('plateDiamond')],
        [ore('stickStainlessSteel'), null, ore('stickStainlessSteel')]])

assembler.recipeBuilder()
    .inputs(ore('stickStainlessSteel')*4, ore('plateDiamond')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_storage:3')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
    //Emerald   - V   (EV)
crafting.replaceShaped('storagedrawers:upgrade_storage_emerald', item('storagedrawers:upgrade_storage', 4)*2, [
        [ore('stickTitanium'), null, ore('stickTitanium')],
        [ore('plateEmerald'), item('storagedrawers:upgrade_template'), ore('plateEmerald')],
        [ore('stickTitanium'), null, ore('stickTitanium')]])

assembler.recipeBuilder()
    .inputs(ore('stickTitanium')*4, ore('plateEmerald')*2, item('storagedrawers:upgrade_template'))
    .outputs(item('storagedrawers:upgrade_storage:4')*2)
    .duration(20)
    .EUt(7)
    .buildAndRegister()
