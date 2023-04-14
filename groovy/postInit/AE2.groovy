import gregtech.api.metatileentity.multiblock.CleanroomType

def glasscable = item('appliedenergistics2:part:16')
def fboule = item('gtna:boule.fluix')
def fwafer = item('gtna:wafer.fluix')

mods.hei.hide(item('appliedenergistics2:facade', 0))
mods.hei.hide(item('appliedenergistics2:encoded_pattern'))
mods.hei.yeet(item('threng:machine', 5))
mods.hei.yeet(item('threng:machine', 2))
mods.hei.yeet(item('threng:machine', 1))
mods.hei.yeet(item('threng:machine'))
mods.hei.yeet(item('threng:material', 3))
mods.hei.yeet(item('threng:material', 5))
mods.hei.yeet(item('threng:material', 6))
mods.hei.yeet(item('threng:material', 7))
mods.hei.yeet(item('threng:material', 8))
mods.hei.yeet(item('threng:material', 9))
mods.hei.yeet(item('threng:material', 10))
mods.hei.yeet(item('threng:material', 11))
mods.hei.yeet(item('threng:material', 12))
mods.hei.yeet(item('threng:material', 13))
mods.hei.yeet(item('appliedenergistics2:material', 0))
mods.hei.yeet(item('appliedenergistics2:material', 1))
mods.hei.yeet(item('appliedenergistics2:material', 2))
mods.hei.yeet(item('appliedenergistics2:material', 3))
mods.hei.yeet(item('appliedenergistics2:material', 4))
mods.hei.yeet(item('appliedenergistics2:material', 5))
mods.hei.yeet(item('appliedenergistics2:material', 6))
mods.hei.yeet(item('appliedenergistics2:material', 7))
mods.hei.yeet(item('appliedenergistics2:material', 8))
mods.hei.yeet(item('appliedenergistics2:material', 10))
mods.hei.yeet(item('appliedenergistics2:material', 11))
mods.hei.yeet(item('appliedenergistics2:material', 12))
mods.hei.yeet(item('appliedenergistics2:material', 40))
mods.hei.yeet(item('appliedenergistics2:material', 45))
mods.hei.yeet(item('appliedenergistics2:material', 46))
mods.hei.yeet(item('appliedenergistics2:material', 49))
mods.hei.yeet(item('appliedenergistics2:material', 51))
mods.hei.yeet(item('ae2fc:fluid_assembler'))
mods.hei.yeet(item('ae2fc:fluid_pattern_encoder'))

//Removing Cells base recipes
crafting.remove('appliedenergistics2:tools/network_portable_cell')
crafting.remove('appliedenergistics2:network/blocks/storage_chest')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_1k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_4k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_16k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_64k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_1k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_4k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_16k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_64k_part')

crafting.remove('appliedenergistics2:network/cells/storage_cell_1k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_4k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_16k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_64k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_64k')

crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_1k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_4k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_16k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_64k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_64k')

//Removing AE2 related GT items
crafting.remove('gregtech:bolt_saw_CrystalFluix')
crafting.remove('gregtech:screw_CrystalFluix')
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('lubricant')])
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('distilled_water') * 3])
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('water') * 4])

//Removing Misc
crafting.remove('appliedenergistics2:network/blocks/energy_energy_cell')
crafting.remove('appliedenergistics2:network/blocks/energy_dense_energy_cell')
crafting.remove('appliedenergistics2:network/blocks/io_condenser')
crafting.remove('ae2fc:fluid_discretizer')
crafting.remove('appliedenergistics2:network/blocks/fluid_interfaces_interface')
crafting.remove('appliedenergistics2:network/blocks/interfaces_interface')
crafting.remove('appliedenergistics2:materials/annihilationcore')
crafting.remove('appliedenergistics2:materials/formationcore')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_monitor')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_unit')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_accelerator')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_1k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_4k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_16k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_64k')
crafting.remove('appliedenergistics2:network/cables/glass_fluix')
crafting.remove('appliedenergistics2:network/parts/quartz_fiber_part')
crafting.remove('appliedenergistics2:network/crafting/patterns_blank')
crafting.remove('threng:pau')
crafting.remove('threng:machine_core')
crafting.remove('threng:steel_process_dust')
crafting.remove('threng:level_maintainer')
crafting.remove('threng:ma_frame')
crafting.remove('threng:ma_vent')
crafting.remove('threng:ma_mod_pattern')
crafting.remove('threng:ma_mod_cpu')
crafting.remove('threng:ma_io_port')
crafting.remove('threng:ma_controller')
crafting.remove('ae2wtlib:booster_card_old')
crafting.remove('wct:wct')
crafting.remove('ae2fc:fluid_packet_decoder')
crafting.remove('ae2fc:ingredient_buffer')
crafting.remove('ae2fc:large_ingredient_buffer')
crafting.remove('ae2fc:burette')
crafting.remove('wct:magnet_card')

