import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Material
//import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.*
import gregtech.api.GregTechAPI.PostMaterialEvent

event_manager.listen { MaterialEvent event ->

//0₀ 1₁ 2₂ 3₃ 4₄ 5₅ 6₆ 7₇ 8₈ 9₉

    new Material.Builder(32000, "crystal_matrix")
        .ingot().fluid()
        //.color(0x9efff0)
        .iconSet("metallic")
        .flags("generate_plate", "no_smelting", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "disable_decomposition")
        .cableProperties(2147483648, 128, 0, true) 
        //.blastTemp(4700, HIGH, 30)
        .build()

    new Material.Builder(32001, "crystal_fluix")
        .gem().fluid()
        .color(0x975CF7).iconSet("certus") //make it a bit brighter
        .components(material('silicon')*1, material('redstone')*1, material('nether_quartz')*1, material('certus_quartz')*1)
        .flags("generate_plate", "no_smelting", "crystallizable", "generate_bolt_screw", "generate_lens")
        .build()

    new Material.Builder(32002, "silicagel")
        .dust()
        .color(0xffffff)
        .components(material('silicon') * 1, material('oxygen') * 2)
        .build()

        //Polymers ID: 50-??

        //Polypropylene
    new Material.Builder(32050, "polypropylene")
        .polymer()
        .color(0xffffff)
        .flags("generate_plate", "generate_foil")
        .components(material('carbon') * 3, material('hydrogen') * 6)
        .fluidPipeProperties(350, 40, true, true, false, false)
        .fluidTemp(350)
        .build()
        .setFormula("(C3H6)")

        //Polyviny cyanide
    new Material.Builder(32051, "polyacrylonitrile")
        .polymer()
        .color(0xf2feff)
        .flags("generate_plate", "generate_foil")
        .components(material('carbon') * 3, material('hydrogen') * 3, material('nitrogen') * 1)
        .itemPipeProperties(1024, 6)
        .fluidTemp(572)
        .build()
        .setFormula("(C3H3N)")
    
        //Polychloroprene (will be disabled due lack of use)
    /*new Material.Builder(32053, "polychloroprene")
        .polymer()
        .color(0xfcf0f0)
        .flags("generate_plate", "generate_foil")
        //.components([material('carbon') * 12, material('hydrogen') * 23, material('nitrogen') * 1, material('oxygen') * 1])
        .fluidTemp(590)
        .build()
        .setFormula("C4H5Cl")*/

        //Kevlar
    new Material.Builder(32054, "polyazanediyl_14_phenyleneazanediylterephthaloyl")
        .polymer()
        .color(0x6B5252)
        .flags("generate_plate", "generate_foil")
        //.components([material('carbon') * 12, material('hydrogen') * 23, material('nitrogen') * 1, material('oxygen') * 1])
        .fluidPipeProperties(930, 475, true, true, true, false)
        .fluidTemp(930)
        .build()
        .setFormula("[-CO-C6H4-CO-NH-C6H4-NH-]")

        //Zylon (will be disabled due lack of information)
    new Material.Builder(32055, "poly_p_phenylene_26_benzobisoxazole")
        .polymer()
        .color(0x806003)
        .flags("generate_plate", "generate_foil")
        //.components([material('carbon') * 12, material('hydrogen') * 23, material('nitrogen') * 1, material('oxygen') * 1])
        .itemPipeProperties(6144, 32)
        .fluidTemp(590)
        .build()
        .setFormula("?")

        //Polycarbonate
    new Material.Builder(32056, "polycarbonate")
        .polymer()
        .flags("generate_plate", "generate_foil")
        .fluidPipeProperties(311, 200, true)
        .fluidTemp(311)
        .build()
        .setFormula("C15H16O2")

        //PET
    new Material.Builder(32057, "polyethylene_terephthalate")
        .polymer()
        .flags("generate_plate", "generate_foil")
        .fluidPipeProperties(482, 40, true, true, false, false)
        .fluidTemp(482)
        .build()
        .setFormula("C10H8O4")

        //PEEK
    new Material.Builder(32058, "polyether_ether_ketone")
        .polymer()
        .color(0x2D0F3D)
        .flags("generate_frame", "generate_plate", "generate_foil")
        .fluidPipeProperties(662, 150, true, true, false, false)
        .fluidTemp(662)
        .build()
        .setFormula("C19H12O13")
        //to add: Polycarbonate (greenhouse), polyethylene terephthalate and Polyether ether ketone

        //Few catalysts
    
    new Material.Builder(32100, "phillipscatalyst")
        .dust()
        .color(0x6b273c)
        .build()

    new Material.Builder(32101, "ziegler")
        .dust()
        //.color(0x6b273c)
        .build()

        //Start of Nylon-12 chain
    new Material.Builder(32060, "polydodecano_12_lactam")
        .polymer()
        .color(0x8c8c7a)
        .flags("generate_plate", "generate_foil")
        //.components([material('carbon') * 12, material('hydrogen') * 23, material('nitrogen') * 1, material('oxygen') * 1])
        .itemPipeProperties(4096, 24)
        .fluidTemp(590)
        .build()
        .setFormula("(C12H23NO)")

    new Material.Builder(32061, "cyclododecatriene")
        .ingot()
        .fluidTemp(255)
        .build()
        .setFormula("C12H18")

    new Material.Builder(32062, "cyclododecane")
        .ingot()
        .fluidTemp(334)
        .build()
        .setFormula("(CH2)12")

    new Material.Builder(32063, "boric_acid")
        .ingot()
        .fluidTemp(373)
        .build()
        .setFormula("B(OH)3")

    new Material.Builder(32064, "cobalt_ii_nitrate")
        .ingot()
        .fluidTemp(334)
        .build()
        .setFormula("Co(NO3)2(H2O)6")

    new Material.Builder(32065, "cobalt_ii_acetate")
        .ingot()
        .fluidTemp(413)
        .build()
        .setFormula("Co(C2H3O2)2")

    new Material.Builder(32066, "cyclododecanol")
        .ingot()
        .fluidTemp(352)
        .build()
        .setFormula("C12H24O")

    new Material.Builder(32067, "cyclododecanone")
        .ingot()
        .fluidTemp(334)
        .build()
        .setFormula("C12H22O")

    new Material.Builder(32068, "hydroxylamine")
        .ingot()
        .fluidTemp(306)
        .build()
        .setFormula("NH2OH")

    new Material.Builder(32069, "laurolactam")
        .ingot()
        .fluidTemp(426)
        .build()
        .setFormula("C12H23NO")
        //End of Nylon-12 chain

        //Some fuels
    new Material.Builder(32200, "e_10")
        .fluid()
        .build()
        .setFormula("A")
    
    new Material.Builder(32201, "e_25")
        .fluid()
        .build()
        .setFormula("A")

    new Material.Builder(32202, "e_50")
        .fluid()
        .build()
        .setFormula("A")

    new Material.Builder(32203, "e_85")
        .fluid()
        .build()
        .setFormula("A")

    new Material.Builder(32204, "ed_95")
        .fluid()
        .build()
        .setFormula("A")
}

    event_manager.listen { PostMaterialEvent event ->
    material('nether_star').setProperty(PropertyKey.FLUID, new FluidProperty())
    material('blue_alloy').addFlags("generate_fine_wire")
    material('certus_quartz').setProperty(PropertyKey.FLUID, new FluidProperty())
    material('certus_quartz').setMaterialRGB(0xa7cafc) //0xa7cafc
    material('nether_quartz').setProperty(PropertyKey.FLUID, new FluidProperty())
    material('nether_quartz').addFlags("generate_lens")
    material('quartzite').setProperty(PropertyKey.FLUID, new FluidProperty())
    material('blue_topaz').addFlags("generate_lens")
    material('ender_pearl').addFlags("generate_lens")
    material('topaz').addFlags("generate_lens")
    material('lapis').addFlags("generate_lens")
    material('amethyst').addFlags("generate_lens")
    material('garnet_yellow').addFlags("generate_lens")

    material('brass').addFlags("generate_round")
    material('electrum').addFlags("generate_round")
    material('chrome').addFlags("generate_round")
    material('platinum').addFlags("generate_round")
    material('iridium').addFlags("generate_round")
}