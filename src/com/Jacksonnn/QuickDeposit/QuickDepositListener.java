package com.Jacksonnn.QuickDeposit;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Chest;

public class QuickDepositListener implements Listener {
		@EventHandler
		public void onInteract(PlayerInteractEvent event) {
		    if (event.getPlayer().isSneaking()) {
		    	if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
		    		BlockState state = (BlockState) event.getClickedBlock().getState();
			        if (state instanceof Chest) {
			            Chest chest = (Chest) state;
			            
			            Material blockAbove = event.getClickedBlock().getRelative(BlockFace.UP).getType();
						if (blockAbove.isOccluding()) {
							return;
						}
						int empty = ((Inventory) chest).firstEmpty();
						
						if (!(empty == -1)) {
							ItemStack handItem = event.getPlayer().getInventory().getItemInMainHand();
							((Inventory) chest).addItem(handItem);
							
							event.getPlayer().getInventory().removeItem(handItem);
						}
			        }
		    	}
		    }
		
		
		}
}