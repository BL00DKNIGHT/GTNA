//Start of Globals
    //Tools
        gtwrench      = ore('gtWrench')
        gtsrewdriver  = ore('gtScrewdrivers')
        gthhammer     = ore('gtHardHammers')
        gtfile        = ore('gtFIle')
        gtwcutter     = ore('gtWirecutter')
        gtshammer     = ore('gtMallet')
        gtmortar      = ore('gtMortar')
        gtknife       = ore('gtKnife')

    //Machines
        alloysmelter  = recipemap('alloy_smelter') //Onion's favorite machine
        arcfurnace    = recipemap('arc_furnace') 
        assembler     = recipemap('assembler')
        assline       = recipemap('assembly_line')
        autoclave     = recipemap('autoclave')
        bender        = recipemap('bender')
        brewery       = recipemap('brewery')
        canner        = recipemap('canner')
        centrifuge    = recipemap('centrifuge')
        chembath      = recipemap('chemical_bath')
        chemreactor   = recipemap('chemical_reactor')
        cassembler    = recipemap('circuit_assembler')
        cokeoven      = recipemap('coke_oven')
        compressor    = recipemap('compressor')
        cracker       = recipemap('cracker')
        cutter        = recipemap('cutter')
        dt            = recipemap('distillation_tower')
        distillery    = recipemap('distillery')
        ebf           = recipemap('electric_blast_furnace')
        electrolyzer  = recipemap('electrolyzer')
        separator     = recipemap('electromagnetic_separator')
        extractor     = recipemap('extractor')
        extruder      = recipemap('extruder')
        fermenter     = recipemap('fermenter')
        heater        = recipemap('fluid_heater')
        solidifier    = recipemap('fluid_solidifier')
        hammer        = recipemap('forge_hammer')
        press         = recipemap('forming_press')
        freactor      = recipemap('fusion_reactor')
        gascollector  = recipemap('gas_collector')
        implosion     = recipemap('implosion_compressor')
        lcr           = recipemap('large_chemical_reactor')
        lengraver     = recipemap('laser_engraver')
        lathe         = recipemap('lathe')
        macerator     = recipemap('macerator')
        mixer         = recipemap('mixer')
        washer        = recipemap('ore_washer')
        packager      = recipemap('packer')
        polarizer     = recipemap('polarizer')
        pyrolyse      = recipemap('pyrolyse_oven')
        sifter        = recipemap('sifter')
        tcentrifuge   = recipemap('thermal_centrifuge')
        freezer       = recipemap('vacuum_freezer')
        wiremill      = recipemap('wiremill')
        cgenerator    = recipemap('combustion_generator')
        ggenerator    = recipemap('gas_turbine')
        pgeneratir    = recipemap('plasma_generator')
        sfgenerator   = recipemap('semi_fluid_generator')
        sgenerator    = recipemap('steam_turbine')
        rockbreaker   = recipemap('rock_breaker')
        alloybs       = recipemap('alloy_blast_smelter')
//End of Globals
//Start of HEI
    mods.hei.hideCategory('appliedenergistics2.grinder')
    mods.hei.hideCategory('appliedenergistics2.inscriber')
    mods.hei.hideCategory('threng.energize')
    mods.hei.hideCategory('threng.etch')
    mods.hei.hideCategory('threng.agg')
//End of HEI
//Start of OreDict
    item('appliedenergistics2:material:43').addOreDict(ore('FormationCore'))
    item('appliedenergistics2:material:44').addOreDict(ore('AnnhilationCore'))
    item('gtna:entropycore').addOreDict(ore('EntropyCore'))
    item('gtna:micainsulator').addOreDict(ore('micaInsulator'))

    ore('circuitLuv').remove(metaitem('circuit.wetware_processor'))
    ore('circuitZpm').remove(metaitem('circuit.wetware_assembly'))
    ore('circuitUv').remove(metaitem('circuit.wetware_computer'))

    ore('circuitZpm').add(metaitem('circuit.wetware_processor'))
    ore('circuitUv').add(metaitem('circuit.wetware_assembly'))
    ore('circuitUhv').add(metaitem('circuit.wetware_computer'))
//End of OreDict