//Crafting Table Recipes
crafting.addShapeless('magnetcardlv', item('wct:magnet_card'), [item('appliedenergistics2:material:28'), metaitem('item_magnet.lv')])
crafting.addShapeless('magnetcardhv', item('wct:magnet_card'), [item('appliedenergistics2:material:28'), metaitem('item_magnet.hv')])
crafting.addShaped('portable_cell', item('appliedenergistics2:portable_cell').withNbt(["internalCurrentPower": 200000.0D, "internalMaxPower": 200000.0D]), [
        [metaitem('wireGtSingleRedAlloy'), metaitem('screwSteel'), metaitem('wireGtSingleRedAlloy')],
        [metaitem('plateWroughtIron'), ore('paneGlass'), metaitem('plateWroughtIron')],
        [metaitem('boltWroughtIron'), metaitem('crate.wood'), metaitem('boltWroughtIron')]])

crafting.addShaped('me_chest', item('appliedenergistics2:chest'), [
        [ore('blockGlass'), ore('itemIlluminatedPanel'), ore('blockGlass')],
        [metaitem('plateDoubleSteel'), glasscable, metaitem('plateDoubleSteel')],
        [metaitem('screwCrystalFluix'), item('appliedenergistics2:energy_cell'), metaitem('screwCrystalFluix')]])

crafting.addShaped('energy_cell', item('appliedenergistics2:energy_cell'), [
        [metaitem('plateCertusQuartz'), ore('dustCrystalFluix'), metaitem('plateCertusQuartz')],
        [ore('dustCrystalFluix'), item('appliedenergistics2:quartz_glass'), ore('dustCrystalFluix')],
        [metaitem('plateCertusQuartz'), ore('dustCrystalFluix'), metaitem('plateCertusQuartz')]])

crafting.addShaped('dense_energy_cell', item('appliedenergistics2:dense_energy_cell'), [
        [metaitem('plateCrystalFluix'), glasscable, metaitem('plateCrystalFluix')],
        [item('appliedenergistics2:energy_cell'), item('appliedenergistics2:material:23'), item('appliedenergistics2:energy_cell')],
        [metaitem('plateCrystalFluix'), glasscable, metaitem('plateCrystalFluix')]])

crafting.addShaped('condenser', item('appliedenergistics2:condenser'), [
        [metaitem('plateDoubleStainlessSteel'), metaitem('electric.piston.ev'), metaitem('plateDoubleStainlessSteel')],
        [glasscable, item('gregtech:machine:233'), glasscable],
        [metaitem('plateDoubleStainlessSteel'), metaitem('electric.piston.ev'), metaitem('plateDoubleStainlessSteel')]])

crafting.addShaped('discretizer', item('ae2fc:fluid_discretizer'), [
        [metaitem('plateDoubleStainlessSteel'), item('appliedenergistics2:fluid_interface'), metaitem('plateDoubleStainlessSteel')],
        [metaitem('robot.arm.ev'), item('appliedenergistics2:condenser'), metaitem('fluid.regulator.ev')],
        [metaitem('plateDoubleStainlessSteel'), item('appliedenergistics2:interface'), metaitem('plateDoubleStainlessSteel')]])

crafting.addShaped('packet_decoder', item('ae2fc:fluid_packet_decoder'), [
        [metaitem('plateStainlessSteel'), metaitem('conveyor.module.ev'), metaitem('plateStainlessSteel')],
        [glasscable, item('appliedenergistics2:fluid_interface'), glasscable],
        [metaitem('plateStainlessSteel'), item('threng:material:4'), metaitem('plateStainlessSteel')]])

