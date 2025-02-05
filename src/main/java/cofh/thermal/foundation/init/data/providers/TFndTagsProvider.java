package cofh.thermal.foundation.init.data.providers;

import cofh.lib.init.tags.ItemTagsCoFH;
import cofh.thermal.foundation.init.registries.TFndTags;
import cofh.thermal.lib.util.references.ThermalTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static cofh.lib.util.constants.ModIds.ID_THERMAL;
import static cofh.thermal.core.ThermalCore.BLOCKS;
import static cofh.thermal.core.ThermalCore.ITEMS;
import static cofh.thermal.core.util.RegistrationHelper.deepslate;
import static cofh.thermal.core.util.RegistrationHelper.raw;
import static cofh.thermal.foundation.init.registries.TFndIDs.*;
import static net.minecraftforge.common.Tags.Items.*;

public class TFndTagsProvider {

    public static class Block extends BlockTagsProvider {

        public Block(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {

            super(output, lookupProvider, ID_THERMAL, existingFileHelper);
        }

        @SuppressWarnings ("unchecked")
        @Override
        protected void addTags(HolderLookup.Provider pProvider) {

            tag(BlockTags.BEACON_BASE_BLOCKS).add(
                    BLOCKS.get(ID_BRONZE_BLOCK),
                    BLOCKS.get(ID_CONSTANTAN_BLOCK),
                    BLOCKS.get(ID_ELECTRUM_BLOCK),
                    BLOCKS.get(ID_INVAR_BLOCK),
                    BLOCKS.get(ID_LEAD_BLOCK),
                    BLOCKS.get(ID_NICKEL_BLOCK),
                    BLOCKS.get(ID_RUBY_BLOCK),
                    BLOCKS.get(ID_SAPPHIRE_BLOCK),
                    BLOCKS.get(ID_SILVER_BLOCK),
                    BLOCKS.get(ID_TIN_BLOCK)
            );

            // region RESOURCES
            tag(TFndTags.Blocks.ORES_APATITE).add(BLOCKS.get(ID_APATITE_ORE));
            tag(TFndTags.Blocks.ORES_CINNABAR).add(BLOCKS.get(ID_CINNABAR_ORE));
            tag(TFndTags.Blocks.ORES_LEAD).add(BLOCKS.get(ID_LEAD_ORE));
            tag(TFndTags.Blocks.ORES_NICKEL).add(BLOCKS.get(ID_NICKEL_ORE));
            tag(TFndTags.Blocks.ORES_NITER).add(BLOCKS.get(ID_NITER_ORE));
            tag(TFndTags.Blocks.ORES_RUBY).add(BLOCKS.get(ID_RUBY_ORE));
            tag(TFndTags.Blocks.ORES_SAPPHIRE).add(BLOCKS.get(ID_SAPPHIRE_ORE));
            tag(TFndTags.Blocks.ORES_SILVER).add(BLOCKS.get(ID_SILVER_ORE));
            tag(TFndTags.Blocks.ORES_SULFUR).add(BLOCKS.get(ID_SULFUR_ORE));
            tag(TFndTags.Blocks.ORES_TIN).add(BLOCKS.get(ID_TIN_ORE));

            tag(TFndTags.Blocks.ORES_APATITE).add(BLOCKS.get(deepslate(ID_APATITE_ORE)));
            tag(TFndTags.Blocks.ORES_CINNABAR).add(BLOCKS.get(deepslate(ID_CINNABAR_ORE)));
            tag(TFndTags.Blocks.ORES_LEAD).add(BLOCKS.get(deepslate(ID_LEAD_ORE)));
            tag(TFndTags.Blocks.ORES_NICKEL).add(BLOCKS.get(deepslate(ID_NICKEL_ORE)));
            tag(TFndTags.Blocks.ORES_NITER).add(BLOCKS.get(deepslate(ID_NITER_ORE)));
            tag(TFndTags.Blocks.ORES_RUBY).add(BLOCKS.get(deepslate(ID_RUBY_ORE)));
            tag(TFndTags.Blocks.ORES_SAPPHIRE).add(BLOCKS.get(deepslate(ID_SAPPHIRE_ORE)));
            tag(TFndTags.Blocks.ORES_SILVER).add(BLOCKS.get(deepslate(ID_SILVER_ORE)));
            tag(TFndTags.Blocks.ORES_SULFUR).add(BLOCKS.get(deepslate(ID_SULFUR_ORE)));
            tag(TFndTags.Blocks.ORES_TIN).add(BLOCKS.get(deepslate(ID_TIN_ORE)));

            tag(Tags.Blocks.ORES).addTags(
                    TFndTags.Blocks.ORES_APATITE,
                    TFndTags.Blocks.ORES_CINNABAR,
                    TFndTags.Blocks.ORES_LEAD,
                    TFndTags.Blocks.ORES_NICKEL,
                    TFndTags.Blocks.ORES_NITER,
                    TFndTags.Blocks.ORES_RUBY,
                    TFndTags.Blocks.ORES_SAPPHIRE,
                    TFndTags.Blocks.ORES_SILVER,
                    TFndTags.Blocks.ORES_SULFUR,
                    TFndTags.Blocks.ORES_TIN
            );
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_APATITE_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_CINNABAR_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_LEAD_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_NICKEL_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_NITER_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_RUBY_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_SAPPHIRE_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_SILVER_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_SULFUR_ORE));
            tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BLOCKS.get(ID_TIN_ORE));

            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_APATITE_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_CINNABAR_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_LEAD_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_NICKEL_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_NITER_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_RUBY_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_SAPPHIRE_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_SILVER_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_SULFUR_ORE)));
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(BLOCKS.get(deepslate(ID_TIN_ORE)));

            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_APATITE_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_CINNABAR_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_LEAD_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_NICKEL_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_NITER_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_RUBY_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_SAPPHIRE_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_SILVER_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_SULFUR_ORE));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_TIN_ORE));

            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_APATITE_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_CINNABAR_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_LEAD_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_NICKEL_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_NITER_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_RUBY_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_SAPPHIRE_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_SILVER_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_SULFUR_ORE)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(deepslate(ID_TIN_ORE)));

            tag(BlockTags.MINEABLE_WITH_SHOVEL).add(BLOCKS.get(ID_OIL_SAND));
            tag(BlockTags.MINEABLE_WITH_SHOVEL).add(BLOCKS.get(ID_OIL_RED_SAND));

            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_APATITE_ORE));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_CINNABAR_ORE));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_TIN_ORE));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(deepslate(ID_APATITE_ORE)));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(deepslate(ID_CINNABAR_ORE)));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(deepslate(ID_TIN_ORE)));

            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_LEAD_ORE));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_NICKEL_ORE));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_RUBY_ORE));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_SAPPHIRE_ORE));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_SILVER_ORE));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(deepslate(ID_LEAD_ORE)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(deepslate(ID_NICKEL_ORE)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(deepslate(ID_RUBY_ORE)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(deepslate(ID_SAPPHIRE_ORE)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(deepslate(ID_SILVER_ORE)));
            // endregion

            // region STORAGE
            tag(BlockTags.MINEABLE_WITH_HOE).add(BLOCKS.get(ID_RUBBERWOOD_LEAVES));

            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_BRONZE_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_CONSTANTAN_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_ELECTRUM_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_INVAR_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_LEAD_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_NICKEL_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_RUBY_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_SAPPHIRE_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_SILVER_BLOCK));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(ID_TIN_BLOCK));

            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(raw(ID_LEAD_BLOCK)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(raw(ID_NICKEL_BLOCK)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(raw(ID_SILVER_BLOCK)));
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BLOCKS.get(raw(ID_TIN_BLOCK)));

            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_BRONZE_BLOCK));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(ID_TIN_BLOCK));
            tag(BlockTags.NEEDS_STONE_TOOL).add(BLOCKS.get(raw(ID_TIN_BLOCK)));

            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(raw(ID_LEAD_BLOCK)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(raw(ID_NICKEL_BLOCK)));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(raw(ID_SILVER_BLOCK)));

            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_CONSTANTAN_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_ELECTRUM_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_INVAR_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_LEAD_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_NICKEL_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_RUBY_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_SAPPHIRE_BLOCK));
            tag(BlockTags.NEEDS_IRON_TOOL).add(BLOCKS.get(ID_SILVER_BLOCK));

            tag(TFndTags.Blocks.STORAGE_BLOCKS_BRONZE).add(BLOCKS.get(ID_BRONZE_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_CONSTANTAN).add(BLOCKS.get(ID_CONSTANTAN_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_ELECTRUM).add(BLOCKS.get(ID_ELECTRUM_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_INVAR).add(BLOCKS.get(ID_INVAR_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_LEAD).add(BLOCKS.get(ID_LEAD_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_NICKEL).add(BLOCKS.get(ID_NICKEL_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_RAW_LEAD).add(BLOCKS.get(raw(ID_LEAD_BLOCK)));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_RAW_NICKEL).add(BLOCKS.get(raw(ID_NICKEL_BLOCK)));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_RAW_SILVER).add(BLOCKS.get(raw(ID_SILVER_BLOCK)));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_RAW_TIN).add(BLOCKS.get(raw(ID_TIN_BLOCK)));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_RUBY).add(BLOCKS.get(ID_RUBY_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(BLOCKS.get(ID_SAPPHIRE_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_SILVER).add(BLOCKS.get(ID_SILVER_BLOCK));
            tag(TFndTags.Blocks.STORAGE_BLOCKS_TIN).add(BLOCKS.get(ID_TIN_BLOCK));


            tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
                    TFndTags.Blocks.STORAGE_BLOCKS_BRONZE,
                    TFndTags.Blocks.STORAGE_BLOCKS_CONSTANTAN,
                    TFndTags.Blocks.STORAGE_BLOCKS_ELECTRUM,
                    TFndTags.Blocks.STORAGE_BLOCKS_INVAR,
                    TFndTags.Blocks.STORAGE_BLOCKS_LEAD,
                    TFndTags.Blocks.STORAGE_BLOCKS_NICKEL,
                    TFndTags.Blocks.STORAGE_BLOCKS_RAW_LEAD,
                    TFndTags.Blocks.STORAGE_BLOCKS_RAW_NICKEL,
                    TFndTags.Blocks.STORAGE_BLOCKS_RAW_SILVER,
                    TFndTags.Blocks.STORAGE_BLOCKS_RAW_TIN,
                    TFndTags.Blocks.STORAGE_BLOCKS_RUBY,
                    TFndTags.Blocks.STORAGE_BLOCKS_SAPPHIRE,
                    TFndTags.Blocks.STORAGE_BLOCKS_SILVER,
                    TFndTags.Blocks.STORAGE_BLOCKS_TIN
            );
            // endregion

            // region WOOD
            tag(BlockTags.LEAVES).add(BLOCKS.get("rubberwood_leaves"));
            tag(BlockTags.SAPLINGS).add(BLOCKS.get("rubberwood_sapling"));

            tag(BlockTags.DOORS).add(BLOCKS.get("rubberwood_door"));
            tag(BlockTags.FENCES).add(BLOCKS.get("rubberwood_fence"));
            tag(BlockTags.FENCE_GATES).add(BLOCKS.get("rubberwood_fence_gate"));
            tag(BlockTags.PLANKS).add(BLOCKS.get("rubberwood_planks"));
            tag(BlockTags.SLABS).add(BLOCKS.get("rubberwood_slab"));
            tag(BlockTags.STAIRS).add(BLOCKS.get("rubberwood_stairs"));

            tag(BlockTags.WOODEN_BUTTONS).add(BLOCKS.get("rubberwood_button"));
            tag(BlockTags.WOODEN_DOORS).add(BLOCKS.get("rubberwood_door"));
            tag(BlockTags.WOODEN_FENCES).add(BLOCKS.get("rubberwood_fence"));
            tag(BlockTags.WOODEN_PRESSURE_PLATES).add(BLOCKS.get("rubberwood_pressure_plate"));
            tag(BlockTags.WOODEN_SLABS).add(BLOCKS.get("rubberwood_slab"));
            tag(BlockTags.WOODEN_STAIRS).add(BLOCKS.get("rubberwood_stairs"));
            tag(BlockTags.WOODEN_TRAPDOORS).add(BLOCKS.get("rubberwood_trapdoor"));

            //            tag(BlockTags.NON_FLAMMABLE_WOOD).add(
            //                    BLOCKS.get("rubberwood_door"),
            //                    BLOCKS.get("rubberwood_fence"),
            //                    BLOCKS.get("rubberwood_fence_gate"),
            //                    BLOCKS.get(ID_RUBBERWOOD_LOG),
            //                    BLOCKS.get("rubberwood_planks"),
            //                    BLOCKS.get("rubberwood_slab"),
            //                    BLOCKS.get("rubberwood_stairs"),
            //                    BLOCKS.get(ID_RUBBERWOOD_WOOD),
            //                    BLOCKS.get(ID_STRIPPED_RUBBERWOOD_LOG),
            //                    BLOCKS.get(ID_STRIPPED_RUBBERWOOD_WOOD)
            //            );

            tag(ThermalTags.Blocks.LOGS_RUBBERWOOD).add(
                    BLOCKS.get(ID_RUBBERWOOD_LOG),
                    BLOCKS.get(ID_RUBBERWOOD_WOOD),
                    BLOCKS.get(ID_STRIPPED_RUBBERWOOD_LOG),
                    BLOCKS.get(ID_STRIPPED_RUBBERWOOD_WOOD)
            );
            tag(BlockTags.LOGS).addTag(ThermalTags.Blocks.LOGS_RUBBERWOOD);

            tag(BlockTags.STANDING_SIGNS).add(BLOCKS.get("rubberwood_sign"));
            tag(BlockTags.WALL_SIGNS).add(BLOCKS.get("rubberwood_wall_sign"));
            tag(BlockTags.MINEABLE_WITH_AXE).add(BLOCKS.get("rubberwood_sign"));
            tag(BlockTags.MINEABLE_WITH_AXE).add(BLOCKS.get("rubberwood_wall_sign"));

            tag(BlockTags.CEILING_HANGING_SIGNS).add(BLOCKS.get("rubberwood_hanging_sign"));
            tag(BlockTags.WALL_HANGING_SIGNS).add(BLOCKS.get("rubberwood_wall_hanging_sign"));
            tag(BlockTags.MINEABLE_WITH_AXE).add(BLOCKS.get("rubberwood_hanging_sign"));
            tag(BlockTags.MINEABLE_WITH_AXE).add(BLOCKS.get("rubberwood_wall_hanging_sign"));

            // endregion
        }

    }

    public static class Item extends ItemTagsProvider {

        public Item(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagsProvider.TagLookup<net.minecraft.world.level.block.Block>> pBlockTags, ExistingFileHelper existingFileHelper) {

            super(pOutput, pLookupProvider, pBlockTags, ID_THERMAL, existingFileHelper);
        }

        @SuppressWarnings ("unchecked")
        @Override
        protected void addTags(HolderLookup.Provider pProvider) {

            copy(TFndTags.Blocks.ORES_APATITE, TFndTags.Items.ORES_APATITE);
            copy(TFndTags.Blocks.ORES_CINNABAR, TFndTags.Items.ORES_CINNABAR);
            copy(TFndTags.Blocks.ORES_LEAD, TFndTags.Items.ORES_LEAD);
            copy(TFndTags.Blocks.ORES_NICKEL, TFndTags.Items.ORES_NICKEL);
            copy(TFndTags.Blocks.ORES_NITER, TFndTags.Items.ORES_NITER);
            copy(TFndTags.Blocks.ORES_RUBY, TFndTags.Items.ORES_RUBY);
            copy(TFndTags.Blocks.ORES_SAPPHIRE, TFndTags.Items.ORES_SAPPHIRE);
            copy(TFndTags.Blocks.ORES_SILVER, TFndTags.Items.ORES_SILVER);
            copy(TFndTags.Blocks.ORES_SULFUR, TFndTags.Items.ORES_SULFUR);
            copy(TFndTags.Blocks.ORES_TIN, TFndTags.Items.ORES_TIN);

            tag(Tags.Items.ORES).addTags(
                    TFndTags.Items.ORES_APATITE,
                    TFndTags.Items.ORES_CINNABAR,
                    TFndTags.Items.ORES_LEAD,
                    TFndTags.Items.ORES_NICKEL,
                    TFndTags.Items.ORES_NITER,
                    TFndTags.Items.ORES_RUBY,
                    TFndTags.Items.ORES_SAPPHIRE,
                    TFndTags.Items.ORES_SILVER,
                    TFndTags.Items.ORES_SULFUR,
                    TFndTags.Items.ORES_TIN
            );

            copy(TFndTags.Blocks.STORAGE_BLOCKS_BRONZE, TFndTags.Items.STORAGE_BLOCKS_BRONZE);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_CONSTANTAN, TFndTags.Items.STORAGE_BLOCKS_CONSTANTAN);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_ELECTRUM, TFndTags.Items.STORAGE_BLOCKS_ELECTRUM);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_INVAR, TFndTags.Items.STORAGE_BLOCKS_INVAR);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_LEAD, TFndTags.Items.STORAGE_BLOCKS_LEAD);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_NICKEL, TFndTags.Items.STORAGE_BLOCKS_NICKEL);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_RAW_LEAD, TFndTags.Items.STORAGE_BLOCKS_RAW_LEAD);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_RAW_NICKEL, TFndTags.Items.STORAGE_BLOCKS_RAW_NICKEL);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_RAW_SILVER, TFndTags.Items.STORAGE_BLOCKS_RAW_SILVER);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_RAW_TIN, TFndTags.Items.STORAGE_BLOCKS_RAW_TIN);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_RUBY, TFndTags.Items.STORAGE_BLOCKS_RUBY);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_SAPPHIRE, TFndTags.Items.STORAGE_BLOCKS_SAPPHIRE);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_SILVER, TFndTags.Items.STORAGE_BLOCKS_SILVER);
            copy(TFndTags.Blocks.STORAGE_BLOCKS_TIN, TFndTags.Items.STORAGE_BLOCKS_TIN);

            tag(Tags.Items.STORAGE_BLOCKS).addTags(
                    TFndTags.Items.STORAGE_BLOCKS_BRONZE,
                    TFndTags.Items.STORAGE_BLOCKS_CONSTANTAN,
                    TFndTags.Items.STORAGE_BLOCKS_ELECTRUM,
                    TFndTags.Items.STORAGE_BLOCKS_INVAR,
                    TFndTags.Items.STORAGE_BLOCKS_LEAD,
                    TFndTags.Items.STORAGE_BLOCKS_NICKEL,
                    TFndTags.Items.STORAGE_BLOCKS_RAW_LEAD,
                    TFndTags.Items.STORAGE_BLOCKS_RAW_NICKEL,
                    TFndTags.Items.STORAGE_BLOCKS_RAW_SILVER,
                    TFndTags.Items.STORAGE_BLOCKS_RAW_TIN,
                    TFndTags.Items.STORAGE_BLOCKS_RUBY,
                    TFndTags.Items.STORAGE_BLOCKS_SAPPHIRE,
                    TFndTags.Items.STORAGE_BLOCKS_SILVER,
                    TFndTags.Items.STORAGE_BLOCKS_TIN
            );

            copy(BlockTags.LEAVES, ItemTags.LEAVES);
            copy(BlockTags.LOGS, ItemTags.LOGS);
            copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);

            copy(BlockTags.DOORS, ItemTags.DOORS);
            copy(BlockTags.FENCES, ItemTags.FENCES);
            copy(BlockTags.PLANKS, ItemTags.PLANKS);
            copy(BlockTags.SLABS, ItemTags.SLABS);
            copy(BlockTags.STAIRS, ItemTags.STAIRS);

            copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
            copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
            copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
            copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);

            // copy(BlockTags.NON_FLAMMABLE_WOOD, ItemTags.NON_FLAMMABLE_WOOD);
            copy(ThermalTags.Blocks.LOGS_RUBBERWOOD, ThermalTags.Items.LOGS_RUBBERWOOD);

            tag(ItemTags.SIGNS).add(ITEMS.get("rubberwood_sign"));
            tag(ItemTags.HANGING_SIGNS).add(ITEMS.get("rubberwood_hanging_sign"));

            tag(ItemTags.BOATS).add(ITEMS.get(ID_RUBBERWOOD_BOAT));
            tag(ItemTags.BOATS).add(ITEMS.get(ID_RUBBERWOOD_CHEST_BOAT));
            tag(ItemTags.CHEST_BOATS).add(ITEMS.get(ID_RUBBERWOOD_CHEST_BOAT));

            tag(ItemTagsCoFH.COINS_LEAD).add(ITEMS.get("lead_coin"));
            tag(ItemTagsCoFH.COINS_NICKEL).add(ITEMS.get("nickel_coin"));
            tag(ItemTagsCoFH.COINS_SILVER).add(ITEMS.get("silver_coin"));
            tag(ItemTagsCoFH.COINS_TIN).add(ITEMS.get("tin_coin"));

            tag(ItemTagsCoFH.COINS_BRONZE).add(ITEMS.get("bronze_coin"));
            tag(ItemTagsCoFH.COINS_CONSTANTAN).add(ITEMS.get("constantan_coin"));
            tag(ItemTagsCoFH.COINS_ELECTRUM).add(ITEMS.get("electrum_coin"));
            tag(ItemTagsCoFH.COINS_INVAR).add(ITEMS.get("invar_coin"));

            tag(ItemTagsCoFH.COINS).addTags(
                    ItemTagsCoFH.COINS_LEAD,
                    ItemTagsCoFH.COINS_NICKEL,
                    ItemTagsCoFH.COINS_SILVER,
                    ItemTagsCoFH.COINS_TIN,

                    ItemTagsCoFH.COINS_BRONZE,
                    ItemTagsCoFH.COINS_CONSTANTAN,
                    ItemTagsCoFH.COINS_ELECTRUM,
                    ItemTagsCoFH.COINS_INVAR
            );

            tag(ItemTagsCoFH.DUSTS_LEAD).add(ITEMS.get("lead_dust"));
            tag(ItemTagsCoFH.DUSTS_NICKEL).add(ITEMS.get("nickel_dust"));
            tag(ItemTagsCoFH.DUSTS_SILVER).add(ITEMS.get("silver_dust"));
            tag(ItemTagsCoFH.DUSTS_TIN).add(ITEMS.get("tin_dust"));

            tag(ItemTagsCoFH.DUSTS_BRONZE).add(ITEMS.get("bronze_dust"));
            tag(ItemTagsCoFH.DUSTS_CONSTANTAN).add(ITEMS.get("constantan_dust"));
            tag(ItemTagsCoFH.DUSTS_ELECTRUM).add(ITEMS.get("electrum_dust"));
            tag(ItemTagsCoFH.DUSTS_INVAR).add(ITEMS.get("invar_dust"));

            tag(ItemTagsCoFH.DUSTS_RUBY).add(ITEMS.get("ruby_dust"));
            tag(ItemTagsCoFH.DUSTS_SAPPHIRE).add(ITEMS.get("sapphire_dust"));

            tag(DUSTS).addTags(
                    ItemTagsCoFH.DUSTS_LEAD,
                    ItemTagsCoFH.DUSTS_NICKEL,
                    ItemTagsCoFH.DUSTS_SILVER,
                    ItemTagsCoFH.DUSTS_TIN,

                    ItemTagsCoFH.DUSTS_BRONZE,
                    ItemTagsCoFH.DUSTS_CONSTANTAN,
                    ItemTagsCoFH.DUSTS_ELECTRUM,
                    ItemTagsCoFH.DUSTS_INVAR,

                    ItemTagsCoFH.DUSTS_RUBY,
                    ItemTagsCoFH.DUSTS_SAPPHIRE
            );

            tag(ItemTagsCoFH.GEARS_LEAD).add(ITEMS.get("lead_gear"));
            tag(ItemTagsCoFH.GEARS_NICKEL).add(ITEMS.get("nickel_gear"));
            tag(ItemTagsCoFH.GEARS_SILVER).add(ITEMS.get("silver_gear"));
            tag(ItemTagsCoFH.GEARS_TIN).add(ITEMS.get("tin_gear"));

            tag(ItemTagsCoFH.GEARS_BRONZE).add(ITEMS.get("bronze_gear"));
            tag(ItemTagsCoFH.GEARS_CONSTANTAN).add(ITEMS.get("constantan_gear"));
            tag(ItemTagsCoFH.GEARS_ELECTRUM).add(ITEMS.get("electrum_gear"));
            tag(ItemTagsCoFH.GEARS_INVAR).add(ITEMS.get("invar_gear"));

            tag(ItemTagsCoFH.GEARS_RUBY).add(ITEMS.get("ruby_gear"));
            tag(ItemTagsCoFH.GEARS_SAPPHIRE).add(ITEMS.get("sapphire_gear"));

            tag(ItemTagsCoFH.GEARS).addTags(
                    ItemTagsCoFH.GEARS_LEAD,
                    ItemTagsCoFH.GEARS_NICKEL,
                    ItemTagsCoFH.GEARS_SILVER,
                    ItemTagsCoFH.GEARS_TIN,

                    ItemTagsCoFH.GEARS_BRONZE,
                    ItemTagsCoFH.GEARS_CONSTANTAN,
                    ItemTagsCoFH.GEARS_ELECTRUM,
                    ItemTagsCoFH.GEARS_INVAR,

                    ItemTagsCoFH.GEARS_RUBY,
                    ItemTagsCoFH.GEARS_SAPPHIRE
            );

            tag(ItemTagsCoFH.GEMS_RUBY).add(ITEMS.get("ruby"));
            tag(ItemTagsCoFH.GEMS_SAPPHIRE).add(ITEMS.get("sapphire"));

            tag(GEMS).addTags(
                    ItemTagsCoFH.GEMS_RUBY,
                    ItemTagsCoFH.GEMS_SAPPHIRE
            );

            tag(ItemTagsCoFH.INGOTS_LEAD).add(ITEMS.get("lead_ingot"));
            tag(ItemTagsCoFH.INGOTS_NICKEL).add(ITEMS.get("nickel_ingot"));
            tag(ItemTagsCoFH.INGOTS_SILVER).add(ITEMS.get("silver_ingot"));
            tag(ItemTagsCoFH.INGOTS_TIN).add(ITEMS.get("tin_ingot"));

            tag(ItemTagsCoFH.INGOTS_BRONZE).add(ITEMS.get("bronze_ingot"));
            tag(ItemTagsCoFH.INGOTS_CONSTANTAN).add(ITEMS.get("constantan_ingot"));
            tag(ItemTagsCoFH.INGOTS_ELECTRUM).add(ITEMS.get("electrum_ingot"));
            tag(ItemTagsCoFH.INGOTS_INVAR).add(ITEMS.get("invar_ingot"));

            tag(INGOTS).addTags(
                    ItemTagsCoFH.INGOTS_LEAD,
                    ItemTagsCoFH.INGOTS_NICKEL,
                    ItemTagsCoFH.INGOTS_SILVER,
                    ItemTagsCoFH.INGOTS_TIN,

                    ItemTagsCoFH.INGOTS_BRONZE,
                    ItemTagsCoFH.INGOTS_CONSTANTAN,
                    ItemTagsCoFH.INGOTS_ELECTRUM,
                    ItemTagsCoFH.INGOTS_INVAR
            );

            tag(ItemTagsCoFH.NUGGETS_LEAD).add(ITEMS.get("lead_nugget"));
            tag(ItemTagsCoFH.NUGGETS_NICKEL).add(ITEMS.get("nickel_nugget"));
            tag(ItemTagsCoFH.NUGGETS_SILVER).add(ITEMS.get("silver_nugget"));
            tag(ItemTagsCoFH.NUGGETS_TIN).add(ITEMS.get("tin_nugget"));

            tag(ItemTagsCoFH.NUGGETS_BRONZE).add(ITEMS.get("bronze_nugget"));
            tag(ItemTagsCoFH.NUGGETS_CONSTANTAN).add(ITEMS.get("constantan_nugget"));
            tag(ItemTagsCoFH.NUGGETS_ELECTRUM).add(ITEMS.get("electrum_nugget"));
            tag(ItemTagsCoFH.NUGGETS_INVAR).add(ITEMS.get("invar_nugget"));

            tag(NUGGETS).addTags(
                    ItemTagsCoFH.NUGGETS_LEAD,
                    ItemTagsCoFH.NUGGETS_NICKEL,
                    ItemTagsCoFH.NUGGETS_SILVER,
                    ItemTagsCoFH.NUGGETS_TIN,

                    ItemTagsCoFH.NUGGETS_BRONZE,
                    ItemTagsCoFH.NUGGETS_CONSTANTAN,
                    ItemTagsCoFH.NUGGETS_ELECTRUM,
                    ItemTagsCoFH.NUGGETS_INVAR
            );

            tag(ItemTagsCoFH.PLATES_LEAD).add(ITEMS.get("lead_plate"));
            tag(ItemTagsCoFH.PLATES_NICKEL).add(ITEMS.get("nickel_plate"));
            tag(ItemTagsCoFH.PLATES_SILVER).add(ITEMS.get("silver_plate"));
            tag(ItemTagsCoFH.PLATES_TIN).add(ITEMS.get("tin_plate"));

            tag(ItemTagsCoFH.PLATES_BRONZE).add(ITEMS.get("bronze_plate"));
            tag(ItemTagsCoFH.PLATES_CONSTANTAN).add(ITEMS.get("constantan_plate"));
            tag(ItemTagsCoFH.PLATES_ELECTRUM).add(ITEMS.get("electrum_plate"));
            tag(ItemTagsCoFH.PLATES_INVAR).add(ITEMS.get("invar_plate"));

            tag(ItemTagsCoFH.PLATES).addTags(
                    ItemTagsCoFH.PLATES_LEAD,
                    ItemTagsCoFH.PLATES_NICKEL,
                    ItemTagsCoFH.PLATES_SILVER,
                    ItemTagsCoFH.PLATES_TIN,

                    ItemTagsCoFH.PLATES_BRONZE,
                    ItemTagsCoFH.PLATES_CONSTANTAN,
                    ItemTagsCoFH.PLATES_ELECTRUM,
                    ItemTagsCoFH.PLATES_INVAR
            );

            tag(ItemTagsCoFH.RAW_MATERIALS_LEAD).add(ITEMS.get("raw_lead"));
            tag(ItemTagsCoFH.RAW_MATERIALS_NICKEL).add(ITEMS.get("raw_nickel"));
            tag(ItemTagsCoFH.RAW_MATERIALS_SILVER).add(ITEMS.get("raw_silver"));
            tag(ItemTagsCoFH.RAW_MATERIALS_TIN).add(ITEMS.get("raw_tin"));

            tag(RAW_MATERIALS).addTags(
                    ItemTagsCoFH.RAW_MATERIALS_LEAD,
                    ItemTagsCoFH.RAW_MATERIALS_NICKEL,
                    ItemTagsCoFH.RAW_MATERIALS_SILVER,
                    ItemTagsCoFH.RAW_MATERIALS_TIN
            );
        }

    }

}
