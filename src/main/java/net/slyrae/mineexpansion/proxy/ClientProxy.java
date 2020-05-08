package net.slyrae.mineexpansion.proxy;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IThreadListener;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.slyrae.mineexpansion.init.items.ItemBase;
import net.slyrae.mineexpansion.util.ModInfo;
import net.slyrae.mineexpansion.util.handlers.RegistryHandler;

public class ClientProxy implements IProxy {

	private final Minecraft MINECRAFT = Minecraft.getMinecraft();

	@Override
	public void preInit() {
		//ModRenderers.register();
		//ModCommandsClient.registerCommands();
		//ModKeyBindings.registerKeyBindings();
		RegistryHandler.Client();
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public void doClientRightClick() {
		// Press the Use Item keybinding
		KeyBinding.onTick(MINECRAFT.gameSettings.keyBindUseItem.getKeyCode());
	}

	@Nullable
	@Override
	public EntityPlayer getClientPlayer() {
		return MINECRAFT.player;
	}

	@Nullable
	@Override
	public World getClientWorld() {
		return MINECRAFT.world;
	}

	@Override
	public IThreadListener getThreadListener(final MessageContext context) {
		if (context.side.isClient()) {
			return MINECRAFT;
		} else {
			return context.getServerHandler().player.getServer();
		}
	}

	@Override
	public EntityPlayer getPlayer(final MessageContext context) {
		if (context.side.isClient()) {
			return MINECRAFT.player;
		} else {
			return context.getServerHandler().player;
		}
	}

	@Override
	public void registerItemRenderer(Item item, int i, String name) {
		// TODO Auto-generated method stub
		
	}
}
