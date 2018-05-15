package com.Jacksonnn.QuickDeposit;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.material.Chest;
import org.bukkit.util.Vector;

public class QuickDepositListener implements Listener {

	@EventHandler
	    public void onInteract(PlayerInteractEvent event, BlockDamageEvent event2) {
		Player player = event.getPlayer();
		if (!player.isSneaking()) {
			return;
		} else {
	        if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
	            Block block = event2.getBlock();
	            if (block.getState() instanceof Chest) {
	            	Block clickedBlock = event2.getBlock();
	            	InventoryHolder chest = (InventoryHolder) clickedBlock.getState();
	        		Inventory chestInventory = chest.getInventory();
	        		PlayerInventory playerInventory = player.getInventory();
	                
	        		Material blockAbove = clickedBlock.getRelative(BlockFace.UP).getType();
	        		if (blockAbove.isOccluding()) {
	        			return;
	        		} else {
	        			
	        		}
	            } else {
	            	return;
	            }
	        }
	    }
	}
}