crafting.addShaped('burette', item('ae2fc:burette'), [
        [metaitem('plateStainlessSteel'), glasscable, metaitem('plateStainlessSteel')],
        [metaitem('electric.pump.ev'), item('ae2fc:dual_interface'), metaitem('conveyor.module.ev')],
        [metaitem('plateStainlessSteel'), glasscable, metaitem('plateStainlessSteel')]])

crafting.addShaped('gtna:buffer', item('ae2fc:ingredient_buffer'), [
        [metaitem('plateCertusQuartz'), ore('AnnhilationCore'), metaitem('plateCertusQuartz')],
        [item('appliedenergistics2:quartz_glass'), item('ae2fc:dual_interface'), item('appliedenergistics2:quartz_glass')],
        [metaitem('plateCertusQuartz'), ore('FormationCore'), metaitem('plateCertusQuartz')]])

crafting.addShaped('largebuffer', item('ae2fc:large_ingredient_buffer'), [
        [metaitem('plateCrystalFluix'), item('ae2fc:ingredient_buffer'), metaitem('plateCrystalFluix')],
        [item('ae2fc:ingredient_buffer'), ore('EntropyCore'), item('ae2fc:ingredient_buffer')],
        [metaitem('plateCrystalFluix'), item('ae2fc:ingredient_buffer'), metaitem('plateCrystalFluix')]])

crafting.addShaped('maintainer', item('threng:machine:4'), [
        [metaitem('plateSteel'), item('appliedenergistics2:part:280'), metaitem('plateSteel')],
        [item('appliedenergistics2:material:22'), item('appliedenergistics2:interface'), item('appliedenergistics2:material:22')],
        [metaitem('plateSteel'), item('appliedenergistics2:material:53'), metaitem('plateSteel')]])

crafting.addShaped('fmaintainer', item('ae2fc:fluid_level_maintainer'), [
        [metaitem('plateAluminium'), item('appliedenergistics2:part:281'), metaitem('plateAluminium')],
        [item('appliedenergistics2:material:24'), item('appliedenergistics2:fluid_interface'), item('appliedenergistics2:material:24')],
        [metaitem('plateAluminium'), item('appliedenergistics2:material:53'), metaitem('plateAluminium')]])

crafting.addShaped('pau', item('threng:machine:3'), [
        [metaitem('plateBlackSteel'), item('appliedenergistics2:crafting_accelerator'), metaitem('plateBlackSteel')],
        [item('appliedenergistics2:material:22'), item('threng:material:4'), item('appliedenergistics2:material:22')],
        [metaitem('plateBlackSteel'), item('appliedenergistics2:interface'), metaitem('plateBlackSteel')]])

crafting.addShaped('ma_casing', item('threng:big_assembler:0')*4, [
        [metaitem('plateCrystalFluix'), item('appliedenergistics2:molecular_assembler'), metaitem('plateCrystalFluix')],
        [metaitem('conveyor.module.iv'), item('appliedenergistics2:smooth_sky_stone_block'), metaitem('conveyor.module.iv')],
        [metaitem('plateCrystalFluix'), item('appliedenergistics2:molecular_assembler'), metaitem('plateCrystalFluix')]])

crafting.addShaped('ma_vent', item('threng:big_assembler:1')*2, [
        [item('threng:big_assembler:0'), metaitem('electric.motor.iv'), null],
        [metaitem('item_filter'), metaitem('rotorTitanium'), null],
        [null, null, null]])

crafting.addShaped('ma_controller', item('threng:big_assembler:2'), [
        [item('threng:big_assembler:1'), item('appliedenergistics2:molecular_assembler'), item('threng:big_assembler:1')],
        [metaitem('robot.arm.iv'), item('threng:material:4'), metaitem('robot.arm.iv')],
        [item('threng:big_assembler:1'), item('appliedenergistics2:interface'), item('threng:big_assembler:1')]])

crafting.addShaped('ma_pattern', item('threng:big_assembler:3')*2, [
        [item('threng:big_assembler:0'), item('appliedenergistics2:material:58'), item('threng:big_assembler:0')],
        [glasscable, item('appliedenergistics2:interface'), glasscable],
        [item('threng:big_assembler:0'), item('appliedenergistics2:material:58'), item('threng:big_assembler:0')]])

