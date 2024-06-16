package net.mcreator.test.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.Checkbox;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class ProcedurCommandProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
			if (guistate.containsKey("checkbox:Glacon") && ((Checkbox) guistate.get("checkbox:Glacon")).selected()) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.ICE).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (guistate.containsKey("checkbox:Glacon2") && ((Checkbox) guistate.get("checkbox:Glacon2")).selected()) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.PACKED_ICE).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
