package com.railwayteam.railways.content.custom_bogeys.singleAxle;

import com.simibubi.create.content.logistics.trains.track.StandardBogeyTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

public class singleAxleBogeyTileEntity extends StandardBogeyTileEntity {
    public singleAxleBogeyTileEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    protected AABB createRenderBoundingBox() {
        return super.createRenderBoundingBox().inflate(2);
    }
}