crafting.addShaped('ma_cpu', item('threng:big_assembler:4')*2, [
        [item('threng:big_assembler:0'), glasscable, item('threng:big_assembler:0')],
        [item('appliedenergistics2:crafting_accelerator'), item('appliedenergistics2:molecular_assembler'), item('appliedenergistics2:crafting_accelerator')],
        [item('threng:big_assembler:0'), glasscable, item('threng:big_assembler:0')]])

crafting.addShaped('ma_io', item('threng:big_assembler:5'), [
        [item('threng:big_assembler:1'), metaitem('conveyor.module.iv'), item('threng:big_assembler:1')],
        [metaitem('plateCrystalFluix'), item('appliedenergistics2:io_port'), metaitem('plateCrystalFluix')],
        [item('threng:big_assembler:1'), item('appliedenergistics2:material:35'), item('threng:big_assembler:1')]])

//Item Interfaces
crafting.addShaped('interfacelv', item('appliedenergistics2:interface'), [
        [metaitem('plateSteel'), ore('circuitMv'), metaitem('plateSteel')],
        [metaitem('conveyor.module.lv'), metaitem('crate.wood'), metaitem('conveyor.module.lv')],
        [metaitem('plateSteel'), ore('circuitMv'), metaitem('plateSteel')]])

crafting.addShaped('interfacemv', item('appliedenergistics2:interface')*2, [
        [metaitem('plateAluminium'), ore('AnnhilationCore'), metaitem('plateAluminium')],
        [metaitem('conveyor.module.mv'), metaitem('crate.wood'), metaitem('conveyor.module.mv')],
        [metaitem('plateAluminium'), ore('FormationCore'), metaitem('plateAluminium')]])

crafting.addShaped('interfacehv', item('appliedenergistics2:interface')*4, [
        [metaitem('plateStainlessSteel'), ore('AnnhilationCore'), metaitem('plateStainlessSteel')],
        [metaitem('conveyor.module.hv'), metaitem('crate.bronze'), metaitem('conveyor.module.hv')],
        [metaitem('plateStainlessSteel'), ore('FormationCore'), metaitem('plateStainlessSteel')]])

crafting.addShaped('interfaceev', item('appliedenergistics2:interface')*8, [
        [metaitem('plateTitanium'), ore('AnnhilationCore'), metaitem('plateTitanium')],
        [metaitem('conveyor.module.ev'), metaitem('crate.bronze'), metaitem('conveyor.module.ev')],
        [metaitem('plateTitanium'), ore('FormationCore'), metaitem('plateTitanium')]])

crafting.addShaped('interfaceiv', item('appliedenergistics2:interface')*16, [
        [metaitem('plateTungstenSteel'), ore('AnnhilationCore'), metaitem('plateTungstenSteel')],
        [metaitem('conveyor.module.iv'), metaitem('crate.steel'), metaitem('conveyor.module.iv')],
        [metaitem('plateTungstenSteel'), ore('FormationCore'), metaitem('plateTungstenSteel')]])

//Fluid Interfaces
crafting.addShaped('fluidinterfacelv', item('appliedenergistics2:fluid_interface'), [
        [metaitem('plateSteel'), ore('circuitMv'), metaitem('plateSteel')],
        [metaitem('electric.pump.lv'), metaitem('drum.wood'), metaitem('electric.pump.lv')],
        [metaitem('plateSteel'), ore('circuitMv'), metaitem('plateSteel')]])

crafting.addShaped('fluidinterfacemv', item('appliedenergistics2:fluid_interface')*2, [
        [metaitem('plateAluminium'), ore('AnnhilationCore'), metaitem('plateAluminium')],
        [metaitem('electric.pump.mv'), metaitem('drum.wood'), metaitem('electric.pump.mv')],
        [metaitem('plateAluminium'), ore('FormationCore'), metaitem('plateAluminium')]])

crafting.addShaped('fluidinterfacehv', item('appliedenergistics2:fluid_interface')*4, [
        [metaitem('plateStainlessSteel'), ore('AnnhilationCore'), metaitem('plateStainlessSteel')],
        [metaitem('electric.pump.hv'), metaitem('drum.bronze'), metaitem('electric.pump.hv')],
        [metaitem('plateStainlessSteel'), ore('FormationCore'), metaitem('plateStainlessSteel')]])

