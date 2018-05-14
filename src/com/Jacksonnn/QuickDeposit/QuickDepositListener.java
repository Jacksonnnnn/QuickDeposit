package com.Jacksonnn.QuickDeposit;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Chest;
import org.bukkit.util.Vector;

public class QuickDepositListener implements Listener {

	@EventHandler
	    public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if (!player.isSneaking()) {
			return;
		} else {
	        if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
	            Block block = event.getClickedBlock();
	            if (block.getState() instanceof Chest) {
	                Chest chest = (Chest) block.getState();
	                chest.getBlockInventory();
	                
	            } else {
	            	return;
	            }
	        }
	    }
	}
}