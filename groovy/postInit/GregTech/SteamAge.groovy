//Imports

//Defs
def bronzehull = item('gregtech:steam_casing:0')
def brickbronzehull = item('gregtech:steam_casing:1')
def wroughthull = item('gregtech:steam_casing:3')
def steelhull = item('gregtech:steam_casing:2')
def pipe = metaitem('pipeTinyFluidBronze')

//Crafting table and furnace
crafting.addShapeless('gregtech:redalloycable', metaitem('cableGtSingleRedAlloy'), [metaitem('wireGtSingleRedAlloy'), ore('string'), ore('wool'), ore('string')])
crafting.addShapeless('gregtech:dust_redalloy', metaitem('dustRedAlloy'), [ore('dustCopper'), ore('dustRedstone'), ore('dustRedstone'), ore('dustRedstone'), ore('dustRedstone'), ore('dustRedstone')])
crafting.replaceShapeless('gregtech:dust_bronze', metaitem('dustBronze')*4, [ore('dustCopper'), ore('dustCopper'), ore('dustCopper'), ore('dustTin')])

crafting.addShaped('inefficientglasstube', metaitem('component.glass.tube')*2, [
        [null, ore('blockGlass'), null],
        [ore('blockGlass'), null, ore('blockGlass')],
        [null, ore('blockGlass'), null]])

furnace.add(ore('dustGlass'), item('minecraft:glass'), 0.5f)

//Steam machinery
crafting.replaceShaped('gregtech:steam_extractor_bronze', item('gregtech:machine', 7), [
    [pipe, pipe, pipe],
    [ore('craftingPiston'), bronzehull, ore('blockGlass')],
    [pipe, pipe, pipe]])

//Convenient recipes
hammer.recipeBuilder()
    .inputs(metaitem('ingotRubber')*3)
    .outputs(metaitem('plateRubber')*2)
    .duration(28)
    .EUt(16)
    .buildAndRegister()