crafting.addShaped('fluidinterfaceev', item('appliedenergistics2:fluid_interface')*8, [
        [metaitem('plateTitanium'), ore('AnnhilationCore'), metaitem('plateTitanium')],
        [metaitem('electric.pump.ev'), metaitem('drum.bronze'), metaitem('electric.pump.ev')],
        [metaitem('plateTitanium'), ore('FormationCore'), metaitem('plateTitanium')]])

crafting.addShaped('fluidinterfaceiv', item('appliedenergistics2:fluid_interface')*16, [
        [metaitem('plateTungstenSteel'), ore('AnnhilationCore'), metaitem('plateTungstenSteel')],
        [metaitem('electric.pump.iv'), metaitem('drum.steel'), metaitem('electric.pump.iv')],
        [metaitem('plateTungstenSteel'), ore('FormationCore'), metaitem('plateTungstenSteel')]])


//Blank Patterns
crafting.addShaped('blankpatternlv', item('appliedenergistics2:material:52'), [
        [metaitem('boltCrystalFluix'), ore('plateRubber'), metaitem('boltCrystalFluix')],
        [ore('plateRubber'), ore('circuitLv'), ore('plateRubber')],
        [ore('dustCertusQuartz'), metaitem('plateSteel'), ore('dustCertusQuartz')]])
crafting.addShaped('blankpatternmv', item('appliedenergistics2:material:52')*2, [
        [metaitem('boltCrystalFluix'), ore('platePlastic'), metaitem('boltCrystalFluix')],
        [ore('platePlastic'), ore('circuitMv'), ore('platePlastic')],
        [ore('gemCertusQuartz'), metaitem('plateAluminium'), ore('gemCertusQuartz')]])
crafting.addShaped('blankpatternhv', item('appliedenergistics2:material:52')*4, [
        [metaitem('boltCrystalFluix'), ore('platePolyvinylChloride'), metaitem('boltCrystalFluix')],
        [ore('platePolyvinylChloride'), ore('circuitHv'), ore('platePolyvinylChloride')],
        [ore('gemCertusQuartz'), metaitem('plateStainlessSteel'), ore('gemCertusQuartz')]])
crafting.addShaped('blankpatternev', item('appliedenergistics2:material:52')*8, [
        [metaitem('boltCrystalFluix'), ore('platePolytetrafluoroethylene'), metaitem('boltCrystalFluix')],
        [ore('platePolytetrafluoroethylene'), ore('circuitEv'), ore('platePolytetrafluoroethylene')],
        [ore('gemFlawlessCertusQuartz'), metaitem('plateTitanium'), ore('gemFlawlessCertusQuartz')]])
crafting.addShaped('blankpatterniv', item('appliedenergistics2:material:52')*16, [
        [metaitem('boltCrystalFluix'), ore('platePolybenzimidazole'), metaitem('boltCrystalFluix')],
        [ore('platePolybenzimidazole'), ore('circuitIv'), ore('platePolybenzimidazole')],
        [ore('gemExquisiteCertusQuartz'), metaitem('plateTungstenSteel'), ore('gemExquisiteCertusQuartz')]])

//Storage Components
assembler.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()
assembler.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()

