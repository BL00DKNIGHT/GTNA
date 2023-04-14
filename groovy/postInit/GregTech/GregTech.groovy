// Imports
import gregtech.api.metatileentity.multiblock.CleanroomType

//cobbleworks
rockbreaker.recipeBuilder()
    .notConsumable(item('appliedenergistics2:sky_stone_block'))
    .outputs(item('appliedenergistics2:sky_stone_block'))
    .duration(16) 
    .EUt(240)
    .buildAndRegister()

//Removal of Mainframes
mods.hei.yeet(metaitem('circuit.mainframe')) //Mainframe (IV)
mods.hei.yeet(metaitem('circuit.nano_mainframe')) //Nano-Mainframe (LuV)
mods.hei.yeet(metaitem('circuit.quantum_mainframe')) //Quantum-Mainframe (ZPM)
mods.hei.yeet(metaitem('circuit.crystal_mainframe')) //Crystal-Mainframe (UV)
mods.hei.yeet(metaitem('circuit.wetware_mainframe')) //Wetware-Mainframe (UHV)

mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('tin') * 576])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.inductor') * 8, metaitem('component.capacitor') * 16, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.inductor') * 8, metaitem('component.capacitor') * 16, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('tin') * 576])
mods.gregtech.circuit_assembler.removeByInput(1920, [metaitem('frameAluminium') * 2, metaitem('circuit.nano_computer') * 2, metaitem('component.advanced_smd.inductor') * 4, metaitem('component.advanced_smd.capacitor') * 8, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 32], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(1920, [metaitem('frameAluminium') * 2, metaitem('circuit.nano_computer') * 2, metaitem('component.advanced_smd.inductor') * 4, metaitem('component.advanced_smd.capacitor') * 8, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 32], [fluid('tin') * 576])
mods.gregtech.circuit_assembler.removeByInput(1920, [metaitem('frameAluminium') * 2, metaitem('circuit.nano_computer') * 2, metaitem('component.smd.inductor') * 16, metaitem('component.smd.capacitor') * 32, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 32], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(1920, [metaitem('frameAluminium') * 2, metaitem('circuit.nano_computer') * 2, metaitem('component.smd.inductor') * 16, metaitem('component.smd.capacitor') * 32, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 32], [fluid('tin') * 576])
mods.gregtech.circuit_assembler.removeByInput(7680, [metaitem('frameHssg') * 2, metaitem('circuit.quantum_computer') * 2, metaitem('component.advanced_smd.inductor') * 6, metaitem('component.advanced_smd.capacitor') * 12, metaitem('plate.random_access_memory') * 24, metaitem('wireGtSingleAnnealedCopper') * 48], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(7680, [metaitem('frameHssg') * 2, metaitem('circuit.quantum_computer') * 2, metaitem('component.advanced_smd.inductor') * 6, metaitem('component.advanced_smd.capacitor') * 12, metaitem('plate.random_access_memory') * 24, metaitem('wireGtSingleAnnealedCopper') * 48], [fluid('tin') * 576])
mods.gregtech.circuit_assembler.removeByInput(7680, [metaitem('frameHssg') * 2, metaitem('circuit.quantum_computer') * 2, metaitem('component.smd.inductor') * 24, metaitem('component.smd.capacitor') * 48, metaitem('plate.random_access_memory') * 24, metaitem('wireGtSingleAnnealedCopper') * 48], [fluid('soldering_alloy') * 288])
mods.gregtech.circuit_assembler.removeByInput(7680, [metaitem('frameHssg') * 2, metaitem('circuit.quantum_computer') * 2, metaitem('component.smd.inductor') * 24, metaitem('component.smd.capacitor') * 48, metaitem('plate.random_access_memory') * 24, metaitem('wireGtSingleAnnealedCopper') * 48], [fluid('tin') * 576])
mods.gregtech.assembly_line.removeByInput(30720, [metaitem('frameHsse') * 2, metaitem('circuit.crystal_computer') * 2, metaitem('plate.random_access_memory') * 32, metaitem('plate.high_power_integrated_circuit') * 2, metaitem('wireGtSingleNiobiumTitanium') * 8, metaitem('component.advanced_smd.inductor') * 8, metaitem('component.advanced_smd.capacitor') * 16, metaitem('component.advanced_smd.diode') * 8], [fluid('soldering_alloy') * 1440])
mods.gregtech.assembly_line.removeByInput(300000, [metaitem('frameTritanium') * 2, metaitem('circuit.wetware_computer') * 2, metaitem('component.advanced_smd.diode') * 32, metaitem('component.advanced_smd.capacitor') * 32, metaitem('component.advanced_smd.transistor') * 32, metaitem('component.advanced_smd.resistor') * 32, metaitem('component.advanced_smd.inductor') * 32, metaitem('foilPolybenzimidazole') * 64, metaitem('plate.random_access_memory') * 32, metaitem('wireGtDoubleEnrichedNaquadahTriniumEuropiumDuranide') * 16, metaitem('plateEuropium') * 8], [fluid('soldering_alloy') * 2880, fluid('polybenzimidazole') * 1152])


//Solar
crafting.addShaped('solar_panel', metaitem('cover.solar.panel'), [
        [ore('plateSilver'), ore('paneGlass'), ore('plateSilver')],
        [ore('circuitUlv'), ore('plateSilicon'), ore('circuitUlv')]])
crafting.addShaped('solar_panel_ulv', metaitem('cover.solar.panel.ulv'), [
        [ore('plateDoubleSilicon'), ore('paneGlass'), ore('plateDoubleSilicon')],
        [ore('circuitLv'), metaitem('carbon.plate'), ore('circuitLv')],
        [ore('plateDoubleSilver'), null, ore('plateDoubleSilver')]])
crafting.addShaped('solar_panel_lv', metaitem('cover.solar.panel.lv'), [
        [metaitem('wafer.silicon'), ore('blockGlass'), metaitem('wafer.silicon')],
        [ore('circuitMv'), metaitem('carbon.plate'), ore('circuitMv')],
        [ore('plateGalliumArsenide'), null, ore('plateGalliumArsenide')]])
crafting.remove('gregtech:solar_panel_basic')
crafting.remove('gregtech:solar_panel_ulv')
crafting.remove('gregtech:solar_panel_lv')
mods.hei.hide(metaitem('cover.solar.panel.mv'))
mods.hei.hide(metaitem('cover.solar.panel.hv'))
mods.hei.hide(metaitem('cover.solar.panel.ev'))

// Misc
mods.gregtech.extruder.removeByInput(7, [metaitem('blockNeutronium') * 64, metaitem('blockNeutronium') * 64], null)
assline.recipeBuilder() 
    .inputs(ore('blockNeutronium')*64, ore('blockNeutronium')*64, ore('blockTritanium')*64, ore('blockTritanium')*64, ore('circuitUhv')*64, metaitem('max.battery'), metaitem('wireGtHexRutheniumTriniumAmericiumNeutronate')*64, metaitem('wireGtHexRutheniumTriniumAmericiumNeutronate')*64, metaitem('component.advanced_smd.transistor')*64, metaitem('component.advanced_smd.resistor')*64, metaitem('component.advanced_smd.diode')*64, metaitem('component.advanced_smd.capacitor')*64, metaitem('component.advanced_smd.inductor')*64, metaitem('plateDoubleAmericium')*64, metaitem('robot.arm.uhv')*64, metaitem('field.generator.uhv')*64)
    .fluidInputs(fluid('soldering_alloy')*18432, fluid('polybenzimidazole')*9216, fluid('naquadria')*4608, fluid('americium')*4608)
    .outputs(metaitem('nan.certificate'))
    .duration(214748368) 
    .EUt(7)
    .buildAndRegister()

//Diamond Fibers
autoclave.recipeBuilder()
    .inputs(ore('dustDiamond')*8)
    .fluidInputs(fluid('nether_star') * 288)
    .outputs(item('gtna:unrefinedmatrixfiber'))
    .duration(40)
    .EUt(30720)
    .buildAndRegister()
ebf.recipeBuilder()
    .inputs(item('gtna:unrefinedmatrixfiber'))
    .fluidInputs(fluid('tetrafluoroethylene') * 72) //to add perfluorohexane 
    .outputs(item('gtna:matrixfiber'))
    .duration(600)
    .EUt(122880)
    .buildAndRegister()
compressor.recipeBuilder()
    .inputs(item('gtna:matrixfiber')*4)
    .outputs(item('gtna:densematrixfiber'))
    .duration(200)
    .EUt(15360)
    .buildAndRegister()
chembath.recipeBuilder()
    .inputs(item('gtna:densematrixfiber')*2)
    .fluidInputs(fluid('neutronium') * 144)
    .outputs(item('gtna:diamondlattice'))
    .duration(400)
    .EUt(122880)
    .buildAndRegister()

//Damascus Steel
arcfurnace.recipeBuilder()
    .inputs(ore('ingotSteel'))
    .fluidInputs(fluid('oxygen')*56)
    .outputs(metaitem('ingotDamascusSteel'))
    .duration(75) 
    .EUt(30)
    .buildAndRegister()
/*mixer.recipeBuilder() //damascus steel recipe in hm
    .inputs(ore('dustSteel'), ore('dustCarbon'))
    .outputs(metaitem('dustDamascusSteel')*2)
    .duration(120) 
    .EUt(32)
    .buildAndRegister()*/

//Nether Star Dust
lcr.recipeBuilder()
    .inputs(ore('dustPlutonium241'), ore('dustEnderEye'), ore('dustUranium235'))
    .fluidInputs(fluid('gasoline_premium') * 1000, fluid('rocket_fuel') * 1000)
    .outputs(metaitem('dustNetherStar')*5)
    .duration(1200)
    .EUt(1920)
    .buildAndRegister()

//Dust
mixer.recipeBuilder()
    .inputs(item('gtna:melodicmixture'), ore('itemEnderCrystalPowder')*2, ore('dustIridium'))
    .fluidInputs(fluid('nether_star')*144)
    .outputs(item('gtna:stellarmixture')*4)
    .duration(400)
    .EUt(6144)
    .buildAndRegister()

macerator.recipeBuilder()
    .inputs(ore('ingotMelodicAlloy'))
    .outputs(item('gtna:melodicmixture'))
    .duration(120)
    .EUt(32)
    .buildAndRegister()

macerator.recipeBuilder()
    .inputs(ore('itemEnderCrystal'))
    .outputs(item('enderio:item_material:37'))
    .duration(100)
    .EUt(30)
    .buildAndRegister()
//Crystal
autoclave.recipeBuilder()
    .inputs(item('enderio:item_material:14'), metaitem('quantumeye'))
    .fluidInputs(fluid('nether_star') * 144)
    .outputs(item('enderio:item_material:16'))
    .duration(12000)
    .EUt(480)
    .buildAndRegister()

//Multiblocks
crafting.remove('gregtech:electric_blast_furnace')
crafting.remove('gregtech:pyrolyse_oven')
crafting.remove('gregtech:cracking_unit')
crafting.remove('gregtech:distillation_tower')
crafting.remove('gregtech:vacuum_freezer')
crafting.remove('gregtech:implosion_compressor')
crafting.remove('gregtech:multi_furnace')
crafting.remove('gregtech:assembly_line')
crafting.remove('gregtech:processing_array')
crafting.remove('gregtech:advanced_processing_array')
crafting.remove('gregtech:large_chemical_reactor')