assembler.recipeBuilder() //4k Item
    .inputs(metaitem('crate.bronze'), ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*8, ore('circuitHv'), metaitem('screwCrystalFluix')*4, metaitem('plateAluminium'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(64)
    .buildAndRegister()
assembler.recipeBuilder() //4k Item
    .inputs(metaitem('crate.bronze'), metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*8, ore('circuitHv'), metaitem('screwCrystalFluix')*4, metaitem('plateAluminium'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(64)
    .buildAndRegister()
assembler.recipeBuilder() //16k Item
    .inputs(metaitem('crate.steel'), metaitem('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*16, ore('circuitEv')*2, metaitem('screwCrystalFluix')*6, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
assembler.recipeBuilder() //16k Item
    .inputs(metaitem('crate.steel'), metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*16, ore('circuitEv')*2, metaitem('screwCrystalFluix')*6, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
assembler.recipeBuilder() //64k Item
    .inputs(metaitem('crate.aluminium'), metaitem('gemExquisiteNetherQuartz'), ore('FormationCore')*4, ore('AnnhilationCore')*4, metaitem('wireFineRedAlloy')*32, ore('circuitIv')*2, metaitem('screwCrystalFluix')*8, metaitem('plateTitanium'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
assembler.recipeBuilder() //64k Item
    .inputs(metaitem('crate.aluminium'), metaitem('gemExquisiteCertusQuartz'), ore('FormationCore')*4, ore('AnnhilationCore')*4, metaitem('wireFineRedAlloy')*32, ore('circuitIv')*2, metaitem('screwCrystalFluix')*8, metaitem('plateTitanium'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()

assembler.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
assembler.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
assembler.recipeBuilder() //4k Fluid
    .inputs(metaitem('drum.bronze'), ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*8, ore('circuitHv'), metaitem('screwCrystalFluix')*4, metaitem('plateElectrum'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(64)
    .buildAndRegister()
assembler.recipeBuilder() //4k Fluid
    .inputs(metaitem('drum.bronze'), metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*8, ore('circuitHv'), metaitem('screwCrystalFluix')*4, metaitem('plateElectrum'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(64)
    .buildAndRegister()
assembler.recipeBuilder() //16k Fluid
    .inputs(metaitem('drum.steel'), ore('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*16, ore('circuitEv')*2, metaitem('screwCrystalFluix')*6, metaitem('plateChrome'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(256)
    .buildAndRegister()
assembler.recipeBuilder() //16k Fluid
    .inputs(metaitem('drum.steel'), metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*16, ore('circuitEv')*2, metaitem('screwCrystalFluix')*6, metaitem('plateChrome'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(256)
    .buildAndRegister()
assembler.recipeBuilder() //64k Fluid
    .inputs(metaitem('drum.aluminium'), ore('gemExquisiteNetherQuartz'), ore('FormationCore')*4, ore('AnnhilationCore')*4, metaitem('wireFineBlueAlloy')*32, ore('circuitIv')*2, metaitem('screwCrystalFluix')*8, metaitem('platePlatinum'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(256)
    .buildAndRegister()
assembler.recipeBuilder() //64k Fluid
    .inputs(metaitem('drum.aluminium'), metaitem('gemExquisiteCertusQuartz'), ore('FormationCore')*4, ore('AnnhilationCore')*4, metaitem('wireFineBlueAlloy')*32, ore('circuitIv')*2, metaitem('screwCrystalFluix')*8, metaitem('platePlatinum'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(256)
    .buildAndRegister()

//Cheaper Storage Components
assembler.recipeBuilder() //4k Item
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, item('gtna:plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(240)
    .buildAndRegister()
assembler.recipeBuilder() //4k Item
    .inputs( metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, item('gtna:plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(240)
    .buildAndRegister()
assembler.recipeBuilder() //4k Fluid
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, item('gtna:plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
assembler.recipeBuilder() //4k Fluid
    .inputs(metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, item('gtna:plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
assembler.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, item('gtna:plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
assembler.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, item('gtna:plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
assembler.recipeBuilder() //16k Fluid
    .inputs(ore('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, item('gtna:plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
assembler.recipeBuilder() //16k Fluid
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, item('gtna:plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
assembler.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteNetherQuartz'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*16, item('gtna:plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
assembler.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*16, item('gtna:plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
assembler.recipeBuilder() //64k Fluid
    .inputs(ore('gemExquisiteNetherQuartz'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*16, item('gtna:plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
assembler.recipeBuilder() //64k Fluid
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*16, item('gtna:plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
//Cores
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessNetherQuartz'), ore('circuitLv'), metaitem('wireFineBlueAlloy')*8, metaitem('boltInvar')*4)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:44')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessCertusQuartz'), ore('circuitLv'), metaitem('wireFineRedAlloy')*8, metaitem('boltSteel')*4)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:43')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessNetherQuartz'), item('gtna:plate.basic_fluix_systematic_chip'), metaitem('wireFineBlueAlloy')*4, metaitem('boltInvar')*2, metaitem('plateNetherQuartz'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:44')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessCertusQuartz'), item('gtna:plate.basic_fluix_systematic_chip'), metaitem('wireFineRedAlloy')*4, metaitem('boltSteel')*2, metaitem('plateCertusQuartz'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:43')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('foilPolyvinylChloride')*8, metaitem('gemFlawlessCrystalFluix'), ore('circuitHv')*2, metaitem('wireFineElectrum')*16, metaitem('screwAnnealedCopper')*8)
    .fluidInputs(fluid('quartzite')*288)
    .outputs(item('gtna:entropycore'))
    .duration(600) 
    .EUt(480)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(ore('EntropyCore'), metaitem('plateCertusQuartz'), metaitem('screwCrystalFluix')*4, item('threng:material:1')*2, metaitem('wireFinePlatinum')*8, ore('circuitEv'))
    .outputs(item('threng:material:4'))
    .fluidInputs(fluid('quartzite')*144)
    .duration(400) 
    .EUt(480)
    .buildAndRegister()

//Wireless related
assline.recipeBuilder() //put this on hardmode
    .inputs(item('wct:wct'), item('ae2wtlib:infinity_booster_card')*2, metaitem('emitter.luv')*8, metaitem('sensor.luv')*8, metaitem('field.generator.luv')*4, ore('batteryLuv'), metaitem('cableGtSingleNiobiumTitanium')*8, ore('circuitZpm')*4, metaitem('cover.solar.panel.lv')*6, metaitem('foilPalladium')*64, metaitem('foilPalladium')*64, metaitem('wireFineRuridit')*64, metaitem('wireFineRuridit')*64, metaitem('screwHsss')*32, metaitem('frameHsss')*16, metaitem('plateDenseRhodiumPlatedPalladium')*8)
    .fluidInputs(fluid('soldering_alloy')*1152, fluid('crystal_fluix')*1152, fluid('nether_star')*1152, fluid('quartzite')*4608)
    .outputs(item('wct:wct_creative'))
    .duration(9600) 
    .EUt(32768)
    .buildAndRegister()

assembler.recipeBuilder()
    .inputs(metaitem('sensor.iv')*2, metaitem('emitter.iv')*2, item('appliedenergistics2:material:47')*2, item('appliedenergistics2:material:42'), item('threng:material:4'), metaitem('plateDenseTungstenSteel'), metaitem('screwIridium')*4)
    .fluidInputs(fluid('crystal_fluix')*1152)
    .outputs(item('ae2wtlib:infinity_booster_card'))
    .duration(400) 
    .EUt(7680)
    .buildAndRegister()

crafting.addShaped('wct', item('wct:wct'), [
        [metaitem('sensor.iv'), item('threng:material:4'), metaitem('emitter.iv')],
        [metaitem('plateDenseTungstenSteel'), item('appliedenergistics2:part:360'), metaitem('plateDenseTungstenSteel')],
        [metaitem('screwIridium'), item('appliedenergistics2:wireless_terminal'), metaitem('screwIridium')]])

//Making Presses
lengraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensGreen'))
    .outputs(item('appliedenergistics2:material:19'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

lengraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensRed'))
    .outputs(item('appliedenergistics2:material:13'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

lengraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensLightBlue'))
    .outputs(item('appliedenergistics2:material:14'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

lengraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensYellow'))
    .outputs(item('appliedenergistics2:material:15'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

//Using Presses
press.recipeBuilder()
    .inputs(ore('plateSilicon'))
    .notConsumable(item('appliedenergistics2:material:19'))
    .outputs(item('appliedenergistics2:material:20'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

press.recipeBuilder()
    .inputs(ore('plateGold'))
    .notConsumable(item('appliedenergistics2:material:13'))
    .outputs(item('appliedenergistics2:material:18'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

press.recipeBuilder()
    .inputs(ore('plateDiamond'))
    .notConsumable(item('appliedenergistics2:material:14'))
    .outputs(item('appliedenergistics2:material:17'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

press.recipeBuilder()
    .inputs(ore('plateCertusQuartz'))
    .notConsumable(item('appliedenergistics2:material:15'))
    .outputs(item('appliedenergistics2:material:16'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

//Making AE2 Processors
cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:22'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:24'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:23'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

//Cheaper AE2 Processors
cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
cassembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
cassembler.recipeBuilder()  
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, item('gtna:plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

//Crafting Units and Cables
assembler.recipeBuilder()
    .inputs(metaitem('cover.screen'), glasscable, ore('circuitLv'), item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*4)
    .outputs(item('appliedenergistics2:crafting_monitor'))
    .duration(50) 
    .EUt(16)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(metaitem('tool.datastick'), ore('circuitEv'), glasscable, item('threng:material:4'), item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(metaitem('tool.datastick'), ore('circuitEv'), glasscable, item('threng:material:4'), item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_1k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_4k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_16k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_64k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()

/*assembler.recipeBuilder()
    .inputs(metaitem('robot.arm.hv'), metaitem('fluid.regulator.hv'), metaitem('tool.datastick'), ore('circuitIv')*2, item('appliedenergistics2:part:16')*2, item('threng:material:4')*2, item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('crystal_fluix')*1296)
    .outputs(item('appliedenergistics2:crafting_accelerator'))
    .duration(400) 
    .EUt(480)
    .buildAndRegister()*/

//Storage cells
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:54'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:55'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:56'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:57'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:32'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:33'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:34'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
//Cables
autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('crystal_fluix') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(glasscable)
    .duration(100)
    .EUt(16)
    .buildAndRegister()
autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('nether_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()
autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('certus_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()

//Misc
solidifier.recipeBuilder()
    .inputs(metaitem('boltSteel'))
    .fluidInputs(fluid('crystal_fluix')*18)
    .outputs(metaitem('boltCrystalFluix'))
    .duration(15)
    .EUt(30)
    .buildAndRegister()

mixer.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('water')*1000)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(400)
    .EUt(7)
    .buildAndRegister()

mixer.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('distilled_water')*250)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(200)
    .EUt(7)
    .buildAndRegister()

mixer.recipeBuilder()
    .inputs(metaitem('dustCrystalFluix')*2, metaitem('dustCoal')*2, metaitem('dustSilicon')*2)
    .outputs(item('threng:material:1')*6)
    .duration(200)
    .EUt(7)
    .buildAndRegister()

//Fluix wafers
ebf.recipeBuilder() //boule
    .inputs(ore('dustCrystalFluix')*16, item('threng:material:1')*8)
    .fluidInputs(fluid('helium') * 4000) //to add perfluorohexane 
    .outputs(fboule)
    .duration(6000)
    .EUt(60)
    .buildAndRegister()

cutter.recipeBuilder() //wafer
    .inputs(fboule)
    .outputs(item('gtna:wafer.fluix')*8)
    .duration(200)
    .EUt(32)
    .buildAndRegister()

lengraver.recipeBuilder() //simple fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensAmethyst'))
    .outputs(item('gtna:wafer.simple_fluix_systematic_chip'))
    .duration(900) 
    .EUt(120)
    .buildAndRegister()
lengraver.recipeBuilder() //basic fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('craftingLensPurple'))
    .outputs(item('gtna:wafer.basic_fluix_systematic_chip'))
    .duration(900) 
    .EUt(480)
    .buildAndRegister()
lengraver.recipeBuilder() //complex fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensCrystalFluix'))
    .outputs(item('gtna:wafer.complex_fluix_systematic_chip'))
    .duration(900) 
    .EUt(1920)
    .buildAndRegister()

cutter.recipeBuilder() //simple fsc
    .inputs(item('gtna:wafer.simple_fluix_systematic_chip'))
    .outputs(item('gtna:plate.simple_fluix_systematic_chip')*16)
    .duration(900)
    .EUt(64)
    .buildAndRegister()
cutter.recipeBuilder() //basic fsc
    .inputs(item('gtna:wafer.basic_fluix_systematic_chip'))
    .outputs(item('gtna:plate.basic_fluix_systematic_chip')*8)
    .duration(900)
    .EUt(256)
    .buildAndRegister()
cutter.recipeBuilder() //complex fsc
    .inputs(item('gtna:wafer.complex_fluix_systematic_chip'))
    .outputs(item('gtna:plate.complex_fluix_systematic_chip')*4)
    .duration(900)
    .EUt(1024)
    .buildAndRegister()
